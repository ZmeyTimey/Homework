package task1.model;

/**
 * Created by Тимей on 23.04.2018.
 *Part 3
 */
public class Swapper {

    public int a;
    public int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void swap(int a, int b) {

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        this.a = a;
        this.b = b;

    }
}
