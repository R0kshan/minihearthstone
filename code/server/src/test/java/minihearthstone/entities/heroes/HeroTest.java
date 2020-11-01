package minihearthstone.entities.heroes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import minihearthstone.entities.heroes.Hero;
import org.junit.Test;

import static minihearthstone.AssertAnnotations.*;

public class HeroTest {

    @Test
    public void checkPlayerAnnotations(){
        assertClassAnnotation(Hero.class, JsonIgnoreProperties.class,JsonTypeInfo.class,
          JsonSubTypes.class,Entity.class,Inheritance.class);
    }

    @Test
    public void checkFieldsAnnotations(){
        assertField(Hero.class, "id", Id.class, GeneratedValue.class);
        assertField(Hero.class, "name");
        assertField(Hero.class, "type");
    }

    @Test
    public void checkGettersAnnotation(){
        assertGetter(Hero.class, "getId");
        assertGetter(Hero.class, "getName");
        assertGetter(Hero.class, "getType");
    }
}
