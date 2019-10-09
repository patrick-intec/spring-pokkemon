package be.infernalwhale.service.impl;

import be.infernalwhale.model.Pokkemon;
import be.infernalwhale.service.DustCalculatorService;
import be.infernalwhale.service.IVCalculatorService;
import be.infernalwhale.service.PokkemonCalculator;
import org.springframework.beans.factory.annotation.Autowired;

public class PokkemonCalculatorImpl implements PokkemonCalculator {
    @Autowired(required = false)
    private IVCalculatorService ivService;
    @Autowired(required = false)
    private DustCalculatorService dustService;

    @Override
    public Pokkemon parsePokkemon(Pokkemon pokkemon) {
        if (ivService != null) ivService.calculateIV(pokkemon);
        if (dustService != null) dustService.calculateDust(pokkemon);

        return pokkemon;
    }
}
