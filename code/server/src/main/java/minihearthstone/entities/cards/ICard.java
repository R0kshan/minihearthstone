package minihearthstone.entities.cards;

import minihearthstone.entities.cards.effects.AbstractEffect;
import minihearthstone.entities.deck.Deck;
import minihearthstone.entities.gameboard.GameBoard;

public interface ICard {

    // GETTERS

    /**
     * Get id
     * @return id
     */
    Long getId();

    /**
     * Get unique id
     * @return unique id
     */
    String getUniqueId();

    /**
     * Get name
     * @return name
     */
    String getName();

    /**
     * Get manacost
     * @return manacost
     */
    int getManacost();

    /**
     * Get damage
     * @return damage
     */
    int getDamage();

    /**
     * Get lifepoints
     * @return lifepoints
     */
    int getLifepoints();

    /**
     * Get defense
     * @return defense
     */
    int getDefense();

    /**
     * Get type
     * @return type
     */
    String getType();

    /**
     * Get nature
     * @return nature
     */
    String getNature();

    /**
     * Get canAttack
     * @return ability to attack this round
     */
    boolean getCanAttack();

    /**
     * Get effect
     * @return effect
     */
    AbstractEffect getEffect();

    /**
     * Get specific card
     * @return specific card
     */
    AbstractSpecificCard getSpecificCard();

    /**
     * Get description
     * @return description
     */
    String getDescription();

    /**
     * Get deck
     * @return deck
     */
    Deck getDeck();

    /**
     * Get gameboard associated to player 1 hand of cards
     * @return player 1 hand of cards mapping with gameboard
     */
    GameBoard getGbP1HandOfCardsMapping();

    /**
     * Get gameboard associated to player 2 hand of cards
     * @return player 2 hand of cards mapping with gameboard
     */
    GameBoard getGbP2HandOfCardsMapping();

    /** Get gameboard associated to player 1 cards on ground
     * @return player 1 cards on ground  mapping with gameboard
     */
    GameBoard getGbP1CardsOnGroundMapping();

    /**
     * Get gameboard associated to player 2 cards on ground
     * @return player 2 cards on ground  mapping with gameboard
     */
    GameBoard getGbP2CardsOnGroundMapping();


    // SETTERS

    /**
     * Set id
     * @param id primary key id to set
     */
    void setId(Long id);

    /**
     * Set unique id
     * @param uniqueId unique id to set
     */
    void setUniqueId(String uniqueId);

    /**
     * Set name
     * @param name name to set
     */
    void setName(String name);

    /**
     * Set manacost
     * @param manacost manacost to set
     */
    void setManacost(int manacost);

    /**
     * Set damage
     * @param damage damage to set
     */
    void setDamage(int damage);

    /**
     * Set lifepoints
     * @param lifepoints lifepoints to set
     */
    void setLifepoints(int lifepoints);

    /**
     * Set defense
     * @param defense defense to set
     */
    void setDefense(int defense);

    /**
     * Set type
     * @param type type of card (ex: mage, paladin or warrior)
     */
    void setType(String type);

    /**
     * Set nature
     * @param nature nature of card (ex: spell, targetSpell, servant)
     */
    void setNature(String nature);

    /**
     * Set canAttack
     * @param canAttack boolean indicating whether card can attack this round or not
     */
    void setCanAttack(boolean canAttack);

    /**
     * Set effect
     * @param effect effect of card (ex: ProvocationEffect, ChargeEffect, LifeStealEffect)
     */
    void setEffect(AbstractEffect effect);

    /**
     * Set specific card
     * @param specificCard specific card implementation (ex: Tourbillon)
     */
    void setSpecificCard(AbstractSpecificCard specificCard);

    /**
     * Set description
     * @param description card description
     */
    void setDescription(String description);

    /**
     * Set deck
     * @param deck deck to which the card belongs to
     */
    void setDeck(Deck deck);

    /**
     * Unset the deck that is currently holding this card
     */
    void unsetDeck();

    /**
     * Set mapping for gameboard of p1 hand of cards
     * @param gameboard set mapping for gameboard of p1 hand of cards
     */
    void setGbP1HandOfCardsMapping(GameBoard gameboard);

    /**
     * Set mapping for gameboard of p2 hand of cards
     * @param gameboard set mapping for gameboard of p2 hand of cards
     */
    void setGbP2HandOfCardsMapping(GameBoard gameboard);

