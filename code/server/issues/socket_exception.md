# Server logs

## Exceptions occured

### Case 1

2019-07-23 15:41:05.602  INFO 12500 --- [boundChannel-18] minihearthstone.entities.deck.Deck       : Distinct cards: []
2019-07-23 15:41:05.615  INFO 12500 --- [boundChannel-18] minihearthstone.controller.ClientProxy   : After update : GameBoard[id=34, gameId=33, p1ClientId=8431563888245454, p2ClientId=3431563889071201, turn=3431563889071201,
p1HandOfCards='Champion frisselame15638890923521575114451; YÚti
noroit15638882224551687419484; YÚti noroit15638882224551687419484; Chevaucheur de loup15638882224551251997436; BÚnÚdiction de puissance1563888222455905064196; Champion frisselame15638882224557876667; Soldat du comtÚ-de-l'or15638882224551573338133; ',
 p1CardsOnGround='',
 p2HandOfCards='Soldat du comtÚ-de-l'or1563889091868351190038; Avocat commis d'office1563888222455887422321; Chevaucheur de loup15638882224551124209399; Tourbillon15638882224551738750878; Avocat commis d'office1563888222455887422321; Avocat commis d'office1563888222455887422321; YÚti noroit1563888222455504732778; ',
 p2CardsOnGround='YÚti noroit1563888222455504732778; Avocat commis d'office1563888222455887422321; Avocat commis d'office1563888222455887422321; ']
2019-07-23 15:41:05.652 ERROR 12500 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=152902a5-2a3f-0447-5a58-6609b098b93e, uri=ws://localhost:8090/170/m124guot/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/8431563888245454/game/33


### Case 2

 p1CardsOnGround='Chef de Raid1563895594117551849806; ',
 p2HandOfCards='Chef de Raid1563895594117551849806; Chevaucheur de loup15638955941171555476398; Champion frisselame15638955941171728428217; Chevaucheur de loup15638955941171555476398; ',
 p2CardsOnGround='Recrue de la main d'argent1563895700690549859528; Sanglier brocheroc1563895594116823102049; Sanglier brocheroc1563895594116823102049; ']
2019-07-23 17:28:43.439 ERROR 1956 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=b26eb723-5eb6-af1b-01bf-34ba22bfff17, uri=ws://localhost:8090/211/irhy3sxm/websocket]

## Case 3

2019-07-24 12:20:30.261  INFO 5488 --- [nboundChannel-8] minihearthstone.controller.ClientProxy   : Card after applyOnChoiceEffect() -> Card[id=64, uniqueId='YÚti noroit15639634212451111968649', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15639634212451111968649', effect='null', specificCard='null']
2019-07-24 12:20:30.261  INFO 5488 --- [nboundChannel-8] minihearthstone.entities.deck.Deck       : Distinct cards: []
2019-07-24 12:20:30.272  INFO 5488 --- [nboundChannel-8] minihearthstone.controller.ClientProxy   : After update : GameBoard[id=34, gameId=33, p1ClientId=171563963468782, p2ClientId=3231563963469455, turn=3231563963469455,
p1HandOfCards='Soldat du comtÚ-de-l'or1563963421245312226900; Soldat du comtÚ-de-l'or1563963421245312226900; Soldat du comtÚ-de-l'or1563963421245312226900; Chef de Raid1563963421245899240148; Chef de Raid1563963421245899240148; ',
 p1CardsOnGround='',
 p2HandOfCards='Sanglier brocheroc1563963421245856200687; BÚnÚdiction de puissance15639634212451568013252; Chevaucheur de loup1563963421245465499555; Soldat du comtÚ-de-l'or1563963421245312226900; Chef de Raid1563963421245899240148; Soldat du comtÚ-de-l'or1563963421245312226900; Chef de Raid1563963421245899240148; Soldat du comtÚ-de-l'or1563963421245312226900; ',
 p2CardsOnGround='YÚti noroit15639634212451111968649; YÚti noroit15639634212451111968649; ']
2019-07-24 12:20:30.291 ERROR 5488 --- [nio-8090-exec-5] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=757622ee-f0dc-de65-485d-112879225c6f, uri=ws://localhost:8090/501/ufkak0rl/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/171563963468782/game/33

 ] for session ufkak0rl; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/171563963468782/game/33

## Case 4

        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/3141563983280949/game/36

 ] for session b3piika5: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:49:47.299 ERROR 12276 --- [nio-8090-exec-7] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=37e701ef-c34b-1fd5-aa00-dfe8d07d66e8, uri=ws://localhost:8090/599/b3piika5/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/3141563983280949/game/36

 ] for session b3piika5; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/3141563983280949/game/36

 ] for session b3piika5: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/3141563983280949/game/36

 ] for session b3piika5: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:49:47.301 ERROR 12276 --- [nio-8090-exec-7] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=37e701ef-c34b-1fd5-aa00-dfe8d07d66e8, uri=ws://localhost:8090/599/b3piika5/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/3141563983280949/game/36

 ] for session b3piika5; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/3141563983280949/game/36

 ] for session b3piika5: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
<=========----> 75% EXECUTING [1h 20m 54s]etProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
> :bootRun java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
Terminer le programme de commandes (O/N) ? xecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
^CImpossible d’ouvrir le périphérique ou le fichier spécifié.Runnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
PS G:\Github\minihearthstone\code\server> a:745) [na:1.8.0_60]
PS G:\Github\minihearthstone\code\server> sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
PS G:\Github\minihearthstone\code\server> ayer/3141563983280949/game/36
PS G:\Github\minihearthstone\code\server>
PS G:\Github\minihearthstone\code\server>
PS G:\Github\minihearthstone\code\server> sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
PS G:\Github\minihearthstone\code\server>
PS G:\Github\minihearthstone\code\server>
PS G:\Github\minihearthstone\code\server>
PS G:\Github\minihearthstone\code\server>
PS G:\Github\minihearthstone\code\server>
PS G:\Github\minihearthstone\code\server> ^C
PS G:\Github\minihearthstone\code\server>
PS G:\Github\minihearthstone\code\server> gradle bootRun

> Task :bootRun
17:51:12.640 [main] INFO minihearthstone.MinihearthstoneApplication - version: 5.1.3.RELEASE

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.1.RELEASE)

2019-07-24 17:51:13.343  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Starting MinihearthstoneApplication on PC-Roxane with PID 4684 (G:\Github\minihearthstone\code\server\build\classes\java\main started by RoxaneKang in G:\Github\minihearthstone\code\server)
2019-07-24 17:51:13.349  INFO 4684 --- [           main] m.MinihearthstoneApplication             : No active profile set, falling back to default profiles: default
2019-07-24 17:51:14.289  INFO 4684 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
2019-07-24 17:51:14.373  INFO 4684 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 79ms. Found 6 repository interfaces.
2019-07-24 17:51:14.861  INFO 4684 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$7f0d57ae] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24 17:51:14.881  INFO 4684 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.hateoas.config.HateoasConfiguration' of type [org.springframework.hateoas.config.HateoasConfiguration$$EnhancerBySpringCGLIB$$fe8da4e0] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-07-24 17:51:15.575  INFO 4684 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8090 (http)
2019-07-24 17:51:15.599  INFO 4684 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-07-24 17:51:15.599  INFO 4684 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/9.0.13
2019-07-24 17:51:15.599  INFO 4684 --- [           main] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [C:\Program Files\Java\jdk1.8.0_60\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files (x86)\Python37-32\Scripts\;C:\Program Files (x86)\Python37-32\;C:\oraclexe\app\oracle\product\11.2.0\server\bin;C:\ProgramData\Oracle\Java\javapath;C:\Python34\;C:\Python34\Scripts;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files\Common Files\Apple\Mobile Device Support\;C:\Program Files (x86)\Common Files\Apple\Apple Application Support;D:\Softwares\Git\Git\cmd;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;D:\Softwares\Gow\bin;D:\Softwares\Xampp\Xampp\mysql\bin;C:\Program Files (x86)\Skype\Phone\;C:\Program Files (x86)\QuickTime\QTSystem\;C:\Program Files\Java\jdk1.8.0_60\bin;D:\Softwares\Android\android-sdk\tools;D:\Softwares\Android\android-sdk\tools\bin\;D:\Softwares\Android\android-sdk\platform-tools;C:\Program Files (x86)\apache-maven-3.5.2\bin;C:\CamlLight\bin;C:\Program Files (x86)\instantclient_12_2;C:\Program Files (x86)\instantclient-sqlplus-windows.x64-12.2.0.1.0\instantclient_12_2;C:\Users\RoxaneKang\AppData\Local\Julia-0.6.2\bin;C:\Program Files (x86)\Common Files\Acronis\VirtualFile\;C:\Program Files (x86)\Common Files\Acronis\VirtualFile64\;C:\Program Files (x86)\Common Files\Acronis\SnapAPI\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files (x86)\Gpg4win\..\GnuPG\bin;C:\Program Files\gs\gs9.23\bin;C:\xampp\php;C:\ProgramData\ComposerSetup\bin;C:\Program Files (x86)\Brackets\command;D:\Softwares\Sparql\apache-jena-3.9.0\bat;C:\Users\RoxaneKang\AppData\Roaming\nvm;C:\Program Files\nodejs;D:\Softwares\tarql-1.1\bin;C:\Program Files\wkhtmltopdf\bin;G:\Github\markdown-to-pdf;D:\Softwares\Gradle\gradle-4.10.2-all\gradle-4.10.2\bin;G:\Development\WebApps\tomcat\bin;C:\Program Files\doxygen\bin;C:\Program Files (x86)\IVI Foundation\VISA\WinNT\Bin;C:\Users\RoxaneKang\AppData\Roaming\Python\Python37\Scripts;C:\Program Files\MiKTeX 2.9\miktex\bin\x64\;C:\Program Files (x86)\GnuWin32\bin;C:\Program Files (x86)\Graphviz2.38\bin\dot.exe;C:\ProgramData\chocolatey\bin;C:\Users\RoxaneKang\Anaconda3;C:\Users\RoxaneKang\Anaconda3\Library\mingw-w64\bin;C:\Users\RoxaneKang\Anaconda3\Library\usr\bin;C:\Users\RoxaneKang\Anaconda3\Library\bin;C:\Users\RoxaneKang\Anaconda3\Scripts;C:\Users\RoxaneKang\AppData\Local\Microsoft\WindowsApps;C:\Users\RoxaneKang\AppData\Local\atom\bin;C:\Users\RoxaneKang\AppData\Roaming\npm;C:\CamlLight\bin;C:\Users\RoxaneKang\AppData\Local\Microsoft\WindowsApps;C:\Program Files\gs\gs9.23\bin;C:\Users\RoxaneKang\AppData\Roaming\Composer\vendor\bin;C:\Users\RoxaneKang\AppData\Roaming\nvm;C:\Program Files\nodejs;C:\Users\RoxaneKang\AppData\Local\Pandoc\;D:\Softwares\VisualStudioCode\Microsoft VS Code\bin;C:\Users\RoxaneKang\AppData\Local\GitHubDesktop\bin;C:\Users\RoxaneKang\AppData\Local\Programs\EmEditor;C:\Users\RoxaneKang\AppData\Roaming\Python\Python37\Scripts;C:\Users\RoxaneKang\AppData\Local\Programs\MiKTeX 2.9\miktex\bin\x64\;C:\Program Files (x86)\Graphviz2.38\bin\;C:\Users\RoxaneKang\AppData\Local\Google\Cloud SDK\google-cloud-sdk\bin;;.]
2019-07-24 17:51:15.822  INFO 4684 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-07-24 17:51:15.822  INFO 4684 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2429 ms
2019-07-24 17:51:16.072  INFO 4684 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2019-07-24 17:51:16.215  INFO 4684 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2019-07-24 17:51:16.318  INFO 4684 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [
        name: default
        ...]
2019-07-24 17:51:16.390  INFO 4684 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {5.3.7.Final}
2019-07-24 17:51:16.390  INFO 4684 --- [           main] org.hibernate.cfg.Environment            : HHH000206: hibernate.properties not found
2019-07-24 17:51:16.581  INFO 4684 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.0.4.Final}
2019-07-24 17:51:16.763  INFO 4684 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2019-07-24 17:51:16.973  INFO 4684 --- [           main] o.hibernate.id.enhanced.TableGenerator   : HHH000398: Explicit segment value for id generator [hibernate_sequences.sequence_name] suggested; using default [default]
2019-07-24 17:51:16.979  INFO 4684 --- [           main] o.hibernate.id.enhanced.TableGenerator   : HHH000398: Explicit segment value for id generator [hibernate_sequences.sequence_name] suggested; using default [default]
2019-07-24 17:51:16.979  INFO 4684 --- [           main] o.hibernate.id.enhanced.TableGenerator   : HHH000398: Explicit segment value for id generator [hibernate_sequences.sequence_name] suggested; using default [default]
2019-07-24 17:51:17.779  WARN 4684 --- [           main] o.h.t.s.i.ExceptionHandlerLoggedImpl     : GenerationTarget encountered exception accepting command : Error executing DDL "insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement

