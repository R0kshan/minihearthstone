package minihearthstone.entities.cards;

import minihearthstone.entities.cards.effects.BasicEffect;
import minihearthstone.entities.gameboard.GameBoard;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

import static minihearthstone.AssertAnnotations.assertClassAnnotation;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ChefDeRaidTest{

    @InjectMocks
    private ChefDeRaid chefDR;

    @Mock
    private GameBoard gameBoard;

    private final Long CL1ID = new Long("0");
    private final static String NAME1 = "name";
    private final static String NAME2 = "n2";
    private final static int MANA_COST = 1;
    private final static int DMG = 1;
    private final static int DMG2 = 2;
    private final static int HP = 1;
    private final static int HP2 = 2;
    private final static String TYPE = "type";
    private final static String NATURE = "servant";
    private final BasicEffect BASIC_EFFECT = new BasicEffect();
    private final AbstractSpecificCard SPEC_CARD = new ChefDeRaid();
    private final static String DESC = "";
    private final static String TOOLTIP = "";
    
    @Mock
    private final Card c1 = new BasicCard(NAME1,MANA_COST,DMG,HP,TYPE,NATURE,BASIC_EFFECT,SPEC_CARD,DESC,TOOLTIP);
    @Mock
    private final Card c2 = new BasicCard(NAME2,MANA_COST+1,DMG2,HP2,TYPE,NATURE,BASIC_EFFECT,SPEC_CARD,DESC, TOOLTIP);
    
    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test for the method {@link ChefDeRaid#specialSkill(Long, GameBoard)}
     */
    @Test
    public void testSpecialSkill(){
        List<Card> lC = new ArrayList<Card>();
        lC.add(c1);
        lC.add(c2);

        when(gameBoard.getPlayerCardsOnGround(CL1ID)).thenReturn(lC);
        chefDR.specialSkill(CL1ID,gameBoard);
        verify(gameBoard).getPlayerCardsOnGround(CL1ID);
    }

   /**
     * Test for the method {@link ChefDeRaid#specialSkillOnDeath(Long, GameBoard)}
     */
    @Test
    public void testSpecialSkillOnDeath(){
        List<Card> lC = new ArrayList<Card>();
        lC.add(c1);
        lC.add(c2);

        when(gameBoard.getPlayerCardsOnGround(CL1ID)).thenReturn(lC);
        chefDR.specialSkillOnDeath(CL1ID,gameBoard);
        verify(gameBoard).getPlayerCardsOnGround(CL1ID);
    }

    /**
     * Test for the method {@link ChefDeRaid#specialSkillOnServant(String, Long, GameBoard)}
     */
    @Test
    public void testSpecialSkillOnServant(){
        String c1Id = c1.getId().toString();
        when(gameBoard.findCardOnGroundByUniqueId(CL1ID,c1Id)).thenReturn(c1);
        chefDR.specialSkillOnServant(c1Id, CL1ID, gameBoard);
        verify(gameBoard).findCardOnGroundByUniqueId(CL1ID,c1Id);
    }

    @Test
    public void checkPlayerAnnotations(){
        assertClassAnnotation(ChefDeRaid.class, Entity.class);
    }

}