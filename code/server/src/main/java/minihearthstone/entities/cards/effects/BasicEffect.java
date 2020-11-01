package minihearthstone.entities.cards.effects;

import minihearthstone.entities.cards.Card;
import minihearthstone.entities.gameboard.GameBoard;

import javax.persistence.Entity;

// TODO  : delete this class, because it's useless

@Entity
public class BasicEffect extends AbstractEffect {

    public BasicEffect() {
        setName("BasicEffect");
    }

    @Override
    public boolean applyOnChoiceEffect(Card card, Long playerId, GameBoard gameBoard) {
        return true;
    }

    @Override
    public boolean applyPreActionEffect(Card card, Long playerId, String targetCardUniqueId, GameBoard gameBoard) {
        return false;
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