org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlString(SchemaCreatorImpl.java:440) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlStrings(SchemaCreatorImpl.java:424) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.createFromMetadata(SchemaCreatorImpl.java:315) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.performCreation(SchemaCreatorImpl.java:166) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:135) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:121) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:155) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:72) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:310) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:467) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:939) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:57) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:390) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:377) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:341) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1804) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1741) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:576) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:498) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:320) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:318) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1083) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:853) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:546) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:142) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:775) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1260) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1248) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at minihearthstone.MinihearthstoneApplication.main(MinihearthstoneApplication.java:29) ~[main/:na]
Caused by: org.h2.jdbc.JdbcSQLException: Violation dindex unique ou clÚ primaire: {0}
Unique index or primary key violation: {0}; SQL statement:
insert into hibernate_sequences(sequence_name, next_val) values ('default',0) [23505-197]
        at org.h2.message.DbException.getJdbcSQLException(DbException.java:357) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.message.DbException.get(DbException.java:179) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.message.DbException.get(DbException.java:155) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.index.BaseIndex.getDuplicateKeyException(BaseIndex.java:101) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVSecondaryIndex.requireUnique(MVSecondaryIndex.java:236) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVSecondaryIndex.add(MVSecondaryIndex.java:202) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVTable.addRow(MVTable.java:732) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.dml.Insert.insertRows(Insert.java:182) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.dml.Insert.update(Insert.java:134) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.CommandContainer.update(CommandContainer.java:102) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.Command.executeUpdate(Command.java:261) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.jdbc.JdbcStatement.executeInternal(JdbcStatement.java:233) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.jdbc.JdbcStatement.execute(JdbcStatement.java:205) ~[h2-1.4.197.jar:1.4.197]
        at com.zaxxer.hikari.pool.ProxyStatement.execute(ProxyStatement.java:95) ~[HikariCP-3.2.0.jar:na]
        at com.zaxxer.hikari.pool.HikariProxyStatement.execute(HikariProxyStatement.java) ~[HikariCP-3.2.0.jar:na]
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        ... 34 common frames omitted

2019-07-24 17:51:17.789  WARN 4684 --- [           main] o.h.t.s.i.ExceptionHandlerLoggedImpl     : GenerationTarget encountered exception accepting command : Error executing DDL "insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement

org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlString(SchemaCreatorImpl.java:440) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.applySqlStrings(SchemaCreatorImpl.java:424) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.createFromMetadata(SchemaCreatorImpl.java:315) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.performCreation(SchemaCreatorImpl.java:166) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:135) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.internal.SchemaCreatorImpl.doCreation(SchemaCreatorImpl.java:121) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:155) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:72) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:310) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:467) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:939) [hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:57) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:390) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:377) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:341) [spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1804) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1741) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:576) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:498) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:320) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:318) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) [spring-beans-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1083) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:853) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:546) ~[spring-context-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:142) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:775) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1260) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1248) ~[spring-boot-2.1.1.RELEASE.jar:2.1.1.RELEASE]
        at minihearthstone.MinihearthstoneApplication.main(MinihearthstoneApplication.java:29) ~[main/:na]
Caused by: org.h2.jdbc.JdbcSQLException: Violation dindex unique ou clÚ primaire: {0}
Unique index or primary key violation: {0}; SQL statement:
insert into hibernate_sequences(sequence_name, next_val) values ('default',0) [23505-197]
        at org.h2.message.DbException.getJdbcSQLException(DbException.java:357) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.message.DbException.get(DbException.java:179) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.message.DbException.get(DbException.java:155) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.index.BaseIndex.getDuplicateKeyException(BaseIndex.java:101) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVSecondaryIndex.requireUnique(MVSecondaryIndex.java:236) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVSecondaryIndex.add(MVSecondaryIndex.java:202) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.mvstore.db.MVTable.addRow(MVTable.java:732) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.dml.Insert.insertRows(Insert.java:182) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.dml.Insert.update(Insert.java:134) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.CommandContainer.update(CommandContainer.java:102) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.command.Command.executeUpdate(Command.java:261) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.jdbc.JdbcStatement.executeInternal(JdbcStatement.java:233) ~[h2-1.4.197.jar:1.4.197]
        at org.h2.jdbc.JdbcStatement.execute(JdbcStatement.java:205) ~[h2-1.4.197.jar:1.4.197]
        at com.zaxxer.hikari.pool.ProxyStatement.execute(ProxyStatement.java:95) ~[HikariCP-3.2.0.jar:na]
        at com.zaxxer.hikari.pool.HikariProxyStatement.execute(HikariProxyStatement.java) ~[HikariCP-3.2.0.jar:na]
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        ... 34 common frames omitted

2019-07-24 17:51:17.803  INFO 4684 --- [           main] o.h.t.schema.internal.SchemaCreatorImpl  : HHH000476: Executing import script 'org.hibernate.tool.schema.internal.exec.ScriptSourceInputNonExistentImpl@1f3c5308'
2019-07-24 17:51:17.803  INFO 4684 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2019-07-24 17:51:18.873  INFO 4684 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'clientInboundChannelExecutor'
2019-07-24 17:51:18.879  INFO 4684 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'clientOutboundChannelExecutor'
2019-07-24 17:51:18.898  INFO 4684 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService 'messageBrokerTaskScheduler'
2019-07-24 17:51:18.950  INFO 4684 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'brokerChannelExecutor'
2019-07-24 17:51:19.337  WARN 4684 --- [           main] aWebConfiguration$JpaWebMvcConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2019-07-24 17:51:19.859  INFO 4684 --- [           main] o.s.m.s.b.SimpleBrokerMessageHandler     : Starting...
2019-07-24 17:51:19.865  INFO 4684 --- [           main] o.s.m.s.b.SimpleBrokerMessageHandler     : BrokerAvailabilityEvent[available=true, SimpleBrokerMessageHandler [DefaultSubscriptionRegistry[cache[0 destination(s)], registry[0 sessions]]]]
2019-07-24 17:51:19.865  INFO 4684 --- [           main] o.s.m.s.b.SimpleBrokerMessageHandler     : Started.
2019-07-24 17:51:19.931  INFO 4684 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8090 (http) with context path ''
2019-07-24 17:51:19.931  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Started MinihearthstoneApplication in 7.031 seconds (JVM running for 7.884)
2019-07-24 17:51:20.072  INFO 4684 --- [           main] m.MinihearthstoneApplication             : CardRepository :
2019-07-24 17:51:20.072  INFO 4684 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-24 17:51:20.100  INFO 4684 --- [           main] o.h.h.i.QueryTranslatorFactoryInitiator  : HHH000397: Using ASTQueryTranslatorFactory
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=5, uniqueId='Sanglier brocheroc1563983480012515187385', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1563983480012515187385', effect='null', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=6, uniqueId='Soldat du comtÚ-de-l'or1563983480012504731893', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1563983480012504731893', effect='ProvocationEffect', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=7, uniqueId='Chevaucheur de loup15639834800121738750369', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup15639834800121738750369', effect='ChargeEffect', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=8, uniqueId='Chef de Raid1563983480012887421933', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid1563983480012887421933', effect='null', specificCard='ChefDeRaid']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=9, uniqueId='YÚti noroit156398348001257666226', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit156398348001257666226', effect='null', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=10, uniqueId='Champion frisselame1563983480012823102565', name='Champion frisselame', manacost=4, damage=3, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Champion frisselame1563983480012823102565', effect='LifeStealEffect', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=11, uniqueId='BÚnÚdiction de puissance15639834800121335405770', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance15639834800121335405770', effect='null', specificCard='BenedictionDePuissance']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=12, uniqueId='ConsÚcration15639834800121555475741', name='ConsÚcration', manacost=4, damage=2, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='ConsÚcration15639834800121555475741', effect='null', specificCard='Consecration']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=14, uniqueId='Sanglier brocheroc1563983480012551850327', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1563983480012551850327', effect='null', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=15, uniqueId='Soldat du comtÚ-de-l'or15639834800121836481279', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15639834800121836481279', effect='ProvocationEffect', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=16, uniqueId='Chevaucheur de loup15639834800121728428645', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup15639834800121728428645', effect='ChargeEffect', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=17, uniqueId='Chef de Raid1563983480012235190867', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid1563983480012235190867', effect='null', specificCard='ChefDeRaid']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=18, uniqueId='YÚti noroit1563983480012177711517', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit1563983480012177711517', effect='null', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=19, uniqueId='Tourbillon15639834800121409403186', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15639834800121409403186', effect='null', specificCard='Tourbillon']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=20, uniqueId='Avocat commis d'office1563983480012519426043', name='Avocat commis d'office', manacost=2, damage=0, lifepoints=7, nature='servant', canAttack=false, currentTargetUniqueId='Avocat commis d'office1563983480012519426043', effect='ProvocationEffect', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=21, uniqueId='Ma¯trise du blocage1563983480012899655911', name='Ma¯trise du blocage', manacost=3, damage=0, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Ma¯trise du blocage1563983480012899655911', effect='null', specificCard='MaitriseDuBlocage']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=23, uniqueId='Sanglier brocheroc156398348001241644948', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc156398348001241644948', effect='null', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=24, uniqueId='Soldat du comtÚ-de-l'or15639834800121486210027', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15639834800121486210027', effect='ProvocationEffect', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=25, uniqueId='Chevaucheur de loup15639834800121749003409', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup15639834800121749003409', effect='ChargeEffect', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=26, uniqueId='Chef de Raid1563983480012542220621', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid1563983480012542220621', effect='null', specificCard='ChefDeRaid']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=27, uniqueId='YÚti noroit15639834800122036539596', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15639834800122036539596', effect='null', specificCard='null']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=28, uniqueId='Image mirroir1563983480012260275726', name='Image mirroir', manacost=1, damage=0, lifepoints=2, nature='spell', canAttack=false, currentTargetUniqueId='Image mirroir1563983480012260275726', effect='ProvocationEffect', specificCard='ImageMirroir']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=29, uniqueId='Explosion des arcanes1563983480012449474540', name='Explosion des arcanes', manacost=2, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Explosion des arcanes1563983480012449474540', effect='null', specificCard='ExplosionDesArcanes']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=30, uniqueId='MÚtamorphose1563983480012926018496', name='MÚtamorphose', manacost=4, damage=0, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='MÚtamorphose1563983480012926018496', effect='null', specificCard='Metamorphose']
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : HeroRepository :
2019-07-24 17:51:20.272  INFO 4684 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Hero[id=1, uniqueId='Echalwe1563983479931274580842', name='Echalwe', type=paladin, skillType='self', lifepoints=30,defense=0, description=Renfort, invoquant un serviteur 'recrue de la Main d'argent' 1/1., specificHero='Paladin']
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Hero[id=2, uniqueId='Hrothgar1563983479931458582751', name='Hrothgar', type=warrior, skillType='self', lifepoints=30,defense=0, description=Armure, lui confÚrant 2 points d'armure, specificHero='Warrior']
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Hero[id=3, uniqueId='Athelas15639834799312139937152', name='Athelas', type=mage, skillType='targeted', lifepoints=30,defense=0, description=Boule de feu, infligeant un point de dÚgat Ó l'adversaire (serviteur ou hÚros)., specificHero='Mage']
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : commonCards :
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Sanglier brocheroc1563983479931614978933', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1563983479931614978933', effect='null', specificCard='null']
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Soldat du comtÚ-de-l'or15639834799311140573545', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15639834799311140573545', effect='ProvocationEffect', specificCard='null']
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Chevaucheur de loup1563983479931748128394', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Chevaucheur de loup1563983479931748128394', effect='ChargeEffect', specificCard='null']
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Chef de Raid15639834799311579620849', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid15639834799311579620849', effect='null', specificCard='ChefDeRaid']
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='YÚti noroit15639834799311141138109', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15639834799311141138109', effect='null', specificCard='null']
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : paladinSpecificCards :
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='Champion frisselame15639834799311501019869', name='Champion frisselame', manacost=4, damage=3, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Champion frisselame15639834799311501019869', effect='LifeStealEffect', specificCard='null']
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='BÚnÚdiction de puissance15639834799311237401900', name='BÚnÚdiction de puissance', manacost=1, damage=3, lifepoints=0, nature='targetedSpell', canAttack=false, currentTargetUniqueId='BÚnÚdiction de puissance15639834799311237401900', effect='null', specificCard='BenedictionDePuissance']
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Card[id=null, uniqueId='ConsÚcration1563983479931793069896', name='ConsÚcration', manacost=4, damage=2, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='ConsÚcration1563983479931793069896', effect='null', specificCard='Consecration']
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : DeckRepository :
2019-07-24 17:51:20.282  INFO 4684 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-24 17:51:20.322  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Deck[id=4, name='Echalwe's card deck', heroId=1, cards{'Sanglier brocheroc Soldat du comtÚ-de-l'or Chevaucheur de loup Chef de Raid YÚti noroit Champion frisselame BÚnÚdiction de puissance ConsÚcration '}]
2019-07-24 17:51:20.322  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Deck[id=13, name='Hrothgar's card deck', heroId=2, cards{'Sanglier brocheroc Soldat du comtÚ-de-l'or Chevaucheur de loup Chef de Raid YÚti noroit Tourbillon Avocat commis d'office Ma¯trise du blocage '}]
2019-07-24 17:51:20.322  INFO 4684 --- [           main] m.MinihearthstoneApplication             : Deck[id=22, name='Athelas's card deck', heroId=3, cards{'Sanglier brocheroc Soldat du comtÚ-de-l'or Chevaucheur de loup Chef de Raid YÚti noroit Image mirroir Explosion des arcanes MÚtamorphose '}]
2019-07-24 17:51:20.322  INFO 4684 --- [           main] m.MinihearthstoneApplication             : -------------------------------------------------
2019-07-24 17:51:40.989  INFO 4684 --- [nio-8090-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2019-07-24 17:51:40.989  INFO 4684 --- [nio-8090-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2019-07-24 17:51:41.014  INFO 4684 --- [nio-8090-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 25 ms
2019-07-24 17:51:47.909  INFO 4684 --- [nboundChannel-1] minihearthstone.controller.ClientProxy   : number of players looking for match : 0
2019-07-24 17:51:48.800  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : number of players looking for match : 1
2019-07-24 17:51:48.801  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : size: 1
2019-07-24 17:51:48.801  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : random: 0
ok
2019-07-24 17:51:53.572  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : New gameboard :[]
2019-07-24 17:51:53.572  INFO 4684 --- [nboundChannel-3] minihearthstone.entities.deck.Deck       : Added player
2019-07-24 17:51:53.572  INFO 4684 --- [nboundChannel-3] minihearthstone.entities.deck.Deck       : Added hero
2019-07-24 17:51:53.609  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=31, name='titi', clientId='1981563983500836', status='in-lobby', heroId=1, mana=1, stored_mana=1], gb='34']
2019-07-24 17:51:53.609  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=35, uniqueId='Echalwe15639835135721156634161', name='Echalwe', type=paladin, skillType='self', lifepoints=30,defense=0, description=Renfort, invoquant un serviteur 'recrue de la Main d'argent' 1/1., specificHero='Paladin']]
2019-07-24 17:51:53.609  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=null, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-24 17:51:54.672  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Already created gameboard
2019-07-24 17:51:54.672  INFO 4684 --- [nboundChannel-5] minihearthstone.entities.deck.Deck       : Added player
2019-07-24 17:51:54.672  INFO 4684 --- [nboundChannel-5] minihearthstone.entities.deck.Deck       : Added hero
2019-07-24 17:51:54.696  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Updated gameboard : [Player[id=31, name='titi', clientId='1981563983500836', status='in-lobby', heroId=1, mana=1, stored_mana=1], gb='34', Player[id=32, name='toto', clientId='2611563983501498', status='in-lobby', heroId=2, mana=1, stored_mana=1], gb='34']
2019-07-24 17:51:54.696  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Updated gameboard : [Hero[id=35, uniqueId='Echalwe15639835135721156634161', name='Echalwe', type=paladin, skillType='self', lifepoints=30,defense=0, description=Renfort, invoquant un serviteur 'recrue de la Main d'argent' 1/1., specificHero='Paladin'], Hero[id=36, uniqueId='Hrothgar15639835146722107053539', name='Hrothgar', type=warrior, skillType='self', lifepoints=30,defense=0, description=Armure, lui confÚrant 2 points d'armure, specificHero='Warrior']]
2019-07-24 17:51:54.696  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Updated gameboard to string : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=null,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']
2019-07-24 17:51:54.701  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Received initgame from player: 2611563983501498
2019-07-24 17:51:54.705  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Random  :0
2019-07-24 17:51:54.705  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : The lucky winner is 1981563983500836
2019-07-24 17:51:54.719  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 2611563983501498
2019-07-24 17:51:54.719  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:51:54.751  INFO 4684 --- [nboundChannel-5] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-24 17:51:54.751  INFO 4684 --- [nboundChannel-5] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-24 17:51:54.751  INFO 4684 --- [nboundChannel-5] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-24 17:51:54.751  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : The other player is starting first. You've been given 3 cards.
2019-07-24 17:51:54.751  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='',
 p2CardsOnGround='']

