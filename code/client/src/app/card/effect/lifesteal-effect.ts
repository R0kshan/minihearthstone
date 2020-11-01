import { AbstractEffect } from './abstract-effect';

export class LifeStealEffect extends AbstractEffect {

    public LifeStealEffect() {
        this.name = 'LifeStealEffect';
    }

    public applyPreActionEffect(cardUniqueId: string, clientId: number, targetCardUniqueId: string, targetCardEffectName: string): boolean {
        console.log('LifeStealEffect -> Applying applyInActionPreCondEffect() | return true');
        return true;
    }
}
