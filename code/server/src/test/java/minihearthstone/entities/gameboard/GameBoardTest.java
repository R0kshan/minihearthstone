package minihearthstone.entities.gameboard;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import minihearthstone.entities.cards.BasicCard;
import minihearthstone.entities.cards.Card;
import minihearthstone.entities.cards.effects.BasicEffect;
import minihearthstone.entities.cards.effects.LifeStealEffect;
import minihearthstone.entities.player.Player;
import org.hibernate.annotations.Fetch;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import static minihearthstone.AssertAnnotations.*;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class GameBoardTest {

    @Autowired
    private TestEntityManager entityManager;

    private GameBoard gameBoard;


    private final Long GAME_ID = new Long(0);
    private final Long P1ID = new Long(1);
    private final Long P2ID = new Long(2);

    private Player p1 = new Player("p1Nick",P1ID);
    private Player p2 = new Player("p2Nick",P2ID);

    private final BasicCard c1 = new BasicCard("n1",1,1,1,"t1","servant",new BasicEffect(),null,"","");
    private final BasicCard c2 = new BasicCard("n2",1,1,1,"t2","spell",new LifeStealEffect(),null,"","");

    @Before
    public void setup(){
        gameBoard = new GameBoard(new Long(10));
        gameBoard.setP1ClientId(P1ID);
        gameBoard.setP2ClientId(P2ID);
        gameBoard.setGameId(GAME_ID);
        p1.setGameboard(gameBoard);
        p2.setGameboard(gameBoard);
    }

    /**
     * Test {@link GameBoard#addToP1HandOfCards(Card)}
     */
    @Test
    public void addCardToP1Hand(){
        gameBoard.addToP1HandOfCards(c1);

        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.getP1HandOfCards().size()).isEqualTo(1);
        assertThat(gb.getP1HandOfCards().get(0).getUniqueId()).isEqualTo(c1.getUniqueId());
    }

    /**
     * Test {@link GameBoard#addToP1HandOfCards(List)}
     */
    @Test 
    public void addListCardToP1Hand(){
        List<Card> lC = new ArrayList<Card>();
        lC.add(c1);
        lC.add(c2);

        gameBoard.addToP1HandOfCards(lC);

        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.getP1HandOfCards().size()).isEqualTo(2);
        assertThat(gb.getP1HandOfCards().get(0).getUniqueId()).isEqualTo(c1.getUniqueId());
        assertThat(gb.getP1HandOfCards().get(1).getUniqueId()).isEqualTo(c2.getUniqueId());
    }

    /**
     * Test for the method {@link GameBoard#removeFromP1HandOfCards(Card)}
     */
    @Test
    public void removeCardFromP1Hand(){
        boolean expected = true;
        gameBoard.addToP1HandOfCards(c1);
        gameBoard.addToP1HandOfCards(c2);
        boolean res = gameBoard.removeFromP1HandOfCards(c1);

        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.getP1HandOfCards().size()).isEqualTo(1);
        assertThat(gb.getP1HandOfCards().get(0).getUniqueId()).isEqualTo(c2.getUniqueId());
        assertThat(res).isEqualTo(expected);
    }

    /**
     * Test {@link GameBoard#addToP2HandOfCards(Card)}
     */
    @Test
    public void addCardToPH2and(){
        gameBoard.addToP2HandOfCards(c1);

        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.getP2HandOfCards().size()).isEqualTo(1);
        assertThat(gb.getP2HandOfCards().get(0).getUniqueId()).isEqualTo(c1.getUniqueId());
    }

    /**
     * Test {@link GameBoard#addToP2HandOfCards(List)}
     */
    @Test 
    public void addListCardToP2Hand(){
        List<Card> lC = new ArrayList<Card>();
        lC.add(c1);
        lC.add(c2);

        gameBoard.addToP2HandOfCards(lC);

        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.getP2HandOfCards().size()).isEqualTo(2);
    }

    /**
     * Test for the method {@link GameBoard#removeFromP2HandOfCards(Card)}
     */
    @Test
    public void removeCardFromP2Hand(){
        boolean expected = true;
        gameBoard.addToP2HandOfCards(c1);
        gameBoard.addToP2HandOfCards(c2);
        boolean res = gameBoard.removeFromP2HandOfCards(c1);

        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.getP2HandOfCards().size()).isEqualTo(1);
        assertThat(gb.getP2HandOfCards().get(0).getUniqueId()).isEqualTo(c2.getUniqueId());
        assertThat(res).isEqualTo(expected);
    }

    /**
     * Test {@link GameBoard#addToP1CardsOnGround(Card)}
     */
    @Test
    public void addCardToP1Ground(){
        gameBoard.addToP1CardsOnGround(c1);

        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.getP1CardsOnGround().size()).isEqualTo(1);
        assertThat(gb.getP1CardsOnGround().get(0).getUniqueId()).isEqualTo(c1.getUniqueId());
    }
    /**
     * Test method for {@link GameBoard#addToP1CardsOnGround(List)}
     */
    @Test
    public void addCardListToP1Ground(){
        List<Card> lC = new ArrayList<Card>();
        lC.add(c1);
        lC.add(c2);
        gameBoard.addToP1CardsOnGround(lC);

        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.getP1CardsOnGround().size()).isEqualTo(2);
        assertThat(gb.getP1CardsOnGround().get(0).getUniqueId()).isEqualTo(c1.getUniqueId());
        assertThat(gb.getP1CardsOnGround().get(1).getUniqueId()).isEqualTo(c2.getUniqueId());
    }

    /**
     * Test for the method {@link GameBoard#removeFromP1CardsOnGround(Card)}
     */
    @Test
    public void removeCardFromP1Ground(){
        boolean expected = true;
        gameBoard.addToP1CardsOnGround(c1);
        gameBoard.addToP1CardsOnGround(c2);
        boolean res = gameBoard.removeFromP1CardsOnGround(c1);

        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.getP1CardsOnGround().size()).isEqualTo(1);
        assertThat(gb.getP1CardsOnGround().get(0).getUniqueId()).isEqualTo(c2.getUniqueId());
        assertThat(res).isEqualTo(expected);
    }

    /**
     * Test for the method {@link GameBoard#addToP2CardsOnGround(Card)}
     */
    @Test
    public void addCardToP2Ground(){
        gameBoard.addToP2CardsOnGround(c1);
        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.getP2CardsOnGround().size()).isEqualTo(1);
        assertThat(gb.getP2CardsOnGround().get(0).getUniqueId()).isEqualTo(c1.getUniqueId());
    }

    /**
     * Test for the method {@link GameBoard#addToP2CardsOnGround(List)}
     */
    @Test
    public void addCardListToP2Ground(){
        List<Card> lC = new ArrayList<Card>();
        lC.add(c1);
        lC.add(c2);

        gameBoard.addToP2CardsOnGround(lC);
        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.getP2CardsOnGround().size()).isEqualTo(2);
        assertThat(gb.getP2CardsOnGround().get(0).getUniqueId()).isEqualTo(c1.getUniqueId());
        assertThat(gb.getP2CardsOnGround().get(1).getUniqueId()).isEqualTo(c2.getUniqueId());
    }

    /**
     * Test for the method {@link GameBoard#removeFromP2CardsOnGround(Card)}
     */
    @Test
    public void removeCardFromP2Ground(){
        gameBoard.addToP2CardsOnGround(c1);
        gameBoard.addToP2CardsOnGround(c2);
        boolean res = gameBoard.removeFromP2CardsOnGround(c1);

        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.getP2CardsOnGround().size()).isEqualTo(1);
        assertThat(gb.getP2CardsOnGround().get(0).getUniqueId()).isEqualTo(c2.getUniqueId());
        assertThat(res);
    }

    /* TODO FIX those tests
     Test for the method {@link GameBoard#findOpponentCardInHandOfCardsByUniqueId(Long, String)}
     
    @Test
    public void findP1CardOnGround(){
        gameBoard.addToP1CardsOnGround(c1);
        gameBoard.addToP1CardsOnGround(c2);
        
        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);
        assertThat(gb.findCardOnGroundByUniqueId(P1ID, c1.getUniqueId())).isEqualTo(c1.getUniqueId());
    }
    

    
     Test for the method {@link @GameBoard#getPlayerCardsOnGround(Long)}
     
    @Test
    public void testGetP1CardsOnGround(){
        gameBoard.addToP1CardsOnGround(c1);
        gameBoard.addToP1CardsOnGround(c2);
        GameBoard gb = this.entityManager.persistFlushFind(gameBoard);

        assertThat(gb.getPlayerCardsOnGround(P1ID).get(0).getUniqueId()).isEqualTo(c1.getUniqueId());
        assertThat(gb.getPlayerCardsOnGround(P1ID).get(1).getUniqueId()).isEqualTo(c2.getUniqueId());
    }
    */
    @Test
    public void checkPlayerAnnotations(){
        assertClassAnnotation(GameBoard.class, Entity.class, Transactional.class);
    }

    @Test
    public void checkFieldsAnnotations(){
        assertField(GameBoard.class, "id", Id.class, GeneratedValue.class);
        assertField(GameBoard.class, "gameId");
        assertField(GameBoard.class, "p1ClientId");
        assertField(GameBoard.class, "p2ClientId");
        assertField(GameBoard.class, "turn");
        assertField(GameBoard.class, "winner");
        assertField(GameBoard.class, "p1HandOfCards", JsonManagedReference.class,OneToMany.class,Fetch.class);
        assertField(GameBoard.class, "p2HandOfCards", JsonManagedReference.class,OneToMany.class,Fetch.class);
        assertField(GameBoard.class, "p1CardsOnGround", JsonManagedReference.class,OneToMany.class,Fetch.class);
        assertField(GameBoard.class, "p2CardsOnGround", JsonManagedReference.class,OneToMany.class,Fetch.class);
        assertField(GameBoard.class, "log", Transient.class);
        assertField(GameBoard.class, "deckRepository",Transient.class, Autowired.class);
    }

    @Test
    public void checkGettersAnnotation(){
        assertGetter(GameBoard.class, "getId");
        assertGetter(GameBoard.class, "getGameId");
        assertGetter(GameBoard.class, "getP1ClientId");
        assertGetter(GameBoard.class, "getP2ClientId");
        assertGetter(GameBoard.class, "getTurn");
        assertGetter(GameBoard.class, "getWinner");
        assertGetter(GameBoard.class, "getPlayer1");
        assertGetter(GameBoard.class, "getPlayer2");
        assertGetter(GameBoard.class, "getHero1");
        assertGetter(GameBoard.class, "getHero2");
        assertGetter(GameBoard.class, "getPlayers");
        assertGetter(GameBoard.class, "getP1CardsOnGround");
        assertGetter(GameBoard.class, "getP2CardsOnGround");
        assertGetter(GameBoard.class, "getP1HandOfCards");
        assertGetter(GameBoard.class, "getP2HandOfCards"); 
    }
}
