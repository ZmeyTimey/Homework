package task2.model;

/**
 * Created by Тимей on 28.04.2018.
 * Part 4
 */
public class DateCalculator {

    public int day;
    public int month;
    public int year;

    private static final int LAST_MONTH = 12;

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void calculateNextDate(int day, int month, int year) {

        int lastDay = 1;
        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12)

        {
            lastDay = 31;
        }

        else {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                lastDay = 30;
            }

            else {
                if (month == 2) {
                    lastDay = (year % 4 == 0) ? 29 : 28;
                }
            }
        }


        if (day != lastDay) {
            this.day = day + 1;
            this.month = month;
            this.year = year;
        }

        else {
            this.day = 1;

            if (month == LAST_MONTH) {
                this.month = 1;
                this.year = year + 1;
            }

            else {
                this.month = month + 1;
                this.year = year;
            }
        }

    }
}
