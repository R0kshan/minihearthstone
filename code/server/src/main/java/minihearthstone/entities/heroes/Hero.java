package minihearthstone.entities.heroes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import minihearthstone.entities.gameboard.GameBoard;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = BasicHero.class, name = "BasicHero"),
})
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Hero implements IHero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String name;
    protected String type;
    protected String skillType;
    protected int lifepoints;
    protected int defense;
    protected String description;
    protected String uniqueId;
    protected boolean canUseSpecialSkill;
    protected boolean original;

    @ManyToOne(fetch=FetchType.EAGER, optional = true)
    @JsonBackReference(value="heroes-mapping")
    private GameBoard gameBoard;

    @OneToOne(cascade = {CascadeType.ALL})
    protected AbstractSpecificHero specificHero;

    public Hero() {

    }

    public Hero(String name, String type, String skillType, AbstractSpecificHero specificHero, String description) {
        this.uniqueId = name+System.currentTimeMillis()+(int) (Math.random() * (1000)+this.hashCode());
        this.name = name;
        this.type = type;
        this.skillType = skillType;
        this.lifepoints = 30;
        this.defense = 0;
        this.specificHero = specificHero;
        this.description = description;
        this.canUseSpecialSkill = true;
        this.original = true;
    }

    @Override
    public String toString() {
        return String.format(
                "Hero[id=%d, uniqueId='%s', name='%s', type=%s, skillType='%s', lifepoints=%d," +
                        "defense=%d, description=%s, specificHero='%s']",
                this.id, this.uniqueId, this.name, this.type, this.skillType, this.lifepoints,
                this.defense, this.description, (this.specificHero != null) ? this.specificHero.getClass().getSimpleName() : "null");
    }

    // GETTERS
    public Long getId() {
        return this.id;
    }
    public String getUniqueId() { return this.uniqueId; }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }
    public String getSkillType() { return this.skillType; }
    public int getLifepoints() {
        return this.lifepoints;
    }
    public int getDefense() { return this.defense; }
    public String getDescription() {
        return this.description;
    }
    public boolean getCanUseSpecialSkill() { return this.canUseSpecialSkill; }
    public GameBoard getGameBoard() { return this.gameBoard; }
    public AbstractSpecificHero getSpecificHero() { return this.specificHero; }
    public boolean getOriginal() { return this.original; }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setSkillType(String skillType) { this.skillType = skillType; }
    public void setLifepoints(int lifepoints) {
        if (lifepoints <= 30) {
            this.lifepoints = lifepoints;
        } else {
            this.lifepoints = 30;
        }
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDefense(int defense) { this.defense = defense; }
    public void setCanUseSpecialSkill(boolean canUseSpecialSkill) { this.canUseSpecialSkill = canUseSpecialSkill; }
    public void setGameBoard(GameBoard gameBoard) { this.gameBoard = gameBoard; }
    public void unsetGameBoard() {this.gameBoard = null; }
    public void setSpecificHero(AbstractSpecificHero specificHero) { this.specificHero = specificHero; }
    public void setOriginal(boolean original) { this.original = original; }

    // METHODS
    public abstract void specialSkillOnHero(String clientId, GameBoard gameBoard);
    public abstract void specialSkillOnServant(String clientId, String uniqueId, GameBoard gameBoard);
    public abstract void specialSkill(String clientId, GameBoard gameBoard);
    public abstract Hero uniqueCopy();

}
