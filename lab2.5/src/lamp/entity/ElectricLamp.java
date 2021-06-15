package lamp.entity;

/**
 * CreateBy Kiennx
 * CreateAt 15/6/2021
 */
public class ElectricLamp {
    private boolean status;
    /**
     * Constructor khong doi so
     */
    public ElectricLamp(){
        status = false;
    }

    public void turnOff(){
        status = false;
    }

    public void turnOn(){
        status = true;
    }

}
