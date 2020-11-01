package minihearthstone.controller;

import minihearthstone.entities.gameboard.GameBoard;
import minihearthstone.entities.heroes.Hero;
import minihearthstone.entities.match.Match;
import minihearthstone.entities.player.Player;

import java.util.List;

/**
 * Client interface : contains all functions linked to exchanges between the client and the server
 */
interface IClient {

    /**
     * Receive login request from client
     * @param playerId client generated playerId client generated playerId
     * @param playername player username
     * @return newly saved player object in JPA
     */
    Player login(String playerId, String playername);

    /**
     * Receive logout request from client
     * @param playerId client generated playerId
     * @return notification message
     */
    String logout(String playerId);

    /**
     * Receive request to notify other opponent that player has logged out
     * @param playerId client generated playerId
     * @param opponentId client generated playerId
     * @return notification message
     */
    String logout(String playerId, String opponentId);

    /*
    int pregetMatch(String playerId);
    Player getMatch(String playerId);
    Match acceptMatch(String playerId, String opponentId);
    Match rejectMatch(String playerId);
    Player sendMatchRequest(String playerId, String opponentId);
    Match acceptMatchRequest(String playerId, String opponentId);
    String rejectMatchRequest(String playerId, String opponentId);
    */

    Player getPlayer(String playerId);

    /**
     * Receive request from client to remove player
     * @param playerId client generated playerId
     * @return true if player successfully removed, false otherwise
     */
    boolean removePlayer(String playerId);

    /**
     * Receive request from client to get a list of all players
     * @param playerId client generated playerId
     * @return list of players
     */
    List<Player> getAllPlayers(String playerId);

    /**
     * Receive request from client to get a of all heroes
     * @param playerId client generated playerId
     * @return list of heroes
     */
    List<Hero> getAllHeroes(String playerId);

    /**
     * Receive player's choice of card from client
     * @param playerId client generated playerId
     * @param heroId player's chosen hero id
     * @param gameId game id
     * @return gameboard
     */
    GameBoard chooseHero(String playerId, String heroId, String gameId);

    /**
     * Receive request from client to send notification to other player that hero has been chosen
     * @param playerId client generated playerId
     * @param gameId game id
     * @return gameboard
     */
    GameBoard hasChosenHero(String playerId, String gameId);

    /**
     * Receive request to send hero choice to other player's client
     * @param playerId client generated playerId
     * @param opponentId client generated playerId
     * @return hero
     */
    Hero sendMyHero(String playerId, String opponentId);

    /**
     * Receive request from client to initialize game
     * @param playerId client generated playerId
     * @param gameId game id
     * @return gameboard
     */
    GameBoard initGame(String playerId, String gameId);

    /**
     * Receive card choice from client
     * @param playerId client generated playerId
     * @param gameId game id
     * @param cardUniqueId
     * @return gameboard
     */
    GameBoard chooseCard(String playerId, String gameId, String cardUniqueId);

    /**
     * Receive request from client to use servant card to attack opponent's servant
     * @param playerId client generated playerId
     * @param opponentId client generated playerId
     * @param gameId game id
     * @param servantUniqueIds
     * @return gameboard
     */
    GameBoard cardAttackServant(String playerId, String opponentId, String gameId, String servantUniqueIds);

    /**
     * Receive request from client to use spell card to attack opponent's servant
     * @param playerId client generated playerId
     * @param opponentId client generated playerId
     * @param gameId game id
     * @param servantUniqueIds
     * @return gameboard
     */
    GameBoard spellCardAttackServant(String playerId, String opponentId, String gameId, String servantUniqueIds);

    /**
     * Receive request from client to use spell card's special skill on friendly servant on ground
     * @param playerId client generated playerId
     * @param opponentId client generated playerId
     * @param gameId game id
     * @param servantUniqueIds
     * @return gameboard
     */
    GameBoard spellCardOnFriendlyServant( String playerId, String opponentId, String gameId, String servantUniqueIds);

    /**
     * Receive request from client to use card to attack opponent hero
     * @param playerId client generated playerId
     * @param opponentId client generated playerId
     * @param gameId game id
     * @param servantUniqueId
     * @return gameboard
     */
    GameBoard cardAttackHero(String playerId, String opponentId, String gameId, String servantUniqueId);

    /**
     * Receive request from client to use spell card to attack opponent's hero
     * @param playerId client generated playerId
     * @param opponentId client generated playerId
     * @param gameId game id
     * @param spellCardUniqueId
     * @return gameboard
     */
    GameBoard spellCardAttackHero(String playerId,  String opponentId, String gameId, String spellCardUniqueId);

