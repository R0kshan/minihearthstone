package minihearthstone.entities.heroes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import minihearthstone.entities.cards.*;
import minihearthstone.entities.gameboard.GameBoard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Mage.class, name = "Mage"),
        @JsonSubTypes.Type(value = Paladin.class, name = "Paladin"),
        @JsonSubTypes.Type(value = Warrior.class, name = "Warrior")})
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractSpecificHero {

   @Id @GeneratedValue(strategy = GenerationType.TABLE)
   Long id;

   int manacost;

   @Transient
   protected static final Logger log = LoggerFactory.getLogger(BasicCard.class);

   public AbstractSpecificHero() {
       this.manacost = 2;
   }

   public int getManacost() {
      return this.manacost;
   }
   public void setManacost(int manacost) {
      this.manacost = manacost;
   }

   public abstract void specialSkillOnHero(String clientId, GameBoard gameBoard);
   public abstract void specialSkillOnServant(String clientId, String uniqueId, GameBoard gameBoard);
   public abstract void specialSkill(String clientId, GameBoard gameBoard);

}