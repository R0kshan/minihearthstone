package minihearthstone.facade;

import minihearthstone.controller.ClientProxy;
import minihearthstone.entities.cards.Card;
import minihearthstone.entities.cards.CardRepository;
import minihearthstone.entities.deck.Deck;
import minihearthstone.entities.deck.DeckRepository;
import minihearthstone.entities.gameboard.GameBoard;
import minihearthstone.entities.gameboard.GameBoardRepository;
import minihearthstone.entities.heroes.BasicHero;
import minihearthstone.entities.heroes.Hero;
import minihearthstone.entities.heroes.HeroRepository;
import minihearthstone.entities.match.Match;
import minihearthstone.entities.match.MatchRepository;
import minihearthstone.entities.player.Player;
import minihearthstone.entities.player.PlayerRepository;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Component("Facade")
public class Facade implements IFacade {

    private static final Logger log = LoggerFactory.getLogger(ClientProxy.class);

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private HeroRepository heroRepository;

    @Autowired
    private GameBoardRepository gameBoardRepository;

    @Autowired
    private DeckRepository deckRepository;

    @Autowired
    private CardRepository cardRepository;

    public Facade() {

    }

    @Override
    public Player login(String playerId, String playername) {

        // Create instance of player
        Player player = new Player(playername, Long.parseLong(playerId));

        try {
            // Check if player already exists in database
            if (playerRepository.findByClientId(Long.parseLong(playerId)) != null) {
                player = playerRepository.findByClientId(Long.parseLong(playerId));
                player.setClientId(Long.parseLong("-1"));
            } else {
                if (playerRepository.findByName(playername) == null) {
                    // Save player in JPA Persistence
                    playerRepository.save(player);
                } else {
                    player.setClientId(Long.parseLong("-1"));
                }
            }
        } catch (Exception e) {
            log.info("Exception in login from " + playername + " : " + e);
        }

        return player;
    }

    @Override
    @Transactional
    public String logout(String playerId) {

        // Find all components associated to player and delete them
        Player player = playerRepository.findByClientId(Long.parseLong(playerId));
        Player opponent = null;

        try {
            if (player != null) {
                log.info("Logging out player : " + player.getName());
                playerRepository.delete(player);
            }
        } catch (Exception e) {
            log.info("Exception in logout -> delete player " + playerId + " : " + e);
        }

        GameBoard gameboard = gameBoardRepository.findByP1ClientId(Long.parseLong(playerId));

        try {
            // If the gameboard is null, it means that playerId refers to the second player
            if (gameboard == null) {
                gameboard = gameBoardRepository.findByP2ClientId(Long.parseLong(playerId));
            }
            if (gameboard != null) {
                opponent = new Player(gameboard.getOpponentPlayer(Long.parseLong(playerId)).getName(), gameboard.getOpponentPlayer(Long.parseLong(playerId)).getClientId());
                gameBoardRepository.delete(gameboard);
            }
        } catch (Exception e) {
            log.info("Exception in logout -> delete gameboard by player " + playerId + " : " + e);
        }

        // Save the deleted player from the gameboard
        try {
            if (opponent != null) {
                playerRepository.save(opponent);
            }
        } catch (Exception e) {
            log.info("Exception in logout -> saving opponent " + opponent.getId() + " : " + e);
        }

        // Delete all matches related to this player
        try {
            matchRepository.deleteByP1ClientId(playerId);
            matchRepository.deleteByP2ClientId(playerId);
        } catch (Exception e) {
            log.info("Delete match exception for player " + playerId + " : " + e);
        }

        // Show in log all remaining players, matches and games
        log.info("Remaining players : " + playerRepository.findAll().toString());
        log.info("Remaining matches : " + matchRepository.findAll().toString());
        log.info("Remaining games : " + gameBoardRepository.findAll().toString());

        return "Logged out succesffuly";
    }

