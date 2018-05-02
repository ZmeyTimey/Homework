package task3.model;

import java.util.Random;

/**
 * Created by Тимон on 01.04.18.
 * Part 1
 */
public class CoinTosser {

    public int num;
    public int heads = 0;

    public void toss(int num) {

        this.num = num;
        Random rand = new Random();

        for (int i = 0; i < num; i++) {
            if (rand.nextBoolean()) {
                heads++;
            }
        }
    }

    public int getHeads() {
        return this.heads;
    }

    public int getTails() {
        return (num - heads);
    }
}
