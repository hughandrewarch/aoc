package day05;

import util.MyReader;

import java.util.List;

public class Main {

    public static void main(String args[]) {
        String file = "src/main/resources/data/day05/input.txt";
        MyReader fileReader = new MyReader(file);
        List<Integer> data = fileReader.readDelimitedInt(",");

        IntCoder05 intCoder = new IntCoder05(data);
        List<Integer> result = intCoder.execute();

        System.out.println("Part A Result: " + result.get(0));
    }
}
