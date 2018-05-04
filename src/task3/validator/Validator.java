package task3.validator;

import task3.exceptions.NotNaturalNumberException;

/**
 * Created by Тимей on 05.05.2018.
 *
 */
public class Validator {

    public static void validate(int... number) throws NotNaturalNumberException {
        for (int a: number) {
            if (a <= 0) {
                throw new NotNaturalNumberException("The number is not a natural number");
            }
        }
    }
}
