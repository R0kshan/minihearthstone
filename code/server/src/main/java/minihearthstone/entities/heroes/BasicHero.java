package minihearthstone.entities.heroes;

// Spring and java imports
import minihearthstone.entities.gameboard.GameBoard;

import javax.persistence.Entity;

@Entity
public class BasicHero extends Hero {

    public BasicHero() {

    }

    public BasicHero(String name, String type, String skillType, AbstractSpecificHero specificHero, String description) {
       super(name,type,skillType, specificHero, description);
    }

    @Override
    public void specialSkillOnHero(String clientId,  GameBoard gameBoard) {
        if (this.specificHero != null && this.canUseSpecialSkill == true) {
            this.specificHero.specialSkillOnHero(clientId, gameBoard);
            this.canUseSpecialSkill = false;
        }
    }

    @Override
    public void specialSkillOnServant(String clientId, String uniqueId, GameBoard gameBoard) {
        if (this.specificHero != null && this.canUseSpecialSkill == true) {
            this.specificHero.specialSkillOnServant(clientId, uniqueId, gameBoard);
            this.canUseSpecialSkill = false;
        }
    }

    @Override
    public void specialSkill(String clientId, GameBoard gameBoard) {
        if (this.specificHero != null && this.canUseSpecialSkill == true) {
            this.specificHero.specialSkill(clientId, gameBoard);
            this.canUseSpecialSkill = false;
        }
    }

    @Override
    public Hero uniqueCopy() {
        Hero clone = new BasicHero(this.name, this.type, this.skillType, this.specificHero, this.description);
        clone.setOriginal(false);

        if (this.specificHero != null) {
            if (this.specificHero.getClass().getSimpleName().equals("Mage")) {
                clone.setSpecificHero(new Mage());
            } else if (this.specificHero.getClass().getSimpleName().equals("Paladin")) {
                clone.setSpecificHero(new Paladin());
            } else if (this.specificHero.getClass().getSimpleName().equals("Warrior")) {
                clone.setSpecificHero(new Warrior());
            }
        }
        return clone;
    }

}
