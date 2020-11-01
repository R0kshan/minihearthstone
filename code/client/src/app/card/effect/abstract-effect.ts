
/**
 * Abstract class to effect
 */
export abstract class AbstractEffect {

    /**
     * Name of absract effect
     */
    name: string;

    /**
     * Set name
     * @param name name
     */
    public setName(name: string) {
        this.name = name;
    }

    /**
     * Get name
     */
    public getName(): string {
        return this.name;
    }

    /**
     * Abstract effect constructor
     */
    public AbstractEffect() { }

    /**
     * Apply card action effect
     * @param cardUniqueId  unique id of card performing the effect
     * @param clientId client id of player who owns the card
     * @param targetCardUniqueId  unique id of target card
     * @param targetCardEffectName name of target card's effect
     */
    public abstract applyPreActionEffect(
        cardUniqueId: string, clientId: number, targetCardUniqueId: string, targetCardEffectName: string): boolean;
}
