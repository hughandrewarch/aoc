package day03;

import java.util.List;

public class CircuitBoard {

    private Wire wireA;
    private Wire wireB;
    int xMax = 0;
    int xMin = 0;
    int yMax = 0;
    int yMin = 0;

    CircuitBoard(List<String> commandsA, List<String> commandsB) {
        wireA = new Wire();
        wireA.readInstructions(commandsA);

        wireB = new Wire();
        wireB.readInstructions(commandsB);

        setMaxAndMin();
    }

    String process() {
        int width = xMax - xMin;
        int height = yMax - yMin;

        int[][] board = new int[width + 1][height + 1];

        for (int i = 0; i < wireA.getXPoints().size(); i++) {
            int x = wireA.getXPoints().get(i) - xMin;
            int y = wireA.getYPoints().get(i) - yMin;

            board[x][y] = wireA.getSteps().get(i);
        }

        int minDistance = Integer.MAX_VALUE;
        int minCircuitDistance = Integer.MAX_VALUE;
        for (int i = 0; i < wireB.getXPoints().size(); i++) {
            int x = wireB.getXPoints().get(i) - xMin;
            int y = wireB.getYPoints().get(i) - yMin;

            if (board[x][y] != 0) {
                int distance = Math.abs(x + xMin) + Math.abs(y + yMin);
                if (distance > 0) {
                    minDistance = Integer.min(minDistance, distance);
                }

                int circuitDistance = board[x][y] + wireB.getSteps().get(i);
                if (distance > 0) {
                    minCircuitDistance = Integer.min(minCircuitDistance, circuitDistance);
                }
            }
        }

        return "Min distance:  " + minDistance + "\nCirc distance: " + minCircuitDistance;
    }

    private void setMaxAndMin() {
        xMax = Math.max(wireA.getXMax(), wireB.getXMax());
        xMin = Math.min(wireA.getXMin(), wireB.getXMin());
        yMax = Math.max(wireA.getYMax(), wireB.getYMax());
        yMin = Math.min(wireA.getYMin(), wireB.getYMin());
    }
}
