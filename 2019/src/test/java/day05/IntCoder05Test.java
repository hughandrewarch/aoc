package day05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntCoder05Test {
    @Test
    void execute1() {
        List<Integer> input = Arrays.asList(1, 0, 0, 0, 99);
        List<Integer> expected = Arrays.asList(2, 0, 0, 0, 99);

        IntCoder05 intCoder = new IntCoder05(input);
        List<Integer> result = intCoder.execute();

        assertEquals(result, expected);
    }

    @Test
    void execute2() {
        List<Integer> input = Arrays.asList(2, 3, 0, 3, 99);
        List<Integer> expected = Arrays.asList(2, 3, 0, 6, 99);

        IntCoder05 intCoder = new IntCoder05(input);
        List<Integer> result = intCoder.execute();

        assertEquals(result, expected);
    }

    @Test
    void execute3() {
        List<Integer> input = Arrays.asList(2, 4, 4, 5, 99, 0);
        List<Integer> expected = Arrays.asList(2, 4, 4, 5, 99, 9801);

        IntCoder05 intCoder = new IntCoder05(input);
        List<Integer> result = intCoder.execute();

        assertEquals(result, expected);
    }

    @Test
    void execute4() {
        List<Integer> input = Arrays.asList(1, 1, 1, 4, 99, 5, 6, 0, 99);
        List<Integer> expected = Arrays.asList(30, 1, 1, 4, 2, 5, 6, 0, 99);

        IntCoder05 intCoder = new IntCoder05(input);
        List<Integer> result = intCoder.execute();

        assertEquals(result, expected);
    }

    @Test
    void execute_addition_in_full_immediate_mode() {
        List<Integer> input = Arrays.asList(1101, 34, 1200, 0, 99);
        List<Integer> expected = Arrays.asList(1234, 34, 1200, 0, 99);

        IntCoder05 intCoder = new IntCoder05(input);
        List<Integer> result = intCoder.execute();

        assertEquals(result, expected);
    }

    @Test
    void execute_addition_in_mixed_modes() {
        List<Integer> input = Arrays.asList(1001, 0, 1200, 0, 99);
        List<Integer> expected = Arrays.asList(2201, 0, 1200, 0, 99);

        IntCoder05 intCoder = new IntCoder05(input);
        List<Integer> result = intCoder.execute();

        assertEquals(result, expected);
    }

    @Test
    void execute_multiply_in_full_immediate_mode() {
        List<Integer> input = Arrays.asList(1102, 10, 123, 0, 99);
        List<Integer> expected = Arrays.asList(1230, 10, 123, 0, 99);

        IntCoder05 intCoder = new IntCoder05(input);
        List<Integer> result = intCoder.execute();

        assertEquals(result, expected);
    }

    @Test
    void execute_multiplication_in_mixed_modes() {
        List<Integer> input = Arrays.asList(1002, 0, 8, 0, 99);
        List<Integer> expected = Arrays.asList(8016, 0, 8, 0, 99);

        IntCoder05 intCoder = new IntCoder05(input);
        List<Integer> result = intCoder.execute();

        assertEquals(result, expected);
    }
}