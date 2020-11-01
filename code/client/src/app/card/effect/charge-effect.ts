import { AbstractEffect } from './abstract-effect';

export class ChargeEffect extends AbstractEffect {

    public ChargeEffect() {
        this.name = 'ChargeEffect';
    }

    public applyPreActionEffect(cardUniqueId: string, clientId: number, targetCardUniqueId: string, targetCardEffectName: string): boolean {
        console.log('ChargeEffect -> Applying applyInActionPreCondEffect() | return true');
        return true;
    }
}
