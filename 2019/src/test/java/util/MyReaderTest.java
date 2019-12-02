package util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MyReaderTest {

    @Test
    void readStringLines() {
        String file = "src/test/resources/data/ints.txt";

        MyReader reader = new MyReader(file);
        List<String> readStrings = reader.readLines();

        assertEquals(readStrings.size(), 4);
        assertEquals(readStrings.get(0), "1");
        assertEquals(readStrings.get(1), "2");
        assertEquals(readStrings.get(2), "3");
        assertEquals(readStrings.get(3), "999");
    }

    @Test
    void readIntLines() {
        String file = "src/test/resources/data/ints.txt";

        MyReader reader = new MyReader(file);
        List<Integer> readInts = reader.readLinesInt();

        assertEquals(readInts.size(), 4);
        assertEquals(readInts.get(0), 1);
        assertEquals(readInts.get(1), 2);
        assertEquals(readInts.get(2), 3);
        assertEquals(readInts.get(3), 999);
    }

    @Test
    void readDelimited() {
        String file = "src/test/resources/data/commaSeparated.txt";

        MyReader reader = new MyReader(file);
        List<String> read = reader.readDelimited(",");

        assertEquals(read.size(), 12);

        assertEquals(read.get(0), "1");
        assertEquals(read.get(11), "50");
    }

    @Test
    void readDelimitedInts() {
        String file = "src/test/resources/data/commaSeparated.txt";

        MyReader reader = new MyReader(file);
        List<Integer> read = reader.readDelimitedInt(",");

        assertEquals(read.size(), 12);

        assertEquals(read.get(0), 1);
        assertEquals(read.get(11), 50);
    }
}