    @Override
    public String logout(String playerId, String opponentId) {
        // Player player = playerRepository.findByClientId(Long.parseLong(playerId));
        Player opponent = playerRepository.findByClientId(Long.parseLong(opponentId));

        // Delete all matches related to this player
        try {
            matchRepository.deleteByP1ClientId(playerId);
            matchRepository.deleteByP2ClientId(playerId);
        } catch (Exception e) {
            log.info("Delete match exception for player " + playerId + " : " + e);
        }

        // Delete all gameboards attached to this player
        try {
            gameBoardRepository.deleteAllByP1ClientId(playerId);
            gameBoardRepository.deleteAllByP2ClientId(playerId);
        } catch (Exception e) {
            log.info("Exception in logout -> delete match exception for player " + playerId + " : " + e);
        }

        try {
            opponent.setStatus("available");
            playerRepository.save(opponent);
        } catch (Exception e) {
            log.info("Exception in logout -> saving oppponent " + opponentId + " : " + e);
        }


        return "Your opponent has logged out. Redirection you to dashboard ...";
    }

    @Override
    public Player getPlayer(String playerId) {
        return playerRepository.findByClientId(Long.parseLong(playerId));
    }

    @Override
    public boolean removePlayer(String playerId) {

        try {
            // Get player, then delete
            Player player = playerRepository.findByClientId(Long.parseLong(playerId));
            playerRepository.delete(player);
        } catch(Exception e) {
            log.info("removePlayer() exception -> " + e);
        }

        // TODO : make a true verification of deletion
        return true;
    }

    @Override
    public List<Player> getAllPlayers() {
        return convertToList(playerRepository.findAll());
    }


    @Override
    public List<Hero> getAllHeroes(String playerId) {

        try {
            Player player = playerRepository.findByClientId(Long.parseLong(playerId));
            player.setStatus("in-game");
            playerRepository.save(player);
        } catch (Exception e) {
            log.info("getAllHeroes() exception -> " + e);
        }

        return heroRepository.findAllByOriginalEquals(true);
    }

