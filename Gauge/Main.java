package Gauge;

public class Main {
    public static void main(String[] args) {
        Gauge test = new Gauge();
        for (int i = 0; i < 6; i++) {
            test.increase();
            System.out.println(test);
        }
    }
}
