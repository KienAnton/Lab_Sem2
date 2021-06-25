package exc2.entity;

/**
 * Class SportCart is subclass of Car
 */
public class SportCar extends Car {
    /**
     * override method accelerate of Car
     */
    @Override
    public void accelerate() {
        System.out.println("Sport Car is accelerating!");
        //Call to method of Car (Super class)
        super.accelerate();
    }
}
