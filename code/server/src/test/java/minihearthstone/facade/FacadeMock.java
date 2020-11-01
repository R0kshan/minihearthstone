package minihearthstone.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minihearthstone.entities.cards.CardRepository;
import minihearthstone.entities.cards.effects.*;
import minihearthstone.entities.cards.*;
import minihearthstone.entities.deck.*;
import minihearthstone.entities.gameboard.*;
import minihearthstone.entities.heroes.HeroRepository;
import minihearthstone.entities.heroes.*;
import minihearthstone.entities.match.*;
import minihearthstone.entities.player.*;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Before;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;


/**
 * Classe de test pour la classe ClientProxy {@link ClientProxy}
 */
@RunWith(MockitoJUnitRunner.class)
public class FacadeMock {

    private final static String P1ANS = "p1Ans";
    private final static String P2ANS = "p2Ans";

    //Player related
    private final static String P1_NAME = "p1Name";
    private final static String P2_NAME = "p2Name";
    private final static String P1ID = "1";
    private final static String P2ID = "2";
    private final Long L1ID = Long.parseLong(P1ID);
    private final Long L2ID = Long.parseLong(P2ID);
    private final Player p1 = new Player(P1_NAME,Long.parseLong(P1ID));
    private final Player p2 = new Player(P2_NAME,Long.parseLong(P2ID));
    
    //GameBoard related
    private final static String GID = "0";
    private final Long GBID = new Long(GID);
    private final GameBoard gameBoard = new GameBoard(GBID);

    //Heroes related
    private final static String HID = "1";
    private final Long LHID = new Long(HID);
    private final static String NAME1 = "n1";
    private final static String TYPE1 = "t1";
    private final static String SKILL_TYPE1 = "sk1";
    private final Paladin paladin = new Paladin();
    private final static String DESCR = "short description";
    private final BasicHero h1 = new BasicHero(NAME1,TYPE1,SKILL_TYPE1,paladin,DESCR);

    //Card related
    private final static String CARD_ID = "0";
    private final Long CL1ID = new Long(CARD_ID);
    private final static String CNAME1 = "name";
    private final static String CNAME2 = "n2";
    private final static int MANA_COST = 1;
    private final static int DMG = 1;
    private final static int DMG2 = 2;
    private final static int HP = 1;
    private final static int HP2 = 2;
    private final static String TYPE = "type";
    private final static String NATURE = "servant";
    private final BasicEffect BASIC_EFFECT = new BasicEffect();
    private final AbstractSpecificCard SPEC_CARD = new ChefDeRaid();
    private final static String DESC = "";
    private final static  String TOOLTIP = "";

    private final Card c1 = new BasicCard(CNAME1,MANA_COST,DMG,HP,TYPE,NATURE,BASIC_EFFECT,SPEC_CARD,DESC,TOOLTIP);
    private final Card c2 = new BasicCard(CNAME2,MANA_COST+1,DMG2,HP2,TYPE,NATURE,BASIC_EFFECT,SPEC_CARD,DESC,TOOLTIP);

    @InjectMocks
    private Facade facade;

    @Mock
    private PlayerRepository playerRepository;

    @Mock
    private MatchRepository matchRepository;

    @Mock
    private HeroRepository heroRepository;

    @Mock
    private GameBoardRepository gameBoardRepository;

    @Mock
    private DeckRepository deckRepository;

