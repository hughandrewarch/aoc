package util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    public List<String> read() {

        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(this.file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ArrayList();
        }

        return bufferedReader.lines()
                .collect(Collectors.toList());

    }

    public List<Integer> readInts() {
        return read().stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
