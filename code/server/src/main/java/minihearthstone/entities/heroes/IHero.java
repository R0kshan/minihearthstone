package minihearthstone.entities.heroes;

import minihearthstone.entities.gameboard.GameBoard;

/**
 * Hero interface
 */
public interface IHero {

    // GETTERS

    /**
     * Get id
     * @return id
     */
    Long getId();

    /**
     * Get name
     * @return name
     */
    String getName();

    /**
     * Get type (ex: Warrior, Paladin, Mage)
     * @return type
     */
    String getType();

    /**
     * Get skill type (ex: self, targeted)
     * @return skill type
     */
    String getSkillType();

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
     * Get description
     * @return description
     */
    String getDescription() ;

    /**
     * Get ability to use special skill
     * @return boolean
     */
    boolean getCanUseSpecialSkill();

    /**
     * Get the association gameboard
     * @return gameboard
     */
    GameBoard getGameBoard();

    /**
     * Get specific hero class (ex: Mage, Paladin, Warrior)
     * @return specific hero class
     */
    AbstractSpecificHero getSpecificHero();

    // SETTERS

    /**
     * Set name
     * @param name name
     */
    void setName(String name);

    /**
     * Set type
     * @param type type (ex: paladin, mage, warrior)
     */
    void setType(String type);

    /**
     * Set skill type
     * @param skillType skillType
     */
    void setSkillType(String skillType);

    /**
     * Set lifepoints
     * @param lifepoints lifepoints
     */
    void setLifepoints(int lifepoints);

    /**
     * Set description
     * @param description description of the hero
     */
    void setDescription(String description);

    /**
     * Set defense
     * @param defense defense
     */
    void setDefense(int defense);

    /**
     * Set ability to use special skill
     * @param canUseSpecialSkill boolean
     */
    void setCanUseSpecialSkill(boolean canUseSpecialSkill);

    /**
     * Set gameboard
     * @param gameBoard gameboard to be associated to hero
     */
    void setGameBoard(GameBoard gameBoard);

    /**
     * Unset gameboard associated to hero
     */
    void unsetGameBoard();

    /**
     * Get specific hero
     * @param specificHero
     */
    void setSpecificHero(AbstractSpecificHero specificHero);

    // METHODS

    /**
     * Apply special skill on hero
     * @param clientId player's client id player's client id
     * @param gameBoard gameboard
     */
    void specialSkillOnHero(String clientId, GameBoard gameBoard);

    /**
     * Apply special skill on servant
     * @param clientId player's client id
     * @param uniqueId servant cards' unique id
     * @param gameBoard gameboard
     */
    void specialSkillOnServant(String clientId, String uniqueId, GameBoard gameBoard);

    /**
     * Apply special skill
     * @param clientId player's client id
     * @param gameBoard gameboard
     */
    void specialSkill(String clientId, GameBoard gameBoard);

    /**
     * Return a unique copy of this hero (copied all attributes except 'uniqueId')
     * @return
     */
    Hero uniqueCopy();
}