2019-07-24 17:51:54.751  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : P2 client id : 2611563983501498
2019-07-24 17:51:54.764  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=15, uniqueId='Soldat du comtÚ-de-l'or15639834800121836481279', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15639834800121836481279', effect='ProvocationEffect', specificCard='null'], Card[id=15, uniqueId='Soldat du comtÚ-de-l'or15639834800121836481279', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15639834800121836481279', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='Sanglier brocheroc1563983514751844666447', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1563983514751844666447', effect='null', specificCard='null']]
2019-07-24 17:51:54.784  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Soldat du comtÚ-de-l'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; ',
 p2CardsOnGround='']

2019-07-24 17:51:55.227  INFO 4684 --- [boundChannel-11] minihearthstone.controller.ClientProxy   : Received initgame from player: 1981563983500836
2019-07-24 17:51:55.234  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : Received getfirsthand() from player : 1981563983500836
2019-07-24 17:51:55.234  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:51:55.253  INFO 4684 --- [nboundChannel-4] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-24 17:51:55.253  INFO 4684 --- [nboundChannel-4] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-24 17:51:55.253  INFO 4684 --- [nboundChannel-4] minihearthstone.entities.deck.Deck       : Random pick index: 4
2019-07-24 17:51:55.253  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : You are the lucky winner! You have been given 3 cards
2019-07-24 17:51:55.253  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : Gameboard before hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='',
 p1CardsOnGround='',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Soldat du comtÚ-de-l'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; ',
 p2CardsOnGround='']

2019-07-24 17:51:55.253  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : P1 client id : 1981563983500836
2019-07-24 17:51:55.263  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : Hand of cards saved in gameboard : [Card[id=6, uniqueId='Soldat du comtÚ-de-l'or1563983480012504731893', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1563983480012504731893', effect='ProvocationEffect', specificCard='null'], Card[id=6, uniqueId='Soldat du comtÚ-de-l'or1563983480012504731893', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1563983480012504731893', effect='ProvocationEffect', specificCard='null'], Card[id=null, uniqueId='YÚti noroit15639835152531800871939', name='YÚti noroit', manacost=4, damage=4, lifepoints=5, nature='servant', canAttack=false, currentTargetUniqueId='YÚti noroit15639835152531800871939', effect='null', specificCard='null']]
2019-07-24 17:51:55.279  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : Gameboard after hand of cards added : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='Soldat du comtÚ-de-l'or1563983480012504731893; Soldat du comtÚ-de-l'or1563983480012504731893; YÚti noroit15639835152531800871939; ',
 p1CardsOnGround='',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Soldat du comtÚ-de-l'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; ',
 p2CardsOnGround='']

2019-07-24 17:52:01.038  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Received chooseCard() from player : 1981563983500836
2019-07-24 17:52:01.038  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:52:01.042  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Before update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='Soldat du comtÚ-de-l'or1563983480012504731893; Soldat du comtÚ-de-l'or1563983480012504731893; YÚti noroit15639835152531800871939; ',
 p1CardsOnGround='',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Soldat du comtÚ-de-l'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; ',
 p2CardsOnGround='']
2019-07-24 17:52:01.042  INFO 4684 --- [nboundChannel-5] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:01.042  INFO 4684 --- [nboundChannel-5] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:01.042  INFO 4684 --- [nboundChannel-5] minihearthstone.entities.deck.Deck       : findCardInHandOfCardsByUniqueId in p1:
2019-07-24 17:52:01.042  INFO 4684 --- [nboundChannel-5] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:52:01.042  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Card after applyOnChoiceEffect() -> Card[id=40, uniqueId='Soldat du comtÚ-de-l'or1563983480012504731893', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1563983480012504731893', effect='ProvocationEffect', specificCard='null']
2019-07-24 17:52:01.042  INFO 4684 --- [nboundChannel-5] minihearthstone.entities.deck.Deck       : Distinct cards: []
2019-07-24 17:52:01.063  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : After update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='Soldat du comtÚ-de-l'or1563983480012504731893; YÚti noroit15639835152531800871939; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Soldat du comtÚ-de-l'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; ',
 p2CardsOnGround='']
2019-07-24 17:52:05.107  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : Receive end of turn from : 1981563983500836
2019-07-24 17:52:05.107  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:52:05.132  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : Gameboard updated after end of turn : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='Soldat du comtÚ-de-l'or1563983480012504731893; YÚti noroit15639835152531800871939; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Soldat du comtÚ-de-l'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; ',
 p2CardsOnGround='']
