package minihearthstone.entities.cards;

import minihearthstone.entities.gameboard.GameBoard;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class ExplosionDesArcanes extends AbstractSpecificCard {

    public ExplosionDesArcanes() {
      setName("ExplosionDesArcanes");
    }


    @Override
    public void specialSkill(Long clientId, GameBoard gameBoard) {
      List<Card> opponentServants = gameBoard.getOpponentCardsOnGround(clientId);
      for (Card servant : opponentServants) {

        // servant.setLifepoints(servant.getLifepoints()-1);
        // gameBoard.addCardUniqueIdToAttackedServant(servant.getUniqueId());

          /*int remainingDamage = 1 - servant.getDefense();
          if (remainingDamage >= 0) {
              servant.setDefense(0);
              servant.setLifepoints(servant.getLifepoints() - remainingDamage);
              gameBoard.addCardUniqueIdToAttackedServant(servant.getUniqueId());
          }
          else {
              servant.setDefense(servant.getDefense() - 1);
              gameBoard.addCardUniqueIdToAttackedServant(servant.getUniqueId());
          }*/
          this.inflictDamageToServant(servant, 1, gameBoard);
      }
	}

    @Override
    public void specialSkillOnDeath(Long playerId, GameBoard gameBoard) {

    }

    @Override
  public void specialSkillOnServant(String cardId, Long playerId, GameBoard gameBoard) {

  }

  @Override
  public void specialSkillOnHero(Long playerId, GameBoard gameBoard) {

  }
    
}