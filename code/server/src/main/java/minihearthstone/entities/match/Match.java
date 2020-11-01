package minihearthstone.entities.match;

// Spring and java imports
import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
public class Match implements IMatch {
    /*
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // used for gameId in client side

    @EmbeddedId
    private MatchId matchId;*/

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String p1ClientId;
    private String p2ClientId;

    private String p1Answer;
    private String p2Answer;


    public Match() {

    }

    public Match(String p1ClientId) {
        this.id = Long.parseLong(p1ClientId);
        this.p1ClientId = p1ClientId;
    }

    public Match(String p1Answer, String p2Answer, String p1ClientId, String p2ClientId) {
        this.id = System.currentTimeMillis(); // temporary
        this.p1Answer = p1Answer;
        this.p2Answer = p2Answer;
        //this.matchId = new MatchId(p1ClientId, p2ClientId);
        //this.matchId = new MatchId(p1ClientId, p2ClientId);


    }
/*
    @Override
    public String toString() {
        return "{ id : " + this.id + ", p1ClientId : " + this.getMatchId().getP1ClientId() +
        ", p2ClientId : " + this.getMatchId().getP2ClientId() + ", p1Answer : " + this.p1Answer + ", p2Answer : " +
        this.p2Answer + "}";
    }*/

    @Override
    public String toString() {
        return "{ id : " + this.id + ", p1ClientId : " + this.p1ClientId+
                ", p2ClientId : " + this.p2ClientId + ", p1Answer : " + this.p1Answer + ", p2Answer : " +
                this.p2Answer + "}";
    }

    // GETTERS
    public Long getId() {
        return this.id;
    }
/*
    public MatchId getMatchId() {
        return matchId;
    }

    public String getP1ClientId() {
        return this.matchId.getP1ClientId();
    }

    public String getP2ClientId() {
        return this.matchId.getP2ClientId();
    }


    public void setMatchId(MatchId matchid) {
        this.matchId = matchid;
    }
*/
    public String getP1Answer() {
        return this.p1Answer;
    }

    public String getP2Answer() {
        return this.p2Answer;
    }

    public String getP1ClientId() {
        return this.p1ClientId;
    }

    public String getP2ClientId() {
        return p2ClientId;
    }

    // SETTERS

    public void setP1Answer(String p1Answer) {
        this.p1Answer = p1Answer;
    }

    public void setP2Answer(String p2Answer) {
        this.p2Answer = p2Answer;
    }

    @Override
    public void setAnswer(String playerClientId, String answer) {

    }

    public void setP1ClientId(String p1ClientId) {
        this.p1ClientId = p1ClientId;
    }

    public void setP2ClientId(String p2ClientId) {
        this.p2ClientId = p2ClientId;
    }
/*
    public void setP1ClientId(String p1ClientId) {
        this.matchId.setP1ClientId(p1ClientId);
    }

    public void setP2ClientId(String p2ClientId) {
        this.matchId.setP2ClientId(p2ClientId);
    }*/
/*
    // METHODS
    public void setAnswer(String playerClientId, String answer) {
        
        // if (playerClientId.equals(p1ClientId)) {
        if (playerClientId.equals(this.matchId.getP1ClientId())) {
            this.p1Answer = answer;
        }
        else if (playerClientId.equals(this.matchId.getP2ClientId())) {
            this.p2Answer = answer;
        }
    }
*/
}
