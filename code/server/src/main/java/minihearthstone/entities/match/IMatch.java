package minihearthstone.entities.match;

/**
 * Match interface
 */
public interface IMatch {

    // GETTERS
    /**
     * Get id
     * @return id
     */
    Long getId();

    // MatchId getMatchId();

    /**
     * Get p1 answer
     * @return p1 answer (accept or reject match)
     */
    String getP1Answer();

    /**
     * Get p2 answer
     * @return p2 answer (accept or reject match)
     */
    String getP2Answer();

    /*
    String getP1ClientId();

    String getP2ClientId();*/

    // SETTERS
    /**
     * Set p1 answer accept or reject match)
     * @param p1Answer answer
     */
    void setP1Answer(String p1Answer);

    /**
     * Set p2 answer accept or reject match)
     * @param p2Answer answer
     */
    void setP2Answer(String p2Answer);

    /*
    void setP1ClientId(String p1ClientId);
    void setP2ClientId(String p2ClientId);*/

    /**
     * Set player's answer
     * @param playerClientId player answering
     * @param answer player's answer
     */
    void setAnswer(String playerClientId, String answer);

}