package minihearthstone.facade;

import minihearthstone.entities.gameboard.GameBoard;
import minihearthstone.entities.heroes.Hero;
import minihearthstone.entities.match.Match;
import minihearthstone.entities.player.Player;

import java.util.List;

/**
 * Server facade interface : contains all functions linked to game management
 */
public interface IFacade {

    /**
     * Save player instance in JPA
     * @param playerId client generated unique player id
     * @param playername player username sent from client
     * @return player object
     */
    Player login(String playerId, String playername);

    /**
     * Delete this player from JPA
     * @param playerId  client generated unique player id
     * @return Message to notifiy that deletion is successfull
     */
    String logout(String playerId);

    /**
     * Change status of current player to 'availble' when opponent player has logged out
     * @param playerId  client generated unique player id
     * @param opponentId client generated unique opponent player id
     * @return Redirection message sent to opponent player
     */
    String logout(String playerId, String opponentId);

    /**
     * Get player object by clientId from JPA
     * @param playerId client generated unique player id
     * @return player object from JPA
     */
    Player getPlayer(String playerId);

    /**
     * Delete player object by clientId from JPA
     * @param playerId client generated unique player id
     * @return true if player has been deleted, false otherwise
     */
    boolean removePlayer(String playerId);

    /**
     * Get all players from JPA
     * @return List of players
     */
    List<Player> getAllPlayers();

    /**
     * Get all heroes from JPA
     * @return List of heroes
     */
    List<Hero> getAllHeroes(String playerId);

    /**
     * Save player's hero choice in gameboard
     * @param playerId client generated unique player id
     * @param heroId id of the chosen hero
     * @param gameId game id
     * @return updated gameboard object
     */
    GameBoard chooseHero(String playerId, String heroId, String gameId);

    /**
     * Get gameboard by gameId
     * @param gameId game id
     * @return gameboard stored in JPA
     */
    GameBoard getGameBoardByGameId(String gameId);

    /**
     * Get hero associated to player
     * @param playerId client generated unique player id
     * @return hero object stored in JPA
     */
    Hero getHeroByPlayerId(String playerId);

    /**
     * Initialize gameboard by determining randomly which player should start first
     * @param playerId client generated unique player id
     * @param gameId game id
     * @return  updated gameboard from JPA
     */
    GameBoard initGame(String playerId, String gameId);

    /**
     * Do all operations required when a player places a card on the ground
     * @param playerId client generated unique player id
     * @param gameId game id
     * @param cardUniqueId unique of picked card
     * @return updated gameboard
     */
    GameBoard chooseCard(String playerId, String gameId, String cardUniqueId);

    /**
     * Do all operations necessary for a servant card to attack an opponent servant
     * @param playerId client generated unique player id
     * @param opponentId client generated unique opponent player id
     * @param gameId game id
     * @param servantUniqueIds JSON array containing player's servant card and opponent servant's card unique ids
     * @return updated gameboard after attack has (or not been applied)
     */
    GameBoard cardAttackServant(String playerId, String opponentId, String gameId, String servantUniqueIds);

    /**
     * Do all operations necessary for a spell card to attack an opponent servant
     * @param playerId client generated unique player id
     * @param opponentId client generated unique opponent player id
     * @param gameId game id
     * @param servantUniqueIds JSON array containing player's servant card and opponent servant's card unique ids
     * @return updated gameboard after attack has (or not been applied)
     */
    GameBoard spellCardAttackServant(String playerId, String opponentId, String gameId, String servantUniqueIds);

    /**
     * Do all operations necessary for a spell card to apply special skill on friendly servant card
     * @param playerId client generated unique player id
     * @param opponentId client generated unique opponent player id
     * @param gameId game id
     * @param servantUniqueIds JSON array containing player's servant card and opponent servant's card unique ids
     * @return updated gameboard after special skill has (or not been applied) on friendly servant
     */
    GameBoard spellCardOnFriendlyServant( String playerId, String opponentId, String gameId, String servantUniqueIds);

