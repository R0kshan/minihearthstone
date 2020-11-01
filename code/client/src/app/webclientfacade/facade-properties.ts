
import { Player } from '../player/player';
import { Hero } from '../hero/hero';
import { Card } from '../card/card';
import { GameBoard } from '../gameboard/gameboard';
import { Message } from '../message/message';

// Current game state
export let state: String;

// Used before game (in dashboard and lobby)
export let player: Player;
export let playerOpponent: Player;
export let gameId: String;
export let heroes: Hero[];
export let hero: Hero;
export let opponentHero: Hero;

// Used  once game has started, mainly used in dashboard.component.ts
export let gameBoard: GameBoard = new GameBoard();
export let reception = false;

// Reception of requests
export let lastRequestSentToOther = '';
export let acknowlegmentOfReceipt = true;

// Messages
export let msgReception = false;
export let receivedMessage: Message;


// Music
export let gameBoardBgMusic = new Audio();
gameBoardBgMusic.src = '../../../assets/audio/background/Atoms and Particles.mp3';
gameBoardBgMusic.onloadeddata = function () {
    gameBoardBgMusic.loop = true;
    gameBoardBgMusic.volume = 0.3;
};

export let voiceIsPlaying = false;

export function getState(): String {
    return state;
}

export function getGameBoard(): GameBoard {
    return gameBoard;
}

export function getHeroes(): Hero[] {
    return heroes;
}

export function getReception(): boolean {
    return reception;
}

export function getReceivedMessage(): Message {
    return receivedMessage;
}

export function getLastRequestSentToOther(): string {
    return lastRequestSentToOther;
}

export function getAckknowlegmentOfReceipt(): boolean {
    return acknowlegmentOfReceipt;
}

export function setState(newState: String) {
    state = newState;
}

export function setPlayer(newPlayer: Player) {
    player = newPlayer;
}

export function setOpponentHero(newHero: Hero) {
    opponentHero = newHero;
}

export function setHero(newHero: Hero) {
    hero = newHero;
}

export function setHeroes(newHeroes: Hero[]) {
    heroes = newHeroes;
}

export function setPlayerOpponent(newPlayerOpponent: Player) {
    playerOpponent = newPlayerOpponent;
}

export function setGameId(newGameId: String) {
    gameId = newGameId;
}

export function setReception(newReception: boolean) {
    reception = newReception;
}

export function setGameBoard(newGameBoard: GameBoard) {
    gameBoard = newGameBoard;
}

export function setMsgReception(bool: boolean) {
    msgReception = bool;
}

export function setReceivedMessage(newMessage: Message) {
    receivedMessage = newMessage;
}

export function setLastRequestSentToOther(requestUrl: string) {
    lastRequestSentToOther = requestUrl;
}

export function setAcknowlegmentOfReceipt(ack: boolean) {
    acknowlegmentOfReceipt = ack;
}

export function getHandOfCards(playerId: number): Card[] {
    if (playerId === gameBoard.p1ClientId) {
        return gameBoard.p1HandOfCards;
    } else if (playerId === gameBoard.p2ClientId) {
        return gameBoard.p2HandOfCards;
    }
}

export function getCardsOnGround(playerId: number): Card[] {
    if (playerId === gameBoard.p1ClientId) {
        return gameBoard.p1CardsOnGround;
    } else if (playerId === gameBoard.p2ClientId) {
        return gameBoard.p2CardsOnGround;
    }
}

export function getOpponentCardsOnGround(playerId: number) {
    if (playerId === gameBoard.p1ClientId) {
        return gameBoard.p2CardsOnGround;
    } else if (playerId === gameBoard.p2ClientId) {
        return gameBoard.p1CardsOnGround;
    }
}

export function getTurn(): number {
    return gameBoard.turn;
}

export function getPlayer(playerId: number): Player {
    if (gameBoard.players[0].clientId === playerId) {
        return gameBoard.players[0] as Player;
    } else {
        return gameBoard.players[1] as Player;
    }
}

export function getPlayerOpponent(playerId: number): Player {
    if (gameBoard.players.length <= 2) {
        if (gameBoard.players[0].clientId === playerId) {
            return gameBoard.players[1];
        } else if (gameBoard.players[1].clientId === playerId) {
            return gameBoard.players[0];
        }
    }
    return null;
}

export function getHero(playerId: number): Hero {

    let currentPlayer: Player = null;

    if (gameBoard.players[0].clientId === playerId) {
        currentPlayer = gameBoard.players[0] as Player;
    } else {
        currentPlayer = gameBoard.players[1] as Player;
    }

    // console.log('getHero :  ' + JSON.stringify(gameBoard.heroes));
    // console.log('player.heroUniqueId : ' + currentPlayer.heroUniqueId);

    if (gameBoard.heroes[0].uniqueId === currentPlayer.heroUniqueId) {
        return gameBoard.heroes[0];
    } else {
        return gameBoard.heroes[1];
    }
}

export function getOpponentHero(playerId: number): Hero {

    let opponentPlayer: Player = null;

    if (gameBoard.players[0].clientId === playerId) {
        opponentPlayer = gameBoard.players[1] as Player;
    } else {
        opponentPlayer = gameBoard.players[0] as Player;
    }

    // console.log('getOpponentHero :  ' + JSON.stringify(gameBoard.heroes));
    // console.log('player.heroUniqueId : ' + opponentPlayer.heroUniqueId);

    if (gameBoard.heroes[0].uniqueId === opponentPlayer.heroUniqueId) {
        return gameBoard.heroes[0];
    } else {
        return gameBoard.heroes[1];
    }
}

