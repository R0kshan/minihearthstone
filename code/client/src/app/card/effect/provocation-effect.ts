import { AbstractEffect } from './abstract-effect';

export class ProvocationEffect extends AbstractEffect {

    public ProvocationEffect() {
        this.name = 'ProvocationEffect';
    }

    public applyPreActionEffect(cardUniqueId: string, clientId: number, targetCardUniqueId: string, targetCardEffectName: string): boolean {

        console.log('ProvocationEffect -> Applying applyPreActionEffect() | ' +
            'source : ' + cardUniqueId +
            ' ; target card id : ' + targetCardUniqueId +
            ' ; target card effect : ' + targetCardEffectName);

        let response = true;

        // If the target card's id is not identical to this id, return false unless the target card also has provocation effect
        if (targetCardUniqueId !== '') {
            if (cardUniqueId !== targetCardUniqueId) {
                console.log('Current card id : ' + cardUniqueId + ' != ' + targetCardUniqueId);
                response = false;
            }
            if (targetCardEffectName === 'ProvocationEffect') {
                console.log('Target card also has ProvocationEffect');
                response = true;
            }
        } else {
            response = false;
        }
        return response;
    }
}
