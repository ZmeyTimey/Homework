package task1.model;

/**
 * Created by Тимей on 23.04.2018.
 *Part 2
 */
public class RingSquareCalculator {

    private static double square(double number) {
        return Math.pow(number, 2);
    }

    public static double countSquare(double r1, double r2) {
        return Math.PI * square(r1) - square(r2);
    }
}

