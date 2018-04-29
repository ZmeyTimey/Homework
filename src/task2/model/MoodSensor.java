package task2.model;

/**
 * Created by Тимей on 28.04.2018.
 * Part 3
 */
public class MoodSensor {

    private static final int COEFFICIENT_FOR_RANDOM_NUMBER = 10;

    public static String getMood() {

        double randomNumber = Math.random();
        String mood = "";

        switch ((int) (randomNumber * COEFFICIENT_FOR_RANDOM_NUMBER)) {
            case 0: mood = "X_x"; break;
            case 1: mood = "(=_=)"; break;
            case 2: mood = "(T_T)"; break;
            case 3: mood = "(-_-)"; break;
            case 4: mood = "(O_O)"; break;
            case 5: mood = "(o_o)"; break;
            case 6: mood = "*^_^*"; break;
            case 7: mood ="(*_*)"; break;
            case 8: mood = "(^_^)"; break;
            case 9: mood = "(^__^)"; break;
            case 10: mood = "(^___^)"; break;

        }

        return mood;
    }
}