    /**
     * Do all operations necessary for a servant card to attack a hero
     * @param playerId client generated unique player id
     * @param opponentId client generated unique opponent player id
     * @param gameId game id
     * @param servantUniqueId unique id of chosen servant card in hand
     * @return updated gameboard after attack has (or not been applied) on opponent hero
     */
    GameBoard cardAttackHero(String playerId, String opponentId, String gameId, String servantUniqueId);

    /**
     * Do all operations necessary for a spell card to attack a hero
     * @param playerId client generated unique player id
     * @param opponentId client generated unique opponent player id
     * @param gameId game id
     * @param spellCardUniqueId unique id of chosen spell card in hand
     * @return updated gameboard after spell has (or not been applied) on opponent hero
     */
    GameBoard spellCardAttackHero(String playerId,  String opponentId, String gameId, String spellCardUniqueId);

    /**
     * Do all operations necessary for a hero to attack an opponent servant card
     * @param playerId client generated unique player id
     * @param opponentId client generated unique opponent player id
     * @param gameId game id
     * @param opponentServantUniqueId unique id of selected opponent servant
     * @return updated gameboard after the attack has (or not been apllied) on servant
     */
    GameBoard heroAttackServant(String playerId, String opponentId, String gameId, String opponentServantUniqueId);

    /**
     * Do all operations necessary for a hero to attack an opponent hero
     * @param playerId client generated unique player id
     * @param opponentId client generated unique opponent player id
     * @param gameId game id
     * @return updated gameboard after the attack has (or not been apllied) on opponent hero
     */
    GameBoard heroAttackHero(String playerId, String opponentId, String gameId);

    /**
     * Use hero special on self
     * @param playerId client generated unique player id
     * @param opponentId client generated unique opponent player id
     * @param gameId game id
     * @return updated gameboard after the hero special skill has been applied
     */
    GameBoard useHeroSpecial(String playerId, String opponentId, String gameId);

    /**
     * Get first hand of cards : randomly pick three cards from hero's deck
     * @param playerId client generated unique player id
     * @param heroId id of player's chosen hero
     * @param gameId game id
     * @return updated gameboard with hand of cards added
     */
    GameBoard getFirstHandOfCards(String playerId, String heroId, String gameId);

    /**
     * Remove all dead servants from gameboard, and check if there's a winner
     * @param playerId client generated unique player id
     * @param gameId game id
     * @return gameboard
     */
    GameBoard updateGameBoard(String playerId, String gameId);

    /**
     * Do all necessary operations before player's end of turn
     * @param playerId client generated unique player id
     * @param opponentId client generated unique opponent player id
     * @param gameId game id
     * @return updated gameboard
     */
    GameBoard endMyTurn(String playerId, String opponentId, String gameId);

    /**
     * Do all necessary operations before sending updated gameboard to opponent player when player's turn has ended
     * @param playerId client generated unique player id
     * @param gameId game id
     * @return updated gameboard
     */
    GameBoard sendEndOfTurn(String playerId, String gameId);

    /**
     * Get the size of an Iterable object
     * @param iterable iterable object
     * @return size of iterable object
     */
    int size(Iterable<?> iterable);

    /**
     * Convert Iterable object
     * @param iterable iterable object
     * @return List containing elements of Iterable object
     */
    List convertToList(Iterable iterable);

    /**
     * Find random match
     * @param playerId client id
     * @return Match object
     */
    Match findRandomMatch(String playerId);

    /**
     * Send random match object to opponent player
     * @param playerId client id
     * @param matchId match id
     * @return match object
     */
    Match sendRandomMatch(String playerId, String matchId);

    /**
     * Delete a match from JPA
     * @param playerId client id
     * @param matchId id of match to delete
     * @return string indicating success or failure of deletion
     */
    String cancelMatch(String playerId, String matchId);

    /**
     * Delete the game from JPA
     * @param playerId
     * @param opponentId
     * @param gameId id of the game to delete
     * @return string containing the message to be displayed in client
     */
    String quitGame(String playerId, String opponentId, String gameId);

    /**
     * Set the player's status
     * @param playerId client id of player
     * @param status new status
     */
    void setPlayerStatus(String playerId, String status);

}