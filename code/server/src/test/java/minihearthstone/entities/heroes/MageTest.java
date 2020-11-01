package minihearthstone.entities.heroes;

import javax.persistence.Entity;
import minihearthstone.entities.gameboard.*;
import minihearthstone.entities.player.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static minihearthstone.AssertAnnotations.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MageTest {

    //Hero related
    private final static String NAME1 = "n1";
    private final static String TYPE1 = "t1";
    private final static String SKILL_TYPE1 = "sk1";
    private final Paladin paladin = new Paladin();
    private final static String DESCR = "short description";
    private BasicHero h1 = new BasicHero(NAME1,TYPE1,SKILL_TYPE1,paladin,DESCR);

    //Player related
    private final static String P1_NAME = "p1Name";
    private final static String P2_NAME = "p2Name";
    private final static String P1ID = "1";
    private final Long L1ID = Long.parseLong(P1ID);
    private final static String P2ID = "2";
    private Player p1 = new Player(P1_NAME,Long.parseLong(P1ID));
    private Player p2 = new Player(P2_NAME,Long.parseLong(P2ID));

    private final static int MANA_MAX = 10;
    
    @InjectMocks
    private Mage mage;

    @Mock
    private GameBoard gameB;

    @Mock
    private Player player;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test for the method {@link Mage#specialSkillOnHero(String, GameBoard)}
     */
    @Test
    public void specialSkillOnHeroWithNotEnoughMana(){
        Long cId = new Long("1");
        when(gameB.getPlayer(cId)).thenReturn(p1);
    
        mage.specialSkillOnHero(cId.toString(), gameB);

        verify(gameB).getPlayer(cId);
    }

    /**
     * Test for the method {@link Mage#specialSkillOnHero(String, GameBoard)}
     */
    @Test
    public void specialSkillOnHeroWithEnoughMana(){
        p1.setMana(MANA_MAX);
        when(gameB.getPlayer(L1ID)).thenReturn(p1);
        when(gameB.getOpponentHero(L1ID)).thenReturn(h1);

        mage.specialSkillOnHero(P1ID, gameB);
        
        verify(gameB,times(2)).getPlayer(L1ID); 
    }

    /**
     * Test for the method {@link Mage#specialSkillOnServant(String, String, GameBoard)}
     */
    @Test
    public void specialSkillOnServantWithEnoughMana(){
        Long cId = new Long("1");
        String uI = "uniqueId";
        when(gameB.getPlayer(L1ID)).thenReturn(p1);
        when(gameB.getOpponentPlayer(L1ID)).thenReturn(p2);
    
        mage.specialSkillOnServant(P1ID,uI, gameB);
        verify(gameB).getPlayer(L1ID);
        verify(gameB).getOpponentPlayer(L1ID);
    }

    @Test
    public void checkPlayerAnnotations(){
        assertClassAnnotation(Mage.class, Entity.class);
    }
}