2019-07-24 17:52:05.138  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 2611563983501498
2019-07-24 17:52:05.138  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:52:05.144  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:52:05.150  INFO 4684 --- [nboundChannel-5] minihearthstone.entities.deck.Deck       : Random pick index: 5
2019-07-24 17:52:07.749  INFO 4684 --- [boundChannel-11] minihearthstone.controller.ClientProxy   : Received chooseCard() from player : 2611563983501498
2019-07-24 17:52:07.749  INFO 4684 --- [boundChannel-11] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:52:07.749  INFO 4684 --- [boundChannel-11] minihearthstone.controller.ClientProxy   : Before update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='Soldat du comtÚ-de-l'or1563983480012504731893; YÚti noroit15639835152531800871939; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Soldat du comtÚ-de-l'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='']
2019-07-24 17:52:07.749  INFO 4684 --- [boundChannel-11] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:07.749  INFO 4684 --- [boundChannel-11] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:07.749  INFO 4684 --- [boundChannel-11] minihearthstone.entities.deck.Deck       : findCardInHandOfCardsByUniqueId in p2:
2019-07-24 17:52:07.749  INFO 4684 --- [boundChannel-11] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or15639834800121836481279 | current : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:52:07.749  INFO 4684 --- [boundChannel-11] minihearthstone.controller.ClientProxy   : Card after applyOnChoiceEffect() -> Card[id=37, uniqueId='Soldat du comtÚ-de-l'or15639834800121836481279', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15639834800121836481279', effect='ProvocationEffect', specificCard='null']
2019-07-24 17:52:07.749  INFO 4684 --- [boundChannel-11] minihearthstone.entities.deck.Deck       : Distinct cards: []
2019-07-24 17:52:07.768  INFO 4684 --- [boundChannel-11] minihearthstone.controller.ClientProxy   : After update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='Soldat du comtÚ-de-l'or1563983480012504731893; YÚti noroit15639835152531800871939; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='Soldat du comtÚ-de-l'or15639834800121836481279; ']
2019-07-24 17:52:10.008  INFO 4684 --- [boundChannel-15] minihearthstone.controller.ClientProxy   : Received chooseCard() from player : 2611563983501498
2019-07-24 17:52:10.008  INFO 4684 --- [boundChannel-15] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:52:10.008  INFO 4684 --- [boundChannel-15] minihearthstone.controller.ClientProxy   : Before update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='Soldat du comtÚ-de-l'or1563983480012504731893; YÚti noroit15639835152531800871939; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='Soldat du comtÚ-de-l'or15639834800121836481279; ']
2019-07-24 17:52:10.008  INFO 4684 --- [boundChannel-15] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:10.008  INFO 4684 --- [boundChannel-15] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:10.008  INFO 4684 --- [boundChannel-15] minihearthstone.entities.deck.Deck       : findCardInHandOfCardsByUniqueId in p2:
2019-07-24 17:52:10.008  INFO 4684 --- [boundChannel-15] minihearthstone.entities.deck.Deck       : uniqueId : Sanglier brocheroc1563983514751844666447 | current : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:52:10.008  INFO 4684 --- [boundChannel-15] minihearthstone.entities.deck.Deck       : uniqueId : Sanglier brocheroc1563983514751844666447 | current : Sanglier brocheroc1563983514751844666447
2019-07-24 17:52:10.008  INFO 4684 --- [boundChannel-15] minihearthstone.controller.ClientProxy   : Card after applyOnChoiceEffect() -> Card[id=39, uniqueId='Sanglier brocheroc1563983514751844666447', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1563983514751844666447', effect='null', specificCard='null']
2019-07-24 17:52:10.008  INFO 4684 --- [boundChannel-15] minihearthstone.entities.deck.Deck       : Distinct cards: []
2019-07-24 17:52:10.028  INFO 4684 --- [boundChannel-15] minihearthstone.controller.ClientProxy   : After update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='Soldat du comtÚ-de-l'or1563983480012504731893; YÚti noroit15639835152531800871939; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='Soldat du comtÚ-de-l'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; ']
2019-07-24 17:52:11.375  INFO 4684 --- [boundChannel-13] minihearthstone.controller.ClientProxy   : Receive end of turn from : 2611563983501498
<=========----> 75% EXECUTING [1m 17s] [boundChannel-13] minihearthstone.controller.ClientProxy   : -------------------------------------------------
> :bootRun 17:52:11.396  INFO 4684 --- [boundChannel-13] minihearthstone.controller.ClientProxy   : Gameboard updated after end of turn : GameBoard[id=34, gameId=33, p1ClientId=19815639835008
> :bootRun----> 75% EXECUTING [1m 16s]1981563983500836,
p1HandOfCards='Soldat du comtÚ-de-l'or1563983480012504731893; YÚti noroit15639835152531800871939; ',
> :bootRun----> 75% EXECUTING [1m 16s]'or1563983480012504731893; ',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; ',
> :bootRun----> 75% EXECUTING [1m 16s]'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; ']
> :bootRun 17:52:11.400  INFO 4684 --- [boundChannel-12] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 1981563983500836
<=========----> 75% EXECUTING [1m 17s] [boundChannel-12] minihearthstone.controller.ClientProxy   : -------------------------------------------------
> :bootRun 17:52:11.404  INFO 4684 --- [boundChannel-12] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
> :bootRun----> 75% EXECUTING [1m 15s] [boundChannel-12] minihearthstone.entities.deck.Deck       : Random pick index: 2
> :bootRun 17:52:14.108  INFO 4684 --- [nboundChannel-8] minihearthstone.controller.ClientProxy   : Received chooseCard() from player : 1981563983500836
> :bootRun----> 75% EXECUTING [1m 14s] [nboundChannel-8] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:52:14.108  INFO 4684 --- [nboundChannel-8] minihearthstone.controller.ClientProxy   : Before update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563<=========----> 75% EXECUTING [1m 17s]
> :bootRunrds='Soldat du comtÚ-de-l'or1563983480012504731893; YÚti noroit15639835152531800871939; Chevaucheur de loup15639834800121738750369; ',
> :bootRun----> 75% EXECUTING [1m 14s]'or1563983480012504731893; ',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; ',
> :bootRun----> 75% EXECUTING [1m 14s]'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; ']
> :bootRun 17:52:14.108  INFO 4684 --- [nboundChannel-8] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
> :bootRun----> 75% EXECUTING [1m 13s] [nboundChannel-8] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:39.255  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : Received cardAttackServant() from player : 1981563983500836
2019-07-24 17:52:39.256  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : -------------------------------------------------4731893 | current : Soldat du comtÚ-de-l'o
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498iceEffect() -> Card[id=41, uniqueId='Soldat du comtÚ-de-l'or1563983480
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1: queId='Soldat du comtÚ-de-l'or1563983480012504731893', ef
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : Soldat du comtÚ-de-l'or1563983480012504731893d limit, 0 transport error)], stompSubProtocol[processed CONNECT(2)-CONNECTED(2)-DISCONNECT(0)], stompBrokerRelay[null], inboundChannel[pool size = 16, active threads =
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : Checking ability to attackasks = 61], sockJsScheduler[pool size = 8, active threads = 1, qu
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : performPreActionOpponentCardEffects()
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : playerCardsOnGround:
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] m.entities.cards.BasicCard               : ProvocationEffect -> Applying applyPreActionEffect() | target : Soldat du comtÚ-de-l'or15639834800121836481279 EXECUTING [1m 6s]or15639834800121836481279; Tourbillon15639834800121409403186; ',
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] m.entities.cards.BasicCard               : Opponent player : 2611563983501498
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or15639834800121836481279 | current : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] m.entities.cards.BasicCard               : Target also has provocation effect
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:52:39.263  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or15639834800121836481279 | current : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:52:39.264  INFO 4684 --- [boundChannel-16] m.entities.cards.BasicCard               : Soldat du comtÚ-de-l'or1563983480012504731893 attacking Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:52:39.264  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : After attack :
2019-07-24 17:52:39.264  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : Soldat du comtÚ-de-l'or: 1/1/1
2019-07-24 17:52:39.264  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : Sanglier brocheroc: 1/1/1
2019-07-24 17:52:51.558  INFO 4684 --- [boundChannel-10] minihearthstone.controller.ClientProxy   : Receive end of turn from : 1981563983500836
2019-07-24 17:52:51.558  INFO 4684 --- [boundChannel-10] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:52:51.575  INFO 4684 --- [boundChannel-10] minihearthstone.controller.ClientProxy   : Gameboard updated after end of turn : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='YÚti noroit15639835152531800871939; Chevaucheur de loup15639834800121738750369; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='Soldat du comtÚ-de-l'or15639834800121836481279; Sanglier brocheroc1563983514751844666447; ']
2019-07-24 17:52:51.578  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 2611563983501498
2019-07-24 17:52:51.578  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:52:51.582  INFO 4684 --- [nboundChannel-1] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 2611563983501498
2019-07-24 17:52:51.582  INFO 4684 --- [nboundChannel-1] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:52:51.583  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:52:51.584  INFO 4684 --- [nboundChannel-1] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:52:51.587  INFO 4684 --- [nboundChannel-4] minihearthstone.entities.deck.Deck       : Random pick index: 5
2019-07-24 17:52:51.587  INFO 4684 --- [nboundChannel-1] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-24 17:52:55.067  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : Received cardAttackServant() from player : 2611563983501498
2019-07-24 17:52:55.067  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or15639834800121836481279 | current : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : Checking ability to attack
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : performPreActionOpponentCardEffects()
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : playerCardsOnGround:
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] m.entities.cards.BasicCard               : ProvocationEffect -> Applying applyPreActionEffect() | target : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] m.entities.cards.BasicCard               : Opponent player : 1981563983500836
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] m.entities.cards.BasicCard               : Target also has provocation effect
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] m.entities.cards.BasicCard               : ProvocationEffect -> Applying applyPreActionEffect() | target : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] m.entities.cards.BasicCard               : Opponent player : 1981563983500836
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] m.entities.cards.BasicCard               : Target also has provocation effect
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:55.077  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:55.078  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:52:55.078  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:52:55.078  INFO 4684 --- [boundChannel-16] m.entities.cards.BasicCard               : Soldat du comtÚ-de-l'or15639834800121836481279 attacking Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:52:55.078  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : After attack :
2019-07-24 17:52:55.078  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : Soldat du comtÚ-de-l'or: 1/1/0
2019-07-24 17:52:55.078  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : Soldat du comtÚ-de-l'or: 1/1/2
2019-07-24 17:52:59.534  INFO 4684 --- [boundChannel-10] minihearthstone.controller.ClientProxy   : Received cardAttackServant() from player : 2611563983501498
2019-07-24 17:52:59.534  INFO 4684 --- [boundChannel-10] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:52:59.537  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:59.537  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : uniqueId : Sanglier brocheroc1563983514751844666447 | current : Sanglier brocheroc1563983514751844666447
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.controller.ClientProxy   : Checking ability to attack
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : performPreActionOpponentCardEffects()
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : playerCardsOnGround:
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] m.entities.cards.BasicCard               : ProvocationEffect -> Applying applyPreActionEffect() | target : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] m.entities.cards.BasicCard               : Opponent player : 1981563983500836
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] m.entities.cards.BasicCard               : Target also has provocation effect
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] m.entities.cards.BasicCard               : Sanglier brocheroc1563983514751844666447 attacking Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.controller.ClientProxy   : After attack :
2019-07-24 17:52:59.538  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : Soldat du comtÚ-de-l'or: 1/1/1
2019-07-24 17:52:59.557 ERROR 4684 --- [boundChannel-16] o.h.i.ExceptionMapperStandardImpl        : HHH000346: Error during managed flush [Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1]
2019-07-24 17:52:59.558  INFO 4684 --- [boundChannel-16] o.h.e.j.b.internal.AbstractBatchImpl     : HHH000010: On release of batch it still contained JDBC statements
2019-07-24 17:52:59.564 ERROR 4684 --- [boundChannel-16] .WebSocketAnnotationMethodMessageHandler : Unhandled exception from message handler method

org.springframework.orm.ObjectOptimisticLockingFailureException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1; nested exception is org.hibernate.StaleStateException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:338) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:253) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.JpaTransactionManager.doCommit(JpaTransactionManager.java:536) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.support.AbstractPlatformTransactionManager.processCommit(AbstractPlatformTransactionManager.java:746) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.support.AbstractPlatformTransactionManager.commit(AbstractPlatformTransactionManager.java:714) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.commitTransactionAfterReturning(TransactionAspectSupport.java:533) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:304) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:98) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:139) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:135) ~[spring-data-jpa-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:93) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.repository.core.support.SurroundingTransactionDetectorMethodInterceptor.invoke(SurroundingTransactionDetectorMethodInterceptor.java:61) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:212) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at com.sun.proxy.$Proxy110.save(Unknown Source) ~[na:na]
        at minihearthstone.facade.Facade.updateGameBoard(Facade.java:820) ~[main/:na]
        at minihearthstone.controller.ClientProxy.updateGameBoard(ClientProxy.java:244) ~[main/:na]
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_60]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_60]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_60]
        at java.lang.reflect.Method.invoke(Method.java:497) ~[na:1.8.0_60]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:170) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.invoke(InvocableHandlerMethod.java:120) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMatch(AbstractMethodMessageHandler.java:550) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:503) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:93) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessageInternal(AbstractMethodMessageHandler.java:505) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessage(AbstractMethodMessageHandler.java:439) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.support.ExecutorSubscribableChannel$SendTask.run(ExecutorSubscribableChannel.java:144) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.hibernate.StaleStateException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1
        at org.hibernate.jdbc.Expectations$BasicExpectation.checkBatched(Expectations.java:67) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.jdbc.Expectations$BasicExpectation.verifyOutcome(Expectations.java:54) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.jdbc.batch.internal.NonBatchingBatch.addToBatch(NonBatchingBatch.java:46) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.persister.entity.AbstractEntityPersister.delete(AbstractEntityPersister.java:3478) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.persister.entity.AbstractEntityPersister.delete(AbstractEntityPersister.java:3735) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.action.internal.EntityDeleteAction.execute(EntityDeleteAction.java:99) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.spi.ActionQueue.executeActions(ActionQueue.java:604) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.spi.ActionQueue.executeActions(ActionQueue.java:478) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.AbstractFlushingEventListener.performExecutions(AbstractFlushingEventListener.java:356) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultFlushEventListener.onFlush(DefaultFlushEventListener.java:39) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.doFlush(SessionImpl.java:1454) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.managedFlush(SessionImpl.java:511) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.flushBeforeTransactionCompletion(SessionImpl.java:3283) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.beforeTransactionCompletion(SessionImpl.java:2479) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.jdbc.internal.JdbcCoordinatorImpl.beforeTransactionCompletion(JdbcCoordinatorImpl.java:473) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorImpl.beforeCompletionCallback(JdbcResourceLocalTransactionCoordinatorImpl.java:178) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorImpl.access$300(JdbcResourceLocalTransactionCoordinatorImpl.java:39) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorImpl$TransactionDriverControlImpl.commit(JdbcResourceLocalTransactionCoordinatorImpl.java:271) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.transaction.internal.TransactionImpl.commit(TransactionImpl.java:98) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.springframework.orm.jpa.JpaTransactionManager.doCommit(JpaTransactionManager.java:532) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 33 common frames omitted

2019-07-24 17:53:04.308  INFO 4684 --- [boundChannel-12] minihearthstone.controller.ClientProxy   : Received useHeroSpecial() from player : 2611563983501498
2019-07-24 17:53:04.308  INFO 4684 --- [boundChannel-12] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:53:04.308  INFO 4684 --- [boundChannel-12] minihearthstone.controller.ClientProxy   : Hero : Hero[id=36, uniqueId='Hrothgar15639835146722107053539', name='Hrothgar', type=warrior, skillType='self', lifepoints=30,defense=0, description=Armure, lui confÚrant 2 points d'armure, specificHero='Warrior']
2019-07-24 17:53:04.308  INFO 4684 --- [boundChannel-12] m.entities.cards.BasicCard               : Applying Warrior on self specialSkill()
2019-07-24 17:53:08.137  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : Received chooseCard() from player : 2611563983501498
2019-07-24 17:53:08.137  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:53:08.137  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : Before update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='YÚti noroit15639835152531800871939; Chevaucheur de loup15639834800121738750369; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='']
2019-07-24 17:53:08.137  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:53:08.137  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:53:08.137  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : findCardInHandOfCardsByUniqueId in p2:
2019-07-24 17:53:08.137  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or15639834800121836481279 | current : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:53:08.137  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : Card after applyOnChoiceEffect() -> Card[id=38, uniqueId='Soldat du comtÚ-de-l'or15639834800121836481279', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15639834800121836481279', effect='ProvocationEffect', specificCard='null']
2019-07-24 17:53:08.137  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : Distinct cards: []
2019-07-24 17:53:08.151  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : After update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='YÚti noroit15639835152531800871939; Chevaucheur de loup15639834800121738750369; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='Soldat du comtÚ-de-l'or15639834800121836481279; ']
2019-07-24 17:53:56.957  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Receive end of turn from : 2611563983501498
2019-07-24 17:53:56.957  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:53:56.970  INFO 4684 --- [nboundChannel-5] minihearthstone.controller.ClientProxy   : Gameboard updated after end of turn : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='YÚti noroit15639835152531800871939; Chevaucheur de loup15639834800121738750369; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='Soldat du comtÚ-de-l'or15639834800121836481279; ']
2019-07-24 17:53:56.973  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 1981563983500836
2019-07-24 17:53:56.973  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:53:56.976  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:53:56.976  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 1981563983500836
2019-07-24 17:53:56.976  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:53:56.979  INFO 4684 --- [nboundChannel-4] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:53:56.979  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : Random pick index: 4
2019-07-24 17:53:56.981  INFO 4684 --- [nboundChannel-4] minihearthstone.entities.deck.Deck       : Random pick index: 1
2019-07-24 17:54:00.747  INFO 4684 --- [nboundChannel-6] minihearthstone.controller.ClientProxy   : Received chooseCard() from player : 1981563983500836
2019-07-24 17:54:00.747  INFO 4684 --- [nboundChannel-6] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:00.747  INFO 4684 --- [nboundChannel-6] minihearthstone.controller.ClientProxy   : Before update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='YÚti noroit15639835152531800871939; Chevaucheur de loup15639834800121738750369; YÚti noroit156398348001257666226; Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='Soldat du comtÚ-de-l'or15639834800121836481279; ']
2019-07-24 17:54:00.747  INFO 4684 --- [nboundChannel-6] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:54:00.747  INFO 4684 --- [nboundChannel-6] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:54:00.747  INFO 4684 --- [nboundChannel-6] minihearthstone.entities.deck.Deck       : findCardInHandOfCardsByUniqueId in p1:
2019-07-24 17:54:00.747  INFO 4684 --- [nboundChannel-6] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : YÚti noroit15639835152531800871939
2019-07-24 17:54:00.747  INFO 4684 --- [nboundChannel-6] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : Chevaucheur de loup15639834800121738750369
2019-07-24 17:54:00.747  INFO 4684 --- [nboundChannel-6] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : YÚti noroit156398348001257666226
2019-07-24 17:54:00.747  INFO 4684 --- [nboundChannel-6] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:54:00.747  INFO 4684 --- [nboundChannel-6] minihearthstone.controller.ClientProxy   : Card after applyOnChoiceEffect() -> Card[id=53, uniqueId='Soldat du comtÚ-de-l'or1563983480012504731893', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or1563983480012504731893', effect='ProvocationEffect', specificCard='null']
2019-07-24 17:54:00.747  INFO 4684 --- [nboundChannel-6] minihearthstone.entities.deck.Deck       : Distinct cards: []
2019-07-24 17:54:00.762  INFO 4684 --- [nboundChannel-6] minihearthstone.controller.ClientProxy   : After update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='YÚti noroit15639835152531800871939; Chevaucheur de loup15639834800121738750369; YÚti noroit156398348001257666226; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='Soldat du comtÚ-de-l'or15639834800121836481279; ']
2019-07-24 17:54:02.597  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : Received cardAttackServant() from player : 1981563983500836
2019-07-24 17:54:02.598  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:02.600  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:54:02.600  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:54:02.600  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:54:02.600  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:54:02.600  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : Checking ability to attack
2019-07-24 17:54:02.600  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : performPreActionOpponentCardEffects()
2019-07-24 17:54:02.600  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : playerCardsOnGround:
2019-07-24 17:54:02.600  INFO 4684 --- [nboundChannel-2] m.entities.cards.BasicCard               : ProvocationEffect -> Applying applyPreActionEffect() | target : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] m.entities.cards.BasicCard               : Opponent player : 2611563983501498
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or15639834800121836481279 | current : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] m.entities.cards.BasicCard               : Target also has provocation effect
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or15639834800121836481279 | current : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] m.entities.cards.BasicCard               : Soldat du comtÚ-de-l'or1563983480012504731893 attacking Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : After attack :
2019-07-24 17:54:02.601  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : Soldat du comtÚ-de-l'or: 1/1/1
2019-07-24 17:54:02.623 ERROR 4684 --- [boundChannel-11] o.h.i.ExceptionMapperStandardImpl        : HHH000346: Error during managed flush [Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1]
2019-07-24 17:54:02.623  INFO 4684 --- [boundChannel-11] o.h.e.j.b.internal.AbstractBatchImpl     : HHH000010: On release of batch it still contained JDBC statements
2019-07-24 17:54:02.626 ERROR 4684 --- [boundChannel-11] .WebSocketAnnotationMethodMessageHandler : Unhandled exception from message handler method

