package task2.controller;

import task2.model.DragonHeadsCounter;

import static task2.view.Viewer.print;


/**
 * Created by Тимей on 27.04.2018.
 *
 */
public class Test {

    public static void main(String[] args) {
        int dragonAge = 369;

        int dragonHeads = DragonHeadsCounter.countHeads(dragonAge);
        int dragonEyes = DragonHeadsCounter.countEyes(dragonHeads);

        print("Mr. Dragon has " + dragonHeads + " heads " + "and " + dragonEyes + " eyes. \n");

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////


    }
}
