package task2.model;

/**
 * Created by Тимей on 29.04.2018.
 * Part 5
 */
public class NumberToStringConverter {

    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 999;

    public static String convert(int number) {

        final int FIRST_DIGIT = number / 100;
        final int SECOND_DIGIT = (number / 10) % 10;
        final int THIRD_DIGIT = number % 10;

        String converted = "";

        if (FIRST_DIGIT != 0) {
            converted += convertOneDigit(FIRST_DIGIT) + " hundred ";
        }

        if (FIRST_DIGIT != 0 && ! (SECOND_DIGIT == 0 && THIRD_DIGIT == 0)) {
            converted += "and ";
        }

        if (SECOND_DIGIT != 0) {
            converted += ((SECOND_DIGIT == 1) ? convertTeens(THIRD_DIGIT) : convertDozens(SECOND_DIGIT) + " ");
        }

        if (SECOND_DIGIT != 1) {

            if (THIRD_DIGIT != 0) {
                converted += convertOneDigit(THIRD_DIGIT);
            }
            else {
                converted += (SECOND_DIGIT == 0 && FIRST_DIGIT == 0) ? convertOneDigit(THIRD_DIGIT) : "";
            }
        }

        return converted;
    }


    public static boolean numberIsValid(int number) {

        return number >= LOWER_BOUND && number <= UPPER_BOUND;
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


    private static String convertTeens(int digit) {

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


    private static String convertDozens(int digit) {

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