export function getMsgReception(): boolean {
    return msgReception;
}

export function setHandOfCards(playerId: number, handOfCards: Card[]) {
    if (playerId === gameBoard.p1ClientId) {
        gameBoard.p1HandOfCards = handOfCards;
    } else if (playerId === gameBoard.p2ClientId) {
        gameBoard.p2HandOfCards = handOfCards;
    }
}

export function performPreActionPlayerCardEffects(playerId: number, targetCard: Card, targetCardEffectName: string): boolean {

    console.log('proptertis.performPreActionPlayerCardEffects() on target : ' + JSON.stringify(targetCard));

    let effectResponse = true;

    // Get opponent player's cards on ground
    let cardsOnGround: Card[] = [];
    if (playerId === gameBoard.p1ClientId) {
        cardsOnGround = gameBoard.p2CardsOnGround;
    } else if (playerId === gameBoard.p2ClientId) {
        cardsOnGround = gameBoard.p1CardsOnGround;
    }

    // Stop when found a card, whose's effect answers false
    let index = 0;
    while (index < cardsOnGround.length) {

        const currentCard: Card = new Card();
        currentCard.clone(cardsOnGround[index]);

        console.log('current Card: ' + JSON.stringify(currentCard));
        console.log('target Card: ' + JSON.stringify(targetCard));

        // If card's pre-action effect return false, then set effectResponse to false;
        const bool = currentCard.applyPreActionEffect(playerId, targetCard, targetCardEffectName);
        if (!bool) {
            console.log('card pre action effect returns : ' + bool);
            effectResponse = false;
            break;
        }
        index++;
    }
    return effectResponse;
}

export function getWinner(): number {
    return gameBoard.winner;
}

export function getHeroAttacked(): string {
    return gameBoard.heroAttacked;
}

export function getAttackedServants(): string[] {
    let attackedServants: string[] = gameBoard.attackedServants.split(';');
    attackedServants = attackedServants.filter(obj => obj !== '');
    attackedServants = attackedServants.filter(obj => obj !== ' ');
    console.log('Contents of attacked servants : ' + JSON.stringify(attackedServants));
    return attackedServants;
}

export function resetAllProperties() {
    state = null;
    playerOpponent = null;
    gameId = null;
    heroes = null;
    hero = null;
    opponentHero = null;
    gameBoard = null;
    reception = false;
}

// SOUND METHODS :

export function playChooseServantCardSound() {
    const audio = new Audio();
    audio.src = '../../../assets/audio/choose_servant_card.wav';
    audio.load();
    audio.play();
}

export function playChooseSpellCardSound() {
    const audio = new Audio();
    audio.src = '../../../assets/audio/choose_spell_card.wav';
    audio.load();
    audio.play();
}

export function playVictorySound() {
    const audio = new Audio();
    audio.src = '../../../assets/audio/victory.wav';
    audio.load();

    audio.onloadeddata = function () {
        gameBoardBgMusic.pause();
        audio.play();

        setTimeout(function () {
            gameBoardBgMusic.play();
        }, audio.duration * 1000);
    };
}

export function playDefeatSound() {
    const audio = new Audio();
    audio.src = '../../../assets/audio/defeat.wav';
    audio.load();
    audio.onloadeddata = function () {
        gameBoardBgMusic.pause();
        audio.play();

        setTimeout(function () {
            gameBoardBgMusic.play();
        }, audio.duration * 1000);
    };
}

export function playModalAppearSound() {
    const audio = new Audio();
    audio.src = '../../../assets/audio/modal_appear.mp3';
    audio.load();
    audio.play();
}

export function playHoverOrSelectSound() {
    const audio = new Audio();
    audio.src = '../../../assets/audio/hover_or_select.wav';
    audio.load();
    audio.play();
}

export function playCardInfo(cardName: string) {
    const audio = new Audio();
    audio.src = '../../../assets/audio/card-info-reader/' + cardName + '.mp3';
    audio.load();

    audio.onloadeddata = function () {
        if (!voiceIsPlaying) {
            audio.play();
            voiceIsPlaying = true;
            setTimeout(function () {
                voiceIsPlaying = false;
            }, audio.duration * 1000);
        }
    };
}

export function playServantCardInfo() {
    const audio = new Audio();
    audio.src = '../../../assets/audio/card-info-reader/servant_tooltip.mp3';
    audio.load();
    audio.onloadeddata = function () {
        if (!voiceIsPlaying) {
            audio.play();
            voiceIsPlaying = true;
            setTimeout(function () {
                voiceIsPlaying = false;
            }, audio.duration * 1000);
        }
    };
}

export function playGameBoardBackgroundMusic() {
    gameBoardBgMusic.play();
    console.log('Background muisic volule : ' + gameBoardBgMusic.volume);
}

export function stopGameBoardBackgroundMusic() {
    gameBoardBgMusic.pause();
}

export function playDamageSound() {
    const audio = new Audio();
    audio.src = '../../../assets/audio/damage.wav';
    audio.load();
    audio.play();
}

export function playNewMessageSound() {
    const audio = new Audio();
    audio.src = '../../../assets/audio/chat_bip.mp3';
    audio.load();
    audio.play();
}
