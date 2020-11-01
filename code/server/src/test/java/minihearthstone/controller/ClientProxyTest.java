package minihearthstone.controller;

import minihearthstone.entities.cards.CardRepository;
import minihearthstone.entities.deck.*;
import minihearthstone.entities.gameboard.*;
import minihearthstone.entities.heroes.HeroRepository;
import minihearthstone.entities.match.*;
import minihearthstone.facade.*;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;


import static minihearthstone.AssertAnnotations.*;

/**
 * Classe de test pour la classe ClientProxy {@link ClientProxy}
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ClientProxy.class)
public class ClientProxyTest {

    @MockBean
    private IFacade facade;

    @MockBean
    private MatchRepository matchRepository;

    @MockBean
    private HeroRepository heroRepository;

    @MockBean
    private GameBoardRepository gameBoardRepository;

    @MockBean
    private DeckRepository deckRepository;

    @MockBean
    private CardRepository cardRepository;

    @Test
    public void checkPlayerAnnotations(){
        assertClassAnnotation(ClientProxy.class, Controller.class);
    }

    @Test
    public void checkFieldsAnnotations(){
        assertField(ClientProxy.class,"log");
        assertField(ClientProxy.class, "facade", Autowired.class);
    }


}
