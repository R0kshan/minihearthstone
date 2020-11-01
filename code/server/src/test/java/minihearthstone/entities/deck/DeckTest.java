package minihearthstone.entities.deck;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import minihearthstone.entities.cards.*;
import minihearthstone.entities.cards.effects.BasicEffect;
import minihearthstone.entities.cards.effects.ChargeEffect;
import minihearthstone.entities.cards.effects.LifeStealEffect;
import minihearthstone.entities.heroes.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static minihearthstone.AssertAnnotations.*;
import static org.assertj.core.api.Assertions.assertThat;



@RunWith(SpringRunner.class)
@DataJpaTest
public class DeckTest {

    @Autowired
    private TestEntityManager entityManager;

    private Deck deck;

    private BasicCard firstCommonCard;
    private BasicCard secondCommonCard;
    private BasicCard heroSpecificCard;

    @Before
    public void setup(){
        final Warrior specificHero = new Warrior();
        final BasicHero hero = new BasicHero("nomHero","typeHero","skillType",specificHero,"descriptionHero");
        final BasicEffect basicE = new BasicEffect();
        final ChargeEffect lifeSE = new ChargeEffect();
        final LifeStealEffect lse = new LifeStealEffect();
        final String desc = "";

        firstCommonCard = new BasicCard("nameC1",1,1,1,"type1","servant", basicE, null, desc,"");
        secondCommonCard = new BasicCard("nameC2",1,0,1,"type2","servant",lifeSE, null, desc,"");
        heroSpecificCard = new BasicCard("heroSpecC",1,2,1,"typeH","servant",lse, null, "","");

        deck = new Deck(hero);
    }

    /**
     * Test {@link Deck#getCardNames()} 
     */
    @Test 
    public void nameOfCards(){
        deck.addToDeck(firstCommonCard);
        deck.addToDeck(heroSpecificCard);

        String expected = firstCommonCard.getName() + " " + heroSpecificCard.getName() + " ";

        assertThat(deck.getCardNames()).isEqualTo(expected);
    }
    
    /**
     * Test {@link Deck#addToDeck()}
     */
    @Test
    public void addCardToDeck(){
        deck.addToDeck(firstCommonCard);
        deck.addToDeck(secondCommonCard);
        deck.addToDeck(heroSpecificCard);

        Deck savedDeck = this.entityManager.persistFlushFind(deck);

        assertThat(savedDeck.getId()).isNotNull();
        assertThat(savedDeck.getName()).isEqualTo("nomHero's card deck");

    }

    /**
     * Test {@link Deck#pickCard()}
     */
    @Test 
    public void pickCard(){
        deck.addToDeck(firstCommonCard);

        List<Card> listC = new ArrayList<Card>();
        listC.add(firstCommonCard);
        //TODO : Replace the use of getName by Equals for Card
        assertThat(deck.pickCard(listC).getName()).isEqualTo(firstCommonCard.getName());
    }

    @Test
    public void checkPlayerAnnotations(){
        assertClassAnnotation(Deck.class, Entity.class);
    }

    @Test
    public void checkFieldsAnnotations(){
        assertField(Deck.class, "id", Id.class, GeneratedValue.class);
        assertField(Deck.class, "name");
        assertField(Deck.class, "heroId");
        assertField(Deck.class, "deck",OneToMany.class);
        assertField(Deck.class, "cardRepository",Autowired.class, Transient.class);
        assertField(Deck.class, "log",Transient.class);
    }

    @Test
    public void checkGettersAnnotation(){
        assertGetter(Deck.class, "getId",Column.class);
        assertGetter(Deck.class, "getName");
        assertGetter(Deck.class, "getDeck");
        assertGetter(Deck.class, "getHeroId");
    }
}