    @Override
    public GameBoard chooseHero(String playerId, String heroId, String gameId) {

        // Get player from JPA
        Player player = playerRepository.findByClientId(Long.parseLong(playerId));

        // Set hero id to player
        player.setHeroId(Long.parseLong(heroId));
        playerRepository.save(player);


        // Get gameboard from JPA
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        // Get the hero object from JPA
        Hero hero = heroRepository.findById(Long.parseLong(heroId)).get();

        log.info("Player " + player.getName() + " has chosen hero " + hero.getName());

        // If game board doesn't exist, create it and set player id
        if (gameBoard == null) {
            gameBoard = new GameBoard(Long.parseLong(gameId));

            // Save game board in JPA
            gameBoardRepository.save(gameBoard);

            gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));
            log.info("New gameboard :" + gameBoard.getPlayers().toString());
        }
        // If the game exists set player as p2
        else {
            log.info("Already created gameboard");
        }

        // Get hero's unique copy and save it's id to player
        Hero clone = hero.uniqueCopy();
        log.info("Setting uniqueId to player : " + clone.getUniqueId());
        player.setHeroUniqueId(clone.getUniqueId());
        playerRepository.save(player);

        // Add player and hero clone to gameboard
        gameBoard.addPlayer(player);
        gameBoard.addHero(clone);

        // Save game board in JPA
        gameBoardRepository.save(gameBoard);

        // Get updated gameboard from JPA
        GameBoard updatedGameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        log.info("Updated gameboard : " + updatedGameBoard.getPlayers().toString());
        log.info("Updated gameboard : " + updatedGameBoard.getHeroes().toString());
        log.info("Updated gameboard to string : " + updatedGameBoard.toString());

        // Return hero
        return updatedGameBoard;
    }

    @Override
    public GameBoard getGameBoardByGameId(String gameId) {
        // Get match from JPA
        log.info("Getting gameboard by id : " + gameId);
        GameBoard gameboard = gameBoardRepository.findByGameId(Long.parseLong(gameId));
        if (gameboard == null) {
            log.info("Gameboard is null");
        }
        return gameboard;
    }

    @Override
    public Hero getHeroByPlayerId(String playerId) {

        // Get player from JPA
        Player player = playerRepository.findByClientId(Long.parseLong(playerId));

        if (player != null) {
            // Get the player's hero
            return heroRepository.findById(player.getHeroId()).get();
        } else {
            return new BasicHero();
        }
    }

    @Override
    public GameBoard initGame(String playerId, String gameId) {

        // Get gameboard from JPA
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        try {
            // Delete the match at the same time
            matchRepository.deleteById(Long.parseLong(gameId));
        } catch (Exception e) {
            log.info("initgame() exception while deleting match : " + gameId + " for player : " + playerId);
        }


        // If starting player not yet set
        if (gameBoard.getTurn() == null) {
            // Randomly set starting player
            int random = new Random().nextInt((1 - 0) + 1) + 0;
            log.info("Random  :" + random);
            if (random == 0) {
                gameBoard.setTurn(gameBoard.getP1ClientId());
                log.info("The lucky winner is " + gameBoard.getP1ClientId());
            } else if (random == 1) {
                gameBoard.setTurn(gameBoard.getP2ClientId());
                log.info("The lucky winner is " + gameBoard.getP2ClientId());
            }
            gameBoardRepository.save(gameBoard);
        }
        log.info("Init game gameboard : " + gameBoard.toString());
        return gameBoard;
    }

    @Override
    public GameBoard chooseCard(String playerId, String gameId, String cardUniqueId) {

        // Get gameboard
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));
        gameBoard.resetAttackedServantsAndHero();
        log.info("Before update : " + gameBoard.toString());

        Card card = gameBoard.findCardInHandOfCardsByUniqueId(Long.parseLong(playerId), cardUniqueId);

        if (card != null) {

            // Check if player has enough mana
            if (gameBoard.getPlayer(Long.parseLong(playerId)).checkEnoughMana(card.getManacost())) {

                // Deduct mana points according to card cost
                gameBoard.getPlayer(Long.parseLong(playerId)).deductMana(card.getManacost());

                if (card != null) {

                    // Apply card on choice effect
                    card.applyOnChoiceEffect(card, Long.parseLong(playerId), gameBoard);
                    log.info("Card after applyOnChoiceEffect() -> " + card.toString());

                    // If card is a servant add it to the ground
                    if (card.getNature().equals("servant")) {
                        gameBoard.addToPlayerCardsOnGround(Long.parseLong(playerId), card);

                        // Apply all different possible effects to this newly added card
                        gameBoard.applyAllDifferentEffectsOnTarget(Long.parseLong(playerId), card.getUniqueId());
                    }

                    // Apply card special skill
                    card.specialSkill(Long.parseLong(playerId), gameBoard);

                    // Remove card from hand of cards
                    gameBoard.removeFromPlayerHandOfCards(Long.parseLong(playerId), card);

                }
            }
        }
        gameBoardRepository.save(gameBoard);

        // Send updated gameboard back to client
        GameBoard gameBoardUpdated = gameBoardRepository.findByGameId(Long.parseLong(gameId));
        log.info("After update : " + gameBoardUpdated.toString());

        return gameBoardUpdated;
    }

    @Override
    public GameBoard cardAttackServant(String playerId, String opponentId, String gameId, String servantUniqueIds) {

        // Get gameboard from JPA
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));
        gameBoard.resetAttackedServantsAndHero();
        JSONParser parser = new JSONParser();

        String servantUniqueId = "";
        String opponentServantUniqueId = "";
        playerId = playerId.replaceAll("\\s+", "");
        opponentId = opponentId.replaceAll("\\s+", "");

        try {
            Object obj = parser.parse(servantUniqueIds);
            JSONArray array = (JSONArray) obj;

            servantUniqueId = (String) array.get(0);
            opponentServantUniqueId = (String) array.get(1);

        } catch (ParseException pe) {
            log.info("position: " + pe.getPosition());
            log.info("Pe: " + pe);
        }

        if (!servantUniqueId.equals("") && !opponentServantUniqueId.equals("")) {

            // Get the player's selected card on ground
            Card servantCard = gameBoard.findCardOnGroundByUniqueId(Long.parseLong(playerId), servantUniqueId);
            log.info("Checking ability to attack");

            // If card is allowed to attack this round, and if card effects allow it
            if (servantCard.getCanAttack() && gameBoard.performPreActionOpponentCardEffects(Long.parseLong(playerId), opponentServantUniqueId)) {
                // Attack opponent card
                servantCard.normalAttackOnServant(opponentServantUniqueId, Long.parseLong(opponentId), gameBoard);
            } else {
                log.info("There are card effects blocking the attack");
            }
        }
        log.info("After attack : ");
        gameBoard.printPlayerCardsOnGroundInfo(Long.parseLong(opponentId));

        // Save the gameboard
        gameBoardRepository.save(gameBoard);

        // Return updated gameboard from JPA
        GameBoard updatedGameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        return updatedGameBoard;
    }

    @Override
    public GameBoard spellCardAttackServant(String playerId, String opponentId, String gameId, String servantUniqueIds) {

        // Get gameboard from JPA
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));
        gameBoard.resetAttackedServantsAndHero();
        JSONParser parser = new JSONParser();

        String spellCardUniqueId = "";
        String opponentServantUniqueId = "";
        playerId = playerId.replaceAll("\\s+", "");
        opponentId = opponentId.replaceAll("\\s+", "");

        try {
            Object obj = parser.parse(servantUniqueIds);
            JSONArray array = (JSONArray) obj;

            spellCardUniqueId = (String) array.get(0);
            opponentServantUniqueId = (String) array.get(1);

        } catch (ParseException pe) {
            log.info("position: " + pe.getPosition());
            log.info("Pe: " + pe);
        }

        if (!spellCardUniqueId.equals("") && !opponentServantUniqueId.equals("")) {

            // Get the player's selected card on ground
            Card spellCard = gameBoard.findCardInHandOfCardsByUniqueId(Long.parseLong(playerId), spellCardUniqueId);

            // If other card effects allow it
            if (gameBoard.performPreActionOpponentCardEffects(Long.parseLong(playerId), opponentServantUniqueId)) {
                // Attack opponent card
                spellCard.specialSkillOnServant(opponentServantUniqueId, Long.parseLong(opponentId), gameBoard);

                // Remove card from hand of cards
                gameBoard.removeFromPlayerHandOfCards(Long.parseLong(playerId), spellCard);
            } else {
                log.info("There are card effects blocking the attack");
            }
        }
        log.info("After attack : ");
        gameBoard.printPlayerCardsOnGroundInfo(Long.parseLong(opponentId));

        // Save the gameboard
        gameBoardRepository.save(gameBoard);

        // Return updated gameboard from JPA
        GameBoard updatedGameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        return updatedGameBoard;
    }

    @Override
    public GameBoard spellCardOnFriendlyServant(String playerId, String opponentId, String gameId, String servantUniqueIds) {

        // Get gameboard from JPA
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));
        gameBoard.resetAttackedServantsAndHero();
        JSONParser parser = new JSONParser();

        String spellCardUniqueId = "";
        String servantUniqueId = "";
        playerId = playerId.replaceAll("\\s+", "");
        opponentId = opponentId.replaceAll("\\s+", "");

        try {
            Object obj = parser.parse(servantUniqueIds);
            JSONArray array = (JSONArray) obj;

            spellCardUniqueId = (String) array.get(0);
            servantUniqueId = (String) array.get(1);

        } catch (ParseException pe) {
            log.info("position: " + pe.getPosition());
            log.info("Pe: " + pe);
        }

        if (!spellCardUniqueId.equals("") && !servantUniqueId.equals("")) {

            // Get the player's selected card on ground
            Card spellCard = gameBoard.findCardInHandOfCardsByUniqueId(Long.parseLong(playerId), spellCardUniqueId);

            // Apply special skill on servant card
            spellCard.specialSkillOnServant(servantUniqueId, Long.parseLong(playerId), gameBoard);

            // Remove card from hand of cards
            gameBoard.removeFromPlayerHandOfCards(Long.parseLong(playerId), spellCard);
        }
        log.info("After special skill application : ");
        gameBoard.printPlayerCardsOnGroundInfo(Long.parseLong(playerId));

        // Save the gameboard
        gameBoardRepository.save(gameBoard);

        // Return updated gameboard from JPA
        GameBoard updatedGameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        return updatedGameBoard;
    }

    @Override
    public GameBoard cardAttackHero(String playerId, String opponentId, String gameId, String servantUniqueId) {

        playerId = playerId.replaceAll("\\s+", "");
        opponentId = opponentId.replaceAll("\\s+", "");

        // Get gameboard from JPA
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));
        gameBoard.resetAttackedServantsAndHero();

        // Get servant card
        Card servantCard = gameBoard.findCardOnGroundByUniqueId(Long.parseLong(playerId), servantUniqueId);

        // If other card effects allow it
        if (gameBoard.performPreActionOpponentCardEffects(Long.parseLong(playerId), "")) {
            servantCard.normalAttackOnHero(Long.parseLong(opponentId), gameBoard);
        } else {
            log.info("There are card effects blocking the attack");
        }

        log.info("servantUniqueId: " + servantCard.toString());

        // Save the gameboard
        gameBoardRepository.save(gameBoard);

        // Return updated gameboard from JPA
        GameBoard updatedGameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        return updatedGameBoard;
    }

    @Override
    public GameBoard spellCardAttackHero(String playerId, String opponentId, String gameId, String spellCardUniqueId) {

        playerId = playerId.replaceAll("\\s+", "");
        opponentId = opponentId.replaceAll("\\s+", "");

        // Get gameboard from JPA
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));
        gameBoard.resetAttackedServantsAndHero();

        // Get spell card
        Card spellCard = gameBoard.findCardOnGroundByUniqueId(Long.parseLong(playerId), spellCardUniqueId);

        // If other card effects allow it
        if (gameBoard.performPreActionOpponentCardEffects(Long.parseLong(playerId), "")) {
            spellCard.normalAttackOnHero(Long.parseLong(opponentId), gameBoard);

            // Remove spellcard from hand on cards
            gameBoard.removeFromPlayerHandOfCards(Long.parseLong(playerId), spellCard);
        } else {
            log.info("There are card effects blocking the attack");
        }

        log.info("spellCardUniqueId: " + spellCard.toString());

        // Save the gameboard
        gameBoardRepository.save(gameBoard);

        // Return updated gameboard from JPA
        GameBoard updatedGameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        return updatedGameBoard;
    }

    @Override
    public GameBoard heroAttackServant(String playerId, String opponentId, String gameId, String opponentServantUniqueId) {

        log.info("cardUniqueId : " + opponentServantUniqueId);

        // Get gameboard from JPA
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));
        gameBoard.resetAttackedServantsAndHero();

        // Get hero from gameboard
        Player player = playerRepository.findByClientId(Long.parseLong(playerId));
        // Hero hero = gameBoard.getHero(Long.parseLong(playerId));
        Hero hero = gameBoard.getHeroByUniqueId(player.getHeroUniqueId());

        // Apply hero special skill on opponent servant
        hero.specialSkillOnServant(playerId, opponentServantUniqueId, gameBoard);

        // Save the gameboard
        gameBoardRepository.save(gameBoard);

        // Return updated gameboard from JPA
        GameBoard updatedGameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        return updatedGameBoard;
    }

    @Override
    public GameBoard heroAttackHero(String playerId, String opponentId, String gameId) {

        // Get gameboard from JPA
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));
        gameBoard.resetAttackedServantsAndHero();

        // Get hero from gameboard
        Player player = playerRepository.findByClientId(Long.parseLong(playerId));
        // Hero hero = gameBoard.getHero(Long.parseLong(playerId));
        Hero hero = gameBoard.getHeroByUniqueId(player.getHeroUniqueId());

        // Apply hero special skill on servant
        hero.specialSkillOnHero(playerId, gameBoard);

        // Save the gameboard
        gameBoardRepository.save(gameBoard);

        // Return updated gameboard from JPA
        GameBoard updatedGameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        return updatedGameBoard;
    }

    @Override
    public GameBoard useHeroSpecial(String playerId, String opponentId, String gameId) {

        // Get gameboard from JPA
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        // Get hero from gameboard
        Player player = playerRepository.findByClientId(Long.parseLong(playerId));
        // Hero hero = gameBoard.getHero(Long.parseLong(playerId));
        Hero hero = gameBoard.getHeroByUniqueId(player.getHeroUniqueId());
        log.info("Hero : " + hero.toString());

        // Apply hero special skill on servant
        hero.specialSkill(playerId, gameBoard);

        // log.info("After special skill : " + hero.toString());

        // Save the gameboard
        gameBoardRepository.save(gameBoard);

        // Return updated gameboard from JPA
        GameBoard updatedGameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        return updatedGameBoard;
    }

    @Override
    public GameBoard getFirstHandOfCards(String playerId, String heroId, String gameId) {

        List<Card> handOfCards = new ArrayList<>();

        // Get deck of corresponding hero from JPA
        Deck deck = deckRepository.findByHeroId(Long.parseLong(heroId));

        // Get the gameboard from JPA
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        if (deck == null)
            log.info("Deck is null");

        // If this player is the first player to start, pick 3 cards randomly
        /*
        if (gameBoard != null && gameBoard.getTurn() != null) {
            if (gameBoard.getTurn().longValue() == Long.parseLong(playerId)) {
                handOfCards = deck.randomHand(3);
                log.info("You are the lucky winner! You have been given 3 cards");
            }
            // Else pick 4 cards
            else {
                handOfCards = deck.randomHand(3);
                log.info("The other player is starting first. You've been given 3 cards.");
            }
        } else {
            log.info("game board is null");
        }*/

        if (deck != null) {
            handOfCards = deck.randomHand(3);

            log.info("Gameboard before hand of cards added : " + gameBoard.toString() + System.lineSeparator());

            // Put first hand of cards in gameboard
            if (gameBoard.getP1ClientId().longValue() == Long.parseLong(playerId) && gameBoard.getP1HandOfCards().size() == 0) {
                log.info("P1 client id : " + gameBoard.getP1ClientId().longValue());
                gameBoard.addToP1HandOfCards(handOfCards);
                log.info("Number of cards in P1 hand : " + gameBoard.getP1HandOfCards().size());
            }

            if (gameBoard.getP2ClientId().longValue() == Long.parseLong(playerId) && gameBoard.getP2HandOfCards().size() == 0) {
                log.info("P2 client id : " + gameBoard.getP2ClientId().longValue());
                gameBoard.addToP2HandOfCards(handOfCards);
                log.info("Number of cards in P2 hand : " + gameBoard.getP2HandOfCards().size());
            }

            gameBoardRepository.save(gameBoard);
        } else {
            log.info("Deck is null");
        }


        log.info("Hand of cards saved in gameboard : " + handOfCards.toString());

        GameBoard gameBoardUpdated = gameBoardRepository.findByGameId(Long.parseLong(gameId));
        log.info("Gameboard after hand of cards added : " + gameBoardUpdated.toString() + System.lineSeparator());

        return gameBoardUpdated;
    }

    @Override
    public GameBoard updateGameBoard(String playerId, String gameId) {

        // Get gameboard (already update by other player)
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        try {
            // Remove any dead servants from gameboard
            gameBoard.removeDeadServantsFromGround(Long.parseLong(playerId));
        } catch(Exception e) {
            log.info("updateGameBoard() exception -> " + e + " while removing dead servant.");
        }

        // Fix: sometimes multiple requests and responses are being sent which abnormally adds more cards in hand
        // gameBoard.removeExtraCardsInHand(Long.parseLong(playerId));

        try {
            // Check if we have a winner
            gameBoard.isEndOfGame();
            gameBoardRepository.save(gameBoard);
        } catch(Exception e) {
            log.info("updateGameBoard() exception -> " + e + " while checking if there's a winner");
        }

        // Get gameboard (already update by other player)
        GameBoard updatedGameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        try {
            log.info("Updated gameboard : " + updatedGameBoard.toString());
        } catch(Exception e) {
            log.info("updateGameBoard() exception -> " + e);
        }

        return updatedGameBoard;
    }

    @Override
    public GameBoard endMyTurn(String playerId, String opponentId, String gameId) {

        // Get gameboard from JPA
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        try {

            gameBoard.resetAttackedServantsAndHero();

            // Change turn
            gameBoard.setTurn(Long.parseLong(opponentId));

            // Make cards on ground able to attack for next round
            gameBoard.cardsOnGroundCanAttack(Long.parseLong(playerId));

            // Enable hero special skill for next round
            Player player = playerRepository.findByClientId(Long.parseLong(playerId));
            // Hero hero = gameBoard.getHero(Long.parseLong(playerId));
            Hero hero = gameBoard.getHeroByUniqueId(player.getHeroUniqueId());
            hero.setCanUseSpecialSkill(true);
            // gameBoard.getHero(Long.parseLong(playerId)).setCanUseSpecialSkill(true);

            // Save gameboard
            gameBoardRepository.save(gameBoard);

            // Get updated gameboard
            gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

            log.info("Gameboard updated after end of turn : " + gameBoard.toString());
        } catch (Exception e) {
            log.info("Exception : " + e);
        }

        return gameBoard;
    }

    @Override
    public GameBoard sendEndOfTurn(String playerId, String gameId) {

        // Get gameboard (already updated by other player)
        GameBoard gameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));
        gameBoard.resetAttackedServantsAndHero();

        // Increment player mana
        try {
            gameBoard.getPlayer(Long.parseLong(playerId)).incrementMana();

            // Limit on number of card's in hand
            int nbCardsInHand = gameBoard.getPlayerHandOfCards(Long.parseLong(playerId)).size();
            if (nbCardsInHand < 7) {
                log.info("There's less than 7 cards in hand: " + nbCardsInHand);
                // Add random picked card to player's hand of cards
                Deck deck = deckRepository.findByHeroId(gameBoard.getPlayer(Long.parseLong(playerId)).getHeroId());
                gameBoard.pickCardFromDeckToPlayerHand(Long.parseLong(playerId), deck);
                log.info("Number after picking cards : " + gameBoard.getPlayerHandOfCards(Long.parseLong(playerId)).size());
            }
            gameBoardRepository.save(gameBoard);
        } catch (Exception e) {
            log.info("sendEndOfTurn() exception -> " + e);
        }

        // Get updated gameboard
        GameBoard updatedGameBoard = gameBoardRepository.findByGameId(Long.parseLong(gameId));

        return updatedGameBoard;
    }

    @Override
    public synchronized Match findRandomMatch(String playerId) {

        // Find number of players online
        int nbPlayersOnline = playerRepository.findByStatus("available").size();
        log.info("Number of players available : " + nbPlayersOnline);
        log.info("Players online : ");
        for (Player player : playerRepository.findByStatus("available")
                ) {
            log.info("[" + player.toString() + "]");
        }

        // Find number of players available
        log.info("Number of players online : " + nbPlayersOnline);
        log.info("Players online : ");
        List<Player> playersOnline = convertToList(playerRepository.findAll());
        for (Player player : playersOnline) {
            log.info("[" + player.toString() + "]");
        }

        // Check if there are existing matches
        List<Match> matches = matchRepository.findAllByP1ClientIdIsNotNullAndAndP2ClientIdIsNull();
        log.info("Matches found : ");
        for (Match match : matches) {
            log.info("[" + match.toString() + "];");
        }

        // If there are no matches, created one
        if (matches.size() == 0) {
            Match match = new Match(playerId);
            matchRepository.save(match);
            log.info("There's no space in other matches, creating a new one : " + match.toString());

            // Set the status of this player
            this.setPlayerStatus(playerId, "finding-match");

            return match;
        } else {

            // Go to the first match in list and save this player as p2 client id
            Match match = matches.get(0);

            // If p1Client id is not equal to playerId than set playerId as p2ClientId
            if (!match.getP1ClientId().equals(playerId) && match.getP2ClientId() == null) {
                match.setP2ClientId(playerId);
                matchRepository.save(match);

                // Set the status of this player to available
                this.setPlayerStatus(playerId, "in-game");

                log.info("Joining this match : " + match.toString());
            } else {
                log.info("Match p1ClientId -> " + match.getP1ClientId() + " = playerId -> " + playerId);
            }

            return match;
        }

    }

    @Override
    public Match sendRandomMatch(String playerId, String matchId) {

        Match match = null;
        try {
            match = matchRepository.findById(Long.parseLong(matchId)).get();
        } catch (Exception e) {
            log.info("sendRandomMatch() excception for matchId " + matchId + " :  " + e);
        }

        if (match == null) {
            log.info("A problem has occured. No match found.");
            return new Match();
        } else {
            log.info("Sending random match :" + match.toString() + " to playerId : " + playerId);

            // Set player's status to in-game
            this.setPlayerStatus(playerId, "in-game");

            return match;
        }
    }

    @Override
    public String cancelMatch(String playerId, String matchId) {
        String msg = "Failed to delete match " + matchId;
        try {
            matchRepository.deleteById(Long.parseLong(matchId));
            msg = "Delete match " + matchId + " successfully.";

            // Setting player status to available
            log.info("Setting playerId : " + playerId + " status to available.");
            this.setPlayerStatus(playerId, "");

        } catch (Exception e) {
            log.info("cancelMatch() exception -> " + e);
        }
        return msg;
    }

    @Override
    public String quitGame(String playerId, String opponentId, String gameId) {
        try {

            // Gameboard deletion also deletes the associated players in jpa, so we recreate the player
            Player player = playerRepository.findByClientId(Long.parseLong(playerId));
            String playerName = player.getName();

            Player opponentPlayer = playerRepository.findByClientId(Long.parseLong(opponentId));
            String opponentPlayerName = opponentPlayer.getName();

            // Delete associated game
            GameBoard gameboard = gameBoardRepository.findByGameId(Long.parseLong(gameId));
            gameBoardRepository.delete(gameboard);
            log.info("Remaining games : ");
            List<GameBoard> gameBoards = convertToList(gameBoardRepository.findAll());
            for (GameBoard gameBoard : gameBoards) {
                log.info("[" + gameBoard.toString() + "]; ");
            }

            // Recreate players after gameboard deletion
            player = new Player(playerName, Long.parseLong(playerId));
            player.setStatus("available");
            playerRepository.save(player);

            opponentPlayer = new Player(opponentPlayerName, Long.parseLong(opponentId));
            opponentPlayer.setStatus("available");
            playerRepository.save(opponentPlayer);


        } catch (Exception e) {
            log.info("quitGame() exception -> " + e);
        }
        return "You've quit the game. Returning to dashboard ...";
    }

    @Override
    @Transactional
    public void setPlayerStatus(String playerId, String status) {
        Player player = playerRepository.findByClientId(Long.parseLong(playerId));

        try {
            player.setStatus(status);
            playerRepository.save(player);
        } catch (Exception e) {
            log.info("setPlayerStatus() exception -> " + e + " for playerId : " + playerId);
            log.info("playerRepository : " + playerRepository.toString());
            log.info("player : " + player);
        }
    }

    @Override
    public int size(Iterable<?> iterable) {
        if (iterable instanceof Collection)
            return ((Collection<?>) iterable).size();

        // Else iterate
        int i = 0;
        for (Object obj : iterable)
            i++;
        return i;
    }

    @Override
    public List convertToList(Iterable iterable) {
        List target = new ArrayList();
        iterable.forEach(target::add);
        return target;
    }

}
