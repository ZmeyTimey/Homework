package task3.model;

/**
 * Created by Тимей on 03.05.2018.
 * Part 3
 */
public class PerfectNumberChecker {

    public static boolean check(int num) {

        int divisorsSum = 1;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                divisorsSum += i;
            }
        }
        return (divisorsSum == num);
    }
}
