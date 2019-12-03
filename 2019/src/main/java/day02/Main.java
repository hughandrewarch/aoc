package day02;

import util.MyReader;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String args[]) {
        String file = "src/main/resources/data/day02/input.txt";
        MyReader fileReader = new MyReader(file);
        List<Integer> data = fileReader.readDelimitedInt(",");

        IntCoder intCoder = new IntCoder(data, 12, 2);
        List<Integer> result = intCoder.execute();

        System.out.println("Part A Result: " + result.get(0));

        for(int noun = 0; noun < 100; noun++) {
            for(int verb = 0; verb < 100; verb++) {
                intCoder = new IntCoder(data, noun, verb);
                result = intCoder.execute();

                if(result.get(0) == 19690720) {
                    System.out.println("Part B Result: ("+ noun + ", " + verb + ")");
                    break;
                }
            }
        }

    }
}
