package minihearthstone.entities.cards;

import minihearthstone.entities.gameboard.GameBoard;

import javax.persistence.Entity;

@Entity
public class MaitriseDuBlocage extends AbstractSpecificCard {

    public MaitriseDuBlocage() {
        setName("MaitriseDuBlocage");
    }

    @Override
    public void specialSkill(Long playerId, GameBoard gameBoard) {
        Card pickedCard = gameBoard.pickRandomCardFromHand(playerId);
        gameBoard.addToPlayerCardsOnGround(playerId, pickedCard);
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