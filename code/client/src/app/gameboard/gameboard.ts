import { Card } from '../card/card';
import { Player } from '../player/player';
import { Hero } from '../hero/hero';

/**
 * GameBoard component class
 */
export class GameBoard {

    /**
     * id number
     */
    id: number;

    /**
     * Game id
     */
    gameId: number;

    /**
     * Player 1 client id
     */
    p1ClientId: number;

    /**
     * Player 2 client id
     */
    p2ClientId: number;

    /**
     * Contains the client id of the player who has his turn to play
     */
    turn: number;

    /**
     * Client id of player who won the game
     */
    winner: number;

    /**
     * List of players (max 2)
     */
    players: Player[] = [];

    /**
     * List of player's heores (max 2)
     */
    heroes: Hero[] = [];

    /**
     * List of player 1 hand of cards
     */
    p1HandOfCards: Card[] = [];

    /**
     * List of player 2 hand of cards
     */
    p2HandOfCards: Card[] = [];

    /**
     * List of player 1 cards on ground
     */
    p1CardsOnGround: Card[] = [];

    /**
     * List of player 2 cards on ground
     */
    p2CardsOnGround: Card[] = [];

    /**
     * Boolean indicating whether the hero has been attacked or not
     */
    heroAttacked: string;

    /**
     * List of unique ids of attacked servants
     */
    attackedServants: string;

    /**
     * Default constructor
     */
    public GameBoard() {
    }

    /**
     * Get player1
     */
    public getPlayer1(): Player {
        if (this.players.length >= 1) {
            return this.players[0];
        } else {
            return null;
        }
    }

    /**
     * Get player 2
     */
    public getPlayer2(): Player {
        if (this.players.length >= 2) {
            return this.players[1];
        } else {
            return null;
        }
    }

    /**
     * Get player by client id
     * @param playerId player's client id
     */
    public getPlayer(playerId: number): Player {
        if (this.getPlayer1().clientId === playerId) {
            return this.getPlayer1();
        } else if (this.getPlayer2().clientId === playerId) {
            return this.getPlayer2();
        }
    }

    /**
     * Get oppponent player by this player's client id
     * @param playerId this player's client id
     */
    public getOpponentPlayer(playerId: number): Player {
        if (this.getPlayer1().clientId === playerId) {
            return this.getPlayer2();
        } else if (this.getPlayer2().clientId === playerId) {
            return this.getPlayer1();
        }
    }

    /**
     * Returns the boolean indicating whether the hero has been attacked or not
     */
    public getHeroAttacked(): string {
        return this.heroAttacked;
    }

    /**
     * Get the list of unique ids of the servants being attacked
     */
    public getAttackedServants(): string {
        return this.attackedServants;
    }

    /**
     * Find cards on ground by unique id
     * @param clientId player's client id
     * @param uniqueId card's unique id
     */
    public findCardOnGroundByUniqueId(clientId: number, uniqueId: string) {
        let cardOnGround: Card = null;

        console.log('P1 : ' + this.getPlayer1().clientId);
        console.log('P2 : ' + this.getPlayer2().clientId);

        if (this.getPlayer1().clientId === clientId) {

            console.log('findCardOnGroundByUniqueId in p1: ');

            if (this.p1CardsOnGround.length !== 0) {
                let index = 0;
                while (index < this.p1CardsOnGround.length) {
                    console.log('uniqueId : ' + uniqueId + ' | current : ' + this.p1CardsOnGround[index].uniqueId);
                    if (this.p1CardsOnGround[index].uniqueId === uniqueId) {
                        cardOnGround = this.p1CardsOnGround[index];
                        break;
                    }
                    index++;
                }
            } else {
                console.log('p1CardsOnGround is empty');
            }
        } else if (this.getPlayer2().clientId === clientId) {
            console.log('findCardOnGroundByUniqueId in p1: ');

            if (this.p2CardsOnGround.length !== 0) {
                let index = 0;
                while (index < this.p2CardsOnGround.length) {
                    console.log('uniqueId : ' + uniqueId + ' | current : ' + this.p1CardsOnGround[index].uniqueId);
                    if (this.p2CardsOnGround[index].uniqueId === uniqueId) {
                        cardOnGround = this.p2CardsOnGround[index];
                        break;
                    }
                    index++;
                }
            } else {
                console.log('p2CardsOnGround is empty');
            }
        }
        console.log('findCardOnGroundByUniqueId() -> ' + cardOnGround);

        return cardOnGround;
    }

}
