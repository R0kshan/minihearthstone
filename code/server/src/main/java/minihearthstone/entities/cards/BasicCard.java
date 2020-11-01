package minihearthstone.entities.cards;


import minihearthstone.entities.cards.effects.AbstractEffect;
import minihearthstone.entities.cards.effects.ChargeEffect;
import minihearthstone.entities.cards.effects.LifeStealEffect;
import minihearthstone.entities.cards.effects.ProvocationEffect;
import minihearthstone.entities.deck.Deck;
import minihearthstone.entities.gameboard.GameBoard;
import minihearthstone.entities.gameboard.GameBoardRepository;
import minihearthstone.entities.heroes.Hero;
import minihearthstone.entities.player.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class BasicCard extends Card {

  @Transient
  private static final Logger log = LoggerFactory.getLogger(BasicCard.class);

  @Autowired
  @Transient
  private GameBoardRepository gameBoardRepository;

  @Autowired
  @Transient
  private CardRepository cardRepository;

  protected BasicCard() {
  };

  protected BasicCard(final String uniqueId, final String name, final int manacost, final int damage, final int lifepoints, final boolean canAttack, final int defense, String type,
  final String nature, final AbstractEffect effect, final AbstractSpecificCard specificCard, final String description, final String clientTooltip) {
    super(uniqueId, name, manacost, damage, lifepoints, canAttack, defense, type, nature, effect, specificCard, description, clientTooltip);
  }

  public BasicCard(final String name, final int manacost, final int damage, final int lifepoints, final String type, final String nature,
  final AbstractEffect effect, final AbstractSpecificCard specificCard, final String description, final String clientTooltip) {
    super(name, manacost, damage, lifepoints, type, nature, effect, specificCard, description, clientTooltip);
  }

  /**
   * Complete constructor for JSON mapping into Card
   */
  public BasicCard(Long id, String uniqueId, String name, int manacost, int damage, int lifepoints, String type,
      String nature, String description, String clientTooltip, Deck deck, GameBoard gbP1HandOfCardsMapping, GameBoard gbP2HandOfCardsMapping,
      GameBoard gbP1CardsOnGroundMapping, GameBoard gbP2CardsOnGroundMapping, AbstractEffect effect,
      AbstractSpecificCard specificCard) {

    super(id, uniqueId, name, manacost, damage, lifepoints, type, nature, description, clientTooltip, deck, gbP1HandOfCardsMapping,
        gbP2HandOfCardsMapping, gbP1CardsOnGroundMapping, gbP2CardsOnGroundMapping, effect, specificCard);
  }

  // METHODS

  @Override
  public Card copy() {
    Card card = new BasicCard(this.uniqueId, this.name, this.manacost, this.damage, this.lifepoints, this.canAttack, this.defense, this.type,
        this.nature, null, null, this.description, this.clientTooltip);
      copyEffect(card);
      copySpecificCard(card);
    return card;
  }

  @Override
  public Card uniqueCopy() {
    Card card = new BasicCard(this.name, this.manacost, this.damage, this.lifepoints, this.type, this.nature,
            null, null, this.description, this.clientTooltip);

    card.setDefense(this.defense);
    card.setCanAttack(this.canAttack);
    copyEffect(card);
    copySpecificCard(card);

    return card;
  }

    private void copyEffect(Card card) {
      if (this.effect != null) {
          if (this.effect.getClass().getSimpleName().equals("ProvocationEffect")) {
              card.setEffect(new ProvocationEffect());
          } else if (this.effect.getClass().getSimpleName().equals("ChargeEffect")) {
              card.setEffect(new ChargeEffect());
          } else if (this.effect.getClass().getSimpleName().equals("LifeStealEffect")) {
              card.setEffect(new LifeStealEffect());
          }
      }
  }

  private void copySpecificCard(Card card) {
      if (this.specificCard != null) {
          if (this.specificCard.getClass().getSimpleName().equals("BenedictionDePuissance")) {
              card.setSpecificCard(new BenedictionDePuissance());
          } else if (this.specificCard.getClass().getSimpleName().equals("ChefDeRaid")) {
              card.setSpecificCard(new ChefDeRaid());
          } else if (this.specificCard.getClass().getSimpleName().equals("Consecration")) {
              card.setSpecificCard(new Consecration());
          } else if (this.specificCard.getClass().getSimpleName().equals("ExplosionDesArcanes")) {
              card.setSpecificCard(new ExplosionDesArcanes());
          } else if (this.specificCard.getClass().getSimpleName().equals("ImageMirroir")) {
              card.setSpecificCard(new ImageMirroir());
          } else if (this.specificCard.getClass().getSimpleName().equals("MaitriseDuBlocage")) {
              card.setSpecificCard(new MaitriseDuBlocage());
          } else if (this.specificCard.getClass().getSimpleName().equals("Metamorphose")) {
              card.setSpecificCard(new Metamorphose());
          } else if (this.specificCard.getClass().getSimpleName().equals("Tourbillon")) {
              card.setSpecificCard(new Tourbillon());
          }
      }
  }

    @Override
    public boolean applyOnChoiceEffect(Card card, Long playerId, GameBoard gameBoard) {
        if (this.effect != null) {
            return this.effect.applyOnChoiceEffect(card,playerId, gameBoard);
        }
        else return true;
    }

    @Override
    public boolean applyPreActionEffect(Card card, Long playerId, String targetCardUniqueId, GameBoard gameBoard) {
        if (this.effect != null) {
            return this.effect.applyPreActionEffect(card,playerId, targetCardUniqueId, gameBoard);
        }
        else return true;
    }

    @Override
    public boolean applyInActionPreCondEffect(Card card, Long playerId, GameBoard gameBoard) {
        if (this.effect != null) {
            return this.effect.applyInActionPreCondEffect(card,playerId, gameBoard);
        }
        else return true;
    }

    @Override
    public boolean applyInActionPostCondEffect(Card card, Long playerId, GameBoard gameBoard) {
        if (this.effect != null) {
            return this.effect.applyInActionPostCondEffect(card,playerId, gameBoard);
        }
        else return true;
    }

  @Override
  public void specialSkill(Long playerId, GameBoard gameBoard) {
    if (this.specificCard != null) {
      this.specificCard.specialSkill(playerId, gameBoard);
    }
  }

    @Override
    public void specialSkillOnDeath(Long playerId, GameBoard gameBoard) {
        if (this.specificCard != null) {
            this.specificCard.specialSkillOnDeath(playerId, gameBoard);
        }
    }

    @Override
  public void specialSkillOnServant(String cardId, Long playerId, GameBoard gameBoard) {
    if (this.specificCard != null) {
      this.specificCard.specialSkillOnServant(cardId, playerId, gameBoard);
      gameBoard.getPlayer(playerId).deductMana(this.manacost);
    }
  }

    @Override
  public void specialSkillOnHero(Long playerId, GameBoard gameBoard) {
    if (this.specificCard != null) {
      this.specificCard.specialSkillOnHero(playerId, gameBoard);
    }
  }

  @Override
  public void normalAttackOnServant(String cardId, Long playerId, GameBoard gameBoard) {
    Card opponentServant = gameBoard.findCardOnGroundByUniqueId(playerId, cardId);

    // Opponent servant is found and if condition meets the opponent card's effect, this card can attack
    if (opponentServant != null) {

        log.info(this.getUniqueId() + " attacking " + opponentServant.getUniqueId());
        applyInActionPreCondEffect(this,playerId, gameBoard);

        // Attack opponent's servant
        /*int remainingDamage = this.damage - opponentServant.getDefense();
        if (remainingDamage >= 0) {
            opponentServant.setDefense(0);
            opponentServant.setLifepoints(opponentServant.getLifepoints() - remainingDamage);
            gameBoard.addCardUniqueIdToAttackedServant(opponentServant.getUniqueId());
        }
        else {
            opponentServant.setDefense(opponentServant.getDefense() - this.damage);
            gameBoard.addCardUniqueIdToAttackedServant(opponentServant.getUniqueId());
        }*/
        this.inflictDamageToServant(opponentServant, this.damage, gameBoard);

        // Receive damage from opponent servant
        this.setLifepoints(this.getLifepoints()-opponentServant.getDamage());

        // Remove ability to attack again for this round
        this.setCanAttack(false);

        applyInActionPostCondEffect(this,playerId, gameBoard);
    }
    else {
      log.info("Opponent card not found");
    }
  }

  @Override
  public void normalAttackOnHero(Long playerId, GameBoard gameBoard) {
      Player player = gameBoard.getPlayer(playerId);
      // Hero opponentHero = gameBoard.getHero(playerId);
      Hero opponentHero = gameBoard.getHeroByUniqueId(player.getHeroUniqueId());

    if (opponentHero != null) {

        log.info(this.getName() + " attacking " + opponentHero.toString());

        applyInActionPreCondEffect(this,playerId, gameBoard);

        int remainingDamage = this.damage - opponentHero.getDefense();

        // Attack hero
        if (remainingDamage >= 0) {
            opponentHero.setDefense(0);
            opponentHero.setLifepoints(opponentHero.getLifepoints() - remainingDamage);
            gameBoard.setHeroAttacked(opponentHero.getUniqueId());
        }
        else {
            opponentHero.setDefense(opponentHero.getDefense() - this.damage);
        }
        // Remove ability to attack again for this round
        this.setCanAttack(false);

        applyInActionPostCondEffect(this,playerId, gameBoard);
    }
    else {
        log.info("Opponent hero not found");
    }
  }

}
