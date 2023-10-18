import java.util.Objects;

class Square {

  private int s; // side

  // Constructor
  public Square(int s) {
    this.s = s;
  }

  // Implementor
  public void enlarge(int ds) {
    s += ds;
  }

  // Access functions
  public int getSide() {
    return s;
  }

  public void setSide(int s) {
    this.s = s;
  }

  // Helper function
  public int square(int i) {
    return i * i;
  }

  // Manager functions
  public int area() {
    return square(s);
  }

  public int perimeter() {
    return 4 * s;
  }

  // Predicate
  public boolean isLarge() {
    return s > 10;
  }

  @Override
  public String toString() {
    return "Square: Side = " + s;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Square)) return false;
    Square square = (Square) o;
    return s == square.s;
  }

  @Override
  public int hashCode() {
    return Objects.hash(s);
  }

  @Override
  public Square clone() {
    return new Square(this.s);
  }
}

class Circle {

  private double r; // radius

  // Constructor
  public Circle(double r) {
    this.r = r;
  }

  // Implementor
  public void enlarge(double dr) {
    r += dr;
  }

  // Access functions
  public double getRadius() {
    return r;
  }

  public void setRadius(double r) {
    this.r = r;
  }

  // Helper function
  public double pi() {
    return 3.1416;
  }

  // Manager functions
  public double area() {
    return pi() * square(r);
  }

  public double circumference() {
    return 2 * pi() * r;
  }

  // Predicates
  public boolean isLarge() {
    return r > 10;
  }

  public boolean isAPoint() {
    return r == 1;
  }

  @Override
  public String toString() {
    return "Circle: Radius = " + r;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Circle)) return false;
    Circle circle = (Circle) o;
    return Double.compare(circle.r, r) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(r);
  }

  @Override
  public Circle clone() {
    return new Circle(this.r);
  }

  // Helper function
  private double square(double d) {
    return d * d;
  }
}

class Coin {

  private Circle circleObj;
  private Square squareObj;

  // Constructors
  public Coin(int s, double r) {
    squareObj = new Square(s);
    circleObj = new Circle(r);
  }

  public Coin(Square squareObj, Circle circleObj) {
    this.squareObj = squareObj;
    this.circleObj = circleObj;
  }

  // Implementor
  public double area() {
    return circleObj.area() - squareObj.area();
  }

  // Access functions
  public double getCircleArea() {
    return circleObj.area();
  }

  public double getSquareArea() {
    return squareObj.area();
  }

  public void setCircleRadius(double r) {
    circleObj.setRadius(r);
  }

  public void setSquareSide(int s) {
    squareObj.setSide(s);
  }

  // Predicates
  public boolean isNormal() {
    double coinDiameter = 2 * circleObj.getRadius();
    double squareDiagonal = squareObj.getSide() * Math.sqrt(2);
    return coinDiameter > squareDiagonal;
  }

  @Override
  public String toString() {
    return (
      "Coin: Square = " +
      squareObj.toString() +
      ", Circle = " +
      circleObj.toString()
    );
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Coin)) return false;
    Coin coin = (Coin) o;
    return (
      Objects.equals(circleObj, coin.circleObj) &&
      Objects.equals(squareObj, coin.squareObj)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(circleObj, squareObj);
  }

  @Override
  public Coin clone() {
    return new Coin(this.squareObj.clone(), this.circleObj.clone());
  }
}
