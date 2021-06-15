package lamp.entity;

/**
 * CreateBy Kiennx
 * CreateAt 15/6/2021
 */
public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    /**
     * Constructor khong co doi so
     */
    public SwitchButton() {
    }

    public void connectToLamp(ElectricLamp lamp) {
        this.lamp = lamp;
    }

    public void switchOff() {
        status = false;
    }

    public void switchOn() {
        status = true;
    }
}