    /**
     * Receive request from client to use hero's special skill to attack opponent's servant
     * @param playerId client generated playerId
     * @param opponentId client generated playerId
     * @param gameId game id
     * @param opponentServantUniqueId
     * @return gameboard
     */
    GameBoard heroAttackServant(String playerId, String opponentId, String gameId, String opponentServantUniqueId);

    /**
     * Receive request from client to use hero's special skill to attack opponent's hero
     * @param playerId client generated playerId
     * @param opponentId client generated playerId
     * @param gameId game id
     * @return gameboard
     */
    GameBoard heroAttackHero(String playerId, String opponentId, String gameId);

    /**
     * Receive request from client to use hero's special skill on self
     * @param playerId client generated playerId
     * @param opponentId client generated playerId
     * @param gameId game id
     * @return gameboard
     */
    GameBoard useHeroSpecial(String playerId, String opponentId, String gameId);

    /**
     * Receive request from client to send first hand of cards
     * @param playerId client generated playerId
     * @param heroId player's chosen hero id
     * @param gameId game id
     * @return gameboard
     */
    GameBoard getFirstHandOfCards(String playerId, String heroId, String gameId);

    /**
     * Receive request from client to update gameboard
     * @param playerId client generated playerId
     * @param gameId game id
     * @return gameboard
     */
    GameBoard updateGameBoard(String playerId, String gameId);

    /**
     * Receive request from client to send gameboard to opponent player
     * @param playerId client generated playerId
     * @param gameId game id
     * @return gameboard
     */
    GameBoard sendGameboardUpdate(String playerId, String gameId);

    /**
     * Receive request from client to end player's turn
     * @param playerId client generated playerId
     * @param opponentId client generated playerId
     * @param gameId game id
     * @return gameboard
     */
    GameBoard endMyTurn(String playerId, String opponentId, String gameId);

    /**
     * Receive request from client to send end of turn to opponent player
     * @param playerId client generated playerId
     * @param gameId game id
     * @return gameboard
     */
    GameBoard sendEndOfTurn(String playerId, String gameId);

    /**
     * Find random match
     * @param playerId client id
     * @return match
     */
    Match findRandomMatch(String playerId);

    /**
     * Send random match object to the opponent player
     * @param playerId client id of the player who is sending the match
     * @param opponentId client id of the chosen opponent player
     * @param matchId match id
     * @return match object
     */
    Match sendRandomMatch(String playerId, String opponentId, String matchId);

    /**
     * Get the opponent player object
     * @param playerId client id
     * @param opponentId client id
     * @return opponent player object
     */
    Player getOpponentPlayer(String playerId, String opponentId);

    /**
     * Delete the match from JPA
     * @param playerId client id of the player requesting the match cancelation
     * @param matchId id of the match
     * @return string indicating success or failure of the match deletion
     */
    String cancelMatch(String playerId, String matchId);

    /**
     * Notify the opponent player that the match has been cancelled
     * @param playerId client id of the player who is sending the notification
     * @param opponentId client id of the player receiving the notification
     * @param matchId id of the match to delete from JPA
     * @return string indicating success or failure of the match deletion
     */
    String sendCancelMatch(String playerId, String opponentId, String matchId);

    /**
     * Send a message to the other player
     * @param playerId client id of the sender
     * @param opponentId client id of the receiver
     * @param message message to be sent
     * @return string containing the content of the message
     */
    String sendMessage(String playerId, String opponentId, String message);

    /**
     * Quit the game
     * @param playerId id of the player requesting to quit the game
     * @param opponentId client id of the opponent player
     * @param gameId id of the game to be deleted from JPA
     * @return string message to be displayed in client
     */
    String quitGame(String playerId, String opponentId, String gameId);

    /**
     * Send notification to 'opponent' that 'player' has quit the game
     * @param playerId client id of the player sending the notification request
     * @param opponentId client id of the player receive the notification
     * @return string to be displayed on the opponent's client
     */
    String notifyQuitGame(String playerId, String opponentId);

    /**
     * Send acknowledgment of receipt to the other for every request received by server starting by 'send'
     * @param playerId
     * @param opponentId
     * @return string containing the url of request sent so if after certain time this hasn't been received by the
     * sender, the same request will be sent to the server again
     */
    String sendAcknowlegmentOfReceipt(String playerId, String opponentId);

}