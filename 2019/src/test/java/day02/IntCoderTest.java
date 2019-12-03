package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntCoderTest {
    @Test
    void execute1() {
        List<Integer> input = Arrays.asList(1, 0, 0, 0, 99);
        List<Integer> expected = Arrays.asList(2,0,0,0,99);

        IntCoder intCoder = new IntCoder(input);
        List<Integer> result = intCoder.execute();

        assertEquals(result, expected);
    }

    @Test
    void execute2() {
        List<Integer> input = Arrays.asList(2, 3, 0, 3, 99);
        List<Integer> expected = Arrays.asList(2,3,0,6,99);

        IntCoder intCoder = new IntCoder(input);
        List<Integer> result = intCoder.execute();

        assertEquals(result, expected);
    }

    @Test
    void execute3() {
        List<Integer> input = Arrays.asList(2, 4, 4, 5, 99, 0);
        List<Integer> expected = Arrays.asList(2,4,4,5,99,9801);

        IntCoder intCoder = new IntCoder(input);
        List<Integer> result = intCoder.execute();

        assertEquals(result, expected);
    }

    @Test
    void execute4() {
        List<Integer> input = Arrays.asList(1, 1, 1, 4, 99, 5, 6, 0, 99);
        List<Integer> expected = Arrays.asList(30,1,1,4,2,5,6,0,99);

        IntCoder intCoder = new IntCoder(input);
        List<Integer> result = intCoder.execute();

        assertEquals(result, expected);
    }
}