package minihearthstone.entities.cards;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import minihearthstone.entities.gameboard.GameBoard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = ChefDeRaid.class, name = "ChefDeRaid"),
        @JsonSubTypes.Type(value = BenedictionDePuissance.class, name = "BenedictionDePuissance"),
        @JsonSubTypes.Type(value = ChefDeRaid.class, name = "ChefDeRaid"),
        @JsonSubTypes.Type(value = Consecration.class, name = "Consecration"),
        @JsonSubTypes.Type(value = ExplosionDesArcanes.class, name = "ExplosionDesArcanes"),
        @JsonSubTypes.Type(value = Metamorphose.class, name = "Metamorphose"),
        @JsonSubTypes.Type(value = Tourbillon.class, name = "Tourbillon") })
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractSpecificCard {

    // PROPERTIES
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;

    @Transient
    protected static final Logger log = LoggerFactory.getLogger(BasicCard.class);

    // CONSTRUCTORS
    public AbstractSpecificCard() {
        this.name = "AbstractSpecificCard";
    }

    // GETTERS AND SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public String getName() { return  this.name; }

    // METHODS
    public abstract void specialSkillOnServant(String cardId, Long playerId, GameBoard gameBoard);
    public abstract void specialSkillOnHero(Long playerId, GameBoard gameBoard);
    public abstract void specialSkill(Long playerId, GameBoard gameBoard);
    public abstract void specialSkillOnDeath(Long playerId, GameBoard gameBoard);

    public void inflictDamageToServant(Card servant, int damage, GameBoard gameBoard) {
        int remainingDamage = damage - servant.getDefense();
        if (remainingDamage >= 0) {
            servant.setDefense(0);
            servant.setLifepoints(servant.getLifepoints() - remainingDamage);
            gameBoard.addCardUniqueIdToAttackedServant(servant.getUniqueId());
        }
        else {
            servant.setDefense(servant.getDefense() - damage);
            gameBoard.addCardUniqueIdToAttackedServant(servant.getUniqueId());
        }
    }

}