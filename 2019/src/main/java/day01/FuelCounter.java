package day01;

public class FuelCounter {

    public static int calculate(int mass) {
        return (int) Math.floor(mass / 3.0) - 2;
    }

    public static int calculateRecursive(int mass) {

        int fuel = 0;
        int additionFuel = calculate(mass);

        while(additionFuel > 0) {
            fuel += additionFuel;
            additionFuel = calculate(additionFuel);
        }
        return fuel;
    }
}
