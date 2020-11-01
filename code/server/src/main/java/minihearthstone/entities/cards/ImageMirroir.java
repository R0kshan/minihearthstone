package minihearthstone.entities.cards;

import minihearthstone.entities.cards.effects.ProvocationEffect;
import minihearthstone.entities.gameboard.GameBoard;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ImageMirroir extends AbstractSpecificCard {

    public ImageMirroir() {
        setName("ImageMirroir");
    }

    @Override
    public void specialSkill(Long playerId, GameBoard gameBoard) {
        List<Card> newServants = new ArrayList<>();
        newServants.add(new BasicCard("Mirror Image", 1, 1, 2, "common", "servant", new ProvocationEffect(), null,"Provocation", ""));
        newServants.add(new BasicCard("Mirror Image", 1, 1, 2, "common", "servant", new ProvocationEffect(), null,"Provocation",""));
        gameBoard.addToPlayerCardsOnGround(playerId, newServants);
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