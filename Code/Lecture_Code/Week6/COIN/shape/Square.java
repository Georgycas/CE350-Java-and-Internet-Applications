// Square.java in the shape package
package shape;

public class Square {
    private int s; // side

    // Constructor
    public Square(int s) {
        this.s = s;
    }

    // Helping function to calculate the square of a number
    public int square(int i) {
        return i * i;
    }

    // Implementor to increase the side by ds
    public void enLarge(int ds) {
        s += ds;
    }

    // Calculate the area of the square using the square() method
    public int area() {
        return square(s);
    }

    // Calculate the circumference of the square
    public int circumference() {
        return 4 * s;
    }

    // Get function for side
    public int getSide() {
        return s;
    }

    // Set function for side
    public void setSide(int s) {
        this.s = s;
    }

    // Predicate to check if the square is large
    public boolean isLarge() {
        return s > 10;
    }
}
