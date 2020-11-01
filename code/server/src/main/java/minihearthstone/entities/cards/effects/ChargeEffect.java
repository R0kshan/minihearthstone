package minihearthstone.entities.cards.effects;

import minihearthstone.entities.cards.Card;
import minihearthstone.entities.gameboard.GameBoard;

import javax.persistence.Entity;

@Entity
public class ChargeEffect extends AbstractEffect {

    public ChargeEffect() {
        setName("ChargeEffect");
    }

    @Override
    public boolean applyOnChoiceEffect(Card card, Long playerId, GameBoard gameBoard) {
        log.info("ChargeEffect -> Applying applyOnChoiceEffect()");
        card.setCanAttack(true);
        return true;
    }

    @Override
    public boolean applyPreActionEffect(Card card, Long playerId, String targetCardUniqueId, GameBoard gameBoard) {
        log.info("ChargeEffect -> Applying applyInActionPreCondEffect() | return true");
        return true;
    }

    @Override
    public boolean applyInActionPreCondEffect(Card card, Long playerId, GameBoard gameBoard) {
        return true;
    }

    @Override
    public boolean applyInActionPostCondEffect(Card card, Long playerId, GameBoard gameBoard) {
        return true;
    }



}