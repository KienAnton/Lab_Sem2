package rectangle;

import rectangle.entity.Rectangle;

public class MainThread {
    public static void main(String[] args) {
        //Declare and initialize an object of type Rectangle
        Rectangle rectangle = new Rectangle();
        //Show the rectangle on the screen console
        rectangle.display();
        //Change the length and width of the rectangle.
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        //Display to screen area and perimeter of this rectangle
        System.out.println("Area of this rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of this rectangle: " + rectangle.getPerimeter());

    }
}
