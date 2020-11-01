package minihearthstone.entities.heroes;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Hero repository interface used to query JPA for the Hero entity
 */
public interface HeroRepository extends CrudRepository<Hero, Long> {

    List<Hero> findAllByOriginalEquals(boolean original);

}
