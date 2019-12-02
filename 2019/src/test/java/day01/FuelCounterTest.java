package day01;

import org.junit.jupiter.api.Test;
import util.MyReader;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FuelCounterTest {

    @Test
    void calculate() {
        FuelCounter fuelCounter = new FuelCounter();

        assertEquals(fuelCounter.calculate(12), 2);
        assertEquals(fuelCounter.calculate(14), 2);
        assertEquals(fuelCounter.calculate(1969), 654);
        assertEquals(fuelCounter.calculate(100756), 33583);
    }

    @Test
    void calculateRecursive() {
        FuelCounter fuelCounter = new FuelCounter();

        assertEquals(fuelCounter.calculateRecursive(14), 2);
        assertEquals(fuelCounter.calculateRecursive(1969), 966);
        assertEquals(fuelCounter.calculateRecursive(100756), 50346);
    }
}