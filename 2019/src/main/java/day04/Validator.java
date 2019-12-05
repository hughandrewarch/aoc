package day04;

public class Validator {

    public static boolean validate(String password) {

        if(password.length() != 6) {
            return false;
        }



        return false;
    }

    public static boolean validate(int password) {

        if(password <= 99999 || 999999 < password ) {
            return false;
        }

        int[] passwordDeconstructed = new int[6];

        int passwordLooped = password;
        boolean hasDouble = false;
        for(int i = 5; i >= 0; i--) {
            passwordDeconstructed[i] = passwordLooped % 10;
            passwordLooped = (passwordLooped - passwordDeconstructed[i]) / 10;

            if(i != 5) {
                if(passwordDeconstructed[i] > passwordDeconstructed[i+1]) {
                    return false;
                }
                hasDouble = hasDouble || (passwordDeconstructed[i] == passwordDeconstructed[i+1]);
            }
        }

        return hasDouble;
    }

    public static boolean validateNew(int password) {

        if(password <= 99999 || 999999 < password ) {
            return false;
        }

        int[] passwordDeconstructed = new int[6];

        int passwordLooped = password;
        boolean hasDouble = false;
        int duplicateCount = 1;
        for(int i = 5; i >= 0; i--) {
            passwordDeconstructed[i] = passwordLooped % 10;
            passwordLooped = (passwordLooped - passwordDeconstructed[i]) / 10;

            if(i != 5) {
                if(passwordDeconstructed[i] > passwordDeconstructed[i+1]) {
                    return false;
                }

                if(passwordDeconstructed[i] == passwordDeconstructed[i+1]) {
                    duplicateCount++;
                } else {
                    if(duplicateCount == 2) {
                        hasDouble = true;
                    }

                    duplicateCount = 1;
                }
            }
        }

        return hasDouble || duplicateCount == 2;
    }
}
