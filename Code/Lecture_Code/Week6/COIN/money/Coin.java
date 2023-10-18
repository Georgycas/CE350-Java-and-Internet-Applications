// Coin.java in the money package
package money;
import shape.Circle;
import shape.Square;

public class Coin {
    // Attributes
    private Circle circleObj;
    private Square squareObj;

    // Constructors
    public Coin(int s1, double r1) {
        this.circleObj = new Circle(r1);
        this.squareObj = new Square(s1);
    }

    public Coin(Square squareObj1, Circle circleObj1) {
        this.circleObj = circleObj1;
        this.squareObj = squareObj1;
    }

    // Helping function to get the area of the coin's circle portion
    public double getCircleArea() {
        return circleObj.area();
    }

    // Helping function to get the area of the coin's square portion
    public int getSquareArea() {
        return squareObj.area();
    }

    // Implementor to calculate the area of the coin
    public double area() {
        return getCircleArea() - getSquareArea();
    }

    // Access function to get the square object
    public Square getSquareObj() {
        return squareObj;
    }

    // Access function to set the square object
    public void setSquareObj(Square squareObj) {
        this.squareObj = squareObj;
    }

    // Access function to get the circle object
    public Circle getCircleObj() {
        return circleObj;
    }

    // Access function to set the circle object
    public void setCircleObj(Circle circleObj) {
        this.circleObj = circleObj;
    }

    // Predicate function to check if the coin is normal
    public boolean isNormal() {
        double diameter = 2 * circleObj.getRadius();
        double diagonal = Math.sqrt(2) * squareObj.getSide();
        return diameter > diagonal;
    }
}
