package task2.controller;

import task2.model.*;

import java.io.IOException;
import java.util.Scanner;

import static task2.view.Viewer.print;
import static task2.view.Viewer.printDate;

/**
 * Created by Тимей on 27.04.2018.
 *
 */
public class Test {

    public static void main(String[] args) throws IOException {

        int dragonAge = 369;

        int dragonHeads = DragonHeadsCounter.countHeads(dragonAge);
        int dragonEyes = DragonHeadsCounter.countEyes(dragonHeads);

        print("Mr. Dragon has " + dragonHeads + " heads " + "and " + dragonEyes + " eyes. \n");

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Scanner scan = new Scanner(System.in);

        try {

            print("Enter a letter:");
            char letter;

            while (true) {

                String temp = scan.next();
                int letterCount = temp.length();

                if (letterCount > 1) {
                    print("You can enter only one letter!");
                }

                else {
                    letter = temp.charAt(0);
                    break;
                }
            }

            if (LetterIdentifier.isVowel1(letter)) {
                print("This letter is vowel \n");
            }

            else {

                if (LetterIdentifier.isConsonant1(letter)) {
                    print("this letter is consonant \n");
                }

                else {
                    print("A bullshit you entered is not a letter \n");
                }
            }

        } catch (Exception e) {
            print(e);
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        print("Your mood is:");
        print(MoodSensor.getMood() + "\n");

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int day = 28;
        int month = 2;
        int year = 2018;

        DateCalculator dateCalculator = new DateCalculator();

        dateCalculator.calculateNextDate(day, month, year);

        printDate(dateCalculator.getDay(), dateCalculator.getMonth(), dateCalculator.getYear());

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int number;

        while (true) {

            print("Input number (from 0 to 999):");
            number = scan.nextInt();

            if (NumberToStringConverter.numberIsValid(number)) {

                print("The number as a string:");
                print(NumberToStringConverter.convert(number));

                break;
            }
            else {
                print("Invalid input. Try again");
            }
        }

    }
}