package be.infernalwhale.service.impl;

import be.infernalwhale.model.Pokkemon;
import be.infernalwhale.model.PokkemonType;
import be.infernalwhale.service.IVCalculatorService;

public class IVCalculatorServiceImpl
                implements IVCalculatorService {

    @Override
    public Pokkemon calculateIV(Pokkemon pokkemon) {
        Integer sumBase = calcBaseSum(pokkemon.getType());
        Integer difference = pokkemon.getCombatPower() - sumBase;
        distributeValues(pokkemon, difference);

        return pokkemon;
    }

    private void distributeValues(Pokkemon pokkemon, Integer difference) {
        Integer increment = difference / 3;
        Integer leftOvers = difference % 3;

        pokkemon.setIVAttack(pokkemon.getType().getBaseAttack() +
                (leftOvers > 0 ? increment + 1 : increment));
        pokkemon.setIVDefense(pokkemon.getType().getBaseDefense() +
                (leftOvers > 1 ? increment + 1 : increment));
        pokkemon.setIVHitpoints(pokkemon.getType().getBaseHitpoints() +
                increment);

    }

    private Integer calcBaseSum(PokkemonType type) {
        return type.getBaseAttack() +
                type.getBaseDefense() +
                type.getBaseHitpoints();
    }
}
