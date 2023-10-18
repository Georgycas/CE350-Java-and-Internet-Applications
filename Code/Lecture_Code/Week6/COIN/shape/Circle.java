// Circle.java in the shape package
package shape;

public class Circle {
    private double r; // radius

    // Constructor
    public Circle(double r) {
        this.r = r;
    }

    // Helping function to get the value of pi
    public double pi() {
        return 3.1416;
    }

    // Implementor to increase the radius by dr
    public void enLarge(double dr) {
        r += dr;
    }

    // Calculate the area of the circle using the pi() method
    public double area() {
        return pi() * r * r;
    }

    // Calculate the circumference of the circle using the pi() method
    public double circumference() {
        return 2 * pi() * r;
    }

    // Get function for radius
    public double getRadius() {
        return r;
    }

    // Set function for radius
    public void setRadius(double r) {
        this.r = r;
    }

    // Predicate to check if the circle is large
    public boolean isLarge() {
        return r > 10;
    }

    // Predicate to check if the circle is a point
    public boolean isAPoint() {
        return r == 1;
    }
}
