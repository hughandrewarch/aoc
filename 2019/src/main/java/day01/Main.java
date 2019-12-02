package day01;

import util.MyReader;

import java.util.List;

public class Main {

    public static void main(String args[]) {
        String file = "src/main/resources/data/day01/input.txt";
        MyReader fileReader = new MyReader(file);
        List<Integer> data = fileReader.readInts();

        int calculatedSum = data.stream()
                .map(FuelCounter::calculate)
                .reduce(0, Integer::sum);

        System.out.println("Part A Sum: " + calculatedSum);

        int calculatedRecursiveSum = data.stream()
                .map(FuelCounter::calculateRecursive)
                .reduce(0, Integer::sum);

        System.out.println("Part B Sum: " + calculatedRecursiveSum);

    }
}
