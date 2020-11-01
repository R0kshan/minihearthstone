package minihearthstone.entities.gameboard;

import org.springframework.data.repository.CrudRepository;

public interface GameBoardRepository extends CrudRepository<GameBoard, Long> {
  
    GameBoard findByGameId(Long gameId);
    GameBoard findByP1ClientId(Long clientId);
    GameBoard findByP2ClientId(Long clientId);

    void deleteAllByP1ClientId(String clientId);
    void deleteAllByP2ClientId(String clientId);
}
