package minihearthstone.entities.deck;
import java.util.List;

import minihearthstone.entities.cards.Card;

public interface IDeck {

    //GETTERS

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
     * Get deck
     * @return List of cards
     */
    List<Card> getDeck() ;

    /**
     * Get hero id
     * @return id of hero possessing deck
     */
    Long getHeroId();

    // SETTERS

    /**
     * Set id
     * @param id id to set
     */
    void setId(Long id);

    /**
     * Set names
     * @param name name to set
     */
    void setName(String name);

    /**
     * Set deck
     * @param decklist deck list to set
     */
    void setDeck(List<Card> decklist);

    /**
     * Set a hero id
     * @param heroId hero id to set
     */
    void setHeroId(Long heroId);

    // METHODS

    /**
     * Get a string containing all card names
     * @return string containing all card names
     */
    String getCardNames();

    /**
     * Add a card to the deck
     * @param card card to be added to deck
     */
    void addToDeck(Card card);

    /**
     * Pick a card randomly from the deck
     * @param deck deck to pick the card from
     * @return picked card
     */
    Card pickCard(List<Card> deck);

    /**
     * Pick n number of cards
     * @param numberOfCards number of random card to pick
     * @return list of randomly picked cards
     */
    List<Card> randomHand(int numberOfCards);

}