org.springframework.orm.ObjectOptimisticLockingFailureException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1; nested exception is org.hibernate.StaleStateException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:338) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:253) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.JpaTransactionManager.doCommit(JpaTransactionManager.java:536) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.support.AbstractPlatformTransactionManager.processCommit(AbstractPlatformTransactionManager.java:746) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.support.AbstractPlatformTransactionManager.commit(AbstractPlatformTransactionManager.java:714) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.commitTransactionAfterReturning(TransactionAspectSupport.java:533) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:304) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:98) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:139) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:135) ~[spring-data-jpa-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:93) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.repository.core.support.SurroundingTransactionDetectorMethodInterceptor.invoke(SurroundingTransactionDetectorMethodInterceptor.java:61) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:212) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at com.sun.proxy.$Proxy110.save(Unknown Source) ~[na:na]
        at minihearthstone.facade.Facade.updateGameBoard(Facade.java:820) ~[main/:na]
        at minihearthstone.controller.ClientProxy.updateGameBoard(ClientProxy.java:244) ~[main/:na]
        at sun.reflect.GeneratedMethodAccessor130.invoke(Unknown Source) ~[na:na]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_60]
        at java.lang.reflect.Method.invoke(Method.java:497) ~[na:1.8.0_60]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:170) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.invoke(InvocableHandlerMethod.java:120) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMatch(AbstractMethodMessageHandler.java:550) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:503) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:93) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessageInternal(AbstractMethodMessageHandler.java:505) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessage(AbstractMethodMessageHandler.java:439) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.support.ExecutorSubscribableChannel$SendTask.run(ExecutorSubscribableChannel.java:144) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.hibernate.StaleStateException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1
        at org.hibernate.jdbc.Expectations$BasicExpectation.checkBatched(Expectations.java:67) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.jdbc.Expectations$BasicExpectation.verifyOutcome(Expectations.java:54) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.jdbc.batch.internal.NonBatchingBatch.addToBatch(NonBatchingBatch.java:46) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.persister.entity.AbstractEntityPersister.delete(AbstractEntityPersister.java:3478) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.persister.entity.AbstractEntityPersister.delete(AbstractEntityPersister.java:3735) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.action.internal.EntityDeleteAction.execute(EntityDeleteAction.java:99) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.spi.ActionQueue.executeActions(ActionQueue.java:604) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
<=========----> 75% EXECUTING [3m 0s]
> :bootRun org.hibernate.event.internal.AbstractFlushingEventListener.performExecutions(AbstractFlushingEventListener.java:356) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
> :bootRun----> 75% EXECUTING [2m 59s]l.DefaultFlushEventListener.onFlush(DefaultFlushEventListener.java:39) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.doFlush(SessionImpl.java:1454) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
> :bootRun----> 75% EXECUTING [2m 59s]ionImpl.managedFlush(SessionImpl.java:511) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
2019-07-24 17:54:11.778  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Receive end of turn from : 1981563983500836nal]
2019-07-24 17:54:11.778  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:11.791  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Gameboard updated after end of turn : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,dbc.internal.JdbcResourceLocalTransactionCoordinatorImpl.beforeCompletionCallback(JdbcResourceLocalTransactionCoordinatorImpl.java:178)
p1HandOfCards='YÚti noroit15639835152531800871939; Chevaucheur de loup15639834800121738750369; YÚti noroit156398348001257666226; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',.JdbcResourceLocalTransactionCoordinatorImpl.access$300(JdbcResourceLocalTransactionCoordinatorImpl.java:39) ~[hibernate-cor
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='Soldat du comtÚ-de-l'or15639834800121836481279; ']JdbcResourceLocalTransactionCoordinatorImpl$TransactionDriverControlImpl.commit(JdbcResourceLocalTransactionCoordinatorImpl
2019-07-24 17:54:11.793  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 2611563983501498
2019-07-24 17:54:11.794  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:11.796  INFO 4684 --- [boundChannel-10] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 2611563983501498LEASE]
2019-07-24 17:54:11.797  INFO 4684 --- [boundChannel-10] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:11.797  INFO 4684 --- [boundChannel-16] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:54:11.798  INFO 4684 --- [nboundChannel-6] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 2611563983501498
2019-07-24 17:54:11.799  INFO 4684 --- [nboundChannel-6] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:11.802  INFO 4684 --- [boundChannel-16] minihearthstone.entities.deck.Deck       : Random pick index: 3
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.controller.ClientProxy   : Received chooseCard() from player : 2611563983501498
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.controller.ClientProxy   : Before update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,4 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : Random pick index: 1
p1HandOfCards='YÚti noroit15639835152531800871939; Chevaucheur de loup15639834800121738750369; YÚti noroit156398348001257666226; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; Chef de Raid1563983480012235190867; Soldat du comtÚ-de-l'or15639834800121836481279; Avocat commis d'office1563983480012519426043; ',
 p2CardsOnGround='Soldat du comtÚ-de-l'or15639834800121836481279; ']
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : findCardInHandOfCardsByUniqueId in p2:
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : uniqueId : Chef de Raid1563983480012235190867 | current : Tourbillon15639834800121409403186
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : uniqueId : Chef de Raid1563983480012235190867 | current : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : uniqueId : Chef de Raid1563983480012235190867 | current : Tourbillon15639834800121409403186
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : uniqueId : Chef de Raid1563983480012235190867 | current : Chef de Raid1563983480012235190867
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.controller.ClientProxy   : Card after applyOnChoiceEffect() -> Card[id=55, uniqueId='Chef de Raid1563983480012235190867', name='Chef de Raid', manacost=3, damage=2, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Chef de Raid1563983480012235190867', effect='null', specificCard='ChefDeRaid']
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : Distinct cards: [ChefDeRaid]
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : uniqueId : Chef de Raid1563983480012235190867 | current : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : uniqueId : Chef de Raid1563983480012235190867 | current : Chef de Raid1563983480012235190867
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] m.entities.cards.BasicCard               : Before applying ChefDeRaid specialSkill :
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : Soldat du comtÚ-de-l'or: 1/1/2
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : Soldat du comtÚ-de-l'or: 1/1/1
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : Chef de Raid: 3/3/2
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] m.entities.cards.BasicCard               : After applying ChefDeRaid specialSkill :
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : Soldat du comtÚ-de-l'or: 1/1/2
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : Soldat du comtÚ-de-l'or: 1/2/1
2019-07-24 17:54:43.257  INFO 4684 --- [boundChannel-13] minihearthstone.entities.deck.Deck       : Chef de Raid: 3/4/2
2019-07-24 17:54:43.276  INFO 4684 --- [boundChannel-13] minihearthstone.controller.ClientProxy   : After update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='YÚti noroit15639835152531800871939; Chevaucheur de loup15639834800121738750369; YÚti noroit156398348001257666226; ',
 p1CardsOnGround='Soldat du comtÚ-de-l'or1563983480012504731893; ',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Avocat commis d'office1563983480012519426043; ',
 p2CardsOnGround='Soldat du comtÚ-de-l'or15639834800121836481279; Chef de Raid1563983480012235190867; ']
2019-07-24 17:54:47.328  INFO 4684 --- [boundChannel-14] minihearthstone.controller.ClientProxy   : Received cardAttackServant() from player : 2611563983501498
2019-07-24 17:54:47.328  INFO 4684 --- [boundChannel-14] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or15639834800121836481279 | current : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.controller.ClientProxy   : Checking ability to attack
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : performPreActionOpponentCardEffects()
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : playerCardsOnGround:
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] m.entities.cards.BasicCard               : ProvocationEffect -> Applying applyPreActionEffect() | target : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] m.entities.cards.BasicCard               : Opponent player : 1981563983500836
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] m.entities.cards.BasicCard               : Target also has provocation effect
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or1563983480012504731893 | current : Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] m.entities.cards.BasicCard               : Soldat du comtÚ-de-l'or15639834800121836481279 attacking Soldat du comtÚ-de-l'or1563983480012504731893
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.controller.ClientProxy   : After attack :
2019-07-24 17:54:47.331  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : Soldat du comtÚ-de-l'or: 1/1/0
2019-07-24 17:54:47.356 ERROR 4684 --- [boundChannel-10] .WebSocketAnnotationMethodMessageHandler : Unhandled exception from message handler method

