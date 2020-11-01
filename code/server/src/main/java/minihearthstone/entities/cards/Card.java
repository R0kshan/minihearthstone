package minihearthstone.entities.cards;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import minihearthstone.entities.cards.effects.AbstractEffect;
import minihearthstone.entities.deck.Deck;
import minihearthstone.entities.gameboard.GameBoard;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
    @JsonSubTypes.Type(value = BasicCard.class, name = "BasicCard"),
})
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Card implements ICard {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  protected Long id;
  protected String uniqueId; // to differentiate from JPA id
  protected String name;
  protected int manacost;
  protected int damage;
  protected int lifepoints;
  protected int defense;
  protected String type;
  protected String description;
  protected String nature;
  protected boolean canAttack;
  protected  String clientTooltip;

  @ManyToOne(fetch=FetchType.EAGER) 
  protected Deck deck;

  @ManyToOne(fetch=FetchType.EAGER) 
  @JsonBackReference(value="p1HandOfCards-mapping")
  protected GameBoard gbP1HandOfCardsMapping;

  @ManyToOne(fetch=FetchType.EAGER) 
  @JsonBackReference(value="p2HandOfCards-mapping")
  protected GameBoard gbP2HandOfCardsMapping;

  @ManyToOne(fetch=FetchType.EAGER) 
  @JsonBackReference(value="p1CardsOnGround-mapping")
  protected GameBoard gbP1CardsOnGroundMapping;

  @ManyToOne(fetch=FetchType.EAGER) 
  @JsonBackReference(value="p2CardsOnGround-mapping")
  protected GameBoard gbP2CardsOnGroundMapping;

  @OneToOne(cascade = {CascadeType.ALL})
  protected AbstractEffect effect;

  @OneToOne(cascade = {CascadeType.ALL})
  protected AbstractSpecificCard specificCard;

  // CONSTRUCTORS

  /**
   * Default constructor
   */
  protected Card() {}

  /**
   * Copy constructor
   * @param uniqueId unique id
   * @param name name
   * @param manacost manacost
   * @param damage damage
   * @param lifepoints lifepoints
   * @param canAttack canAttack
   * @param defense defense
   * @param type type
   * @param nature nature
   * @param effect effect
   * @param specificCard specificCard
   * @param canAttack
   * @param description
   * @param clientTooltip
   */
  protected Card(String uniqueId, String name, int manacost, int damage, int lifepoints, boolean canAttack, int defense, String type, String nature, AbstractEffect effect, AbstractSpecificCard specificCard, String description, String clientTooltip) {
    this.uniqueId = uniqueId;
    this.name = name;
    this.manacost = manacost;
    this.damage = damage;
    this.lifepoints = lifepoints;
    this.defense = defense;
    this.type = type;
    this.nature = nature;
    this.effect = effect;
    this.specificCard = specificCard;
    this.canAttack = canAttack;
    this.description = description;
    this.clientTooltip = clientTooltip;
  }

  /**
   * Constructor
   * @param name name
   * @param manacost manacost
   * @param damage damage
   * @param lifepoints lifepoints
   * @param type type
   * @param nature nature
   * @param effect effect
   * @param specificCard specificCard
   * @param description
   * @param clientTooltip
   */
  public Card(String name, int manacost, int damage, int lifepoints, String type, String nature, AbstractEffect effect, AbstractSpecificCard specificCard, String description, String clientTooltip) {
    
    // Create a unique id combining the name of the card and the current time
    this.uniqueId = name+System.currentTimeMillis()+(int) (Math.random() * (1000)+this.hashCode());
    this.name = name;
    this.manacost = manacost;
    this.damage = damage;
    this.lifepoints = lifepoints;
    this.defense = 0;
    this.type = type;
    this.nature = nature;
    this.effect = effect;
    this.specificCard = specificCard;
    this.canAttack = false;
    this.description = description;
    this.clientTooltip = clientTooltip;
  }

  /**
   * Complete constructor necessaire for JSON Mapping
   * @param id id
   * @param uniqueId uniqueId
   * @param name name
   * @param manacost manacost
   * @param damage damage
   * @param lifepoints lifepoints
   * @param type type
   * @param nature nature
   * @param description description
   * @param clientTooltip client tooltip
   * @param deck deck
   * @param gbP1HandOfCardsMapping gbP1HandOfCardsMapping
   * @param gbP2HandOfCardsMapping gbP2HandOfCardsMapping
   * @param gbP1CardsOnGroundMapping gbP1CardsOnGroundMapping
   * @param gbP2CardsOnGroundMapping gbP2CardsOnGroundMapping
   * @param effect effect
   * @param specificCard specificCard
   */
  public Card(Long id, String uniqueId, String name, int manacost, int damage, int lifepoints, String type, String nature, String description, String clientTooltip,
              Deck deck, 
              GameBoard gbP1HandOfCardsMapping, GameBoard gbP2HandOfCardsMapping, 
              GameBoard gbP1CardsOnGroundMapping, GameBoard gbP2CardsOnGroundMapping,
              AbstractEffect effect, AbstractSpecificCard specificCard) {
    this.id = id;
    this.uniqueId = uniqueId;
    this.name = name;
    this.manacost = manacost;
    this.damage = damage;
    this.lifepoints = lifepoints;
    this.defense = 0;
    this.description = description;
    this.type = type;
    this.nature = nature;
    this.deck = deck;
    this.gbP1HandOfCardsMapping = gbP1HandOfCardsMapping;
    this.gbP2HandOfCardsMapping = gbP2HandOfCardsMapping;
    this.gbP1CardsOnGroundMapping = gbP1CardsOnGroundMapping;
    this.gbP2CardsOnGroundMapping = gbP2CardsOnGroundMapping;
    this.effect = effect;
    this.specificCard = specificCard;
    this.canAttack = false;
  }

  @Override
  public String toString() {
    return String.format(
            "Card[id=%d, uniqueId='%s', name='%s', manacost=%d, damage=%d, lifepoints=%d, nature='%s', " +
                    "canAttack=%b, currentTargetUniqueId='%s', effect='%s', specificCard='%s']",
            this.id, this.uniqueId, this.name, this.manacost, this.damage, this.lifepoints, this.nature,
            this.canAttack, this.uniqueId, (this.effect != null ) ? this.effect.getClass().getSimpleName() : "null",
            (this.specificCard != null ) ? this.specificCard.getClass().getSimpleName() : "null");
  }

  // GETTERS 
  public Long getId() {
    return this.id;
  } 
  public String getUniqueId() {
    return this.uniqueId;
  }
  public String getName() {
    return this.name;
  }
  public int getManacost() {
    return this.manacost;
  }
  public int getDamage() {
    return this.damage;
  }
  public int getLifepoints() {
    return this.lifepoints;
  }
  public int getDefense() { return this.defense; }
  public String getType() {
    return this.type;
  }
  public String getNature() {
    return this.nature;
  }
  public boolean getCanAttack() { return this.canAttack; }
  public AbstractEffect getEffect() {
    return this.effect;
  }
  public AbstractSpecificCard getSpecificCard() { return this.specificCard; }
  public String getDescription() {
    return this.description;
  }
  public String getClientTooltip() { return this.clientTooltip; }
  public Deck getDeck() {
    return this.deck;
  }
  public GameBoard getGbP1HandOfCardsMapping() {
    return this.gbP1HandOfCardsMapping;
  }
  public GameBoard getGbP2HandOfCardsMapping() {
    return this.gbP2HandOfCardsMapping;
  }
  public GameBoard getGbP1CardsOnGroundMapping() {
    return this.gbP1CardsOnGroundMapping;
  }
  public GameBoard getGbP2CardsOnGroundMapping() {
    return this.gbP2CardsOnGroundMapping;
  }


  // SETTERS
  public void setId(Long id) {
    this.id = id;
  }
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setManacost(int manacost) {
    this.manacost = manacost;
  }
  public void setDamage(int damage) {
    this.damage = damage;
  }
  public void setLifepoints(int lifepoints) {
    if (lifepoints >= 0) {
      this.lifepoints = lifepoints;
    } else {
      this.lifepoints = 0;
    }
  }
  public void setDefense(int defense) { this.defense = defense; }
  public void setType(String type) {
    this.type = type;
  }
  public void setNature(String nature) {
    this.nature = nature;
  }
  public void setCanAttack(boolean canAttack) { this.canAttack = canAttack; }
  public void setEffect(AbstractEffect effect) {
    this.effect = effect;
  }
  public void setSpecificCard(AbstractSpecificCard specificCard) {this.specificCard = specificCard; }
  public void setDescription(String description) {
    this.description = description;
  }
  public void setClientTooltip(String clientTooltip) { this.clientTooltip = clientTooltip; }
  public void setDeck(Deck deck) {
    this.deck = deck;
  }
  public void unsetDeck() {
    this.deck = null;
  }
  public void setGbP1HandOfCardsMapping(GameBoard gameboard) {
    this.gbP1HandOfCardsMapping = gameboard;
  }
  public void setGbP2HandOfCardsMapping(GameBoard gameboard) {
    this.gbP2HandOfCardsMapping = gameboard;
  }
  public void setGbP1CardsOnGroundMapping(GameBoard gameboard) {
    this.gbP1CardsOnGroundMapping = gameboard;
  }
  public void setGbP2CardsOnGroundMapping(GameBoard gameboard) {
    this.gbP2CardsOnGroundMapping = gameboard;
  }
  public void unsetGbP1HandOfCardsMapping() {
    this.gbP1HandOfCardsMapping = null;
  }
  public void unsetGbP2HandOfCardsMapping() {
    this.gbP2HandOfCardsMapping = null;
  }
  public void unsetGbP1CardsOnGroundMapping() {
    this.gbP1CardsOnGroundMapping = null;
  }
  public void unsetGbP2CardsOnGroundMapping() {
    this.gbP2CardsOnGroundMapping = null;
  }

  // METHODS
  public abstract Card copy();
  public abstract Card uniqueCopy();

  public abstract boolean applyOnChoiceEffect(Card card, Long playerId, GameBoard gameBoard);
  public abstract boolean applyPreActionEffect(Card card, Long playerId, String targetCardUniqueId, GameBoard gameBoard);
  public abstract boolean applyInActionPreCondEffect(Card card, Long playerId, GameBoard gameBoard);
  public abstract boolean applyInActionPostCondEffect(Card card, Long playerId, GameBoard gameBoard);

  public abstract void normalAttackOnServant(String cardId, Long playerId, GameBoard gameBoard);
  public abstract void normalAttackOnHero(Long playerId, GameBoard gameBoard);
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
