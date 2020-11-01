package minihearthstone.entities.heroes;

import minihearthstone.entities.cards.Card;
import minihearthstone.entities.gameboard.GameBoard;
import minihearthstone.entities.player.Player;

import javax.persistence.Entity;

@Entity
public class Mage extends AbstractSpecificHero {

    public Mage() {
        super();
    }

    @Override
    public void specialSkillOnHero(String clientId, GameBoard gameBoard) {
        log.info("Applying Mage on target specialSkillOnHero()");

        Player player = gameBoard.getPlayer(Long.parseLong(clientId));

        // Check if player has enough mana to perform skill
        if (player.checkEnoughMana(this.getManacost())) {
            Hero hero = gameBoard.getOpponentHero(Long.parseLong(clientId));

            int remainingDamage = 1 - hero.getDefense();
            if (remainingDamage >= 0) {
                hero.setDefense(0);
                hero.setLifepoints(hero.getLifepoints() - remainingDamage);
                gameBoard.setHeroAttacked(hero.getUniqueId());
            }
            else {
                hero.setDefense(hero.getDefense() - 1);
            }

            // Deduct mana points according to skill cost
            gameBoard.getPlayer(Long.parseLong(clientId)).deductMana(this.getManacost());
        } else {
            log.info("Not enough mana");
        }
    }

    @Override
    public void specialSkillOnServant(String clientId, String uniqueId, GameBoard gameBoard) {
        log.info("Applying Mage on target specialSkillOnServant()");

        Player player = gameBoard.getPlayer(Long.parseLong(clientId));
        Player opponentPlayer = gameBoard.getOpponentPlayer(Long.parseLong(clientId));

        // Check if player has enough mana to perform skill
        if (player.checkEnoughMana(this.getManacost())) {
            Card servant = gameBoard.findCardOnGroundByUniqueId(opponentPlayer.getClientId(), uniqueId);

            int remainingDamage = 1 - servant.getDefense();
            if (remainingDamage >= 0) {
                servant.setDefense(0);
                servant.setLifepoints(servant.getLifepoints() - remainingDamage);
                gameBoard.addCardUniqueIdToAttackedServant(servant.getUniqueId());
            }
            else {
                servant.setDefense(servant.getDefense() - 1);
                gameBoard.addCardUniqueIdToAttackedServant(servant.getUniqueId());
            }

            // servant.setLifepoints(servant.getLifepoints() - 1);

            // Deduct mana points according to skill cost
            gameBoard.getPlayer(Long.parseLong(clientId)).deductMana(this.getManacost());
        } else {
            log.info("Not enough mana");
        }
    }

    @Override
    public void specialSkill(String clientId, GameBoard gameBoard) {

    }

 }