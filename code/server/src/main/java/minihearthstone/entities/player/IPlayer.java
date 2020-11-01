package minihearthstone.entities.player;

/**
 * Player interface
 */
public interface IPlayer {

    /**
     * Get id
     * @return id
     */
    Long getId();

    /**
     * Get client id
     * @return client id
     */
    Long getClientId();

    /**
     * Get name
     * @return name
     */
    String getName();

    /**
     * Get status
     * @return status (ex: 'looking for match', 'in lobby' etc..)
     */
    String getStatus();

    /**
     * get hero id
     * @return hero id
     */
    Long getHeroId();

    /**
     * Get mana
     * @return mana
     */
    int getMana();

    /**
     * Set client id
     * @param clientId client id
      */
    void setClientId(Long clientId);

    /**
     * Set name
     * @param name name
     */
    void setName(String name);

    /**
     *
     * @param status
     */
    void setStatus(String status);

    /**
     * Set hero id
     * @param heroId hero id
     */
    void setHeroId(Long heroId);

    /**
     * Set mana
     * @param mana mana
     */
    void setMana(int mana);
   

}