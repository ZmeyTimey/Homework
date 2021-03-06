package task3.model;

import task3.exceptions.NotNaturalNumberException;

import static task3.validator.Validator.*;

/**
 * Created by Тимей on 02.05.2018.
 * Part 2
 */
public class MathSolver {

    private static final int LEAST_DIVISOR = 2;

    public static int getLargestDigit(int number) throws NotNaturalNumberException {

        validate(number);

        int largestDigit = 0;

        while(number > 0) {

            if (number % 10 > largestDigit) {
                largestDigit = number % 10;
            }

            if (largestDigit == 9) {
                break;
            }

            number /= 10;
        }
        return largestDigit;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean checkIfPalindrome(int num) throws NotNaturalNumberException {

        validate(num);

        boolean palindrome = true;
        int digits = countDigits(num);

        for (int i = 1; i <= digits / 2; i++) {

            if (num % 10 != (num / (int) Math.pow(10, digits - 1))) {
                palindrome = false;
            }

            num /= 10;
            num = num % (int) Math.pow(10, digits - 1);
        }
        return palindrome;
    }

    private static int countDigits(int num) throws NotNaturalNumberException {

        validate(num);

        int digits = 0;

        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean checkIfPrime(int num) throws NotNaturalNumberException {

        boolean primeNumber = true;

        for (int i = LEAST_DIVISOR; i <= num / 2; i++) {
            if (num % i == 0) {
                primeNumber = false;
            }
        }
        return primeNumber;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static String getPrimeDivisors(int num) throws NotNaturalNumberException {

        validate(num);

        String divisorsString = "1";

        for (int i = LEAST_DIVISOR; i <= num /2; i++) {

            if (num % i == 0 && checkIfPrime(i)) {
                divisorsString = divisorsString + ", " + Integer.toString(i);
            }
        }
        divisorsString += ", "  + num;

        return divisorsString;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int getGCD(int a, int b) throws NotNaturalNumberException {

        validate(a, b);

        int GCD = 1;

        for (int i = getSmallerNumber(a, b); i >= 1; i--) {

            if (a % i == 0 && b % i == 0) {
                GCD = i;
                break;
            }
        }
        return GCD;
    }

    public static int getLCM(int a, int b) throws NotNaturalNumberException {

        return a * b / getGCD(a, b);
    }

    private static int getSmallerNumber(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int countDifferentDigits(int num) throws NotNaturalNumberException {

        validate(num);

        int digits = countDigits(num);
        String digitsString = Integer.toString(num);
        int differentDigits = 0;

        for (int i = 0; i < digits; i++) {
            String digit = Integer.toString(num % 10);

            if (digitsString.contains(digit)) {
                digitsString = digitsString.replace(digit, "");
                differentDigits++;
            }

            num /= 10;
        }
        return differentDigits;
    }
}
