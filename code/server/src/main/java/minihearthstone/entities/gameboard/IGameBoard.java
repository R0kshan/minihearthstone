package minihearthstone.entities.gameboard;

import minihearthstone.entities.cards.Card;
import minihearthstone.entities.deck.Deck;
import minihearthstone.entities.heroes.Hero;
import minihearthstone.entities.player.Player;

import java.util.List;

public interface IGameBoard {

    // GETTERS

    /**
     * Get id
     * @return id
     */
    public Long getId();

    /**
     * Get game id
     * @return game id
     */
    public Long getGameId();

    /**
     * Get p1 client id
     * @return p1 client id
     */
    public Long getP1ClientId();

    /**
     * Get p2 client id
     * @return p2 client id
     */
    public Long getP2ClientId();

    /**
     * Get turn
     * @return turn
     */
    public Long getTurn();

    /**
     * Get winner
     * @return winner
     */
    public Long getWinner();

    /**
     * Get player1
     * @return player
     */
    public Player getPlayer1();

    /**
     * Get player 2
     * @return player 2
     */
    public Player getPlayer2();

    /**
     * Get player by client id
     * @param clientId client id of player
     * @return player
     */
    public Player getPlayer(Long clientId);

    /**
     * Get opponent player by client id
     * @param clientId client id of player
     * @return opponent player
     */
    public Player getOpponentPlayer(Long clientId);

    /**
     * Get hero 1
     * @return hero 1
     */
    public Hero getHero1() ;

    /**
     * Get hero 2
     * @return hero 2
     */
    public Hero getHero2();

    /**
     * Get hero by client id
     * @param clientId client id of player
     * @return
     */
    // public Hero getHero(Long clientId);

    /**
     * Get list of heroes (of the tw players)
     * @return list of heroes
     */
    public List<Hero> getHeroes();

    /**
     * Get opponent hero
     * @param clientId client id of player
     * @return opponent hero
     */
    public Hero getOpponentHero(Long clientId);

    /**
     * List of players
     * @return list of players
     */
    public List<Player> getPlayers();

    /**
     * Get p1 cards on ground
     * @return list containing p1 cards on ground
     */
    public List<Card> getP1CardsOnGround();

    /**
     * Get p2 cards on ground
     * @return list containing p2 cards on ground
     */
    public List<Card> getP2CardsOnGround();

    /**
     * Get p1 hand of cards
     * @return list containing p1 hand of cards
     */
    public List<Card> getP1HandOfCards();

    /**
     * Get p2 hand of cards
     * @return list containing p2 hand of cards
     */
    public List<Card> getP2HandOfCards();


    // SETTERS

    /**
     * Set player 1
     * @param player player
     */
    public void setPlayer1(Player player);

    /**
     * Set player 2
     * @param player player
     */
    public void setPlayer2(Player player);
    

    /**
     * Set game id
     * @param gameId game id
     */
    public void setGameId(Long gameId);

    /**
     * Set p1 client id
     * @param p1ClientId p1 client id
     */
    public void setP1ClientId(Long p1ClientId);

    /**
     * Set p2 client id
     * @param p2ClientId p2 client id
     */
    public void setP2ClientId(Long p2ClientId);

    /**
     * Set turn
     * @param turn
     */
    public void setTurn(Long turn);

    /**
     * Set winner
     * @param winner client id of winner player
     */
    public void setWinner(Long winner);

    /**
     * Add player
     * @param player player to be added
     */
    public void addPlayer(Player player);

    // METHODS

    /**
     * Add a card to p1 hand of cards
     * @param card card to be added
     */
    public void addToP1HandOfCards(Card card);

    /**
     * Add a list of cards to p1 hand of cards
     * @param cards list of cards to be added
     */
    public void addToP1HandOfCards(List<Card> cards);

    /**
     * Remove card from p1 hand of cards
     * @param card card to be removed
     * @return true if card as been removed, false otherwise
     */
    public boolean removeFromP1HandOfCards(Card card);

