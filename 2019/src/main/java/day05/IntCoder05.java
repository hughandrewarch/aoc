package day05;

import java.util.ArrayList;
import java.util.List;

public class IntCoder05 {

    private List<Integer> memory;

    public IntCoder05(List<Integer> initialState) {
        this(initialState, initialState.get(1), initialState.get(2));
    }

    IntCoder05(List<Integer> initialState, int noun, int verb) {
        memory = new ArrayList(initialState);
        memory.set(1, noun);
        memory.set(2, verb);
    }

    private int[] processCommand(int command) {
        int partialCommand = command;
        int[] result = new int[4];
        result[3] = partialCommand % 100;
        partialCommand /= 100;
        result[2] = partialCommand % 10;
        partialCommand /= 10;
        result[1] = partialCommand % 10;
        partialCommand /= 10;
        result[0] = partialCommand % 10;

        return result;
    }

    private int getValue(int parameter, int mode) {

        switch (mode) {
            case 1:
                return parameter;
            case 0:
            default:
                return memory.get(parameter);

        }
    }

    List<Integer> execute() {

        int pos = 0;
        System.out.println("START---------------");
        while (pos < memory.size()) {
            int[] operation = processCommand(memory.get(pos));

            if (operation[3] == 99) {
                break;
            } else if (operation[3] == 1 ||
                    operation[3] == 2 ||
                    operation[3] == 7 ||
                    operation[3] == 8) {
                int op1 = getValue(memory.get(pos + 1), operation[2]);
                int op2 = getValue(memory.get(pos + 2), operation[1]);

                int destination = memory.get(pos + 3);

                int newValue;
                switch (operation[3]) {
                    case 1:
                        newValue = op1 + op2;
                        memory.set(destination, newValue);
                        break;
                    case 2:
                        newValue = op1 * op2;
                        memory.set(destination, newValue);
                        break;
                    case 7:
                        if (op1 < op2) {
                            memory.set(destination, 1);
                        } else {
                            memory.set(destination, 0);
                        }
                        break;
                    case 8:
                        if (op1 == op2) {
                            memory.set(destination, 1);
                        } else {
                            memory.set(destination, 0);
                        }
                        break;
                }
                pos += 4;
            } else if (operation[3] == 3 || operation[3] == 4) {
                switch (operation[3]) {
                    case 3:
                        //TODO actually take input
                        memory.set(memory.get(pos + 1), 5);
                        break;
                    case 4:
                        System.out.print(memory.get(memory.get(pos + 1)) + " ");
                        break;
                }
                pos += 2;
            } else if (operation[3] == 5 || operation[3] == 6) {
                int condition = getValue(memory.get(pos + 1), operation[2]);
                int destination = getValue(memory.get(pos + 2), operation[1]);

                switch (operation[3]) {
                    case 5:
                        if (condition != 0) {
                            pos = destination;
                        } else {
                            pos += 3;
                        }
                        break;
                    case 6:
                        if (condition == 0) {
                            pos = destination;
                        } else {
                            pos += 3;
                        }
                        break;
                }
            }

        }
        System.out.println();
        return memory;
    }
}
