package minihearthstone.entities.player;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Player repository interface used to query JPA for the Player entity
 */
public interface PlayerRepository extends CrudRepository<Player, Long> {

  /**
   * Find player by client id
   * @param id
   * @return
   */
  Player findByClientId(Long id);

  /**
   * Find player by username
   * @param name
   * @return
   */
  Player findByName(String name);

  /**
   * Find player by status (in game or in waiting room)
   * @param status
   * @return
   */
  List<Player> findByStatus(String status);

  /**
   * Remove player by client id
   * @param id client id
   * @return boolean true if deletion successfull
   */
  Boolean deleteByClientId(Long id);

}
