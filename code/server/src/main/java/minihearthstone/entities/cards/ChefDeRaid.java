package minihearthstone.entities.cards;

import java.util.List;

import javax.persistence.Entity;

import minihearthstone.entities.gameboard.GameBoard;

@Entity
public class ChefDeRaid extends AbstractSpecificCard {

    public ChefDeRaid() {
        setName("ChefDeRaid");
    }

    @Override
    public void specialSkill(Long clientId, GameBoard gameBoard) {
        log.info("Before applying ChefDeRaid specialSkill : ");
        gameBoard.printP1CardsOnGroundInfo();
        gameBoard.printP2CardsOnGroundInfo();

        List<Card> allyServants = gameBoard.getPlayerCardsOnGround(clientId);
        for(Card ally : allyServants) {
            ally.setDamage(ally.getDamage()+1);
        }

        log.info("After applying ChefDeRaid specialSkill : ");
        gameBoard.printP1CardsOnGroundInfo();
        gameBoard.printP2CardsOnGroundInfo();
	}

    @Override
    public void specialSkillOnDeath(Long playerId, GameBoard gameBoard) {
        log.info("Before death of ChefDeRaid : ");
        gameBoard.printP1CardsOnGroundInfo();
        gameBoard.printP2CardsOnGroundInfo();

        List<Card> allyServants = gameBoard.getPlayerCardsOnGround(playerId);
        for(Card ally : allyServants) {
            ally.setDamage(ally.getDamage()-1);
        }

        log.info("Before death of ChefDeRaid : ");
        gameBoard.printP1CardsOnGroundInfo();
        gameBoard.printP2CardsOnGroundInfo();
    }

    @Override
    public void specialSkillOnServant(String cardId, Long playerId, GameBoard gameBoard) {
        Card servant = gameBoard.findCardOnGroundByUniqueId(playerId, cardId);
        servant.setDamage(servant.getDamage()+1);
    }

    @Override
    public void specialSkillOnHero(Long playerId, GameBoard gameBoard) {

    }
    
}