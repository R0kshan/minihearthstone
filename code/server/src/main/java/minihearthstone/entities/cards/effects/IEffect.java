package minihearthstone.entities.cards.effects;
import minihearthstone.entities.cards.Card;
import minihearthstone.entities.gameboard.GameBoard;

/**
 * Effect interface class
 */
public interface IEffect {

    /**
     * Set effect name
     * @param name
     */
    void setName(String name);

    /**
     * Get effect name
     * @return
     */
    String getName();

    /**
     * Apply effect on card choice
     * @param card card that owns this effect
     * @param playerId id of player who owns this card
     * @param gameBoard gameboard who owns this card
     * @return boolean
     */
    boolean applyOnChoiceEffect(Card card, Long playerId, GameBoard gameBoard);

    /**
     * Apply effect before an action is performed
     * @param card card that owns this effect
     * @param playerId id of player who owns this card
     * @param targetCardUniqueId unique id of target card
     * @param gameBoard gameboard who owns this card
     * @return boolean
     */
    boolean applyPreActionEffect(Card card, Long playerId, String targetCardUniqueId, GameBoard gameBoard);

    /**
     * Apply effect during an action as a precondition effect
     * @param card card that owns this effect
     * @param playerId id of player who owns this card
     * @param gameBoard gameboard who owns this card
     * @return boolean
     */
    boolean applyInActionPreCondEffect(Card card, Long playerId, GameBoard gameBoard);

    /**
     * Apply effect during an action as a postcondition effect
     * @param card card that owns this effect
     * @param playerId id of player who owns this card
     * @param gameBoard gameboard who owns this card
     * @return boolean
     */
    boolean applyInActionPostCondEffect(Card card, Long playerId, GameBoard gameBoard);

}