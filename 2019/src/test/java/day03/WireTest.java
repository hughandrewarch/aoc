package day03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WireTest {

    @Test
    void readInstructionU() {
        Wire wire = new Wire();

        wire.readInstruction("U3");

        assertEquals(wire.getXPoints(), Arrays.asList(0, 0, 0, 0));
        assertEquals(wire.getYPoints(), Arrays.asList(0, 1, 2, 3));
        assertEquals(wire.getSteps(), Arrays.asList(0, 1, 2, 3));
    }

    @Test
    void readInstructionR() {
        Wire wire = new Wire();

        wire.readInstruction("R3");

        assertEquals(wire.getXPoints(), Arrays.asList(0, 1, 2, 3));
        assertEquals(wire.getYPoints(), Arrays.asList(0, 0, 0, 0));
        assertEquals(wire.getSteps(), Arrays.asList(0, 1, 2, 3));
    }

    @Test
    void readInstructionD() {
        Wire wire = new Wire();

        wire.readInstruction("D3");

        assertEquals(wire.getXPoints(), Arrays.asList(0, 0, 0, 0));
        assertEquals(wire.getYPoints(), Arrays.asList(0, -1, -2, -3));
        assertEquals(wire.getSteps(), Arrays.asList(0, 1, 2, 3));
    }

    @Test
    void readInstructionL() {
        Wire wire = new Wire();

        wire.readInstruction("L3");

        assertEquals(wire.getXPoints(), Arrays.asList(0, -1, -2, -3));
        assertEquals(wire.getYPoints(), Arrays.asList(0, 0, 0, 0));
        assertEquals(wire.getSteps(), Arrays.asList(0, 1, 2, 3));
    }

    @Test
    void readInstructions() {
        Wire wire = new Wire();

        wire.readInstructions(Arrays.asList("L3", "U3"));

        assertEquals(wire.getXPoints(), Arrays.asList(0, -1, -2, -3, -3, -3, -3));
        assertEquals(wire.getYPoints(), Arrays.asList(0,  0,  0,  0,  1,  2,  3));
        assertEquals(wire.getSteps(),   Arrays.asList(0,  1,  2,  3,  4,  5,  6));
    }

    @Test
    void maxAndMin() {
        Wire wire = new Wire();

        wire.readInstructions(Arrays.asList("L3", "U3"));

        assertEquals(wire.getXMax(),0);
        assertEquals(wire.getXMin(),-3);
        assertEquals(wire.getYMax(),3);
        assertEquals(wire.getYMin(),0);
    }
}