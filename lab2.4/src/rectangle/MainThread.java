package rectangle;

import rectangle.entity.rectangle;

public class MainThread {
    public static void main(String[] args) {
        //Initializing Temperature object
        rectangle temperature = new rectangle();
        //Assign values of C temperature to the object at a temperature of 25 degrees
        temperature.setcTemp(25.0);
        //Display to screen F and Kelvin temperature, respectively.
        System.out.println("F temperature: " + temperature.getfTemp());
        System.out.println("K temperature: " + temperature.getkTemp());



    }
}
