package minihearthstone.entities.gameboard;

import minihearthstone.entities.cards.BasicCard;
import minihearthstone.entities.cards.effects.BasicEffect;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameBoardMockTest {
    private final Long P1ID = new Long(0);
    private final Long P2ID = new Long(1);
    private final String C1ID = "C1ID";

    private final BasicCard c1 = new BasicCard("n1",1,1,1,"t1","servant",new BasicEffect(),null,"","");

    @Mock
    private GameBoard gameBoard;

    /**
     * Test for the method {@link GameBoard#findCardOnGroundByUniqueId(Long, String)}
     */
    @Test
    public void findCardOnGroundForP1(){
    when(gameBoard.findCardOnGroundByUniqueId(P1ID, C1ID)).thenReturn(c1);

    assertThat(gameBoard.findCardOnGroundByUniqueId(P1ID, C1ID).getUniqueId()).isEqualTo(c1.getUniqueId());
    }

    /**
     * Test for the method {@link GameBoard#findCardOnGroundByUniqueId(Long, String)}
     */
    @Test
    public void findCardOnGroundForP2(){
    when(gameBoard.findCardOnGroundByUniqueId(P2ID, C1ID)).thenReturn(c1);

    assertThat(gameBoard.findCardOnGroundByUniqueId(P2ID, C1ID).getUniqueId()).isEqualTo(c1.getUniqueId());
    }
}