    /**
     * Add a card to p2 hand of cards
     * @param card card to be added
     */
    public void addToP2HandOfCards(Card card);

    /**
     * Add a list of cards to p2 hand of cards
     * @param cards list of cards to be added to p2 hand of cards
     */
    public void addToP2HandOfCards(List<Card> cards);

    /**
     * Remove a card from p2 hand of cards
     * @param card card to be removed from p2 hand of cards
     * @return true if card as been removed, false otherwise 
     */
    public boolean removeFromP2HandOfCards(Card card);

    /**
     * Add a card to p1 cards on ground
     * @param card card to be added to p1 cards on ground
     */
    public void addToP1CardsOnGround(Card card);

    /**
     * Add a list of cards to p1 cards on ground
     * @param cards list of cards to be added
     */
    public void addToP1CardsOnGround(List<Card> cards);

    /**
     * Remove a card from p1 cards on ground
     * @param card card to be removed
     * @return true if removed, false otherwise
     */
    public boolean removeFromP1CardsOnGround(Card card);

    /**
     * Add card to p2 cards on ground
     * @param card card to be added
     */
    public void addToP2CardsOnGround(Card card);

    /**
     * Add list of cards to p2 cards on ground
     * @param cards list of cards to be added
     */
    public void addToP2CardsOnGround(List<Card> cards);

    /**
     * Remove card from p2 cards on ground
     * @param card card to be removed
     * @return true if removed, false otherwise
     */
    public boolean removeFromP2CardsOnGround(Card card);

    /**
     * Get string containing the names of all the cards
     * @param cards list of cards
     * @return string containing the name of all the cards
     */
    String getCardNames(List<Card> cards);

    /**
     * Swap p1 and p2
     */
    public void swapPlayers();

    /**
     * Find card on ground by unique id
     * @param clientId client id of player of player
     * @param uniqueId card's unqiue id
     * @return card
     */
    public Card findCardOnGroundByUniqueId(Long clientId, String uniqueId);

    /**
     * Find opponent card on groud by unique id
     * @param clientId client id of player of player
     * @param uniqueId card's unqiue id
     * @return card
     */
    public Card findOpponentCardOnGroundByUniqueId(Long clientId, String uniqueId);

    /**
     * Find a card in hand of cards by unique id
     * @param clientId client id of player of player
     * @param uniqueId card's unqiue id
     * @return
     */
    public Card findCardInHandOfCardsByUniqueId(Long clientId, String uniqueId);

    /**
     *  Fin opponent card in hand of cards by unique id
     * @param clientId client id of player of player
     * @param uniqueId card's unique id
     * @return card
     */
    public Card findOpponentCardInHandOfCardsByUniqueId(Long clientId, String uniqueId);

    /**
     * Get player cards on ground by client id
     * @param clientId client id of player
     * @return list of players' cards on ground
     */
    public List<Card> getPlayerCardsOnGround(Long clientId);

    /**
     * Get opponent player's cards on ground
     * @param clientId client id of player 
     * @return list of opponent players' cards on ground
     */
    public List<Card> getOpponentCardsOnGround(Long clientId);

    /**
     * Get player hand of cards by client id
     * @param clientId client id of player
     * @return list of players' hand of cards
     */
    public List<Card> getPlayerHandOfCards(Long clientId);

    /**
     * Get opponent player hand of cards by client id
     * @param clientId client id of player
     * @return list of opponent players' hand of cards
     */
    public List<Card> getOpponentHandOfCards(Long clientId);

    /**
     * Add card to player's hand of cards
     * @param clientId client id of player
     * @param card card to be added to player's hand of cards
     */
    public void addToPlayerHandOfCards(Long clientId, Card card);

    /**
     * Add card to player's cards on ground
     * @param clientId client id of player
     * @param card card to be added to player's cards on ground
     */
    public void addToPlayerCardsOnGround(Long clientId, Card card);

