package task2.model;

/**
 * Created by Тимей on 27.04.2018.
 * Part 01
 */
public class DragonHeadsCounter {

    private static final int DRAGON_AGE_LIMIT_ONE = 200;
    private static final int DRAGON_AGE_LIMIT_TWO = 300;

    private static final int HEADS_INCREASE_ONE = 3;
    private static final int HEADS_INCREASE_TWO = 2;
    private static final int HEADS_INCREASE_THREE = 1;

    private static final int EYES_ON_ONE_HEAD = 2;
    public static int countHeads(int age) {

        int heads = 0;

        for (int i = 1; i < age; i++) {
            if (i > DRAGON_AGE_LIMIT_ONE & i < DRAGON_AGE_LIMIT_TWO) {
                heads = heads + HEADS_INCREASE_TWO;
            }
            else {
                if (i > DRAGON_AGE_LIMIT_TWO) {
                    heads = heads + HEADS_INCREASE_THREE;
                }
                else {
                    heads = heads + HEADS_INCREASE_ONE;
                }
            }
        }
        return heads;
    }

    public static int countEyes(int heads) {

        return (EYES_ON_ONE_HEAD * heads);
    }
}
