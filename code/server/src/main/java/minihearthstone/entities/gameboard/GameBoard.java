package minihearthstone.entities.gameboard;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import minihearthstone.entities.cards.*;
import minihearthstone.entities.deck.Deck;
import minihearthstone.entities.deck.DeckRepository;
import minihearthstone.entities.heroes.Hero;
import minihearthstone.entities.player.Player;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

// Spring and java imports

@Entity
@Transactional
public class GameBoard implements IGameBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long gameId;
    private Long p1ClientId;
    private Long p2ClientId;
    private Long turn; // client id of starting
    private Long winner;
    private String heroAttacked = "";
    String attackedServants = "";

    @JsonManagedReference(value = "players-mapping")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, mappedBy = "gameBoard", orphanRemoval = true)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Player> players = new ArrayList<>();

    @JsonManagedReference(value = "heroes-mapping")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, mappedBy = "gameBoard", orphanRemoval = true)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Hero> heroes = new ArrayList<>();

    @JsonManagedReference(value = "p1HandOfCards-mapping")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "gbP1HandOfCardsMapping", orphanRemoval = true)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Card> p1HandOfCards = new ArrayList<>();

    @JsonManagedReference(value = "p2HandOfCards-mapping")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "gbP2HandOfCardsMapping", orphanRemoval = true)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Card> p2HandOfCards = new ArrayList<>();

    @JsonManagedReference(value = "p1CardsOnGround-mapping")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "gbP1CardsOnGroundMapping", orphanRemoval = true)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Card> p1CardsOnGround = new ArrayList<>();

    @JsonManagedReference(value = "p2CardsOnGround-mapping")
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "gbP2CardsOnGroundMapping", orphanRemoval = true)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Card> p2CardsOnGround = new ArrayList<>();

    @Transient
    private static final Logger log = LoggerFactory.getLogger(Deck.class);

    @Transient
    @Autowired
    private static DeckRepository deckRepository;

    protected GameBoard() {
    }

    public GameBoard(Long gameId) {
        this.gameId = gameId;
    }

    @Override
    public String toString() {
        return String.format(
                "GameBoard[id=%d, gameId=%d, p1ClientId=%d, p2ClientId=%d, turn=%d," +
                        System.lineSeparator() + "p1HandOfCards='%s'," +
                        System.lineSeparator() + " p1CardsOnGround='%s'," +
                        System.lineSeparator() + " p2HandOfCards='%s'," +
                        System.lineSeparator() + " p2CardsOnGround='%s']",
                this.id, this.gameId, this.p1ClientId, this.p2ClientId, this.turn, getCardNames(this.p1HandOfCards), getCardNames(this.p1CardsOnGround), getCardNames(this.p2HandOfCards), getCardNames(this.p2CardsOnGround));
    }

    // GETTERS
    public Long getId() {
        return this.id;
    }

    public Long getGameId() {
        return this.gameId;
    }

    public Long getP1ClientId() {
        return this.p1ClientId;
    }

    public Long getP2ClientId() {
        return this.p2ClientId;
    }

    public Long getTurn() {
        return this.turn;
    }

    public Long getWinner() {
        return this.winner;
    }

    public Player getPlayer1() {
        if (players.size() >= 1) {
            return this.players.get(0);
        } else {
            return null;
        }
    }

    public Player getPlayer2() {
        if (players.size() >= 2) {
            return this.players.get(1);
        } else {
            return null;
        }
    }

    public Player getPlayer(Long clientId) {
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            return this.getPlayer1();
        } else {
            return this.getPlayer2();
        }
    }

    public Player getOpponentPlayer(Long clientId) {
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            return this.getPlayer2();
        } else {
            return this.getPlayer1();
        }
    }

    public Hero getHero1() {
        if (heroes.size() >= 1) {
            return this.heroes.get(0);
        } else {
            return null;
        }
    }

    public Hero getHero2() {
        if (heroes.size() >= 2) {
            return this.heroes.get(1);
        } else {
            return null;
        }
    }

    public Hero getHeroByUniqueId(String heroUniqueId) {
        if (this.heroes.get(0).getUniqueId() == heroUniqueId) {
            return this.heroes.get(0);
        } else {
            return this.heroes.get(1);
        }
    }

    public Hero getOpponentHero(Long clientId) {
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            return this.getHero2();
        } else {
            return this.getHero1();
        }
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    public void setPlayer1(Player player) {
        if (players.size() >= 1) {
            Player p1 = this.players.get(0);
            p1 = player;
        } else {
            log.info("Unable to swap");
        }
    }

    public void setPlayer2(Player player) {
        if (players.size() >= 2) {
            Player p2 = this.players.get(1);
            p2 = player;
        } else {
            log.info("Unable to swap");
        }
    }

    public List<Card> getP1CardsOnGround() {
        return this.p1CardsOnGround;
    }

    public List<Card> getP2CardsOnGround() {
        return this.p2CardsOnGround;
    }

    public List<Card> getP1HandOfCards() {
        return this.p1HandOfCards;
    }

    public List<Card> getP2HandOfCards() {
        return this.p2HandOfCards;
    }

    public String getHeroAttacked() { return this.heroAttacked; }

    public String getAttackedServants() { return this.attackedServants; }

    // SETTERS
    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public void setP1ClientId(Long p1ClientId) {
        this.p1ClientId = p1ClientId;
    }

    public void setP2ClientId(Long p2ClientId) {
        this.p2ClientId = p2ClientId;
    }

    public void setTurn(Long turn) {
        this.turn = turn;
    }

    public void setWinner(Long winner) {
        this.winner = winner;
    }

    public void setHeroAttacked(String heroAttacked) {
        this.heroAttacked = heroAttacked;
        log.info("Set attacked hero : " + heroAttacked);
    }

    public void setAttackedServants(String attackedServants) { this.attackedServants = attackedServants; }

    // METHODS

    public void addPlayer(Player player) {
        if (this.players.size() <= 2) {

            player.setGameboard(this);
            this.players.add(player);

            log.info("Added player");
            if (this.players.size() == 1) {
                this.p1ClientId = player.getClientId();
            } else if (this.players.size() == 2) {
                this.p2ClientId = player.getClientId();
            }
        }
    }

    public void addToP1HandOfCards(Card card) {
        if (this.p1HandOfCards.size() < 7) {
            Card cardCopy = card.copy();
            cardCopy.setGbP1HandOfCardsMapping(this);
            this.p1HandOfCards.add(cardCopy);
        }
    }

    public void addToP1HandOfCards(List<Card> cards) {
        for (Card card : cards) {
            if (this.p1HandOfCards.size() < 7) {
                Card cardCopy = card.copy();
                cardCopy.setGbP1HandOfCardsMapping(this);
                this.p1HandOfCards.add(cardCopy);
            } else return;
        }
    }

    public boolean removeFromP1HandOfCards(Card card) {
        log.info("Card to be removed : " + card.getUniqueId());

        Predicate<Card> cardPredicate = c -> c.getUniqueId().equals(card.getUniqueId());
        if (this.p1HandOfCards.removeIf(cardPredicate)) {
            card.unsetGbP1HandOfCardsMapping();
            return true;
        } else return false;
    }

    public void addToP2HandOfCards(Card card) {
        if (this.p2HandOfCards.size() < 7 ) {
            Card cardCopy = card.copy();
            cardCopy.setGbP2HandOfCardsMapping(this);
            this.p2HandOfCards.add(cardCopy);
        }
    }

    public void addToP2HandOfCards(List<Card> cards) {
        for (Card card : cards) {
            if (this.p2HandOfCards.size() < 7) {
                Card cardCopy = card.copy();
                cardCopy.setGbP2HandOfCardsMapping(this);
                this.p2HandOfCards.add(cardCopy);
            } else return;
        }
    }

    public boolean removeFromP2HandOfCards(Card card) {
        log.info("Card to be removed : " + card.getUniqueId());

        Predicate<Card> cardPredicate = c -> c.getUniqueId().equals(card.getUniqueId());
        if (this.p2HandOfCards.removeIf(cardPredicate)) {
            card.unsetGbP2HandOfCardsMapping();
            return true;
        } else return false;
    }

    public void addToP1CardsOnGround(Card card) {
        if (this.p1CardsOnGround.size() < 7) {
            Card cardCopy = card.copy();
            cardCopy.setGbP1CardsOnGroundMapping(this);
            this.p1CardsOnGround.add(cardCopy);
        }
    }

    public void addToP1CardsOnGround(List<Card> cards) {
        for (Card card : cards) {
            if (this.p1CardsOnGround.size() < 7) {
                Card cardCopy = card.copy();
                cardCopy.setGbP1CardsOnGroundMapping(this);
                this.p1CardsOnGround.add(cardCopy);
            } else return;
        }
    }

    public boolean removeFromP1CardsOnGround(Card card) {
        Predicate<Card> cardPredicate = c -> c.getUniqueId().equals(card.getUniqueId());
        if (this.p1CardsOnGround.removeIf(cardPredicate)) {
            card.unsetGbP1CardsOnGroundMapping();
            return true;
        } else return false;
    }

    public void addToP2CardsOnGround(Card card) {
        if (this.p2CardsOnGround.size() < 7) {
            Card cardCopy = card.copy();
            cardCopy.setGbP2CardsOnGroundMapping(this);
            this.p2CardsOnGround.add(cardCopy);
        }
    }

    public void addToP2CardsOnGround(List<Card> cards) {
        for (Card card : cards) {
            if (this.p2CardsOnGround.size() < 7) {
                Card cardCopy = card.copy();
                cardCopy.setGbP2CardsOnGroundMapping(this);
                this.p2CardsOnGround.add(cardCopy);
            } else return;
        }
    }

    public boolean removeFromP2CardsOnGround(Card card) {
        Predicate<Card> cardPredicate = c -> c.getUniqueId().equals(card.getUniqueId());
        if (this.p2CardsOnGround.removeIf(cardPredicate)) {
            card.unsetGbP2CardsOnGroundMapping();
            return true;
        } else return false;
    }

    public String getCardNames(List<Card> cards) {
        String names = "";
        for (Card card : cards) {
            names += card.getUniqueId() + "; ";
        }
        return names;
    }

    public void swapPlayers() {
        if (players.size() == 2) {

            Player p1 = this.getPlayer1();
            Player p2 = this.getPlayer2();
            Player p1Copy = p1.copy();

            log.info("p1 before swap : " + p1.toString());
            log.info("p2 before swap: " + p2.toString());

            this.players.get(0).clone(this.getPlayer2());
            this.players.get(1).clone(p1Copy);

            log.info("p1 after swap : " + this.getPlayer1().toString());
            log.info("p2 after swap: " + this.getPlayer2().toString());
        } else {
            log.info("Can't swap the two player because there's only one player");
        }
    }

    public Card findCardOnGroundByUniqueId(Long clientId, String uniqueId) {
        Card cardOnGround = null;
        log.info("P1 : " + this.getPlayer1().getClientId());
        log.info("P2 : " + this.getPlayer2().getClientId());
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            log.info("findCardOnGroundByUniqueId in p1: ");

            if (!this.p1CardsOnGround.isEmpty()) {

                for (Card card : this.p1CardsOnGround) {
                    log.info("uniqueId : " + uniqueId + " | current : " + card.getUniqueId());
                    if (card.getUniqueId().equals(uniqueId)) {
                        return card;
                    }
                }
            } else log.info("p1CardsOnGround is empty");
        } else if (this.getPlayer2().getClientId().longValue() == clientId) {
            log.info("findCardOnGroundByUniqueId in p1: ");

            if (!this.p2CardsOnGround.isEmpty()) {

                for (Card card : this.p2CardsOnGround) {
                    log.info("uniqueId : " + uniqueId + " | current : " + card.getUniqueId());
                    if (card.getUniqueId().equals(uniqueId)) {
                        return card;
                    }
                }

            } else log.info("p2CardsOnGround is empty");
        }
        log.info("findCardOnGroundByUniqueId() -> " + cardOnGround);

        // If not found check if it's in the other list
        if (cardOnGround == null) {

            cardOnGround = findOpponentCardOnGroundByUniqueId(clientId, uniqueId);
            log.info("findOpponentCardOnGroundByUniqueId() -> " + cardOnGround);

            // If card on ground is found in other list than swap the lists
            if (cardOnGround != null) {
                log.info("Swapping players:  ");
                swapPlayers();
                log.info("P1 : " + this.getPlayer1().getClientId());
                log.info("P2 : " + this.getPlayer2().getClientId());
            }
        }
        return cardOnGround;
    }

    public Card findOpponentCardOnGroundByUniqueId(Long clientId, String uniqueId) {
        Card cardOnGround = null;
        log.info("P1 : " + this.getPlayer1().getClientId());
        log.info("P2 : " + this.getPlayer2().getClientId());
        if (this.getPlayer2().getClientId().longValue() == clientId) {
            log.info("findCardOnGroundByUniqueId in p1: ");

            if (!this.p1CardsOnGround.isEmpty()) {

                for (Card card : this.p1CardsOnGround) {
                    log.info("uniqueId : " + uniqueId + " | current : " + card.getUniqueId());
                    if (card.getUniqueId().equals(uniqueId)) {
                        return card;
                    }
                }
            } else log.info("p1CardsOnGround is empty");
        } else if (this.getPlayer1().getClientId().longValue() == clientId) {
            log.info("findCardOnGroundByUniqueId in p1: ");

            if (!this.p2CardsOnGround.isEmpty()) {

                for (Card card : this.p2CardsOnGround) {
                    log.info("uniqueId : " + uniqueId + " | current : " + card.getUniqueId());
                    if (card.getUniqueId().equals(uniqueId)) {
                        cardOnGround = card;
                        return card;
                    }
                }

            } else log.info("p2CardsOnGround is empty");
        }
        log.info("findCardOnGroundByUniqueId() -> " + cardOnGround);

        return cardOnGround;
    }

    public Card findCardInHandOfCardsByUniqueId(Long clientId, String uniqueId) {
        Card cardInHand = null;
        log.info("P1 : " + this.getPlayer1().getClientId());
        log.info("P2 : " + this.getPlayer2().getClientId());
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            log.info("findCardInHandOfCardsByUniqueId in p1: ");


            if (!this.p1HandOfCards.isEmpty()) {

                for (Card card : this.p1HandOfCards) {
                    log.info("uniqueId : " + uniqueId + " | current : " + card.getUniqueId());
                    if (card.getUniqueId().equals(uniqueId)) {
                        if (card.getUniqueId().equals(uniqueId)) {
                            return card;
                        }
                    }
                }

            } else log.info("p1HandOfCards is empty");
        } else if (this.getPlayer2().getClientId().longValue() == clientId) {
            log.info("findCardInHandOfCardsByUniqueId in p2: ");

            if (!this.p2HandOfCards.isEmpty()) {

                for (Card card : this.p2HandOfCards) {
                    log.info("uniqueId : " + uniqueId + " | current : " + card.getUniqueId());
                    if (card.getUniqueId().equals(uniqueId)) {
                        return card;
                    }
                }
            } else log.info("p2HandOfCards is empty");
        }
        log.info("findCardInHandOfCardsByUniqueId() -> " + cardInHand);

        // Bad solution : if not found check if it's in the other list

        if (cardInHand == null) {
            cardInHand = findOpponentCardInHandOfCardsByUniqueId(clientId, uniqueId);
            log.info("findOpponentCardInHandOfCardsByUniqueId() -> " + cardInHand);

            // If card on ground is found in other list than swap the lists
            if (cardInHand != null) {
                log.info("Swapping players:  ");
                swapPlayers();
                log.info("P1 : " + this.getPlayer1().getClientId());
                log.info("P2 : " + this.getPlayer2().getClientId());
            }
        }
        return cardInHand;
    }

    public Card findOpponentCardInHandOfCardsByUniqueId(Long clientId, String uniqueId) {
        Card cardInHand = null;
        log.info("P1 : " + this.getPlayer1().getClientId());
        log.info("P2 : " + this.getPlayer2().getClientId());
        if (this.getPlayer2().getClientId().longValue() == clientId) {
            log.info("findOpponentCardInHandOfCardsByUniqueId in p1: ");

            if (!this.p1HandOfCards.isEmpty()) {

                for (Card card : this.p1HandOfCards) {
                    log.info("uniqueId : " + uniqueId + " | current : " + card.getUniqueId());
                    if (card.getUniqueId().equals(uniqueId)) {
                        cardInHand = card;
                        return card;
                    }
                }
            } else log.info("p1HandOfCards is empty");
        } else if (this.getPlayer1().getClientId().longValue() == clientId) {
            log.info("findOpponentCardInHandOfCardsByUniqueId in p2: ");

            if (!this.p2HandOfCards.isEmpty()) {

                for (Card card : this.p2HandOfCards) {
                    log.info("uniqueId : " + uniqueId + " | current : " + card.getUniqueId());
                    if (card.getUniqueId().equals(uniqueId)) {
                        cardInHand = card;
                        return card;
                    }
                }
            } else log.info("p2HandOfCards is empty");
        }
        log.info("findOpponentCardInHandOfCardsByUniqueId() -> " + cardInHand);
        return cardInHand;
    }

    public List<Card> getPlayerCardsOnGround(Long clientId) {
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            return this.p1CardsOnGround;
        } else {
            return this.p2CardsOnGround;
        }
    }

    public List<Card> getOpponentCardsOnGround(Long clientId) {
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            return this.p2CardsOnGround;
        } else {
            return this.p1CardsOnGround;
        }
    }

    public List<Card> getPlayerHandOfCards(Long clientId) {
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            log.info("getPlayerHandOfCards("+clientId+") -> p1HandOfCards : " + this.p1HandOfCards.toString());
            return this.p1HandOfCards;
        } else {
            log.info("getPlayerHandOfCards("+clientId+") -> p2HandOfCards : "  + this.p2HandOfCards.toString());
            return this.p2HandOfCards;
        }
    }

    public List<Card> getOpponentHandOfCards(Long clientId) {
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            return this.p2HandOfCards;
        } else {
            return this.p1HandOfCards;
        }
    }

    public void addToPlayerHandOfCards(Long clientId, Card card) {
        Card cardCopy = card.copy();
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            cardCopy.setGbP1HandOfCardsMapping(this);
            this.p1HandOfCards.add(cardCopy);
        } else {
            cardCopy.setGbP2HandOfCardsMapping(this);
            this.p2HandOfCards.add(cardCopy);
        }
    }

    public Card getRandomPlayerCardOnGround(Long clientId) {
        int random = (int) (Math.random() * (this.getPlayerCardsOnGround(clientId).size() - 1));
        return this.getPlayerCardsOnGround(clientId).get(random);
    }

    public Card getRandomOpponentCardOnGround(Long clientId) {
        int random = (int) (Math.random() * (this.getOpponentCardsOnGround(clientId).size() - 1));
        return this.getOpponentCardsOnGround(clientId).get(random);
    }

    public void addToPlayerCardsOnGround(Long clientId, Card card) {
        Card cardCopy = card.copy();
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            // cardCopy.setGbP1CardsOnGroundMapping(this);
            // this.p1CardsOnGround.add(cardCopy);
            this.addToP1CardsOnGround(card);
        } else {
            //cardCopy.setGbP2CardsOnGroundMapping(this);
            //this.p2CardsOnGround.add(cardCopy);
            this.addToP2CardsOnGround(card);
        }
    }

    public void addToPlayerCardsOnGround(Long clientId, List<Card> cards) {
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            /*for (Card card : cards) {
                Card cardCopy = card.copy();
                cardCopy.setGbP1CardsOnGroundMapping(this);
                this.p1CardsOnGround.add(cardCopy);
            }*/
            this.addToP1CardsOnGround(cards);
        } else {
            /*for (Card card : cards) {
                Card cardCopy = card.copy();
                cardCopy.setGbP2CardsOnGroundMapping(this);
                this.p2CardsOnGround.add(cardCopy);
            }*/
            this.addToP2CardsOnGround(cards);
        }
    }

    public boolean removeFromPlayerHandOfCards(Long clientId, Card card) {

        // Get hand of cards of player
        List<Card> playerHandOfCards = null;
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            playerHandOfCards = this.p1HandOfCards;
        } else {
            playerHandOfCards = this.p2HandOfCards;
        }

        // Initialize loop
        boolean removed = false;
        int size = playerHandOfCards.size();
        int i = 0;

        // Search for the card to remove then detach it from gameboard
        while (i < size) {
            if (playerHandOfCards.get(i).getUniqueId().equals(card.getUniqueId())) {
                Card c = playerHandOfCards.get(i);

                if (this.getPlayer1().getClientId().longValue() == clientId) {
                    playerHandOfCards.get(i).unsetGbP1HandOfCardsMapping();
                    removed = playerHandOfCards.remove(c);
                    c.unsetGbP1HandOfCardsMapping();
                } else {
                    playerHandOfCards.get(i).unsetGbP2HandOfCardsMapping();
                    removed = playerHandOfCards.remove(c);
                    c.unsetGbP2HandOfCardsMapping();
                }
                break;
            }
            i++;
        }
        return removed;
    }

    public void removeDeadServantsFromGround(Long playerId) {

        // Perform on death special skill
        this.cardSpecialSkillsBeforeDeath(playerId);

        // Remove all cards from ground having lifepoints <= 0
        Predicate<Card> CardPredicate = c -> c.getLifepoints() <= 0;
        this.p1CardsOnGround.removeIf(CardPredicate);
        this.p2CardsOnGround.removeIf(CardPredicate);
    }

    public void cardSpecialSkillsBeforeDeath(Long playerId) {

        List<Card> playerCardsOnGround = this.getPlayerCardsOnGround(playerId);

        // Before removing the dead cards, perform their on death special skills
        for (Card card : playerCardsOnGround) {
            if (card.getLifepoints() <= 0) {
                card.specialSkillOnDeath(playerId, this);
            }
        }
    }

    public void applyAllDifferentEffectsOnTarget(Long playerId, String targetUniqueId) {

        List<Card> playerCardsOnGround = this.getPlayerCardsOnGround(playerId);
        Set<String> distinctCards = new HashSet<>();

        if (playerCardsOnGround != null || !playerCardsOnGround.isEmpty()) {
            // Distinguish all different specific cards on player's ground
            for (Card card : playerCardsOnGround) {
                if (card.getSpecificCard() != null) {
                    distinctCards.add(card.getSpecificCard().getName());
                }
            }
        }

        if (distinctCards != null || !distinctCards.isEmpty()) {
            log.info("Distinct cards: " + distinctCards.toString());

            // Perform all the different effects only once
            for (String specificCardName : distinctCards) {

                AbstractSpecificCard specificCard = null;

                if (specificCardName.equals("BenedictionDePuissance")) {
                    specificCard = new BenedictionDePuissance();
                } else if (specificCardName.equals("ChefDeRaid")) {
                    specificCard = new ChefDeRaid();
                } else if (specificCardName.equals("Consecration")) {
                    specificCard = new Consecration();
                } else if (specificCardName.equals("ExplosionDesArcanes")) {
                    specificCard = new ExplosionDesArcanes();
                } else if (specificCardName.equals("ImageMirroir")) {
                    specificCard = new ImageMirroir();
                } else if (specificCardName.equals("MaitriseDuBlocage")) {
                    specificCard = new MaitriseDuBlocage();
                } else if (specificCardName.equals("Metamorphose")) {
                    specificCard = new Metamorphose();
                } else if (specificCardName.equals("Tourbillon")) {
                    specificCard = new Tourbillon();
                }
                if (specificCard != null) {
                    specificCard.specialSkillOnServant(targetUniqueId, playerId, this);
                }
            }
        }
    }

    public void printPlayerCardsOnGroundInfo(Long clientId) {
        List<Card> playerCardsOnGround = null;
        if (this.getPlayer1().getClientId().longValue() == clientId) {
            playerCardsOnGround = this.p1CardsOnGround;
        } else {
            playerCardsOnGround = this.p2CardsOnGround;
        }
        if (playerCardsOnGround != null) {
            for (Card card : playerCardsOnGround) {
                log.info(card.getName() + ": " + card.getManacost() + "/" + card.getDamage() + "/" + card.getLifepoints());
            }
        }

    }

    public void printP1CardsOnGroundInfo() {
        if (this.p1CardsOnGround != null) {
            for (Card card : this.p1CardsOnGround) {
                log.info(card.getName() + ": " + card.getManacost() + "/" + card.getDamage() + "/" + card.getLifepoints());
            }
        }
    }

    public void printP2CardsOnGroundInfo() {
        if (this.p2CardsOnGround != null) {
            for (Card card : this.p2CardsOnGround) {
                log.info(card.getName() + ": " + card.getManacost() + "/" + card.getDamage() + "/" + card.getLifepoints());
            }
        }
    }

    public void addHero(Hero hero) {
        if (this.players.size() <= 2) {
            hero.setGameBoard(this);
            this.heroes.add(hero);
            log.info("Added hero");
        }
    }

    public List<Hero> getHeroes() {
        return this.heroes;
    }

    public Card pickRandomCardFromHand(Long playerId) {
        List<Card> playerCardsOnGround = null;
        if (this.getPlayer1().getClientId().longValue() == playerId) {
            playerCardsOnGround = this.p1CardsOnGround;
        } else {
            playerCardsOnGround = this.p2CardsOnGround;
        }
        int random = (int) (Math.random() * (playerCardsOnGround.size() - 1));

        return playerCardsOnGround.get(random);
    }

    public void cardsOnGroundCanAttack(Long playerId) {
        List<Card> playerCardsOnGround = null;
        if (this.getPlayer1().getClientId().longValue() == playerId) {
            playerCardsOnGround = this.p1CardsOnGround;
        } else {
            playerCardsOnGround = this.p2CardsOnGround;
        }
        for (Card card : playerCardsOnGround) {
            card.setCanAttack(true);
        }
    }

    public boolean performPreActionPlayerCardEffects(Long playerId, String targetUniqueId) {

        List<Card> playerCardsOnGround = null;

        // Get the player's cards on ground
        if (this.getPlayer1().getClientId().longValue() == playerId) {
            playerCardsOnGround = this.p1CardsOnGround;
        } else {
            playerCardsOnGround = this.p2CardsOnGround;
        }
        return getCardEffectResponses(playerId, targetUniqueId, playerCardsOnGround);
    }

    public boolean performPreActionOpponentCardEffects(Long playerId, String targetUniqueId) {
        log.info("performPreActionOpponentCardEffects()");
        List<Card> playerCardsOnGround = null;

        // Get the player's cards on ground
        if (this.getPlayer1().getClientId().longValue() != playerId) {
            playerCardsOnGround = this.p1CardsOnGround;
        } else {
            playerCardsOnGround = this.p2CardsOnGround;
        }
        log.info("playerCardsOnGround: ".toString());

        return getCardEffectResponses(playerId, targetUniqueId, playerCardsOnGround);
    }

    public boolean getCardEffectResponses(Long playerId, String targetUniqueId, List<Card> playerCardsOnGround) {
        boolean effectResponse = true;
        // Stop when found a card, whose's effect answers false
        if (!playerCardsOnGround.isEmpty()) {
            int index = 0;
            while (index < playerCardsOnGround.size()) {
                Card card = playerCardsOnGround.get(index);
                if (!card.applyPreActionEffect(card, playerId, targetUniqueId, this)) {
                    effectResponse = false;
                    break;
                }
                index++;
            }
        }
        return effectResponse;
    }

    public void pickCardFromDeckToPlayerHand(Long playerId, Deck deck) {
        // Get random card from deck
        log.info("pickCardFromDeckToPlayerHand : " + playerId);
        Card randomPick = deck.pickCard(deck.getDeck());

        // Add randompick card to player's hand of cards
        this.addToPlayerHandOfCards(playerId, randomPick);
    }

    public boolean isEndOfGame() {

        if (this.getHero1() != null && this.getHero2() != null) {
            if (this.getHero1().getLifepoints() <= 0 || this.getHero2().getLifepoints() <= 0) {

                // Determiner winner
                if (this.getHero1().getLifepoints() > 0) {
                    if (this.getPlayer1() != null) {
                        this.setWinner(this.getPlayer1().getClientId());
                    }
                } else if (this.getHero2().getLifepoints() > 0) {
                    if (this.getPlayer2() != null) {
                        this.setWinner(this.getPlayer2().getClientId());
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void removeExtraCardsInHand(Long playerId) {

        List<Card> playerCardsInHand = null;

        // Get the player's cards on ground
        if (this.getPlayer1().getClientId().longValue() != playerId) {
            playerCardsInHand = this.p1HandOfCards;
        } else {
            playerCardsInHand = this.p2HandOfCards;
        }

        if (playerCardsInHand != null) {
            // If there are more cards in hand than 7 remove them
            for (int i = 7; i < playerCardsInHand.size(); i++) {

                // We unset both because in any case the card can't be in both at the same time
                playerCardsInHand.get(i).unsetGbP1HandOfCardsMapping();
                playerCardsInHand.get(i).unsetGbP2HandOfCardsMapping();
                playerCardsInHand.remove(i);
            }
        }
    }

    public void addCardUniqueIdToAttackedServant(String servantCardUniqueId) {
        this.attackedServants = servantCardUniqueId + ";";
        log.info("Added attacked servant : " + servantCardUniqueId);
    }

    public void resetAttackedServantsAndHero() {
        this.heroAttacked = "";
        this.attackedServants = "";
    }
}
