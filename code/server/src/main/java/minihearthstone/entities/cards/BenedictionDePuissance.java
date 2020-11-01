package minihearthstone.entities.cards;

import minihearthstone.entities.gameboard.GameBoard;

import javax.persistence.Entity;

@Entity
public class BenedictionDePuissance extends AbstractSpecificCard {

    public BenedictionDePuissance() {
        setName("BenedictionDePuissance");
    }

    @Override
    public void specialSkill(Long playerId, GameBoard gameBoard) {

    }

    @Override
    public void specialSkillOnDeath(Long playerId, GameBoard gameBoard) {

    }

    @Override
    public void specialSkillOnServant(String cardId, Long playerId, GameBoard gameBoard) {
        Card servantCard = gameBoard.findCardOnGroundByUniqueId(playerId, cardId);
        servantCard.setDamage(servantCard.getDamage()+3);

    }

    @Override
    public void specialSkillOnHero(Long playerId, GameBoard gameBoard) {

    }


}