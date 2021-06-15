package lamp;

import lamp.entity.Battery;
import lamp.entity.FlashLamp;

public class Client {
    public static void main(String[] args) {
        // Khai báo và khởi tạo đối tượng Battery và FlashLamp
        Battery battery = new Battery();
        FlashLamp flashLamp = new FlashLamp();
        // Lắp pin vào đèn
        flashLamp.setBattery(battery);
        // Bật và tắt đèn 10 lần
        for (int i = 0; i < 10; i++) {
            flashLamp.turnOn();
            flashLamp.turnOff();
        }
        //Hiển thị ra màn hình lượng pin còn lại
        System.out.println("Lượng pin còn lại trong đèn là: " + battery.getEnergy());



    }
}
