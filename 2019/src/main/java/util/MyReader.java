package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//TODO separate into own module
public class MyReader {

    private String file;

    public MyReader(String file) {
        this.file = file;
    }

    public List<String> readLines() {

        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(this.file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

        return bufferedReader.lines()
                .collect(Collectors.toList());

    }

    public List<Integer> readLinesInt() {
        return toIntegers(readLines());
    }

    public List<String> readDelimited(String delimiter) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();

        }
        scanner.useDelimiter(delimiter);

        List<String> data = new ArrayList<>();

        while(scanner.hasNext()) {
            data.add(scanner.next());
        }

        return data;
    }

    public List<Integer> readDelimitedInt(String delimiter) {
        return toIntegers(readDelimited(delimiter));
    }

    private List<Integer> toIntegers(List<String> strings) {
        return strings.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
