import { GameBoard } from '../gameboard/gameboard';
import { AbstractEffect } from './effect/abstract-effect';
import { AbstractSpecificCard } from './abstract-specific-card';
import { ProvocationEffect } from './effect/provocation-effect';
import { ChargeEffect } from './effect/charge-effect';
import { LifeStealEffect } from './effect/lifesteal-effect';

export class Card {

    // PROPRITIES
    id: number;
    uniqueId: string;
    name: string;
    manacost: number;
    damage: number;
    lifepoints: number;
    defense: number;
    type: string;
    description: string;
    clientTooltip: string;
    nature: string;
    canAttack: boolean;
    gbP1HandOfCardsMapping: GameBoard;
    gbP2HandOfCardsMapping: GameBoard;
    gbP1CardsOnGroundMapping: GameBoard;
    gbP2CardsOnGroundMapping: GameBoard;
    effect: AbstractEffect;
    specificCard: AbstractSpecificCard;

    // CONSTRUCTOR
    /*
    constructor(
        id: number,
        uniqueId: string,
        name: string,
        manacost: number,
        damage: number,
        lifepoints: number,
        defense: number,
        type: string,
        description: string,
        nature: string,
        canAttack: boolean,
        gbP1HandOfCardsMapping: GameBoard,
        gbP2HandOfCardsMapping: GameBoard,
        gbP1CardsOnGroundMapping: GameBoard,
        gbP2CardsOnGroundMapping: GameBoard,
        effect: AbstractEffect,
        specifiedCard: AbstractSpecificCard) {

        this.id = id;
        this.uniqueId = uniqueId;
        this.name = name;
        this.manacost = manacost;
        this.damage = damage;
        this.lifepoints = lifepoints;
        this.defense = defense;
        this.type = type;
        this.description = description;
        this.nature = nature;
        this.canAttack = canAttack;
        this.gbP1HandOfCardsMapping = gbP1HandOfCardsMapping;
        this.gbP2HandOfCardsMapping = gbP2HandOfCardsMapping;
        this.gbP1CardsOnGroundMapping = gbP1CardsOnGroundMapping;
        this.gbP2CardsOnGroundMapping = gbP2CardsOnGroundMapping;
        this.effect = effect;

        // Instanciate effect
        console.log('Instanciating effect : ');
        console.log(this.effect);
        if (this.effect != null) {
            if (this.effect.name === 'ProvocationEffect') {
                this.effect = new ProvocationEffect();
            } else if (this.effect.name === 'ChargeEffect') {
                this.effect = new ChargeEffect();
            } else if (this.effect.name === 'LifeStealEffect') {
                this.effect = new LifeStealEffect();
            }
        }
        this.specificCard = specifiedCard;

    }*/

    public Card() {

    }

    // METHODS

    /**
     * Create exact copy of card passed in parameter
     * @param card card to be cloned
     */
    public clone(card: Card) {
        this.id = card.id;
        this.uniqueId = card.uniqueId;
        this.name = card.name;
        this.manacost = card.manacost;
        this.damage = card.damage;
        this.lifepoints = card.lifepoints;
        this.defense = card.defense;
        this.type = card.type;
        this.description = card.description;
        this.clientTooltip = card.clientTooltip;
        this.nature = card.nature;
        this.canAttack = card.canAttack;
        this.gbP1HandOfCardsMapping = card.gbP1HandOfCardsMapping;
        this.gbP2HandOfCardsMapping = card.gbP2HandOfCardsMapping;
        this.gbP1CardsOnGroundMapping = card.gbP1CardsOnGroundMapping;
        this.gbP2CardsOnGroundMapping = card.gbP2CardsOnGroundMapping;
        this.effect = card.effect;

        // Instanciate effect
        console.log('Instanciating effect : ');
        console.log(this.effect);
        if (card.effect != null) {
            if (this.effect.name === 'ProvocationEffect') {
                card.effect = new ProvocationEffect();
            } else if (this.effect.name === 'ChargeEffect') {
                card.effect = new ChargeEffect();
            } else if (this.effect.name === 'LifeStealEffect') {
                card.effect = new LifeStealEffect();
            }
        }
        this.specificCard = card.specificCard;
    }

    /**
     * Apply pre action effect
     * @param playerId client id of player who owns this card
     * @param targetCard target card
     */
    public applyPreActionEffect(playerId: number, targetCard: Card, targetCardEffectName: string) {

        let effect: AbstractEffect = null;
        // let effectName = '';
        let targetCardUniqueId = '';

        // Get target effect name
        if (targetCard != null) {
            /*if (targetCard.effect != null) {
                console.log('Target card effect : ' + JSON.stringify(targetCard.effect));
                effectName = targetCard.effect.getName();
                console.log('Target card effect name : ' + effectName);
            }*/
            if (targetCard.uniqueId != null) {
                targetCardUniqueId = targetCard.uniqueId;
            }
        }

        // Initiliaze this effect
        if (this.effect != null) {
            if (this.effect.name === 'ProvocationEffect') {
                effect = new ProvocationEffect();
            } else if (this.effect.name === 'ChargeEffect') {
                effect = new ChargeEffect();
            } else if (this.effect.name === 'LifeStealEffect') {
                effect = new LifeStealEffect();
            }
        }

        if (effect !== null) {
            return effect.applyPreActionEffect(this.uniqueId, playerId, targetCardUniqueId, targetCardEffectName);
        } else {
            console.log('Effect is equal to null');
            return true;
        }
    }

}