org.springframework.orm.jpa.JpaObjectRetrievalFailureException: Unable to find minihearthstone.entities.cards.Card with id 54; nested exception is javax.persistence.EntityNotFoundException: Unable to find minihearthstone.entities.cards.Card with id 54
        at org.springframework.orm.jpa.EntityManagerFactoryUtils.convertJpaAccessExceptionIfPossible(EntityManagerFactoryUtils.java:372) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:255) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:527) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:153) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:135) ~[spring-data-jpa-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:93) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.repository.core.support.SurroundingTransactionDetectorMethodInterceptor.invoke(SurroundingTransactionDetectorMethodInterceptor.java:61) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:212) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at com.sun.proxy.$Proxy110.save(Unknown Source) ~[na:na]
        at minihearthstone.facade.Facade.updateGameBoard(Facade.java:820) ~[main/:na]
        at minihearthstone.controller.ClientProxy.updateGameBoard(ClientProxy.java:244) ~[main/:na]
        at sun.reflect.GeneratedMethodAccessor130.invoke(Unknown Source) ~[na:na]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_60]
        at java.lang.reflect.Method.invoke(Method.java:497) ~[na:1.8.0_60]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:170) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.invoke(InvocableHandlerMethod.java:120) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMatch(AbstractMethodMessageHandler.java:550) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:503) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:93) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessageInternal(AbstractMethodMessageHandler.java:505) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessage(AbstractMethodMessageHandler.java:439) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.support.ExecutorSubscribableChannel$SendTask.run(ExecutorSubscribableChannel.java:144) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: javax.persistence.EntityNotFoundException: Unable to find minihearthstone.entities.cards.Card with id 54
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl$JpaEntityNotFoundDelegate.handleEntityNotFound(EntityManagerFactoryBuilderImpl.java:162) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultLoadEventListener.load(DefaultLoadEventListener.java:230) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultLoadEventListener.proxyOrLoad(DefaultLoadEventListener.java:281) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultLoadEventListener.doOnLoad(DefaultLoadEventListener.java:124) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultLoadEventListener.onLoad(DefaultLoadEventListener.java:92) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.fireLoad(SessionImpl.java:1257) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.internalLoad(SessionImpl.java:1140) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.EntityType.resolveIdentifier(EntityType.java:682) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.EntityType.resolve(EntityType.java:464) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.ManyToOneType.resolve(ManyToOneType.java:239) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.EntityType.resolve(EntityType.java:457) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.EntityType.replace(EntityType.java:358) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.CollectionType.preserveSnapshot(CollectionType.java:592) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.CollectionType.replaceElements(CollectionType.java:566) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.CollectionType.replace(CollectionType.java:699) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.TypeHelper.replace(TypeHelper.java:163) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultMergeEventListener.copyValues(DefaultMergeEventListener.java:393) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultMergeEventListener.entityIsDetached(DefaultMergeEventListener.java:327) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultMergeEventListener.onMerge(DefaultMergeEventListener.java:170) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultMergeEventListener.onMerge(DefaultMergeEventListener.java:69) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.fireMerge(SessionImpl.java:901) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.merge(SessionImpl.java:887) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at sun.reflect.GeneratedMethodAccessor94.invoke(Unknown Source) ~[na:na]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_60]
        at java.lang.reflect.Method.invoke(Method.java:497) ~[na:1.8.0_60]
        at org.springframework.orm.jpa.SharedEntityManagerCreator$SharedEntityManagerInvocationHandler.invoke(SharedEntityManagerCreator.java:308) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at com.sun.proxy.$Proxy102.merge(Unknown Source) ~[na:na]
        at org.springframework.data.jpa.repository.support.SimpleJpaRepository.save(SimpleJpaRepository.java:492) ~[spring-data-jpa-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at sun.reflect.GeneratedMethodAccessor73.invoke(Unknown Source) ~[na:na]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_60]
        at java.lang.reflect.Method.invoke(Method.java:497) ~[na:1.8.0_60]
        at org.springframework.data.repository.core.support.RepositoryComposition$RepositoryFragments.invoke(RepositoryComposition.java:359) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.data.repository.core.support.RepositoryComposition.invoke(RepositoryComposition.java:200) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.data.repository.core.support.RepositoryFactorySupport$ImplementationMethodExecutionInterceptor.invoke(RepositoryFactorySupport.java:644) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.doInvoke(RepositoryFactorySupport.java:608) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.lambda$invoke$3(RepositoryFactorySupport.java:595) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.invoke(RepositoryFactorySupport.java:595) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.projection.DefaultMethodInvokingMethodInterceptor.invoke(DefaultMethodInvokingMethodInterceptor.java:59) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:294) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:98) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:139) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:54:47.361 ERROR 4684 --- [nboundChannel-1] o.h.i.ExceptionMapperStandardImpl        : HHH000346: Error during managed flush [Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1]
2019-07-24 17:54:47.361  INFO 4684 --- [nboundChannel-1] o.h.e.j.b.internal.AbstractBatchImpl     : HHH000010: On release of batch it still contained JDBC statements
2019-07-24 17:54:47.364 ERROR 4684 --- [nboundChannel-1] .WebSocketAnnotationMethodMessageHandler : Unhandled exception from message handler method

org.springframework.orm.ObjectOptimisticLockingFailureException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1; nested exception is org.hibernate.StaleStateException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:338) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:253) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.JpaTransactionManager.doCommit(JpaTransactionManager.java:536) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.support.AbstractPlatformTransactionManager.processCommit(AbstractPlatformTransactionManager.java:746) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.support.AbstractPlatformTransactionManager.commit(AbstractPlatformTransactionManager.java:714) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.commitTransactionAfterReturning(TransactionAspectSupport.java:533) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:304) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:98) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:139) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:135) ~[spring-data-jpa-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:93) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.repository.core.support.SurroundingTransactionDetectorMethodInterceptor.invoke(SurroundingTransactionDetectorMethodInterceptor.java:61) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:212) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at com.sun.proxy.$Proxy110.save(Unknown Source) ~[na:na]
        at minihearthstone.facade.Facade.updateGameBoard(Facade.java:820) ~[main/:na]
        at minihearthstone.controller.ClientProxy.updateGameBoard(ClientProxy.java:244) ~[main/:na]
        at sun.reflect.GeneratedMethodAccessor130.invoke(Unknown Source) ~[na:na]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_60]
        at java.lang.reflect.Method.invoke(Method.java:497) ~[na:1.8.0_60]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:170) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.invoke(InvocableHandlerMethod.java:120) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMatch(AbstractMethodMessageHandler.java:550) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:503) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:93) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessageInternal(AbstractMethodMessageHandler.java:505) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessage(AbstractMethodMessageHandler.java:439) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.support.ExecutorSubscribableChannel$SendTask.run(ExecutorSubscribableChannel.java:144) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.hibernate.StaleStateException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1
        at org.hibernate.jdbc.Expectations$BasicExpectation.checkBatched(Expectations.java:67) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.jdbc.Expectations$BasicExpectation.verifyOutcome(Expectations.java:54) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.jdbc.batch.internal.NonBatchingBatch.addToBatch(NonBatchingBatch.java:46) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.persister.entity.AbstractEntityPersister.delete(AbstractEntityPersister.java:3478) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.persister.entity.AbstractEntityPersister.delete(AbstractEntityPersister.java:3735) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.action.internal.EntityDeleteAction.execute(EntityDeleteAction.java:99) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.spi.ActionQueue.executeActions(ActionQueue.java:604) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.spi.ActionQueue.executeActions(ActionQueue.java:478) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.AbstractFlushingEventListener.performExecutions(AbstractFlushingEventListener.java:356) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultFlushEventListener.onFlush(DefaultFlushEventListener.java:39) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.doFlush(SessionImpl.java:1454) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.managedFlush(SessionImpl.java:511) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.flushBeforeTransactionCompletion(SessionImpl.java:3283) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.beforeTransactionCompletion(SessionImpl.java:2479) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.jdbc.internal.JdbcCoordinatorImpl.beforeTransactionCompletion(JdbcCoordinatorImpl.java:473) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorImpl.beforeCompletionCallback(JdbcResourceLocalTransactionCoordinatorImpl.java:178) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorImpl.access$300(JdbcResourceLocalTransactionCoordinatorImpl.java:39) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorImpl$TransactionDriverControlImpl.commit(JdbcResourceLocalTransactionCoordinatorImpl.java:271) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.transaction.internal.TransactionImpl.commit(TransactionImpl.java:98) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.springframework.orm.jpa.JpaTransactionManager.doCommit(JpaTransactionManager.java:532) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 32 common frames omitted

2019-07-24 17:54:51.703  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Receive end of turn from : 2611563983501498
2019-07-24 17:54:51.703  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:51.714  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Gameboard updated after end of turn : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='YÚti noroit15639835152531800871939; Chevaucheur de loup15639834800121738750369; YÚti noroit156398348001257666226; ',
 p1CardsOnGround='',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Avocat commis d'office1563983480012519426043; ',
 p2CardsOnGround='Chef de Raid1563983480012235190867; ']
2019-07-24 17:54:51.717  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 1981563983500836
2019-07-24 17:54:51.717  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:51.718  INFO 4684 --- [boundChannel-14] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 1981563983500836
2019-07-24 17:54:51.718  INFO 4684 --- [boundChannel-14] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:51.719  INFO 4684 --- [boundChannel-10] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 1981563983500836
2019-07-24 17:54:51.719  INFO 4684 --- [boundChannel-10] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:51.720  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:54:51.720  INFO 4684 --- [boundChannel-14] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:54:51.721  INFO 4684 --- [boundChannel-10] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:54:51.722  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-24 17:54:51.723  INFO 4684 --- [boundChannel-10] minihearthstone.entities.deck.Deck       : Random pick index: 0
2019-07-24 17:54:51.723  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : Random pick index: 6
2019-07-24 17:54:56.875  INFO 4684 --- [nboundChannel-1] minihearthstone.controller.ClientProxy   : Received chooseCard() from player : 1981563983500836
2019-07-24 17:54:56.875  INFO 4684 --- [nboundChannel-1] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:56.875  INFO 4684 --- [nboundChannel-1] minihearthstone.controller.ClientProxy   : Before update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='YÚti noroit15639835152531800871939; Chevaucheur de loup15639834800121738750369; YÚti noroit156398348001257666226; Chevaucheur de loup15639834800121738750369; BÚnÚdiction de puissance15639834800121335405770; Sanglier brocheroc1563983480012515187385; ',
 p1CardsOnGround='',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Avocat commis d'office1563983480012519426043; ',
 p2CardsOnGround='Chef de Raid1563983480012235190867; ']
2019-07-24 17:54:56.875  INFO 4684 --- [nboundChannel-1] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:54:56.875  INFO 4684 --- [nboundChannel-1] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:54:56.875  INFO 4684 --- [nboundChannel-1] minihearthstone.entities.deck.Deck       : findCardInHandOfCardsByUniqueId in p1:
2019-07-24 17:54:56.875  INFO 4684 --- [nboundChannel-1] minihearthstone.entities.deck.Deck       : uniqueId : Chevaucheur de loup15639834800121738750369 | current : YÚti noroit15639835152531800871939
2019-07-24 17:54:56.875  INFO 4684 --- [nboundChannel-1] minihearthstone.entities.deck.Deck       : uniqueId : Chevaucheur de loup15639834800121738750369 | current : Chevaucheur de loup15639834800121738750369
2019-07-24 17:54:56.875  INFO 4684 --- [nboundChannel-1] m.entities.cards.BasicCard               : ChargeEffect -> Applying applyOnChoiceEffect()
2019-07-24 17:54:56.875  INFO 4684 --- [nboundChannel-1] minihearthstone.controller.ClientProxy   : Card after applyOnChoiceEffect() -> Card[id=47, uniqueId='Chevaucheur de loup15639834800121738750369', name='Chevaucheur de loup', manacost=3, damage=3, lifepoints=1, nature='servant', canAttack=true, currentTargetUniqueId='Chevaucheur de loup15639834800121738750369', effect='ChargeEffect', specificCard='null']
2019-07-24 17:54:56.875  INFO 4684 --- [nboundChannel-1] minihearthstone.entities.deck.Deck       : Distinct cards: []
2019-07-24 17:54:56.896  INFO 4684 --- [nboundChannel-1] minihearthstone.controller.ClientProxy   : After update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='YÚti noroit15639835152531800871939; YÚti noroit156398348001257666226; Chevaucheur de loup15639834800121738750369; BÚnÚdiction de puissance15639834800121335405770; Sanglier brocheroc1563983480012515187385; ',
 p1CardsOnGround='Chevaucheur de loup15639834800121738750369; ',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Avocat commis d'office1563983480012519426043; ',
 p2CardsOnGround='Chef de Raid1563983480012235190867; ']
2019-07-24 17:54:59.552  INFO 4684 --- [boundChannel-14] minihearthstone.controller.ClientProxy   : Received cardAttackServant() from player : 1981563983500836
2019-07-24 17:54:59.552  INFO 4684 --- [boundChannel-14] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : uniqueId : Chevaucheur de loup15639834800121738750369 | current : Chevaucheur de loup15639834800121738750369
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.controller.ClientProxy   : Checking ability to attack
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : performPreActionOpponentCardEffects()
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : playerCardsOnGround:
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : findCardOnGroundByUniqueId in p1:
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : uniqueId : Chef de Raid1563983480012235190867 | current : Chef de Raid1563983480012235190867
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] m.entities.cards.BasicCard               : Chevaucheur de loup15639834800121738750369 attacking Chef de Raid1563983480012235190867
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.controller.ClientProxy   : After attack :
2019-07-24 17:54:59.555  INFO 4684 --- [boundChannel-14] minihearthstone.entities.deck.Deck       : Chef de Raid: 3/4/0
2019-07-24 17:54:59.581 ERROR 4684 --- [nboundChannel-7] .WebSocketAnnotationMethodMessageHandler : Unhandled exception from message handler method

