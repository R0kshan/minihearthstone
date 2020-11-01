package minihearthstone.entities.heroes;

import minihearthstone.entities.cards.BasicCard;
import minihearthstone.entities.cards.Card;
import minihearthstone.entities.gameboard.GameBoard;
import minihearthstone.entities.player.Player;

import javax.persistence.Entity;

@Entity
public class Paladin extends AbstractSpecificHero {

    public Paladin() {
        super();
    }

    @Override
    public void specialSkillOnHero(String clientId, GameBoard gameBoard) {

    }

    @Override
    public void specialSkillOnServant(String clientId, String uniqueId, GameBoard gameBoard) {

    }

    @Override
    public void specialSkill(String clientId, GameBoard gameBoard) {
        log.info("Applying Paladin on self specialSkill() | Manacost : " + this.getManacost());

        Player player = gameBoard.getPlayer(Long.parseLong(clientId));

        // Check if player has enough mana to perform skill
        if (player.checkEnoughMana(this.getManacost())) {
            Card newServant = new BasicCard("Silverhand recruit", 0, 1, 1, "paladin","servant", null, null,"Common card","Click on this card to summon the servant.");
            gameBoard.addToPlayerCardsOnGround(Long.parseLong(clientId), newServant);
            gameBoard.printPlayerCardsOnGroundInfo(Long.parseLong(clientId));

            // Deduct mana points according to skill cost
            gameBoard.getPlayer(Long.parseLong(clientId)).deductMana(this.getManacost());
        } else {
            log.info("Not enough mana");
        }

    }

 }