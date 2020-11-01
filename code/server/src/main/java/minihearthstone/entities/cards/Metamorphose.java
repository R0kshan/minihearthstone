package minihearthstone.entities.cards;

import minihearthstone.entities.gameboard.GameBoard;
import minihearthstone.entities.player.Player;

import javax.persistence.Entity;

@Entity
public class Metamorphose extends AbstractSpecificCard {

    public Metamorphose() {
        setName("Metamorphose");
    }

    @Override
    public void specialSkill(Long playerId, GameBoard gameBoard) {

	}

    @Override
    public void specialSkillOnDeath(Long playerId, GameBoard gameBoard) {

    }

    @Override
    public void specialSkillOnServant(String cardId, Long clientId, GameBoard gameBoard) {
        Player player = gameBoard.getOpponentPlayer(clientId);
        Card servant = gameBoard.findCardOnGroundByUniqueId(player.getClientId(), cardId);
        servant.setDamage(1);
        servant.setLifepoints(1);
        servant.setEffect(null);
    }

    @Override
    public void specialSkillOnHero(Long playerId, GameBoard gameBoard) {

    }
    
}