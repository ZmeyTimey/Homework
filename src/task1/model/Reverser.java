package task1.model;


/**
 * Created by Тимей on 24.04.2018.
 *Part 7
 */

public class Reverser {

    public static int reverse(int n) {

        int sum = n % 10;

        sum = (sum * 10) + ((n /= 10) % 10);
        sum = (sum * 10) + ((n /= 10) % 10);
        sum = (sum * 10) + ((n /= 10) % 10);
        sum = (sum * 10) + ((n /= 10) % 10);
        sum = (sum * 10) + ((n /= 10) % 10);
        sum = (sum * 10) + ((n /= 10) % 10);

        return sum;
    }
}
