package day02;

import java.util.ArrayList;
import java.util.List;

public class IntCoder {

    private List<Integer> memory;

    public IntCoder(List<Integer> initialState) {
        this(initialState, initialState.get(1), initialState.get(2));
    }

    public IntCoder(List<Integer> initialState, int noun, int verb) {
        memory = new ArrayList(initialState);
        memory.set(1, noun);
        memory.set(2, verb);
    }

    public List<Integer> execute() {

        for (int i = 0; i < memory.size(); i += 4) {
            int operation = memory.get(i);
            if (operation == 99) {
                break;
            }

            int op1 = memory.get(i + 1);
            int op2 = memory.get(i + 2);
            int destination = memory.get(i + 3);

            int newValue;
            switch (memory.get(i)) {
                case 1:
                    newValue = memory.get(op1) + memory.get(op2);
                    memory.set(destination, newValue);
                    break;
                case 2:
                    newValue = memory.get(op1) * memory.get(op2);
                    memory.set(destination, newValue);
                    break;
            }
        }

        return memory;
    }
}
