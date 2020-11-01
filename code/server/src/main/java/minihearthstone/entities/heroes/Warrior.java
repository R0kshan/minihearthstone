package minihearthstone.entities.heroes;

import minihearthstone.entities.gameboard.GameBoard;
import minihearthstone.entities.player.Player;

import javax.persistence.Entity;

@Entity
public class Warrior extends AbstractSpecificHero {


    public Warrior() {
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
        log.info("Applying Warrior on self specialSkill()");

        Player player = gameBoard.getPlayer(Long.parseLong(clientId));

        // Check if player has enough mana to perform skill
        if (player.checkEnoughMana(this.getManacost())) {
            // Hero hero = gameBoard.getHero(Long.parseLong(clientId));
            Hero hero = gameBoard.getHeroByUniqueId(player.getHeroUniqueId());
            hero.setDefense(hero.getDefense()+2);

            // Deduct mana points according to skill cost
            gameBoard.getPlayer(Long.parseLong(clientId)).deductMana(this.getManacost());
        } else {
            log.info("Not enough mana");
        }
    }

 }