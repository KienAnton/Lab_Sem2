package rectangle.entity;

/**
 * CreateBy Kiennx
 * CreateAt 14/6/2021
 */
public class rectangle {
    private double cTemp;
    private double kTemp;
    private double fTemp;

    /**
     * Constructor không đối số
     */
    public rectangle() {
        this.cTemp = 23.1;
    }

    /**
     * Constructor có đối số
     */
    public rectangle(double cTemp) {
        this.cTemp = cTemp;
    }

    public double getcTemp() {
        return cTemp;
    }

    public void setcTemp(double cTemp) {
        this.cTemp = cTemp;
    }

    public double getkTemp() {
        kTemp = 273.15 + cTemp;
        return kTemp;
    }

    public double getfTemp() {
        fTemp = (double) (9.0 / 5.0) * cTemp + 32;
        return fTemp;
    }

}