    /**
     * Get random card on ground from players' cards on ground
     * @param clientId client id of player
     * @return random card picked from players' cards on ground
     */
    public Card getRandomPlayerCardOnGround(Long clientId);

    /**
     * Get random opponent card on ground from opponent players' cards on ground
     * @param clientId client id of player
     * @return card random card picked from players' cards on ground
     */
    public Card getRandomOpponentCardOnGround(Long clientId);

    /***
     * Add list of cards to player cards on ground
     * @param clientId client id of player 
     * @param cards list of cards to be added
     */
    public void addToPlayerCardsOnGround(Long clientId, List<Card> cards);

    /**
     * Remove card from player had of cards
     * @param clientId client id of player
     * @param card card to be removed
     * @return true if removed false otherwise
     */
    public boolean removeFromPlayerHandOfCards(Long clientId, Card card);

    /**
     * Remove dead servants from ground (meaning all cards who have lifepoints <= 0) 
     * @param playerId player's client id 
     */
    public void removeDeadServantsFromGround(Long playerId);

    /**
     * Apply all cards secial skill before death
     * @param playerId player's client id
     */
    public void cardSpecialSkillsBeforeDeath(Long playerId);

    /**
     * Apply all differents on target
     * @param playerId player's client id
     * @param targetUniqueId
     */
    public void applyAllDifferentEffectsOnTarget(Long playerId, String targetUniqueId);

    /**
     * Print player cards on ground information
     * @param clientId client id of player
     */
    public void printPlayerCardsOnGroundInfo(Long clientId);

    /**
     * Print p1s' cards on ground information
     */
    public void printP1CardsOnGroundInfo();

    /**
     * Print p2s' cards on ground information
     */
    public void printP2CardsOnGroundInfo();

    /**
     * Add hero to list of heroes
     * @param hero hero to be added
     */
    public void addHero(Hero hero);

    /**
     * Pick a random card from hand
     * @param playerId player's client id
     * @return randomly picked card from hand
     */
    public Card pickRandomCardFromHand(Long playerId);

    /**
     * Make all cards on ground able to attack
     * @param playerId player's client id
     */
    public void cardsOnGroundCanAttack(Long playerId);

    /**
     * Perform pre action cards effects of cards owned by the player
     * @param playerId player's client id 
     * @param targetUniqueId target cards' unique id
     * @return true if pre action effect has been applied false otherwise
     */
    public boolean performPreActionPlayerCardEffects(Long playerId, String targetUniqueId);

    /**
     * Perform pre action cards effects of cards owned by the opponent player 
     * @param playerId player's client id
     * @param targetUniqueId target cards' unique id
     * @return true if pre action effect has been applied false otherwise
     */
    public boolean performPreActionOpponentCardEffects(Long playerId, String targetUniqueId);

    /**
     * Get card effect responses (true or false depending whether required conditions have been met)
     * @param playerId player's client id
     * @param targetUniqueId target cards' unique id
     * @param playerCardsOnGround list of player cards on ground
     * @return true if pre action effect has been applied false otherwise
     */
    boolean getCardEffectResponses(Long playerId, String targetUniqueId, List<Card> playerCardsOnGround);

    /**
     * Pick a card randomly from deck to player add to player's hand of cards
     * @param playerId player's client id
     * @param deck deck to pick card from
     */
    void pickCardFromDeckToPlayerHand(Long playerId, Deck deck);

    /**
     * Check whether it's the end of the game, and if so, set a winner
     * @return true if end of game, false otherwise
     */
    boolean isEndOfGame();

    /**
     * Temporary fix solution for extra cards added in hand
     */
    void removeExtraCardsInHand(Long playerId);

    /**
     * Add a servant's unique id to the list of attacked servants
     * @param servantCardUniqueId
     */
    void addCardUniqueIdToAttackedServant(String servantCardUniqueId);

    /**
     * Set all attacked servants to none
     */
    void resetAttackedServantsAndHero();


}