    /**
     * Set mapping for gameboard of p1 cards on ground
     * @param gameboard set mapping for gameboard of p1 cards on ground
     */
    void setGbP1CardsOnGroundMapping(GameBoard gameboard);

    /**
     * Set mapping for gameboard of p2 cards on ground
     * @param gameboard set mapping for gameboard of p2 cards on ground
     */
    void setGbP2CardsOnGroundMapping(GameBoard gameboard);

    /**
     * set mapping for gameboard of p1 hand of cards
     */
    void unsetGbP1HandOfCardsMapping();

    /**
     * unset mapping for gameboard of p2 hand of cards
     */
    void unsetGbP2HandOfCardsMapping();

    /**
     * unset mapping for gameboard of p1 cards on ground
     */
    void unsetGbP1CardsOnGroundMapping();

    /**
     * unset mapping for gameboard of p2 cards on ground
     */
    void unsetGbP2CardsOnGroundMapping();

    // METHODS

    /**
     * Complete copy of current card (excluding 'id' attribute)
     * @return copy of this card
     */
    Card copy();

    /**
     * Complete copy of current card (excluding 'id' and generating a new 'uniqueId')
     * @return
     */
    Card uniqueCopy();

    /**
     * Effect to be applied when card is chosen from hand of cards, just before putting it on the ground
     * @param card The card who owns this effect
     * @param playerId The player who owns this card
     * @param gameBoard The gamebaord that the player belongs to
     * @return boolean true is effect has been made, else false
     */
    boolean applyOnChoiceEffect(Card card, Long playerId, GameBoard gameBoard);

    /**
     * Effect to be applied just before a card attack is performed, if return is true then the card can attack, else the card can't perform the attack
     * @param card The card who owns this effect
     * @param playerId The player who owns this card
     * @param targetCardUniqueId Unique id of target card
     * @param gameBoard The gamebaord that the player belongs to
     * @return boolean true is effect has been made, else false
     */
    boolean applyPreActionEffect(Card card, Long playerId, String targetCardUniqueId, GameBoard gameBoard);

    /**
     * Effect to be applied during a card attack, after damage has been inflicted to opponent servant
     * @param card The card who owns this effect
     * @param playerId The player who owns this card
     * @param gameBoard The gamebaord that the player belongs to
     * @return boolean true is effect has been made, else false
     */
    boolean applyInActionPreCondEffect(Card card, Long playerId, GameBoard gameBoard);

    /**
     * Effect to be applied during a card attack, before damage has been inflicted to opponent servant
     * @param card The card who owns this effect
     * @param playerId The player who owns this card
     * @param gameBoard The gamebaord that the player belongs to
     * @return boolean true is effect has been made, else false
     */
    boolean applyInActionPostCondEffect(Card card, Long playerId, GameBoard gameBoard);

    /**
     * Apply normal attack on servant
     * @param cardId card id
     * @param playerId player id
     * @param gameBoard gameboard
     */
    void normalAttackOnServant(String cardId, Long playerId, GameBoard gameBoard);

    /**
     * Apply normal attack on opponent hero
     * @param playerId player id
     * @param gameBoard gameboard
     */
    void normalAttackOnHero(Long playerId, GameBoard gameBoard);

    /**
     * Apply special skill on servant
     * @param cardId card id
     * @param playerId player id
     * @param gameBoard gameboard
     */
    void specialSkillOnServant(String cardId, Long playerId, GameBoard gameBoard);

    /**
     * Apply special skill on hero
     * @param playerId player id
     * @param gameBoard gameboard
     */
    void specialSkillOnHero(Long playerId, GameBoard gameBoard);

    /**
     * Apply special skill on self
     * @param playerId player id
     * @param gameBoard gameboard
     */
    void specialSkill(Long playerId, GameBoard gameBoard);

    /**
     * Apply special skill to executed on death
     * @param playerId player id
     * @param gameBoard gameboard
     */
    void specialSkillOnDeath(Long playerId, GameBoard gameBoard);

    /**
     * Inflict damage according to servant's health and defense
     * @param damage damage points
     * @param gameBoard gameboard
     */
    void inflictDamageToServant(Card servant, int damage, GameBoard gameBoard);

}