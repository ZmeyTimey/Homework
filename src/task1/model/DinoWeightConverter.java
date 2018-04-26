package task1.model;

/**
 * Created by Тимей on 23.04.2018.
 *Part 1
 */
public class DinoWeightConverter {

    private static final int GRAM_PER_TON = 1000000;
    private static final int GRAM_PER_KILOGRAM = 1000;

    public static double convertToTon(double weightGram){
        return weightGram / GRAM_PER_TON;
    }

    public static double convertToKg(double weightGram) {
        return weightGram / GRAM_PER_KILOGRAM;
    }
}