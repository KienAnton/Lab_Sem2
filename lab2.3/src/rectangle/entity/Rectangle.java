package rectangle.entity;

public class Rectangle {
    /**
     * Khai báo các trường để lưu giá trị
     * CreateBy Kiennx
     * CreateAt 14/6/2021
     */
    private int width;
    private int height;
    private int area;
    private int perimeter;

    /**
     * Constructor không có đối số
     */
    public Rectangle() {
        this.width = 7;
        this.height = 3;
    }

    /**
     * Constructor có đối số
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void display() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        area = width * height;
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        perimeter = (height + width) * 2;
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
}
