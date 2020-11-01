package minihearthstone.entities.heroes;

import javax.persistence.Entity;
import minihearthstone.entities.gameboard.*;
import minihearthstone.entities.player.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

import static minihearthstone.AssertAnnotations.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PaladinTest {

    private final static String P1_NAME = "p1Name";
    private final static String P1ID = "1";
    private final static Long L1ID = Long.parseLong(P1ID);
    private Player p1 = new Player(P1_NAME,Long.parseLong(P1ID));

    private final int MANA_MAX = 10;

    @InjectMocks
    private Paladin paladin;

    @Mock
    private GameBoard gameB;

    @Mock
    private Player player;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test for the method {@link Paladin#specialSkill(String, GameBoard)}
     */
    @Test
    public void specialSkillWithNotEnoughMana(){
        when(gameB.getPlayer(L1ID)).thenReturn(p1);

        paladin.specialSkill(P1ID, gameB);

        verify(gameB).getPlayer(L1ID);
    }

    /**
     * Test for the method {@link Paladin#specialSkill(String, GameBoard)}
     */
    @Test
    public void specialSkillWithEnoughMana(){
        p1.setMana(MANA_MAX);
        when(gameB.getPlayer(L1ID)).thenReturn(p1);

        paladin.specialSkill(P1ID, gameB);

        verify(gameB).printPlayerCardsOnGroundInfo(L1ID);
        verify(gameB,times(2)).getPlayer(L1ID);
    }


    @Test
    public void checkPlayerAnnotations(){
        assertClassAnnotation(Warrior.class, Entity.class);
    }
}
