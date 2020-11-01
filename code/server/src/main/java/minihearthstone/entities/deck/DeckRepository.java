package minihearthstone.entities.deck;

import org.springframework.data.repository.CrudRepository;

/**
 * Deck repository interface used to query JPA for the Deck entity
 */
public interface DeckRepository extends CrudRepository<Deck, Long> {

    /**
     * Find deck by hero id
     * @param heroId hero id
     * @return deck
     */
    Deck findByHeroId(Long heroId);
}