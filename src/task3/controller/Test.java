package task3.controller;

import static task3.view.Viewer.print;

import task3.model.CoinTosser;
import task3.model.MathSolver;
import task3.model.PerfectNumberChecker;

/**
 * Created by Тимон on 01.04.18.
 *
 */
public class Test {

    public static void main(String[] args) {

        int num = 1000;
        CoinTosser coinTosser = new CoinTosser();
        coinTosser.toss(num);

        print("Heads fell " + coinTosser.getHeads() + " times");
        print("Tails fell " + coinTosser.getTails() + " times \n");

     /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int number = 35453;
        int a = 26;
        int b = 250;

        print("The largest digit of a given number is " + MathSolver.getLargestDigit(number));

        if (MathSolver.checkIfPalindrome(number)) {
            print("Number " + number + " is a palindrome \n");
        }
        else {
            print("Number " + number + " is not a palindrome \n");
        }

        if (MathSolver.checkIfPrime(number)) {
            print("Number " + number + " is prime \n");
        }
        else {
            print("Number " + number + " is not prime \n");
        }

        print("Prime divisors of the number " + number + " are:");
        print(MathSolver.getPrimeDivisors(number) + "\n");

        print("The greatest common divisor of the numbers " + a + " and " + b + " is " + MathSolver.getGCD(a, b));
        print("The last common multiple of the numbers " + a + " and " + b + " is " + MathSolver.getLCM(a, b) + "\n");

        print("Number " + number + " contains " + MathSolver.countDifferentDigits(number) + " different digits \n");

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int perfectNumber = 496;

        if (PerfectNumberChecker.check(perfectNumber)) {
            print("Number " + perfectNumber + "  is perfect");
        }

        else {
            print("Number " + perfectNumber + "  is not perfect");
        }
    }
}