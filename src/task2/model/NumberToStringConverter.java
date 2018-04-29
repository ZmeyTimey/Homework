package task2.model;

/**
 * Created by Тимей on 29.04.2018.
 * Part 5
 */
public class NumberToStringConverter {

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

                converted = convertOneDigit(number / 100) + " hundred " + convertTwoDigits(number % 100);
                break;
            }
        }

        return converted;
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

        if (num / 10 == 1) {

            converted = convertTeen(num % 10);
        }

        else {

            converted = convertSecondDigit(num / 10) + " ";
            if (num % 10 != 0) {

                converted += convertOneDigit(num % 10);
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
