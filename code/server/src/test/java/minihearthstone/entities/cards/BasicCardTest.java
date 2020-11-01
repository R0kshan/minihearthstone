package minihearthstone.entities.cards;

import org.junit.Before;
import org.junit.Test;

import minihearthstone.entities.cards.effects.BasicEffect;
import minihearthstone.entities.cards.effects.ChargeEffect;
import minihearthstone.entities.cards.effects.LifeStealEffect;
import minihearthstone.entities.cards.effects.ProvocationEffect;
import minihearthstone.entities.gameboard.GameBoard;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicCardTest {
    //TODO : FINISH THIS

    private BasicCard card;
    private final static String uniqueId = "uniqueId";
    private final static String name = "name";
    private final static int manacost = 1;
    private final static int damage = 1;
    private final static int lifepoints = 1;
    private final static String type = "type";
    private final static String nature = "servant";
    private final BasicEffect basicE = new BasicEffect();
    private final AbstractSpecificCard specificCard = new ChefDeRaid();

    private final GameBoard gameB = new GameBoard(new Long("3"));
    private final Long playerId = new Long("2");
    private final String description = "";
    private final String tooltip = "";

    @Before
    public void setup() {
        card = new BasicCard(name,manacost,damage,lifepoints,type,nature, basicE, specificCard, description, tooltip);

    }

    /**
     * Test {@link Card#copy()} with a provocation effect
     */
    @Test 
    public void copyOfCardWithProvocationEffect(){
        final ProvocationEffect provoE = new ProvocationEffect();
        card.setEffect(provoE);
        final Card copy = card.copy();
        assertThat(copy.getName()).isEqualTo(name);
        assertThat(copy.getManacost()).isEqualTo(manacost);
        assertThat(copy.getDamage()).isEqualTo(damage);
        assertThat(copy.getLifepoints()).isEqualTo(lifepoints);
        assertThat(copy.getType()).isEqualTo(type);
        assertThat(copy.getEffect().getName()).isEqualTo(provoE.getName());
    }

    
    /**
     * Test {@link Card#copy()} with a charge effect
     */
    @Test 
    public void copyOfCardWithChargeEffect(){
        final ChargeEffect chargeE = new ChargeEffect();
        card.setEffect(chargeE);
        final Card copy = card.copy();
        assertThat(copy.getName()).isEqualTo(name);
        assertThat(copy.getManacost()).isEqualTo(manacost);
        assertThat(copy.getDamage()).isEqualTo(damage);
        assertThat(copy.getLifepoints()).isEqualTo(lifepoints);
        assertThat(copy.getType()).isEqualTo(type);
        assertThat(copy.getEffect().getName()).isEqualTo(chargeE.getName());
    }

    
    /**
     * Test {@link Card#copy()} with a life steal effect
     */
    @Test 
    public void copyOfCardWithLifeStealEffect(){
        final LifeStealEffect lifeSE = new LifeStealEffect();
        card.setEffect(lifeSE);
        final Card copy = card.copy();
        assertThat(copy.getName()).isEqualTo(name);
        assertThat(copy.getManacost()).isEqualTo(manacost);
        assertThat(copy.getDamage()).isEqualTo(damage);
        assertThat(copy.getLifepoints()).isEqualTo(lifepoints);
        assertThat(copy.getType()).isEqualTo(type);
        assertThat(copy.getEffect().getName()).isEqualTo(lifeSE.getName());
    }
    

    /**
     * Test {@link Card#uniqueCopy()} with a provocation effect
     */
    @Test 
    public void uniqueCopyOfCardWithProvocationEffect(){
        final ProvocationEffect provoE = new ProvocationEffect();
        card.setEffect(provoE);

        final Card copy = card.uniqueCopy();

        assertThat(copy.getUniqueId()).isNotEqualTo(uniqueId);
        assertThat(copy.getName()).isEqualTo(name);
        assertThat(copy.getManacost()).isEqualTo(manacost);
        assertThat(copy.getDamage()).isEqualTo(damage);
        assertThat(copy.getLifepoints()).isEqualTo(lifepoints);
        assertThat(copy.getType()).isEqualTo(type);
        assertThat(copy.getEffect().getName()).isEqualTo(provoE.getName());
    }


    /**
     * Test {@link Card#uniqueCopy()} with a lifesteal effect
     */
    @Test 
    public void uniqueCopyOfCardWithLifeStealEffect(){
        final LifeStealEffect lifeSE = new LifeStealEffect();
        card.setEffect(lifeSE);

        final Card copy = card.uniqueCopy();

        assertThat(copy.getUniqueId()).isNotEqualTo(uniqueId);
        assertThat(copy.getName()).isEqualTo(name);
        assertThat(copy.getManacost()).isEqualTo(manacost);
        assertThat(copy.getDamage()).isEqualTo(damage);
        assertThat(copy.getLifepoints()).isEqualTo(lifepoints);
        assertThat(copy.getType()).isEqualTo(type);
        assertThat(copy.getEffect().getName()).isEqualTo(lifeSE.getName());
    }
    
    /**
     * Test {@link Card#uniqueCopy()} with an charge effect
     */
    @Test 
    public void uniqueCopyOfCardWithAttackBoostEffect(){
        final ChargeEffect chargeE = new ChargeEffect();
        card.setEffect(chargeE);

        final Card copy = card.uniqueCopy();

        assertThat(copy.getUniqueId()).isNotEqualTo(uniqueId);
        assertThat(copy.getName()).isEqualTo(name);
        assertThat(copy.getManacost()).isEqualTo(manacost);
        assertThat(copy.getDamage()).isEqualTo(damage);
        assertThat(copy.getLifepoints()).isEqualTo(lifepoints);
        assertThat(copy.getType()).isEqualTo(type);
        assertThat(copy.getEffect().getName()).isEqualTo(chargeE.getName());
    }    

    @Test
    public void applyOnChoiceEffectWithEffect(){
        card.setEffect(new LifeStealEffect());
        assertThat(card.applyOnChoiceEffect(card, playerId, gameB));
    }

    @Test
    public void applyOnChoiceEffectWithoutEffect(){
        assertThat(card.applyOnChoiceEffect(card, playerId, gameB));
    }

    
    @Test
    public void applyPreActionEffectWithEffect(){
        card.setEffect(new ChargeEffect());
        assertThat(card.applyPreActionEffect(card, playerId, "uniqueId", gameB));
    }

    @Test
    public void applyPreActionEffectWithoutEffect(){
        assertThat(card.applyPreActionEffect(card, playerId, "uniqueId", gameB));
    }

    @Test
    public void applyInActionPreCondEffectWithEffect(){
        card.setEffect(new ProvocationEffect());
        assertThat(card.applyInActionPreCondEffect(card, playerId, gameB));
    }

    @Test
    public void applyInActionPreCondEffectWithoutEffect(){
        assertThat(card.applyInActionPreCondEffect(card, playerId, gameB));
    }

    @Test
    public void applyInActionPostCondEffectWithEffect(){
        card.setEffect(new ProvocationEffect());
        assertThat(card.applyInActionPostCondEffect(card, playerId, gameB));
    }

    @Test
    public void applyInActionPostCondEffectWithoutEffect(){
        assertThat(card.applyInActionPostCondEffect(card, playerId, gameB));
    }
}
