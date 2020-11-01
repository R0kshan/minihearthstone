package minihearthstone.controller;

// Spring and Java imports

import minihearthstone.entities.gameboard.GameBoard;
import minihearthstone.entities.heroes.Hero;
import minihearthstone.entities.match.Match;
import minihearthstone.entities.player.Player;
import minihearthstone.facade.IFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.List;

// Minishearthstone imports

@Controller
public class ClientProxy implements IClient {

    private static final Logger log = LoggerFactory.getLogger(ClientProxy.class);

    protected ClientProxy() {};

    @Autowired
    private transient IFacade facade;

    @Override
    @MessageMapping("/login/player/{playerId}/playername/{playername}")
    @SendTo("/client/login/player/{playerId}")
    public Player login(@DestinationVariable final String playerId, @DestinationVariable final String playername) {
        log.info("Received login() from playerId  : " + playerId + "; username : " + playername);
        log.info("-------------------------------------------------");
        return facade.login(playerId, playername);
    }

    @Override
    @MessageMapping("/logout/player/{playerId}")
    @SendTo("/client/logout/player/{playerId}")
    public String logout(@DestinationVariable final String playerId) {
        log.info("Received logout() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.logout(playerId);
    }

    @Override
    @MessageMapping("/notifylogout/player/{playerId}/opponent/{opponentId}")
    @SendTo("/client/receivenotifylogout/player/{opponentId}")
    public String logout(@DestinationVariable final String playerId, @DestinationVariable final String opponentId) {
        log.info("Received notifylogout() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.logout(playerId, opponentId);
    }

    @Override
    @MessageMapping("/playerinfo/player/{playerId}")
    @SendTo("/client/playerinfo/player/{playerId}")
    public Player getPlayer(@DestinationVariable final String playerId) {
        log.info("Received playerinfo() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.getPlayer(playerId);
    }

    @Override
    @MessageMapping("/removeplayer/player/{playerId}")
    @SendTo("/client/removeplayer/player/{playerId}")
    public boolean removePlayer(@DestinationVariable final String playerId) {
        log.info("Received removeplayer() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.removePlayer(playerId);
    }

    @Override
    @MessageMapping("/getallplayers/player/{playerId}")
    @SendTo("/client/getallplayers/player/{playerId}")
    public List<Player> getAllPlayers(@DestinationVariable final String playerId) {
        log.info("Received getallplayers() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.getAllPlayers();
    }

    @Override
    @MessageMapping("/getallheroes/player/{playerId}")
    @SendTo("/client/getallheroes/player/{playerId}")
    public List<Hero> getAllHeroes(@DestinationVariable final String playerId) {
        log.info("Received getallheroes() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.getAllHeroes(playerId);
    }

    @Override
    @MessageMapping("/choosehero/player/{playerId}/hero/{heroId}/game/{gameId}")
    @SendTo("/client/choosehero/player/{playerId}")
    public GameBoard chooseHero(@DestinationVariable final String playerId, @DestinationVariable final String heroId,
                                @DestinationVariable final String gameId) {
        log.info("Received choosehero() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.chooseHero(playerId, heroId, gameId);
    }

    @Override
    @MessageMapping("/haschosenhero/player/{playerId}/game/{gameId}")
    @SendTo("/client/haschosenhero/player/{playerId}")
    public GameBoard hasChosenHero(@DestinationVariable final String playerId, @DestinationVariable final String gameId) {
        log.info("Receive haschosenhero() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.getGameBoardByGameId(gameId);
    }

    @Override
    @MessageMapping("/sendmyhero/player/{playerId}/opponent/{opponentId}")
    @SendTo("/client/receivehero/player/{opponentId}")
    public Hero sendMyHero(@DestinationVariable final String playerId, @DestinationVariable final String opponentId) {
        log.info("Received sendmyhero() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.getHeroByPlayerId(playerId);
    }

    @Override
    @MessageMapping("/initgame/player/{playerId}/game/{gameId}")
    @SendTo("/client/initgame/player/{playerId}")
    public GameBoard initGame(@DestinationVariable final String playerId, @DestinationVariable final String gameId) {
        log.info("Received initgame() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.initGame(playerId, gameId);
    }

    @Override
    @MessageMapping("/choosecard/player/{playerId}/game/{gameId}")
    @SendTo("/client/choosecard/player/{playerId}")
    public GameBoard chooseCard(@DestinationVariable final String playerId, @DestinationVariable final String gameId,
                                final String cardUniqueId) {
        log.info("Received chooseCard() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.chooseCard(playerId, gameId, cardUniqueId);
    }

    @Override
    @MessageMapping("/cardattackservant/player/{playerId}/opponent/{opponentId}/game/{gameId}")
    @SendTo("/client/cardattackservant/player/{playerId}")
    public GameBoard cardAttackServant(@DestinationVariable final String playerId, @DestinationVariable final String opponentId,
                                       @DestinationVariable final String gameId, final String servantUniqueIds) {
        log.info("Received cardattackservant() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.cardAttackServant(playerId, opponentId, gameId, servantUniqueIds);
    }

    @Override
    @MessageMapping("/spellcardattackservant/player/{playerId}/opponent/{opponentId}/game/{gameId}")
    @SendTo("/client/spellcardattackservant/player/{playerId}")
    public GameBoard spellCardAttackServant(@DestinationVariable final String playerId, @DestinationVariable final String opponentId,
                                            @DestinationVariable final String gameId, final String servantUniqueIds) {
        log.info("Received spellCardAttackServant() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.spellCardAttackServant(playerId, opponentId, gameId, servantUniqueIds);
    }

    @Override
    @MessageMapping("/spellcardonfriendlyservant/player/{playerId}/opponent/{opponentId}/game/{gameId}")
    @SendTo("/client/spellcardonfriendlyservant/player/{playerId}")
    public GameBoard spellCardOnFriendlyServant(@DestinationVariable final String playerId, @DestinationVariable final String opponentId,
                                                @DestinationVariable final String gameId, final String servantUniqueIds) {
        log.info("Received spellCardOnFriendlyServant() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.spellCardOnFriendlyServant(playerId, opponentId, gameId, servantUniqueIds);
    }

    @Override
    @MessageMapping("/cardattackhero/player/{playerId}/opponent/{opponentId}/game/{gameId}")
    @SendTo("/client/cardattackhero/player/{playerId}")
    public GameBoard cardAttackHero(@DestinationVariable final String playerId, @DestinationVariable final String opponentId,
                                    @DestinationVariable final String gameId, final String servantUniqueId) {
        log.info("Received cardAttackHero() from player : " + playerId);
        log.info("-------------------------------------------------");
        return facade.cardAttackHero(playerId, opponentId, gameId, servantUniqueId);
    }

    @Override
    @MessageMapping("/spellcardattackhero/player/{playerId}/opponent/{opponentId}/game/{gameId}")
    @SendTo("/client/spellcardattackhero/player/{playerId}")
    public GameBoard spellCardAttackHero(@DestinationVariable final String playerId, @DestinationVariable final String opponentId,
                                         @DestinationVariable final String gameId, final String spellCardUniqueId) {
        log.info("Received spellcardattackhero() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.spellCardAttackHero(playerId, opponentId, gameId, spellCardUniqueId);
    }

    @Override
    @MessageMapping("/heroattackservant/player/{playerId}/opponent/{opponentId}/game/{gameId}")
    @SendTo("/client/heroattackservant/player/{playerId}")
    public GameBoard heroAttackServant(@DestinationVariable final String playerId, @DestinationVariable final String opponentId,
                                       @DestinationVariable final String gameId, final String opponentServantUniqueId) {
        log.info("Received heroAttackServant() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.heroAttackServant(playerId, opponentId, gameId, opponentServantUniqueId);
    }

    @Override
    @MessageMapping("/heroattackhero/player/{playerId}/opponent/{opponentId}/game/{gameId}")
    @SendTo("/client/heroattackhero/player/{playerId}")
    public GameBoard heroAttackHero(@DestinationVariable final String playerId, @DestinationVariable final String opponentId,
                                    @DestinationVariable final String gameId) {
        log.info("Received heroAttackHero() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.heroAttackHero(playerId, opponentId, gameId);
    }

    @Override
    @MessageMapping("/useherospecial/player/{playerId}/opponent/{opponentId}/game/{gameId}")
    @SendTo("/client/useherospecial/player/{playerId}")
    public GameBoard useHeroSpecial(@DestinationVariable final String playerId, @DestinationVariable final String opponentId,
                                    @DestinationVariable final String gameId) {
        log.info("Received useHeroSpecial() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.useHeroSpecial(playerId, opponentId, gameId);
    }

    @Override
    @MessageMapping("/getfirsthand/player/{playerId}/hero/{heroId}/game/{gameId}")
    @SendTo("/client/getfirsthand/player/{playerId}")
    public GameBoard getFirstHandOfCards(@DestinationVariable final String playerId, @DestinationVariable final String heroId,
                                         @DestinationVariable final String gameId) {
        log.info("Received getfirsthand() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.getFirstHandOfCards(playerId, heroId, gameId);
    }

    @Override
    @MessageMapping("/updategameboard/player/{playerId}/game/{gameId}")
    @SendTo("/client/updategameboard/player/{playerId}")
    public GameBoard updateGameBoard(@DestinationVariable final String playerId, @DestinationVariable final String gameId) {
        log.info("Received updateGameboard() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.updateGameBoard(playerId, gameId);
    }

    @Override
    @MessageMapping("/sendgameboardupdate/player/{playerId}/game/{gameId}")
    @SendTo("/client/receivegameboardupdate/player/{playerId}")
    public GameBoard sendGameboardUpdate(@DestinationVariable final String playerId, @DestinationVariable final String gameId) {
        log.info("Received sendgameboardupdate() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.getGameBoardByGameId(gameId);
    }

    @Override
    @MessageMapping("/endmyturn/player/{playerId}/opponent/{opponentId}/game/{gameId}")
    @SendTo("/client/endmyturn/player/{playerId}")
    public GameBoard endMyTurn(@DestinationVariable final String playerId, @DestinationVariable final String opponentId,
                               @DestinationVariable final String gameId) {
        log.info("Received endmyturn() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.endMyTurn(playerId, opponentId, gameId);
    }

    @Override
    @MessageMapping("/sendendofturn/player/{playerId}/game/{gameId}")
    @SendTo("/client/receiveendofturn/player/{playerId}")
    public GameBoard sendEndOfTurn(@DestinationVariable final String playerId, @DestinationVariable final String gameId) {
        log.info("Received sendendofturn() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.sendEndOfTurn(playerId, gameId);
    }

    // New random get match
    @Override
    @MessageMapping("/findrandommatch/player/{playerId}")
    @SendTo("/client/findrandommatch/player/{playerId}")
    public Match findRandomMatch(@DestinationVariable final String playerId) {
        log.info("Received findrandommatch() from playerId : " + playerId);
        log.info("-------------------------------------------------");
        return facade.findRandomMatch(playerId);
    }

    @Override
    @MessageMapping("/sendrandommatch/player/{playerId}/opponent/{opponentId}/match/{matchId}")
    @SendTo("/client/receiverandommatch/player/{opponentId}")
    public Match sendRandomMatch(@DestinationVariable final String playerId, @DestinationVariable final String opponentId, @DestinationVariable final String matchId) {
        log.info("Received sendrandommatch() from playerId : " + playerId + " to opponentId : " + opponentId + " ; matchId : " + matchId);
        log.info("-------------------------------------------------");
        return facade.sendRandomMatch(opponentId, matchId);
    }

    @Override
    @MessageMapping("/getopponent/player/{playerId}/opponent/{opponentId}")
    @SendTo("/client/receiveopponent/player/{playerId}")
    public Player getOpponentPlayer(@DestinationVariable final String playerId, @DestinationVariable final String opponentId) {
        log.info("Received getOpponentPlayer() from playerId : " + playerId + " to get player by opponentId : " + opponentId);
        log.info("-------------------------------------------------");
        return facade.getPlayer(opponentId);
    }

    @Override
    @MessageMapping("/cancelmatch/player/{playerId}/match/{matchId}")
    @SendTo("/client/cancelmatch/player/{playerId}")
    public String cancelMatch(@DestinationVariable final String playerId, @DestinationVariable final String matchId) {
        log.info("Received cancelMatch() from playerId : " + playerId + " of matchId : " + matchId);
        log.info("-------------------------------------------------");
        return facade.cancelMatch(playerId, matchId);
    }

    @Override
    @MessageMapping("/sendcancelmatch/player/{playerId}/opponent/{opponentId}/match/{matchId}")
    @SendTo("/client/receivecancelmatch/player/{opponentId}")
    public String sendCancelMatch(@DestinationVariable final String playerId, @DestinationVariable final String opponentId, @DestinationVariable final String matchId) {
        log.info("Received sendCancelMatch() from playerId : " + playerId + " of matchId : " + matchId + " to player : " + opponentId);
        log.info("-------------------------------------------------");
        return facade.cancelMatch(opponentId,matchId);
    }

    @Override
    @MessageMapping("/sendmessage/player/{playerId}/opponent/{opponentId}/message/{message}")
    @SendTo("/client/receivemessage/player/{opponentId}")
    public String sendMessage(@DestinationVariable final String playerId, @DestinationVariable final String opponentId, @DestinationVariable final String message) {
        log.info("Received sendMessage() from playerId : " + playerId + " to player : " + opponentId);
        log.info("-------------------------------------------------");
        return message;
    }

    @Override
    @MessageMapping("/quitgame/player/{playerId}/opponent/{opponentId}/game/{gameId}")
    @SendTo("/client/quitgame/player/{playerId}")
    public String quitGame(@DestinationVariable final String playerId, @DestinationVariable final String opponentId, @DestinationVariable final String gameId) {
        log.info("Received quitGame() from playerId : " + playerId + " to quit game  : " + gameId);
        log.info("-------------------------------------------------");
        return this.facade.quitGame(playerId, opponentId, gameId);
    }

    @Override
    @MessageMapping("/notifyquitgame/player/{playerId}/opponent/{opponentId}")
    @SendTo("/client/receivequitgame/player/{opponentId}")
    public String notifyQuitGame(@DestinationVariable final String playerId, @DestinationVariable final String opponentId) {
        log.info("Received notifyQuitGame() from playerId : " + playerId + " to opponent  : " + opponentId);
        log.info("-------------------------------------------------");
        this.facade.setPlayerStatus(opponentId, "available");
        return "Your opponent has quit the game. Returning to dashboard ...";
    }

    @Override
    @MessageMapping("/sendacknowledgmentofreceipt/player/{playerId}/opponent/{opponentId}")
    @SendTo("/client/receiveacknowledgmentofreceipt/player/{opponentId}")
    public String sendAcknowlegmentOfReceipt(@DestinationVariable final String playerId, @DestinationVariable final String opponentId) {
        log.info("Received sendAcknowlegmentOfReceipt() from playerId : " + playerId + " to opponent  : " + opponentId);
        log.info("-------------------------------------------------");
        return "acknowledgement receipt from " + opponentId;
    }

}