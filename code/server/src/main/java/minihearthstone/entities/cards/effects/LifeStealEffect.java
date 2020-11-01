package minihearthstone.entities.cards.effects;

import minihearthstone.entities.cards.Card;
import minihearthstone.entities.gameboard.GameBoard;
import minihearthstone.entities.heroes.Hero;

import javax.persistence.Entity;

@Entity
public class LifeStealEffect extends AbstractEffect {

    public LifeStealEffect() {
        setName("LifeStealEffect");
    }

    @Override
    public boolean applyOnChoiceEffect(Card card, Long playerId, GameBoard gameBoard) {
        return true;
    }

    @Override
    public boolean applyPreActionEffect(Card card, Long playerId, String targetCardUniqueId, GameBoard gameBoard) {
        return true;
    }

    @Override
    public boolean applyInActionPreCondEffect(Card card, Long playerId, GameBoard gameBoard) {
        log.info("LifeStealEffect -> Applying applyInActionPreCondEffect() | return true");
        return true;
    }

    @Override
    public boolean applyInActionPostCondEffect(Card card, Long playerId, GameBoard gameBoard) {
        log.info("LifeStealEffect -> Applying applyInActionPostCondEffect()");
        Hero hero = gameBoard.getOpponentHero(playerId);
        hero.setLifepoints(hero.getLifepoints() + card.getDamage());
        return true;
    }

}