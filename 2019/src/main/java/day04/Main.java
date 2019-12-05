package day04;

public class Main {

    public static void main(String args[]) {

        int validCount = 0;
        for (int i = 156218; i <= 652527; i++) {
            if (Validator.validate(i)) {
                validCount++;
            }
        }
        System.out.println("Part A Valid: " + validCount);

        validCount = 0;
        for (int i = 156218; i <= 652527; i++) {
            if (Validator.validateNew(i)) {
                validCount++;
            }
        }
        System.out.println("Part B Valid: " + validCount);
    }
}
