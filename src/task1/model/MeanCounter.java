package task1.model;


/**
 * Created by Тимей on 24.04.2018.
 *Part 6
 */
public class MeanCounter {

    private static final int COUNT_OF_DIGITS = 6;

    public static double countArithmeticalMean(int n) {

        int sum = (n % 10)
                + ((n /= 10) % 10 )
                + ((n /= 10) % 10 )
                + ((n /= 10) % 10 )
                + ((n /= 10) % 10 )
                + ((n /= 10) % 10 );

        return (sum * 1.0 / COUNT_OF_DIGITS);
    }

    public static double countGeometricMean(int n) {

        int sum = (n % 10)
                * ((n /= 10) % 10 )
                * ((n /= 10) % 10 )
                * ((n /= 10) % 10 )
                * ((n /= 10) % 10 )
                * ((n /= 10) % 10 );

        return Math.pow(sum, 1.0/COUNT_OF_DIGITS);
    }
}