org.springframework.orm.jpa.JpaObjectRetrievalFailureException: Unable to find minihearthstone.entities.cards.Card with id 62; nested exception is javax.persistence.EntityNotFoundException: Unable to find minihearthstone.entities.cards.Card with id 62
        at org.springframework.orm.jpa.EntityManagerFactoryUtils.convertJpaAccessExceptionIfPossible(EntityManagerFactoryUtils.java:372) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:255) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:527) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:153) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:135) ~[spring-data-jpa-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:93) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.repository.core.support.SurroundingTransactionDetectorMethodInterceptor.invoke(SurroundingTransactionDetectorMethodInterceptor.java:61) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:212) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at com.sun.proxy.$Proxy110.save(Unknown Source) ~[na:na]
        at minihearthstone.facade.Facade.updateGameBoard(Facade.java:820) ~[main/:na]
        at minihearthstone.controller.ClientProxy.updateGameBoard(ClientProxy.java:244) ~[main/:na]
        at sun.reflect.GeneratedMethodAccessor130.invoke(Unknown Source) ~[na:na]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_60]
        at java.lang.reflect.Method.invoke(Method.java:497) ~[na:1.8.0_60]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:170) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.invoke(InvocableHandlerMethod.java:120) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMatch(AbstractMethodMessageHandler.java:550) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:503) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:93) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessageInternal(AbstractMethodMessageHandler.java:505) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessage(AbstractMethodMessageHandler.java:439) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.support.ExecutorSubscribableChannel$SendTask.run(ExecutorSubscribableChannel.java:144) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: javax.persistence.EntityNotFoundException: Unable to find minihearthstone.entities.cards.Card with id 62
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl$JpaEntityNotFoundDelegate.handleEntityNotFound(EntityManagerFactoryBuilderImpl.java:162) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultLoadEventListener.load(DefaultLoadEventListener.java:230) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultLoadEventListener.proxyOrLoad(DefaultLoadEventListener.java:281) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultLoadEventListener.doOnLoad(DefaultLoadEventListener.java:124) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultLoadEventListener.onLoad(DefaultLoadEventListener.java:92) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.fireLoad(SessionImpl.java:1257) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.internalLoad(SessionImpl.java:1140) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.EntityType.resolveIdentifier(EntityType.java:682) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.EntityType.resolve(EntityType.java:464) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.ManyToOneType.resolve(ManyToOneType.java:239) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.EntityType.resolve(EntityType.java:457) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.EntityType.replace(EntityType.java:358) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.CollectionType.preserveSnapshot(CollectionType.java:592) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.CollectionType.replaceElements(CollectionType.java:566) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.CollectionType.replace(CollectionType.java:699) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.type.TypeHelper.replace(TypeHelper.java:163) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultMergeEventListener.copyValues(DefaultMergeEventListener.java:393) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultMergeEventListener.entityIsDetached(DefaultMergeEventListener.java:327) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultMergeEventListener.onMerge(DefaultMergeEventListener.java:170) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultMergeEventListener.onMerge(DefaultMergeEventListener.java:69) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.fireMerge(SessionImpl.java:901) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.merge(SessionImpl.java:887) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at sun.reflect.GeneratedMethodAccessor94.invoke(Unknown Source) ~[na:na]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_60]
        at java.lang.reflect.Method.invoke(Method.java:497) ~[na:1.8.0_60]
        at org.springframework.orm.jpa.SharedEntityManagerCreator$SharedEntityManagerInvocationHandler.invoke(SharedEntityManagerCreator.java:308) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at com.sun.proxy.$Proxy102.merge(Unknown Source) ~[na:na]
        at org.springframework.data.jpa.repository.support.SimpleJpaRepository.save(SimpleJpaRepository.java:492) ~[spring-data-jpa-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at sun.reflect.GeneratedMethodAccessor73.invoke(Unknown Source) ~[na:na]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_60]
        at java.lang.reflect.Method.invoke(Method.java:497) ~[na:1.8.0_60]
        at org.springframework.data.repository.core.support.RepositoryComposition$RepositoryFragments.invoke(RepositoryComposition.java:359) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.data.repository.core.support.RepositoryComposition.invoke(RepositoryComposition.java:200) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.data.repository.core.support.RepositoryFactorySupport$ImplementationMethodExecutionInterceptor.invoke(RepositoryFactorySupport.java:644) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.doInvoke(RepositoryFactorySupport.java:608) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.lambda$invoke$3(RepositoryFactorySupport.java:595) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.invoke(RepositoryFactorySupport.java:595) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.projection.DefaultMethodInvokingMethodInterceptor.invoke(DefaultMethodInvokingMethodInterceptor.java:59) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:294) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:98) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:139) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:04.656  INFO 4684 --- [nboundChannel-7] minihearthstone.controller.ClientProxy   : Received chooseCard() from player : 1981563983500836
2019-07-24 17:55:04.656  INFO 4684 --- [nboundChannel-7] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:55:04.666  INFO 4684 --- [nboundChannel-7] minihearthstone.controller.ClientProxy   : Before update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='YÚti noroit15639835152531800871939; YÚti noroit156398348001257666226; Chevaucheur de loup15639834800121738750369; BÚnÚdiction de puissance15639834800121335405770; Sanglier brocheroc1563983480012515187385; ',
 p1CardsOnGround='',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Avocat commis d'office1563983480012519426043; ',
 p2CardsOnGround='']
2019-07-24 17:55:04.666  INFO 4684 --- [nboundChannel-7] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:55:04.666  INFO 4684 --- [nboundChannel-7] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:55:04.666  INFO 4684 --- [nboundChannel-7] minihearthstone.entities.deck.Deck       : findCardInHandOfCardsByUniqueId in p1:
2019-07-24 17:55:04.666  INFO 4684 --- [nboundChannel-7] minihearthstone.entities.deck.Deck       : uniqueId : Sanglier brocheroc1563983480012515187385 | current : YÚti noroit15639835152531800871939
2019-07-24 17:55:04.666  INFO 4684 --- [nboundChannel-7] minihearthstone.entities.deck.Deck       : uniqueId : Sanglier brocheroc1563983480012515187385 | current : YÚti noroit156398348001257666226
2019-07-24 17:55:04.666  INFO 4684 --- [nboundChannel-7] minihearthstone.entities.deck.Deck       : uniqueId : Sanglier brocheroc1563983480012515187385 | current : Chevaucheur de loup15639834800121738750369
2019-07-24 17:55:04.666  INFO 4684 --- [nboundChannel-7] minihearthstone.entities.deck.Deck       : uniqueId : Sanglier brocheroc1563983480012515187385 | current : BÚnÚdiction de puissance15639834800121335405770
2019-07-24 17:55:04.666  INFO 4684 --- [nboundChannel-7] minihearthstone.entities.deck.Deck       : uniqueId : Sanglier brocheroc1563983480012515187385 | current : Sanglier brocheroc1563983480012515187385
2019-07-24 17:55:04.666  INFO 4684 --- [nboundChannel-7] minihearthstone.controller.ClientProxy   : Card after applyOnChoiceEffect() -> Card[id=61, uniqueId='Sanglier brocheroc1563983480012515187385', name='Sanglier brocheroc', manacost=1, damage=1, lifepoints=1, nature='servant', canAttack=false, currentTargetUniqueId='Sanglier brocheroc1563983480012515187385', effect='null', specificCard='null']
2019-07-24 17:55:04.666  INFO 4684 --- [nboundChannel-7] minihearthstone.entities.deck.Deck       : Distinct cards: []
2019-07-24 17:55:04.666  INFO 4684 --- [nboundChannel-7] minihearthstone.controller.ClientProxy   : After update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=1981563983500836,
p1HandOfCards='YÚti noroit15639835152531800871939; YÚti noroit156398348001257666226; Chevaucheur de loup15639834800121738750369; BÚnÚdiction de puissance15639834800121335405770; ',
 p1CardsOnGround='Sanglier brocheroc1563983480012515187385; ',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Avocat commis d'office1563983480012519426043; ',
 p2CardsOnGround='']
2019-07-24 17:55:07.261  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Receive end of turn from : 1981563983500836
2019-07-24 17:55:07.261  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:55:07.270  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Gameboard updated after end of turn : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='YÚti noroit15639835152531800871939; YÚti noroit156398348001257666226; Chevaucheur de loup15639834800121738750369; BÚnÚdiction de puissance15639834800121335405770; ',
 p1CardsOnGround='Sanglier brocheroc1563983480012515187385; ',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Avocat commis d'office1563983480012519426043; ',
 p2CardsOnGround='']
2019-07-24 17:55:07.273  INFO 4684 --- [nboundChannel-6] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 2611563983501498
2019-07-24 17:55:07.273  INFO 4684 --- [nboundChannel-6] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:55:07.275  INFO 4684 --- [nboundChannel-6] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:55:07.276  INFO 4684 --- [boundChannel-11] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 2611563983501498
2019-07-24 17:55:07.276  INFO 4684 --- [boundChannel-11] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:55:07.277  INFO 4684 --- [boundChannel-12] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 2611563983501498
2019-07-24 17:55:07.277  INFO 4684 --- [boundChannel-12] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:55:07.278  INFO 4684 --- [boundChannel-11] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:55:07.278  INFO 4684 --- [nboundChannel-6] minihearthstone.entities.deck.Deck       : Random pick index: 5
2019-07-24 17:55:07.278  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : Notifiy end of turn to : 2611563983501498
2019-07-24 17:55:07.279  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:55:07.279  INFO 4684 --- [boundChannel-12] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:55:07.281  INFO 4684 --- [nboundChannel-2] minihearthstone.controller.ClientProxy   : There's less than 7 cards in hand
2019-07-24 17:55:07.281  INFO 4684 --- [boundChannel-11] minihearthstone.entities.deck.Deck       : Random pick index: 2
2019-07-24 17:55:07.281  INFO 4684 --- [boundChannel-12] minihearthstone.entities.deck.Deck       : Random pick index: 4
2019-07-24 17:55:07.284  INFO 4684 --- [nboundChannel-2] minihearthstone.entities.deck.Deck       : Random pick index: 5
2019-07-24 17:55:15.747  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Received chooseCard() from player : 2611563983501498
2019-07-24 17:55:15.747  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:55:15.747  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Before update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='YÚti noroit15639835152531800871939; YÚti noroit156398348001257666226; Chevaucheur de loup15639834800121738750369; BÚnÚdiction de puissance15639834800121335405770; ',
 p1CardsOnGround='Sanglier brocheroc1563983480012515187385; ',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Avocat commis d'office1563983480012519426043; Tourbillon15639834800121409403186; YÚti noroit1563983480012177711517; Chevaucheur de loup15639834800121728428645; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='']
2019-07-24 17:55:15.747  INFO 4684 --- [nboundChannel-3] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:55:15.747  INFO 4684 --- [nboundChannel-3] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:55:15.747  INFO 4684 --- [nboundChannel-3] minihearthstone.entities.deck.Deck       : findCardInHandOfCardsByUniqueId in p2:
2019-07-24 17:55:15.747  INFO 4684 --- [nboundChannel-3] minihearthstone.entities.deck.Deck       : uniqueId : Tourbillon15639834800121409403186 | current : Tourbillon15639834800121409403186
2019-07-24 17:55:15.747  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Card after applyOnChoiceEffect() -> Card[id=44, uniqueId='Tourbillon15639834800121409403186', name='Tourbillon', manacost=1, damage=1, lifepoints=0, nature='spell', canAttack=false, currentTargetUniqueId='Tourbillon15639834800121409403186', effect='null', specificCard='Tourbillon']
2019-07-24 17:55:15.760  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : After update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='YÚti noroit15639835152531800871939; YÚti noroit156398348001257666226; Chevaucheur de loup15639834800121738750369; BÚnÚdiction de puissance15639834800121335405770; ',
 p1CardsOnGround='Sanglier brocheroc1563983480012515187385; ',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Avocat commis d'office1563983480012519426043; Tourbillon15639834800121409403186; YÚti noroit1563983480012177711517; Chevaucheur de loup15639834800121728428645; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='']
2019-07-24 17:55:15.767 ERROR 4684 --- [nboundChannel-3] o.h.i.ExceptionMapperStandardImpl        : HHH000346: Error during managed flush [Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1]
2019-07-24 17:55:15.767  INFO 4684 --- [nboundChannel-3] o.h.e.j.b.internal.AbstractBatchImpl     : HHH000010: On release of batch it still contained JDBC statements
2019-07-24 17:55:15.767 ERROR 4684 --- [nboundChannel-3] .WebSocketAnnotationMethodMessageHandler : Unhandled exception from message handler method

org.springframework.orm.ObjectOptimisticLockingFailureException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1; nested exception is org.hibernate.StaleStateException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:338) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:253) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.JpaTransactionManager.doCommit(JpaTransactionManager.java:536) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.support.AbstractPlatformTransactionManager.processCommit(AbstractPlatformTransactionManager.java:746) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.support.AbstractPlatformTransactionManager.commit(AbstractPlatformTransactionManager.java:714) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.commitTransactionAfterReturning(TransactionAspectSupport.java:533) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:304) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:98) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:139) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:135) ~[spring-data-jpa-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:93) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.repository.core.support.SurroundingTransactionDetectorMethodInterceptor.invoke(SurroundingTransactionDetectorMethodInterceptor.java:61) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:212) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at com.sun.proxy.$Proxy110.save(Unknown Source) ~[na:na]
        at minihearthstone.facade.Facade.updateGameBoard(Facade.java:820) ~[main/:na]
        at minihearthstone.controller.ClientProxy.updateGameBoard(ClientProxy.java:244) ~[main/:na]
        at sun.reflect.GeneratedMethodAccessor130.invoke(Unknown Source) ~[na:na]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_60]
        at java.lang.reflect.Method.invoke(Method.java:497) ~[na:1.8.0_60]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:170) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.invoke(InvocableHandlerMethod.java:120) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMatch(AbstractMethodMessageHandler.java:550) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:503) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:93) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessageInternal(AbstractMethodMessageHandler.java:505) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessage(AbstractMethodMessageHandler.java:439) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.support.ExecutorSubscribableChannel$SendTask.run(ExecutorSubscribableChannel.java:144) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.hibernate.StaleStateException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1
        at org.hibernate.jdbc.Expectations$BasicExpectation.checkBatched(Expectations.java:67) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.jdbc.Expectations$BasicExpectation.verifyOutcome(Expectations.java:54) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.jdbc.batch.internal.NonBatchingBatch.addToBatch(NonBatchingBatch.java:46) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.persister.entity.AbstractEntityPersister.delete(AbstractEntityPersister.java:3478) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.persister.entity.AbstractEntityPersister.delete(AbstractEntityPersister.java:3735) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.action.internal.EntityDeleteAction.execute(EntityDeleteAction.java:99) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.spi.ActionQueue.executeActions(ActionQueue.java:604) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.spi.ActionQueue.executeActions(ActionQueue.java:478) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.AbstractFlushingEventListener.performExecutions(AbstractFlushingEventListener.java:356) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultFlushEventListener.onFlush(DefaultFlushEventListener.java:39) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.doFlush(SessionImpl.java:1454) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.managedFlush(SessionImpl.java:511) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.flushBeforeTransactionCompletion(SessionImpl.java:3283) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.beforeTransactionCompletion(SessionImpl.java:2479) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.jdbc.internal.JdbcCoordinatorImpl.beforeTransactionCompletion(JdbcCoordinatorImpl.java:473) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorImpl.beforeCompletionCallback(JdbcResourceLocalTransactionCoordinatorImpl.java:178) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorImpl.access$300(JdbcResourceLocalTransactionCoordinatorImpl.java:39) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorImpl$TransactionDriverControlImpl.commit(JdbcResourceLocalTransactionCoordinatorImpl.java:271) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.transaction.internal.TransactionImpl.commit(TransactionImpl.java:98) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.springframework.orm.jpa.JpaTransactionManager.doCommit(JpaTransactionManager.java:532) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 32 common frames omitted

