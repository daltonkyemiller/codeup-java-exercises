package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return width * length;
    }

    double getPerimeter() {
        return (width * 2) + (length * 2);
    }
}
