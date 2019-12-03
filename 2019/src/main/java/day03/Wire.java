package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wire {

    private int xPos = 0;
    private int yPos = 0;
    private int stepCount = 0;

    private int xMax = 0;
    private int xMin = 0;
    private int yMax = 0;
    private int yMin = 0;

    private List<Integer> x;
    private List<Integer> y;
    private List<Integer> steps;

    public Wire() {
        x = new ArrayList<>();
        x.add(xPos);
        y = new ArrayList<>();
        y.add(yPos);
        steps = new ArrayList<>();
        steps.add(stepCount++);
    }

    public void readInstruction(String command) {
        String direction = command.substring(0, 1);
        int magnitude = Integer.parseInt(command.substring(1));

        for (int i = 0; i < magnitude; i++) {
            switch (direction) {
                case "U":
                    yPos++;
                    break;
                case "R":
                    xPos++;
                    break;
                case "D":
                    yPos--;
                    break;
                case "L":
                    xPos--;
                    break;
                default:
                    return;
            }
            x.add(xPos);
            y.add(yPos);
            steps.add(stepCount++);
            xMax = Math.max(xMax, xPos);
            xMin = Math.min(xMin, xPos);
            yMax = Math.max(yMax, yPos);
            yMin = Math.min(yMin, yPos);
        }
    }

    public void readInstructions(List<String> commands) {
        for(String command: commands) {
            readInstruction(command);
        }
    }

    public List<Integer> getXPoints() {
        return x;
    }

    public List<Integer> getYPoints() {
        return y;
    }

    public List<Integer> getSteps() {
        return steps;
    }
    public int getXMax() {
        return xMax;
    }

    public int getXMin() {
        return xMin;
    }

    public int getYMax() {
        return yMax;
    }

    public int getYMin() {
        return yMin;
    }
}
