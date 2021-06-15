package lamp;

import lamp.entity.ElectricLamp;
import lamp.entity.SwitchButton;

public class MainThread {
    public static void main(String[] args) {
        //Declare and initialize a SwitchButton object and an ElectricLamp object.
        SwitchButton switchButton = new SwitchButton();
        ElectricLamp electricLamp = new ElectricLamp();
        //Connect the SwitchButton object to the ElectricLamp object.
        switchButton.connectToLamp(electricLamp);
        //Turn off the SwitchButton object 10 times.
        electricLamp.turnOn();
        for (int i = 0; i < 10; i++) {
            switchButton.switchOff();
        }
    }
}
