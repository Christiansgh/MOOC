package Gauge;

public class Gauge {
    private int value;

    /*
     * constructors
     */
    public Gauge() {
        this.value = 0;
    }

    /*
     * service
     */
    private boolean acceptableRange(int value) {
        return (value >= 0 && value <= 5);
    }

    /*
     * behaviour
     */
    public void increase() {
        if (acceptableRange(value)) {
            value++;
        } else {
            System.out.println("Overflow!");
        }
        // caps at 5
    }

    public void decrease() {
        if (acceptableRange(value)) {
            value--;
        } else {
            System.out.println("It's empty!");
        }
        // caps at 0
    }

    /*
     * toString
     */
    public String toString() {
        return "[Value: " + value + "]";
    }
}
