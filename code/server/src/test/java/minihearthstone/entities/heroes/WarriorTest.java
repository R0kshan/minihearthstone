package minihearthstone.entities.heroes;

import minihearthstone.entities.gameboard.GameBoard;
import minihearthstone.entities.player.Player;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import javax.persistence.Entity;

import static minihearthstone.AssertAnnotations.assertClassAnnotation;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class WarriorTest {

    //Player related
    private final static String P1_NAME = "p1Name";
    private final static String P1ID = "1";
    private final Long L1ID = Long.parseLong(P1ID);
    private Player p1 = new Player(P1_NAME,Long.parseLong(P1ID));
    private final static int MANA_MAX = 10;

    //Hero related
    private final static String NAME1 = "n1";
    private final static String TYPE1 = "t1";
    private final static String SKILL_TYPE1 = "sk1";
    private final Paladin paladin = new Paladin();
    private final static String DESCR = "short description";
    private BasicHero h1 = new BasicHero(NAME1,TYPE1,SKILL_TYPE1,paladin,DESCR);

    @InjectMocks
    private Warrior warrior;

    @Mock
    private GameBoard gameB;

    @Mock
    private Player player;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test for the method {@link Warrior#specialSkill(String, GameBoard)}
     */
    @Test
    public void specialSkillWithNotEnoughMana(){
        when(gameB.getPlayer(L1ID)).thenReturn(p1);

        warrior.specialSkill(P1ID, gameB);

        verify(gameB).getPlayer(L1ID);
    }
   
    /**
     * Test for the method {@link Warrior#specialSkill(String, GameBoard)}
     */
    @Test
    public void specialSkillWithEnoughMana(){
        p1.setMana(MANA_MAX);
        when(gameB.getPlayer(L1ID)).thenReturn(p1);
        //when(gameB.getHero(L1ID)).thenReturn(h1);

        warrior.specialSkill(P1ID, gameB);

        verify(gameB,times(2)).getPlayer(L1ID);
    }

    @Test
    public void checkPlayerAnnotations(){
        assertClassAnnotation(Warrior.class, Entity.class);
    }
}
