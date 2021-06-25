package exc4;

import exc4.entity.Car;
import exc4.entity.LuxuryCar;

public class Main {
    public static void main(String[] args) {
        Car c = new LuxuryCar();
        c.accelerate();
        ((LuxuryCar) c).service();
    }
}