    @Mock
    private CardRepository cardRepository;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test {@link Facade#login(String,String)} 
     */
    @Test
    public void login_PlayerAlreadyExisting() {
        when(playerRepository.findByClientId(L1ID)).thenReturn(p1);
        final Player p = facade.login(P1ID,P1_NAME);
        verify(playerRepository,times(2)).findByClientId(L1ID);
        assertThat(p.getId()).isEqualTo(p1.getId());
    }
    
    /**
     * Test {@link Facade#login(String, String)} 
     */
    @Test
    public void login_AddPlayer() {
        when(playerRepository.findByClientId(L1ID)).thenReturn(null);
        final List<Player> emptyList = new ArrayList<>();
        // List<Player> nonEmptyList = new ArrayList<Player>();
        Player nonEmptyPlayer = new Player(P1_NAME, L1ID);
        when(playerRepository.findByName(P1_NAME)).thenReturn(nonEmptyPlayer);
        facade.login(P1ID,P1_NAME);
        verify(playerRepository).findByClientId(L1ID);
        verify(playerRepository).findByName(P1_NAME);
        verify(playerRepository).save(any());
    }

    /**
     * Test {@link Facade#login(String, String)} 
     */
    @Test
    public void login_PlayerWithNoId() {
        when(playerRepository.findByClientId(L1ID)).thenReturn(null);
        // List<Player> nonEmptyList = new ArrayList<Player>();
        Player nonEmptyPlayer = new Player(P1_NAME, L1ID);
        // nonEmptyList.add(p1);
        when(playerRepository.findByName(P1_NAME)).thenReturn(nonEmptyPlayer);
        facade.login(P1ID,P1_NAME);
        verify(playerRepository).findByClientId(L1ID);
        verify(playerRepository).findByName(P1_NAME);
        verify(playerRepository,never()).save(any());
    }

    /**
     * Test method for {@link Facade#login(String))}
     */
    @Test
    public void logoutNotInMatch(){
        when(playerRepository.findByClientId(L1ID)).thenReturn(p1);
        when(gameBoardRepository.findByP1ClientId(GBID)).thenReturn(gameBoard);
        final String expected = "Logged out succesffuly";
        final String ans = facade.logout(P1ID);
        assertThat(ans).isEqualTo(expected);
        verify(playerRepository).delete(any());
        verify(gameBoardRepository,never()).delete(any());
    }

    /**
     * Test method for {@link Facade#login(String, String))}
     */
    @Test
    public void logoutInMatch(){
        when(playerRepository.findByClientId(L1ID)).thenReturn(p1);
        when(playerRepository.findByClientId(L2ID)).thenReturn(p2);
        final String expected = P1_NAME + " has logged out. Redirection you to dashboard ...";
        final String res = facade.logout(P1ID,P2ID);
        verify(playerRepository).save(any());
        assertThat(res).isEqualTo(expected);
    }

    /**
     * Test method for {@link Facade#pregetMatch(String))}
     */
    @Test
    public void pregetMatch(){
        when(playerRepository.findByClientId(L1ID)).thenReturn(p1);
        final List<Player> emptyList = new ArrayList<Player>();
        when(playerRepository.findByStatus("looking for match")).thenReturn(emptyList);
        final int expected = 0;
        //final int res = facade.pregetMatch(P1ID);
        verify(playerRepository).save(any());
        //assertThat(res).isEqualTo(expected);
    }

    /**
     * Test method for {@link Facade#getMatch(String)}
     */
    @Test
    public void getMatchWhenPlayerAvailable() {
       List<Player> players = new ArrayList<Player>();
       players.add(p2);
       when(playerRepository.findByStatus("looking for match")).thenReturn(players);
       when(playerRepository.findByClientId(L1ID)).thenReturn(p1);
       final Player expected = p2;
       //final Player res = facade.getMatch(P1ID);
       verify(playerRepository,times(2)).save(any());
       //assertThat(res.getClientId()).isEqualTo(expected.getClientId());
    }

    /**
     * Test method for {@link Facade#getMatch(String)}
     */
    @Test
    public void getMatchWhenNoPlayerAvailable() {
       final List<Player> players = new ArrayList<Player>();
       when(playerRepository.findByStatus("looking for match")).thenReturn(players);
       when(playerRepository.findByClientId(L1ID)).thenReturn(p1);
       final Player expected = null;
       //final Player res = facade.getMatch(P1ID);
       verify(playerRepository,never()).save(any());
      // assertThat(res).isEqualTo(expected);
    }

    /**
     * Test method for {@link Facade#acceptMatch(String, String)}
     */
    @Test
    public void AcceptMatch() {
      final Match match = new Match(P1ANS,P2ANS,P1ID,P2ID);
      // when(matchRepository.findMatchByMatchId_P1ClientId(P1ID)).thenReturn(match);
      when(playerRepository.findByClientId(L1ID)).thenReturn(p1);

      //final Match res = facade.acceptMatch(P1ID, P2ID);

      verify(matchRepository).save(any());
      verify(playerRepository).save(any());
     // assertThat(match).isEqualTo(res);
    }

    /**
     * Test method for {@link Facade#rejectMatch(String)}
     */
    @Test
    public void rejectMatch(){
        final Match match = new Match(P1ANS,P2ANS,P1ID,P2ID);
        // when(matchRepository.findMatchByMatchId_P1ClientId(P1ID)).thenReturn(match);
        when(playerRepository.findByClientId(L1ID)).thenReturn(p1);

        //final Match res = facade.rejectMatch(P1ID);

        verify(playerRepository).save(any());
        verify(matchRepository).delete(any());
        // assertThat(match).isEqualTo(res);
    }
    
    /**
     * Test method for {@link Facade#acceptMatch(String, String)}
     */
    @Test
    public void acceptMatchRequest(){
        final Match match = new Match(P1ANS,P2ANS,P1ID,P2ID);
        // when(matchRepository.findMatchByMatchId_P1ClientId(P1ID)).thenReturn(match);
        when(playerRepository.findByClientId(L1ID)).thenReturn(p1);

        //final Match res = facade.acceptMatch(P1ID, P2ID);

        verify(playerRepository).save(any());
        //assertThat(res.getId()).isEqualTo(match.getId());
    }

    /**
     * Test method for {@link Facade#acceptMatch(String, String)}
     */
    @Test
    public void acceptMatchRequestFromSecondPlayer(){
        final Match match = new Match(P1ANS,P2ANS,P1ID,P2ID);
        // when(matchRepository.findMatchByMatchId_P1ClientId(P1ID)).thenReturn(null);
        // when(matchRepository.findMatchByMatchId_P2ClientId(P1ID)).thenReturn(match);
        when(playerRepository.findByClientId(L1ID)).thenReturn(p1);

        //final  Match res = facade.acceptMatch(P1ID, P2ID);

        verify(playerRepository).save(any());
        //assertThat(res.getId()).isEqualTo(match.getId());
    }

    /**
     * Test method for {@link Facade#rejectMatchRequest(String, String)}
     */
    @Test
    public void rejetcMatchRequest(){
        when(playerRepository.findByClientId(L1ID)).thenReturn(p1);
        when(playerRepository.findByClientId(L2ID)).thenReturn(p2);
        final Match match = new Match(P1ANS,P2ANS,P1ID,P2ID);
        // when(matchRepository.findMatchByMatchId_P1ClientId(P1ID)).thenReturn(match);

        final String expected = p1.getName() + " has rejected your challenge.";
        //final String res = facade.rejectMatchRequest(P1ID, P2ID);

        verify(playerRepository).save(any());
        verify(matchRepository).delete(any());
        //assertThat(res).isEqualTo(expected);
    }

    /**
     * Test method for {@link Facade#getPlayer(String)}
     */
    @Test
    public void getPlayer(){
        when(playerRepository.findByClientId(L1ID)).thenReturn(p1);

        final Player res = facade.getPlayer(P1ID);

        assertThat(p1.getClientId()).isEqualTo(res.getClientId());
    }

    /**
     * Test method for {@link Facade#removePlayer(String)}
     */
    @Test
    public void removePlayer(){
        when(playerRepository.findByClientId(L1ID)).thenReturn(p1);

        assertThat(facade.removePlayer(P1ID));
        verify(playerRepository).delete(any());
    }

    /**
     * Test method for {@link Facade#getAllPlayers()}
     */
    @Test
    public void getAllPlayers(){
        List<Player> players = new ArrayList<Player>();
        players.add(p1);
        players.add(p2);
        when(playerRepository.findAll()).thenReturn(players);

        final List<Player> res = facade.getAllPlayers();
        assertThat(res.get(0).getClientId()).isEqualTo(p1.getClientId());
        assertThat(res.get(1).getClientId()).isEqualTo(p2.getClientId());
    }

    /**
     * Test method for {@link Facade#getAllHeroes()}
     */
    @Test
    public void getAllHeroes(){
        List<Hero> heroes = new ArrayList<Hero>();
        heroes.add(h1);
        when(heroRepository.findAll()).thenReturn(heroes);

        //final List<Hero> res = facade.getAllHeroes();
        //assertThat(res.get(0).getName()).isEqualTo(h1.getName());
        //assertThat(res.get(0).getType()).isEqualTo(h1.getType());
        //assertThat(res.get(0).getDescription()).isEqualTo(h1.getDescription());
        //assertThat(res.get(0).getDescription()).isEqualTo(h1.getDescription());
    }

    //TODO : Fix this (problem with accessing the hero in a heroRepository)
    /**
     * Test method for {@link Facade#chooseHero(String, String, String)}
     */
    @Test
    public void chooseHero(){
        when(playerRepository.findByClientId(L1ID)).thenReturn(p1);
        when(gameBoardRepository.findByP1ClientId(GBID)).thenReturn(gameBoard);
        when(heroRepository.findById(LHID)).thenReturn(Optional.of(h1));

        final GameBoard res = facade.chooseHero(P1ID,HID,GID);
    }


    /**
     * Test method for {@link Facade#getGameBoardByGameId(String)}
     */
    @Test
    public void getGameBoardByGameId(){
        when(gameBoardRepository.findByGameId(GBID)).thenReturn(gameBoard);
        final GameBoard res = facade.getGameBoardByGameId(GID);
        assertThat(gameBoard.getGameId()).isEqualTo(res.getGameId());
    }

    //TODO : Fix this (problem with accessing the hero in a heroRepository)
    public void getHeroByPlayerId(){
        when(playerRepository.findByClientId(L1ID)).thenReturn(p1);

    }

    /**
     * Test method for {@link Facade#initGame(String, String)}
     */
    @Test
    public void initGame(){
        when(gameBoardRepository.findByGameId(GBID)).thenReturn(gameBoard);
        final GameBoard res = facade.initGame(P1ID, GID);
        verify(gameBoardRepository).save(any());
        assertThat(gameBoard.getId()).isEqualTo(res.getId());
    }

    /**
     * Test method for {@link Facade#initGame(String, String)}
     */
    @Test
    public void initGameWhenAlreadyStarted(){
        gameBoard.setTurn(new Long("1"));
        when(gameBoardRepository.findByGameId(GBID)).thenReturn(gameBoard);
        final GameBoard res = facade.initGame(P1ID, GID);
        verify(gameBoardRepository,never()).save(any());
        assertThat(gameBoard.getId()).isEqualTo(res.getId());
    }
}
