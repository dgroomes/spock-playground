package dgroomes.spockplayground.basic;

/**
 * A toy class that exists just to demonstrate a Spock test.
 */
public class Adder {

    private int sum;

    public Adder(int base) {
        this.sum = base;
    }

    public void add(int i) {
        this.sum += i;
    }

    public int getSum() {
        return sum;
    }
}
