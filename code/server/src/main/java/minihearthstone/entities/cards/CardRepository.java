package minihearthstone.entities.cards;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Card repository interface used to query JPA for the Card entity
 */
public interface CardRepository extends CrudRepository<Card, Long> {

  /**
   * Find card by name
   * @param name name of card to find
   * @return card
   */
  Card findByName(String name);

  /**
   * Find all cards
   * @return List containing all the cards stored in JPA
   */
  List<Card> findAll();

  /**
   * Get a list of cards by type
   * @param type type of card (ex: warrior, paladin, mage)
   * @return List containing all cards of a certain type
   */
  List<Card> findByType(String type);
}
