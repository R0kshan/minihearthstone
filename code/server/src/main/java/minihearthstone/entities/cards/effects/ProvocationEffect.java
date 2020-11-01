package minihearthstone.entities.cards.effects;

import minihearthstone.entities.cards.Card;
import minihearthstone.entities.gameboard.GameBoard;
import minihearthstone.entities.player.Player;

import javax.persistence.Entity;

@Entity
public class ProvocationEffect extends AbstractEffect  {

    public ProvocationEffect() {
        setName("ProvocationEffect");
    }

    @Override
    public boolean applyOnChoiceEffect(Card card, Long playerId, GameBoard gameBoard) {
        return true;
    }

    @Override
    public boolean applyPreActionEffect(Card card, Long playerId, String targetCardUniqueId, GameBoard gameBoard) {
        log.info("ProvocationEffect -> Applying applyPreActionEffect() | target : " + targetCardUniqueId );

        Player opponentPlayer = gameBoard.getOpponentPlayer(playerId);
        log.info("Opponent player : " + opponentPlayer.getClientId());
        Card targetCard = gameBoard.findCardOnGroundByUniqueId(opponentPlayer.getClientId(), targetCardUniqueId);
        String targetEffectName = "";

        boolean response = true;

        if (!targetCardUniqueId.equals("")) {
            if (targetCard.getEffect() != null) {
                targetEffectName = targetCard.getEffect().getName();
            }

            if (!card.getUniqueId().equals(targetCardUniqueId)) {
                log.info("Current card " + card.getUniqueId() + " != " + targetCardUniqueId);
                response = false;
            }
            if (targetEffectName.equals("ProvocationEffect")) {
                log.info("Target also has provocation effect");
                response = true;
            }
        } else {
            response = false;
        }
        return response;
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