2019-07-24 17:55:15.776 ERROR 4684 --- [boundChannel-13] o.h.i.ExceptionMapperStandardImpl        : HHH000346: Error during managed flush [Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1]
2019-07-24 17:55:15.776  INFO 4684 --- [boundChannel-13] o.h.e.j.b.internal.AbstractBatchImpl     : HHH000010: On release of batch it still contained JDBC statements
2019-07-24 17:55:15.780 ERROR 4684 --- [boundChannel-13] .WebSocketAnnotationMethodMessageHandler : Unhandled exception from message handler method

org.springframework.orm.ObjectOptimisticLockingFailureException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1; nested exception is org.hibernate.StaleStateException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:338) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:253) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.orm.jpa.JpaTransactionManager.doCommit(JpaTransactionManager.java:536) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.support.AbstractPlatformTransactionManager.processCommit(AbstractPlatformTransactionManager.java:746) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.support.AbstractPlatformTransactionManager.commit(AbstractPlatformTransactionManager.java:714) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.commitTransactionAfterReturning(TransactionAspectSupport.java:533) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:304) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:98) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:139) ~[spring-tx-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:135) ~[spring-data-jpa-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:93) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.data.repository.core.support.SurroundingTransactionDetectorMethodInterceptor.invoke(SurroundingTransactionDetectorMethodInterceptor.java:61) ~[spring-data-commons-2.1.3.RELEASE.jar:2.1.3.RELEASE]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:212) ~[spring-aop-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at com.sun.proxy.$Proxy110.save(Unknown Source) ~[na:na]
        at minihearthstone.facade.Facade.updateGameBoard(Facade.java:820) ~[main/:na]
        at minihearthstone.controller.ClientProxy.updateGameBoard(ClientProxy.java:244) ~[main/:na]
        at sun.reflect.GeneratedMethodAccessor130.invoke(Unknown Source) ~[na:na]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_60]
        at java.lang.reflect.Method.invoke(Method.java:497) ~[na:1.8.0_60]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:170) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.InvocableHandlerMethod.invoke(InvocableHandlerMethod.java:120) ~[spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMatch(AbstractMethodMessageHandler.java:550) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:503) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler.handleMatch(SimpAnnotationMethodMessageHandler.java:93) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessageInternal(AbstractMethodMessageHandler.java:505) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.handler.invocation.AbstractMethodMessageHandler.handleMessage(AbstractMethodMessageHandler.java:439) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.messaging.support.ExecutorSubscribableChannel$SendTask.run(ExecutorSubscribableChannel.java:144) [spring-messaging-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.hibernate.StaleStateException: Batch update returned unexpected row count from update [0]; actual row count: 0; expected: 1
        at org.hibernate.jdbc.Expectations$BasicExpectation.checkBatched(Expectations.java:67) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.jdbc.Expectations$BasicExpectation.verifyOutcome(Expectations.java:54) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.jdbc.batch.internal.NonBatchingBatch.addToBatch(NonBatchingBatch.java:46) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.persister.entity.AbstractEntityPersister.delete(AbstractEntityPersister.java:3478) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.persister.entity.AbstractEntityPersister.delete(AbstractEntityPersister.java:3735) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.action.internal.EntityDeleteAction.execute(EntityDeleteAction.java:99) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.spi.ActionQueue.executeActions(ActionQueue.java:604) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.spi.ActionQueue.executeActions(ActionQueue.java:478) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.AbstractFlushingEventListener.performExecutions(AbstractFlushingEventListener.java:356) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.event.internal.DefaultFlushEventListener.onFlush(DefaultFlushEventListener.java:39) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.doFlush(SessionImpl.java:1454) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.managedFlush(SessionImpl.java:511) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.flushBeforeTransactionCompletion(SessionImpl.java:3283) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.internal.SessionImpl.beforeTransactionCompletion(SessionImpl.java:2479) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.jdbc.internal.JdbcCoordinatorImpl.beforeTransactionCompletion(JdbcCoordinatorImpl.java:473) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorImpl.beforeCompletionCallback(JdbcResourceLocalTransactionCoordinatorImpl.java:178) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorImpl.access$300(JdbcResourceLocalTransactionCoordinatorImpl.java:39) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcResourceLocalTransactionCoordinatorImpl$TransactionDriverControlImpl.commit(JdbcResourceLocalTransactionCoordinatorImpl.java:271) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.hibernate.engine.transaction.internal.TransactionImpl.commit(TransactionImpl.java:98) ~[hibernate-core-5.3.7.Final.jar:5.3.7.Final]
        at org.springframework.orm.jpa.JpaTransactionManager.doCommit(JpaTransactionManager.java:532) ~[spring-orm-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 32 common frames omitted

2019-07-24 17:55:18.996  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Received chooseCard() from player : 2611563983501498
2019-07-24 17:55:18.996  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : -------------------------------------------------
2019-07-24 17:55:18.996  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Before update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='YÚti noroit15639835152531800871939; YÚti noroit156398348001257666226; Chevaucheur de loup15639834800121738750369; BÚnÚdiction de puissance15639834800121335405770; ',
 p1CardsOnGround='',
 p2HandOfCards='Soldat du comtÚ-de-l'or15639834800121836481279; Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Avocat commis d'office1563983480012519426043; Tourbillon15639834800121409403186; YÚti noroit1563983480012177711517; Chevaucheur de loup15639834800121728428645; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='']
2019-07-24 17:55:18.996  INFO 4684 --- [nboundChannel-3] minihearthstone.entities.deck.Deck       : P1 : 1981563983500836
2019-07-24 17:55:18.996  INFO 4684 --- [nboundChannel-3] minihearthstone.entities.deck.Deck       : P2 : 2611563983501498
2019-07-24 17:55:18.996  INFO 4684 --- [nboundChannel-3] minihearthstone.entities.deck.Deck       : findCardInHandOfCardsByUniqueId in p2:
2019-07-24 17:55:18.996  INFO 4684 --- [nboundChannel-3] minihearthstone.entities.deck.Deck       : uniqueId : Soldat du comtÚ-de-l'or15639834800121836481279 | current : Soldat du comtÚ-de-l'or15639834800121836481279
2019-07-24 17:55:18.996  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : Card after applyOnChoiceEffect() -> Card[id=49, uniqueId='Soldat du comtÚ-de-l'or15639834800121836481279', name='Soldat du comtÚ-de-l'or', manacost=1, damage=1, lifepoints=2, nature='servant', canAttack=false, currentTargetUniqueId='Soldat du comtÚ-de-l'or15639834800121836481279', effect='ProvocationEffect', specificCard='null']
2019-07-24 17:55:18.996  INFO 4684 --- [nboundChannel-3] minihearthstone.entities.deck.Deck       : Distinct cards: []
2019-07-24 17:55:19.006  INFO 4684 --- [nboundChannel-3] minihearthstone.controller.ClientProxy   : After update : GameBoard[id=34, gameId=33, p1ClientId=1981563983500836, p2ClientId=2611563983501498, turn=2611563983501498,
p1HandOfCards='YÚti noroit15639835152531800871939; YÚti noroit156398348001257666226; Chevaucheur de loup15639834800121738750369; BÚnÚdiction de puissance15639834800121335405770; ',
 p1CardsOnGround='',
 p2HandOfCards='Tourbillon15639834800121409403186; Soldat du comtÚ-de-l'or15639834800121836481279; Avocat commis d'office1563983480012519426043; Tourbillon15639834800121409403186; YÚti noroit1563983480012177711517; Chevaucheur de loup15639834800121728428645; Tourbillon15639834800121409403186; ',
 p2CardsOnGround='Soldat du comtÚ-de-l'or15639834800121836481279; ']
2019-07-24 17:55:19.038 ERROR 4684 --- [nio-8090-exec-4] o.s.w.s.m.StompSubProtocolHandler        : Failed to parse TextMessage payload=[SEND
desti..], byteCount=79, last=true] in session du42on5g. Sending STOMP ERROR to client.

java.lang.IllegalStateException: No decoder for session id 'du42on5g'
        at org.springframework.web.socket.messaging.StompSubProtocolHandler.handleMessageFromClient(StompSubProtocolHandler.java:233) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.messaging.SubProtocolWebSocketHandler.handleMessage(SubProtocolWebSocketHandler.java:324) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.WebSocketHandlerDecorator.handleMessage(WebSocketHandlerDecorator.java:75) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.LoggingWebSocketHandlerDecorator.handleMessage(LoggingWebSocketHandlerDecorator.java:56) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.ExceptionWebSocketHandlerDecorator.handleMessage(ExceptionWebSocketHandlerDecorator.java:58) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:386) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]

2019-07-24 17:55:19.038 ERROR 4684 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.038 ERROR 4684 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.046 ERROR 4684 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.046 ERROR 4684 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.050 ERROR 4684 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.050 ERROR 4684 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.050 ERROR 4684 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.050 ERROR 4684 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.050 ERROR 4684 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.050 ERROR 4684 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.050 ERROR 4684 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.056 ERROR 4684 --- [nio-8090-exec-3] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.056 ERROR 4684 --- [nio-8090-exec-5] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.060 ERROR 4684 --- [nio-8090-exec-6] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.060 ERROR 4684 --- [nio-8090-exec-7] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.060 ERROR 4684 --- [nio-8090-exec-9] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.060 ERROR 4684 --- [io-8090-exec-10] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.067 ERROR 4684 --- [nio-8090-exec-8] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.067 ERROR 4684 --- [nio-8090-exec-1] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.070 ERROR 4684 --- [nio-8090-exec-2] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.070 ERROR 4684 --- [nio-8090-exec-4] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.070 ERROR 4684 --- [nio-8090-exec-3] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.070 ERROR 4684 --- [nio-8090-exec-5] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.070 ERROR 4684 --- [nio-8090-exec-6] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.070 ERROR 4684 --- [nio-8090-exec-7] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.076 ERROR 4684 --- [nio-8090-exec-9] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

2019-07-24 17:55:19.076 ERROR 4684 --- [io-8090-exec-10] .w.s.a.s.StandardWebSocketHandlerAdapter : Closing session due to exception for StandardWebSocketSession[id=0361fe6b-88b6-2532-5595-401a5eabdb77, uri=ws://localhost:8090/467/du42on5g/websocket]

org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g; nested exception is org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:391) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession.handleMessage(WebSocketServerSockJsSession.java:195) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.sockjs.transport.handler.SockJsWebSocketHandler.handleTextMessage(SockJsWebSocketHandler.java:93) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.handler.AbstractWebSocketHandler.handleMessage(AbstractWebSocketHandler.java:43) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.handleTextMessage(StandardWebSocketHandlerAdapter.java:113) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter.access$000(StandardWebSocketHandlerAdapter.java:42) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:84) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.springframework.web.socket.adapter.standard.StandardWebSocketHandlerAdapter$3.onMessage(StandardWebSocketHandlerAdapter.java:81) [spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        at org.apache.tomcat.websocket.WsFrameBase.sendMessageText(WsFrameBase.java:395) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.sendMessageText(WsFrameServer.java:119) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processDataText(WsFrameBase.java:495) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processData(WsFrameBase.java:294) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.WsFrameBase.processInputBuffer(WsFrameBase.java:133) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.onDataAvailable(WsFrameServer.java:82) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.doOnDataAvailable(WsFrameServer.java:171) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsFrameServer.notifyDataAvailable(WsFrameServer.java:151) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.tomcat.websocket.server.WsHttpUpgradeHandler.upgradeDispatch(WsHttpUpgradeHandler.java:148) [tomcat-embed-websocket-9.0.13.jar:9.0.13]
        at org.apache.coyote.http11.upgrade.UpgradeProcessorInternal.dispatch(UpgradeProcessorInternal.java:54) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:53) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:791) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1417) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_60]
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_60]
        at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.13.jar:9.0.13]
        at java.lang.Thread.run(Thread.java:745) [na:1.8.0_60]
Caused by: org.springframework.web.socket.sockjs.SockJsMessageDeliveryException: Failed to deliver message(s) [SEND
destination:/server/sendgameboardupdate/player/1981563983500836/game/33

 ] for session du42on5g: Session closed
        at org.springframework.web.socket.sockjs.transport.session.AbstractSockJsSession.delegateMessages(AbstractSockJsSession.java:383) ~[spring-websocket-5.1.3.RELEASE.jar:5.1.3.RELEASE]
        ... 25 common frames omitted

<=========----> 75% EXECUTING [4m 21s]
> :bootRun
