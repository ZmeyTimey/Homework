package task3.controller;

import static task3.view.Viewer.print;

import task3.exceptions.NotNaturalNumberException;
import task3.model.CoinTosser;
import task3.model.MathSolver;
import task3.model.PerfectNumberChecker;

/**
 * Created by Тимон on 01.04.18.
 *
 */
public class Test {

    public static void main(String[] args) throws NotNaturalNumberException {

        int num = 1000;
        CoinTosser coinTosser = new CoinTosser();
        coinTosser.toss(num);

        print("Heads fell " + coinTosser.getHeads() + " times");
        print("Tails fell " + coinTosser.getTails() + " times \n");

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int number = 343;

        int a = 26;
        int b = 250;
        String msg;

        try {
            print("The largest digit of a given number is " + MathSolver.getLargestDigit(number));

            msg = MathSolver.checkIfPalindrome(number)
                    ? "Number " + number + " is a palindrome \n"
                    : "Number " + number + " is not a palindrome \n";

            print(msg);

            msg = MathSolver.checkIfPrime(number)
                    ? "Number " + number + " is prime \n"
                    : "Number " + number + " is not prime \n";

            print(msg);

            print("Prime divisors of the number " + number + " are:");
            print(MathSolver.getPrimeDivisors(number) + "\n");

            print("The greatest common divisor of the numbers " + a + " and " + b + " is " + MathSolver.getGCD(a, b));
            print("The last common multiple of the numbers " + a + " and " + b + " is " + MathSolver.getLCM(a, b) + "\n");

            print("Number " + number + " contains " + MathSolver.countDifferentDigits(number) + " different digits \n");

        } catch (NotNaturalNumberException e) {
            print(e);
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int perfectNumber = 496;
        try {
            msg = PerfectNumberChecker.check(perfectNumber)
                    ? "Number " + perfectNumber + " is perfect"
                    : "Number " + perfectNumber + " is not perfect";

            print(msg);

        } catch (NotNaturalNumberException e) {
            print(e);
        }
    }
}