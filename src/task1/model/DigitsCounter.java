package task1.model;


/**
 * Created by Тимей on 24.04.2018.
 *Part 5
 */
public class DigitsCounter {

        public static int multiplyDigits(int n) {

            return (n % 10)
                    * ((n /= 10) % 10)
                    * ((n /= 10) % 10)
                    * ((n /= 10) % 10)
                    * ((n /= 10) % 10);
        }

        public static int addDigits(int n) {

            return (n % 10)
                    + (n /= 10) % 10
                    + (n /= 10) % 10
                    + (n /= 10) % 10
                    + (n) % 10;
    }
    }
