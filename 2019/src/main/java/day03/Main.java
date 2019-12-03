package day03;

import util.MyReader;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        String file = "src/main/resources/data/day03/input.txt";
        MyReader fileReader = new MyReader(file);
        List<String> data = fileReader.readLines();

        List<String> wireA = Arrays.asList(data.get(0).split("\\s*,\\s*"));
        List<String> wireB = Arrays.asList(data.get(1).split("\\s*,\\s*"));

        CircuitBoard circuitBoard = new CircuitBoard(wireA, wireB);

        String result = circuitBoard.process();

        System.out.println("Part A Result: " + result);
    }
}
