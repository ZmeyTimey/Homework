package task1.controller;

import task1.model.*;

import static task1.view.Viewer.print;

/**
 * Created by Тимей on 26.04.2018.
 */
public class Test {

    public static void main(String[] args) {

        double weightDinoGram = 35870666;
        double weightDinoTon = DinoWeightConverter.convertToTon(weightDinoGram);

        print("The weight of dinosaur equals " + weightDinoTon + " ton");


        double weightDinoKg = DinoWeightConverter.convertToKg(weightDinoGram);

        print("The weight of dinosaur equals " + weightDinoKg + " kg");


        print("");


        double r1 = 7;
        double r2 = 3;
        double S = RingSquareCalculator.countSquare(r1, r2);

        print("S" + "=" + S);


        print("");


        int a = 10;
        int b = 20;

        Swapper swapper = new Swapper();
        swapper.swap(a,b);

        a = swapper.getA();
        b = swapper.getB();

        print("a" + "=" + a);
        print("b" + "=" + b);


        print("");


        int n = 1369;

        String result = NumRowChecker.checkIfIncreasing(n)
                ? "The digits of the number N form an increasing sequence"
                : (NumRowChecker.checkIfDecreasing(n)) ? "The digits of the number N form a decreasing sequence"
                : "The digits of the number N do not form an increasing or decreasing sequence";

        print(result);


        print("");


        int n5 = 56389;

        int amount = DigitsCounter.addDigits(n5);
        int product = DigitsCounter.multiplyDigits(n5);

        print("The amount of digits of the number N equals " + amount);
        print("The product of digits of the number N equals " + product);


        print("");


        int n6 = 345678;

        double arMean = MeanCounter.countArithmeticalMean(n6);
        double geoMean = MeanCounter.countGeometricMean(n6);

        print("The arithmetical mean of digits of the number N equals " + arMean);
        print("The geometrical mean of digits of the number N equals " + geoMean);


        print("");


        int n7 = 1234567;
        int reversedN = Reverser.reverse(n7);
        print("reversed N = " + reversedN);
    }

}
