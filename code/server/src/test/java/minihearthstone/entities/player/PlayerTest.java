package minihearthstone.entities.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;

import minihearthstone.entities.player.Player;
import minihearthstone.entities.gameboard.GameBoard;

import static minihearthstone.AssertAnnotations.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test class for {@link Player}
 */
public class PlayerTest {
    
    private Player player;

    @Before
    public void setup(){
        player = new Player("playerName",new Long("1"));
    }

    /**
     * Test for the method {@link Player#toString()}
     */
    @Test
    public void testToString(){
        player.setHeroId(new Long("1"));
        player.setMana(1);
        player.setStored_mana(3);
        String expected = "Player[id=null, name='playerName', clientId='1', status='available', heroId=1, mana=1, stored_mana=3], gb=''";
        assertThat(player.toString()).isEqualTo(expected);

    }
    
    /**
     *  Test for the method {@link Player#incrementMana()}
     */
    @Test 
    public void incrementManaBelow10(){
        player.setStored_mana(3);
        player.incrementMana();
        assertThat(player.getStored_mana()).isEqualTo(4);
        assertThat(player.getMana()).isEqualTo(4);
    }

    /**
     * Test for the method {@link Player#incrementMana()}
     */
    @Test
    public void incrementManaAboveOrEqual10(){
        player.setStored_mana(10);
        player.incrementMana();
        assertThat(player.getStored_mana()).isEqualTo(10);
    }

    /**
     * Test for the method {@link Player#deductMana(int)}
     */
    @Test 
    public void useCardWithEnoughMana(){
        player.setMana(10);
        player.deductMana(7);
        assertThat(player.getMana()).isEqualTo(3);
    }

    /**
     * Test for the method {@link Player#deductMana(int)}
     */
    @Test
    public void useCardWithNotEnoughMana(){
        player.setMana(3);
        player.deductMana(4);
        assertThat(player.getMana()).isEqualTo(0);
    }

    /**
     * Test for the method {@link Player#checkEnoughMana(int)}
     */
    @Test
    public void enoughMana(){
        player.setMana(3);
        assertThat(player.checkEnoughMana(2));
    }

    /**
     * Test for the method {@link Player#notEnoughMana(int)}
     */
    @Test
    public void notEnoughMana(){
        player.setMana(3);
        assertThat(player.checkEnoughMana(4)).isEqualTo(false);
    }

    /**
     * Test for the method {@link Player#clone(Player)}
     */
    @Test
    public void testClone(){
        String expN = "expN";
        Long expCId = new Long("1");
        String expStatus = "expStatus";
        Long expHeroId = new Long("2");
        int expMana = 2;
        int expStoredMana = 8;
        GameBoard expGB = new GameBoard(new Long("1"));

       // Player p2 = new Player(expN,expCId,expStatus,expHeroId,expMana,expStoredMana,expGB);

       // player.clone(p2);
        assertThat(player.getName()).isEqualTo(expN);
        assertThat(player.getClientId()).isEqualTo(expCId);
        assertThat(player.getStatus()).isEqualTo(expStatus);
        assertThat(player.getHeroId()).isEqualTo(expHeroId);
        assertThat(player.getMana()).isEqualTo(expMana);
        assertThat(player.getStored_mana()).isEqualTo(expStoredMana);
    }

    /**
     * Test for the method {@link Player#copy()}
     */
    @Test
    public void testCopy(){
        Player p2 = player.copy();

        player.clone(p2);
        assertThat(p2.getName()).isEqualTo(player.getName());
        assertThat(p2.getClientId()).isEqualTo(player.getClientId());
        assertThat(p2.getStatus()).isEqualTo(player.getStatus());
        assertThat(p2.getHeroId()).isEqualTo(player.getHeroId());
        assertThat(p2.getMana()).isEqualTo(player.getMana());
        assertThat(p2.getStored_mana()).isEqualTo(player.getStored_mana());
    }

    @Test
    public void checkPlayerAnnotations(){
        assertClassAnnotation(Player.class, Entity.class, Transactional.class);
    }

    @Test
    public void checkFieldsAnnotations(){
        assertField(Player.class, "id", Id.class, GeneratedValue.class);
        assertField(Player.class, "clientId");
        assertField(Player.class, "name");
        assertField(Player.class, "status");
    }

    @Test
    public void checkGettersAnnotation(){
        assertGetter(Player.class, "getId");
        assertGetter(Player.class, "getClientId");
        assertGetter(Player.class, "getName");
        assertGetter(Player.class, "getStatus");
    }
}
