package minihearthstone.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.messaging.simp.stomp.StompFrameHandler;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;
import org.springframework.web.socket.sockjs.client.SockJsClient;
import org.springframework.web.socket.sockjs.client.WebSocketTransport;

import java.lang.reflect.Type;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import static java.util.Arrays.asList;
import static java.util.concurrent.TimeUnit.SECONDS;
import static minihearthstone.AssertAnnotations.*;

/**
 * Created by rhzeffa on 16/05/16. 
 * @see <a href="https://rafaelhz.github.io/testing-websockets/">RafaelHZ website </a>
 * Modifié par Matthieu Gayraud.
 * Le serveur doit être lancé avec la commande gradle bootRun
 */
public class WebSocketConfigTest {
 

    static final String WEBSOCKET_URI = "ws://localhost:8090/";
    static final String WEBSOCKET_CLIENT = "/client";

    private BlockingQueue<String> blockingQueue;
    private WebSocketStompClient stompClient;

    @Test
    public void checkPlayerAnnotations(){
        assertClassAnnotation(WebSocketConfig.class, Configuration.class, EnableWebSocketMessageBroker.class);
    }
    
    @Before
    public void setup() {
        blockingQueue = new LinkedBlockingDeque<>();
        stompClient = new WebSocketStompClient(new SockJsClient(
                asList(new WebSocketTransport(new StandardWebSocketClient()))));
    }

    @Test
    public void shouldReceiveAMessageFromTheServer() throws Exception {
        StompSession session = stompClient
                .connect(WEBSOCKET_URI, new StompSessionHandlerAdapter() {})
                .get(1, SECONDS);
        session.subscribe(WEBSOCKET_CLIENT, new DefaultStompFrameHandler());

        String message = "Message de test";
        session.send(WEBSOCKET_CLIENT, message.getBytes());

        Assert.assertEquals(message, blockingQueue.poll(1, SECONDS));
    }

    class DefaultStompFrameHandler implements StompFrameHandler {
        @Override
        public Type getPayloadType(StompHeaders stompHeaders) {
            return byte[].class;
        }

        @Override
        public void handleFrame(StompHeaders stompHeaders, Object o) {
            blockingQueue.offer(new String((byte[]) o));
        }
    }
}
