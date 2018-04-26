package task2.model;

/**
 * Created by Тимей on 27.04.2018.
 * Part 01
 */
public class DragonHeadsCounter {

    public static int countHeads(int age) {

        int heads = 0;

        for (int i = 1; i < age; i++) {
            if (i > 200 & i < 300) {
                heads = heads + 2;
            }
            else {
                if (i > 300) {
                    heads = heads + 1;
                }
                else {
                    heads = heads + 3;
                }
            }
        }
        return heads;
    }

    public static int countEyes(int heads) {

        return (2 * heads);
    }
}
