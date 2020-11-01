import { Message } from "../message/message";


export interface Facade {

    // PROPERTIES GETTERS AND SETTERS


    // METHODS TO COMMUNICATE WITH SERVER

    /**
     * Send login player request to the server through ServerProxy
     * @param playername Player username
     */
    login(playername);

    /**
     * Send logout player request to the server through ServerProxy
     */
    logout();

    /**
     * Find a random match
     */
    findRandomMatch();

    /**
     * Send reject match request to the server through ServerProxy
     */
    rejectMatch();


    /**
     * Send get player request to the server through ServerProxy
     */
    getPlayerFromServer();

    /**
     * Send get all players request to the server through ServerProxy
     */
    getAllPlayers();

    /**
     * Send get all heroes request to the server through ServerProxy
     */
    getAllHeroes();

    /**
     * Send get first hand request to the server through ServerProxy
     */
    getFirstHandOfCards();

    /**
     * Send hero choice to the server through ServerProxy
     * @param heroId hero id number (stored in JPA)
     */
    chooseHero(heroId: number);

    /**
     * Send card choice to the server through ServerProxy
     * @param cardUniqueId card's unique id stored in JPA
     * @param cardNature indicates whether a card is a servant or a spell
     */
    chooseCard(cardUniqueId: string, cardNature: string);

    /**
     * Send end my turn (in game) to the server through ServerProxy
     */
    endMyTurn();

    /**
     * Send request to apply card's skill on a target servant to the server through ServerProxy
     * @param myCardUniqueId Propriety ''uniqueId' of selected servant card on ground stored in JPA
     * @param opponentCardUniqueId Propriety 'uniqueId' of selected opponent servant card on ground stored in JPA
     */
    applyCardOnTargetServant(myCardUniqueId: string, opponentCardUniqueId: string);

    /**
     * Send request to apply card's skill on the oppoent's hero to the server through ServerProxy
     * @param myCardUniqueId Propriety 'uniqueId' of selected servant card on ground stored in JPA
     */
    applyCardOnTargetHero(myCardUniqueId: string);

    /**
     * Send request to apply my hero's special skill on a target servant to the server through ServerProxy
     * @param opponentServantUniqueId  Propriety 'uniqueId' of selected opponent servant card on ground stored in JPA
     */
    applyHeroSpecialOnServant(opponentServantUniqueId: string);

    /**
     * Send request to apply my hero's special skill on the opponen't hero to the server through ServerProxy
     */
    applyHeroSpecialOnHero();

    /**
     * Send request to apply card's spell on a target opponent servant to the server through ServerProxy
     * @param myTargetSpellCardUniqueId Propriety 'uniqueId' of selected servant card on ground stored in JPA
     * @param opponentCardUniqueId Propriety 'uniqueId' of selected opponent servant card on ground stored in JPA
     */
    applySpellCardOnServant(myTargetSpellCardUniqueId: string, opponentCardUniqueId: string);

    /**
     * Send request to apply card's spell on a one of my servants on ground to the server through ServerProxy
     * @param myTargetSpellCardUniqueId Propriety 'uniqueId' of selected servant card on ground stored in JPA
     * @param opponentCardUniqueId Propriety 'uniqueId' of selected opponent servant card on ground stored in JPA
     */
    applySpellCardOnFriendlyServant(myTargetSpellCardUniqueId: string, opponentCardUniqueId: string);

    /**
     * Send request to apply card's spell on opponent's hero to the server through ServerProxy
     * @param myTargetSpellCardUniqueId Propriety 'uniqueId' of selected servant card on ground stored in JPA
     */
    applySpellCardOnHero(myTargetSpellCardUniqueId: string);

    /**
     * Send request to apply hero's special skill on self
     */
    useHeroSpecial();

    /**
     * Send a message to the other player
     * @param message message content
     */
    sendMessage(message: string);

    /**
     * Check whether the client has received a message from the other player
     */
    gotMessageReception();

    /**
     * Indicate whether a message has been received or not
     * @param bool indicates whether or not a message has been received
     */
    setMessageReception(bool: boolean);

    /**
     * Get the received message
     */
    getReceivedMessage(): Message;

    /**
     * Send quit game request to server
     */
    quitGame();

    /**
     * Play sound when choose a servant card
     */
    playChooseServantCardSound();

    /**
     * Play sound when choosing spell card
     */
    playChooseSpellCardSound();

    /**
     * Play victorious tune when player wins
     */
    playVictorySound();

    /**
     * Play sound of defeat when play looses
     */
    playDefeatSound();

    /**
     * Play sound when modal appears
     */
    playModalAppearSound();

    /**
     * Play sound when hoevery selected objects
     */
    playHoverOrSelectSound();

    /**
     * Play the synthethic voice to explain how the card works
     * @param cardName name of the card to be explained
     */
    playCardInfo(cardName: string);

    /**
     * Play the information exlaining how to use a servant card on the fighting ground
     */
    playServantCardInfo();

    /**
     * Play gameboard's the background music
     */
    playGameBoardBackgroundMusic();

    /**
     * Stop the gameboard's background music
     */
    stopGameBoardBackgroundMusic();

    /**
     * Play damage sound
     */
    playDamageSound();

    /**
     * Play sound when receive a new message from other player in the chatbox
     */
    playNewMessageSound();

}
