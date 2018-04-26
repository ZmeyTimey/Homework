package task1.model;


/**
 * Created by Тимей on 23.04.2018.
 *Part 4
 */

public class NumRowChecker {

    public static boolean checkIfIncreasing(int n) {

        boolean checkOne = (n % 10) > ((n /= 10) % 10);
        boolean checkTwo = (n % 10) > ((n /= 10) % 10);
        boolean checkThree = (n % 10) > ((n / 10) % 10);

        return checkOne & checkTwo & checkThree;
    }

    public static boolean checkIfDecreasing(int n) {

        boolean checkOne = (n % 10) < ((n /= 10) % 10);
        boolean checkTwo = (n % 10) < ((n /= 10) % 10);
        boolean checkThree = (n % 10) < ((n / 10) % 10);

        return checkOne & checkTwo & checkThree;
    }
}
