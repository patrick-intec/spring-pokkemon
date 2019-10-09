package be.infernalwhale.service.impl;

import be.infernalwhale.model.Pokkemon;
import be.infernalwhale.model.Trainer;
import be.infernalwhale.service.DustCalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DustCalculatorServiceImplTest {
    private Pokkemon pokkemon;

    @BeforeEach
    void init() {
        pokkemon = new Pokkemon();
        pokkemon.setTrainer(new Trainer());
    }


    @ParameterizedTest
    @CsvSource({
            "1, 1, 100",
            "1, 2, 200",
            "1, 5, 650",
            "1, 9, 1650",
            "1, 10, 2650",
            "1, 19, 11650",
            "1, 20, 13150",
            "1, 21, 14650",
            "1, 25, 20650",
            "1, 29, 26650",
            "1, 30, 28650",
            "1, 39, 46650"
    })
    void testDustCalculation_Normal(int level, int levelTrainer, int dustNeeded) {
        pokkemon.setLevel(level);
        pokkemon.getTrainer().setLevel(levelTrainer);

        DustCalculatorService service = new DustCalculatorServiceImpl();
        service.calculateDust(pokkemon);

        assertEquals(dustNeeded, pokkemon.getDustToMaxLevel());
    }
}