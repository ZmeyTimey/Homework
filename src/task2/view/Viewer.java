package task2.view;

/**
 * Created by Тимей on 27.04.2018.
 *g
 */
public class Viewer {

    public static void print(Object message) {
        System.out.println(message);
    }


    public static void printDate(int day, int month, int year) {

        printTwoDigits(day);
        printTwoDigits(month);
        System.out.println(year + "\n");
    }

    private static void printTwoDigits(int dateNumber) {

         if (dateNumber < 10) {
             System.out.print("0");
         }

         System.out.print(dateNumber + ".");

        }
}
