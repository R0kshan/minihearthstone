package minihearthstone.entities.cards;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import static minihearthstone.AssertAnnotations.*;

/**
 * Test class for {@link Card}
 */
public class CardTest {

    @Test
    public void checkPlayerAnnotations(){
        assertClassAnnotation(Card.class,JsonIgnoreProperties.class, JsonTypeInfo.class,JsonSubTypes.class,
        Entity.class,Inheritance.class);
    }

    @Test
    public void checkFieldsAnnotations(){
        assertField(Card.class, "id", Id.class, GeneratedValue.class);
        assertField(Card.class, "uniqueId");
        assertField(Card.class, "name");
        assertField(Card.class, "manacost");
        assertField(Card.class, "damage");
        assertField(Card.class, "lifepoints");
        assertField(Card.class, "defense");
        assertField(Card.class, "type");
        assertField(Card.class, "description");
        assertField(Card.class, "nature");
        assertField(Card.class, "canAttack");
        assertField(Card.class, "deck",ManyToOne.class);
        assertField(Card.class, "gbP1HandOfCardsMapping",ManyToOne.class,JsonBackReference.class);
        assertField(Card.class, "gbP2HandOfCardsMapping",ManyToOne.class,JsonBackReference.class);
        assertField(Card.class, "gbP1CardsOnGroundMapping",ManyToOne.class,JsonBackReference.class);
        assertField(Card.class, "gbP2CardsOnGroundMapping",ManyToOne.class,JsonBackReference.class);
        assertField(Card.class, "effect",OneToOne.class);
        assertField(Card.class, "specificCard",OneToOne.class);

    }

    @Test
    public void checkGettersAnnotation(){
        assertGetter(Card.class, "getId");
        assertGetter(Card.class, "getUniqueId");
        assertGetter(Card.class, "getName");
        assertGetter(Card.class, "getManacost");
        assertGetter(Card.class, "getDamage");
        assertGetter(Card.class, "getLifepoints");
        assertGetter(Card.class, "getType");
        assertGetter(Card.class, "getEffect");
        assertGetter(Card.class, "getDescription");
        assertGetter(Card.class, "getId");
        assertGetter(Card.class, "getDeck");
        assertGetter(Card.class, "getGbP1HandOfCardsMapping");
        assertGetter(Card.class, "getGbP2HandOfCardsMapping");
        assertGetter(Card.class, "getGbP1CardsOnGroundMapping");
        assertGetter(Card.class, "getGbP2CardsOnGroundMapping");

    }
}
