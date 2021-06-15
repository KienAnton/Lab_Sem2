package lamp.entity;

/**
 * Pin là một thiết bị lưu trữ năng lượng dưới dạng hoá năng. Khi ta dùng, năng lượng này sẽ dần chuyển đổi thành điện năng
 * CreateBy Kiennx
 * CreateAt 14/6/2021
 */
public class Battery {
    /**
     * Fields
     */
    private int energy;

    /**
     * Constructor for objects of class Battery
     */
    public Battery() {
// To do:
        energy = 100;
    }

    /**
     * Method
     */
    public void setEnergy(int value) {
        energy = value;
    }

    public int getEnergy() {
        return energy;
    }

    public void decreaseEnergy() {
        energy--;
    }
}

