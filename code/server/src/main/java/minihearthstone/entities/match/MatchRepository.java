package minihearthstone.entities.match;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Match repository interface used to query JPA for the Match entity
 */
public interface MatchRepository extends CrudRepository<Match, Long> {


   List<Match> findAllByP1ClientIdIsNotNullAndAndP2ClientIdIsNull();

   void deleteByP1ClientId(String p1ClientId);
   void deleteByP2ClientId(String p2ClientId);

   Match findByP2ClientId(String p2ClientId);




}
