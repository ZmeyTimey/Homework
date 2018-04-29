package task2.model;

/**
 * Created by Тимей on 29.04.2018.
 * Part 5
 */
public class NumberToStringConverter {

    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 999;

    private static final int SECOND_DIGIT_COEFFICIENT = 10;
    private static final int THIRD_DIGIT_COEFFICIENT = 100;

    public static String convert(int number) {

        String converted = "";
        int digits = countDigits(number);

        switch (digits) {

            case 1: {

                converted = convertOneDigit(number);
                break;
            }

            case 2: {

                converted = convertTwoDigits(number);
                break;
            }

            case 3: {

                converted = convertOneDigit(number / THIRD_DIGIT_COEFFICIENT)
                        + " hundred " + convertTwoDigits(number % THIRD_DIGIT_COEFFICIENT);
                break;
            }
        }

        return converted;
    }


    public static boolean numberIsValid(int number) {

        return number >= LOWER_BOUND && number <= UPPER_BOUND;
    }


    private static int countDigits(int num) {

        int sum = 0;

        while (num > 1) {

            sum++;
            num /= 10;
        }

        return sum;
    }


    private static String convertOneDigit(int digit) {

        String converted = "";

        switch (digit) {

            case 0: converted = "zero"; break;
            case 1: converted = "one"; break;
            case 2: converted = "two"; break;
            case 3: converted = "three"; break;
            case 4: converted = "four"; break;
            case 5: converted = "five"; break;
            case 6: converted = "six"; break;
            case 7: converted = "seven"; break;
            case 8: converted = "eight"; break;
            case 9: converted = "nine"; break;
        }

        return converted;
    }


    private static String convertTwoDigits(int num) {

        String converted = "";

        if (num / SECOND_DIGIT_COEFFICIENT == 1) {

            converted = convertTeen(num % SECOND_DIGIT_COEFFICIENT);
        }

        else {

            converted = convertSecondDigit(num / SECOND_DIGIT_COEFFICIENT) + " ";
            if (num % SECOND_DIGIT_COEFFICIENT != 0) {

                converted += convertOneDigit(num % SECOND_DIGIT_COEFFICIENT);
            }
        }

        return converted;
    }


    private static String convertTeen(int digit) {

        String converted = "";

        switch (digit) {

            case 0: converted = "ten"; break;
            case 1: converted = "eleven"; break;
            case 2: converted = "twelve"; break;
            case 3: converted = "thirteen"; break;
            case 4: converted = "fourteen"; break;
            case 5: converted = "fifteen"; break;
            case 6: converted = "sixteen"; break;
            case 7: converted = "seventeen"; break;
            case 8: converted = "eighteen"; break;
            case 9: converted = "nineteen"; break;
        }

        return converted;
    }


    private static String convertSecondDigit(int digit) {

        String converted = "";

        switch (digit) {

            case 2: converted = "twenty"; break;
            case 3: converted = "thirty"; break;
            case 4: converted = "forty"; break;
            case 5: converted = "fifty"; break;
            case 6: converted = "sixty"; break;
            case 7: converted = "seventy"; break;
            case 8: converted = "eighty"; break;
            case 9: converted = "ninety"; break;
        }

        return converted;
    }

}
