package minihearthstone.entities.cards.effects;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import minihearthstone.entities.cards.BasicCard;
import minihearthstone.entities.cards.Card;
import minihearthstone.entities.gameboard.GameBoard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ChargeEffect.class, name = "ChargeEffect"),
    @JsonSubTypes.Type(value = LifeStealEffect.class, name = "LifeStealEffect"),
    @JsonSubTypes.Type(value = ProvocationEffect.class, name = "ProvocationEffect")
})
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractEffect implements IEffect {

    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    Long id;

    protected String name;

    @ManyToOne(fetch=FetchType.EAGER)
    @JsonBackReference(value="effect-mapping")
    protected Card effectMapping;

    @Transient
    protected static final Logger log = LoggerFactory.getLogger(BasicCard.class);

    public AbstractEffect() {
        
    }

    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // METHODS

    /**
     * Effect to be applied when card is chosen from hand of cards, just before putting it on the ground
     * @param card The card who owns this effect
     * @param playerId The player who owns this card
     * @param gameBoard The gameboard that the player belongs to
     * @return boolean true is effect has been made, else false
     */
    public abstract boolean applyOnChoiceEffect(Card card, Long playerId, GameBoard gameBoard);

    /**
     * Effect to be applied just before a card attack is performed, if return is true then the card can attack, else the card can't perform the attack
     * @param card
     * @param playerId
     * @param targetCardUniqueId
     * @param gameBoard
     * @return
     */
    public abstract boolean applyPreActionEffect(Card card, Long playerId, String targetCardUniqueId, GameBoard gameBoard);

    /**
     * Effect to be applied during a card attack, after damage has been inflicted to opponent servant
     * @param card The card who owns this effect
     * @param playerId The player who owns this card
     * @param gameBoard The gamebaord that the player belongs to
     * @return boolean true is effect has been made, else false
     */
    public abstract boolean applyInActionPreCondEffect(Card card, Long playerId, GameBoard gameBoard);

    /**
     * Effect to be applied during a card attack, before damage has been inflicted to opponent servant
     * @param card The card who owns this effect
     * @param playerId The player who owns this card
     * @param gameBoard The gamebaord that the player belongs to
     * @return boolean true is effect has been made, else false
     */
    public abstract boolean applyInActionPostCondEffect(Card card, Long playerId, GameBoard gameBoard);
}