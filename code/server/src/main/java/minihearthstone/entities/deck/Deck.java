package minihearthstone.entities.deck;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import org.springframework.beans.factory.annotation.Autowired;
import minihearthstone.entities.cards.Card;
import minihearthstone.entities.cards.CardRepository;
import minihearthstone.entities.heroes.Hero;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Entity
public class Deck implements IDeck {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private Long heroId;

    @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL, mappedBy="deck")
    List<Card> deck = new ArrayList<Card>();

    @Autowired
    @Transient
    private CardRepository cardRepository;

    @Transient
    private static final Logger log = LoggerFactory.getLogger(Deck.class);

    protected Deck() { }

    public Deck(Hero hero) {
        this.name = hero.getName() + "'s card deck";
        this.heroId = hero.getId();
    }

    public Deck(Hero hero, List<Card> commonCards, List<Card> heroSpecificCards) {
        this.name = hero.getName() + "'s card deck";
        this.heroId = hero.getId();
        
        // Add all elements of common and heroSpecific to deck
        for (Card card : commonCards) {
            this.addToDeck(card);
        }
        
        for (Card card : heroSpecificCards) {
            this.addToDeck(card);
        }
    }

    @Override
  public String toString() {
    return String.format(
            "Deck[id=%d, name='%s', heroId=%d, cards{'%s'}]",
            this.id, this.name, this.heroId, this.getCardNames());
  }

    // Getters
    @Column(insertable = false, updatable = false)
    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public List<Card> getDeck() {
        return this.deck;
    }
    public Long getHeroId() {
        return this.heroId;
    }

    // Setters
	public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDeck(List<Card> decklist) {
        this.deck = decklist; // TODO : handle bidirection association
    }
    public void setHeroId(Long heroId) {
        this.heroId = heroId;
    }

    // Methods 
    public String getCardNames() {
        String names = "";
        for(Card card: this.deck) {
            names += card.getName() + " ";
        }
        return names;
    }
    
    public void addToDeck(Card card) {
        Card cardCopy = card.uniqueCopy();
        cardCopy.setDeck(this);
        this.deck.add(cardCopy);
    }
    
    public Card pickCard(List<Card> deck) {
        int random = (int) (Math.random() * (deck.size()-1));
        log.info("Random pick index: " + random);
        return deck.get(random);
    }
    
    public List<Card> randomHand(int numberOfCards) {

        log.info("Random hand of : " + numberOfCards + " cards.");

        List<Card> handOfCards = new ArrayList<>();
        List<Card> cardsundertwo = new ArrayList<>();

        // Check in case param numberOfCards is > to deck size
        if (numberOfCards > this.deck.size()) {
            numberOfCards = this.deck.size();
        }

        // Get 2 cards where manacost <= 2
        for(int i = 0; i < this.deck.size(); i++) {
            if (this.deck.get(i).getManacost() <= 2 && !cardsundertwo.contains(this.deck.get(i))) {
                cardsundertwo.add(this.deck.get(i));
            }
        }
        log.info("Cards where manacost <= 2 " + cardsundertwo.toString());

        // Randomly pick 2 cards from list of cards where manacost is under 2
        while(handOfCards.size() < 2) {
            Card pickedCard = pickCard(cardsundertwo);
            handOfCards.add(pickedCard.uniqueCopy());
        }

        // Randomly add one last card of any mana cost
        while(handOfCards.size() < 3){
            handOfCards.add(pickCard(this.deck).uniqueCopy());
        }

        return handOfCards;
    }
    
}
