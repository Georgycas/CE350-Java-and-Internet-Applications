import money.Coin;
import shape.Circle;
import shape.Square;

public class TestCoin {
    public static void main(String[] args) {
        // Create a coin object with a square's side of 2 and a circle's radius of 2
        Square square = new Square(2);
        Circle circle = new Circle(2);
        Coin coinObj = new Coin(square, circle);

        // Print the area of coinObj
        double coinArea = coinObj.area();
        System.out.println("The area of the coin is: " + coinArea);

        // Check if coinObj is normal
        if (coinObj.isNormal()) {
            System.out.println("The coin is normal.");
        } else {
            System.out.println("The coin is not normal.");
        }
    }
}
