package minihearthstone.facade;

import minihearthstone.entities.cards.CardRepository;
import minihearthstone.entities.deck.*;
import minihearthstone.entities.gameboard.*;
import minihearthstone.entities.heroes.HeroRepository;
import minihearthstone.entities.match.*;
import minihearthstone.entities.player.PlayerRepository;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import static minihearthstone.AssertAnnotations.*;

/**
 * Classe de test pour la classe ClientProxy {@link ClientProxy}
 */
@RunWith(SpringRunner.class)
public class FacadeTest {

    @MockBean
    private IFacade facade;

    @MockBean
    private PlayerRepository playerRepository;

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
        assertClassAnnotation(Facade.class, Component.class);
    }

    @Test
    public void checkFieldsAnnotations(){
        assertField(Facade.class,"log");
        assertField(Facade.class, "playerRepository", Autowired.class);
        assertField(Facade.class, "matchRepository", Autowired.class);
        assertField(Facade.class, "heroRepository", Autowired.class);
        assertField(Facade.class, "gameBoardRepository", Autowired.class);
        assertField(Facade.class, "deckRepository", Autowired.class);
        assertField(Facade.class, "cardRepository", Autowired.class);

    }
}
