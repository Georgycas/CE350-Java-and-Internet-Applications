public class Main {

  public static void main(String[] args) {
    Coin coin = new Coin(2, 2);
    System.out.println("Area of the coin: " + coin.area());
    System.out.println("Is the coin normal? " + coin.isNormal());

    // Testing toString(), equals(), and clone()
    Coin coin2 = coin.clone();
    System.out.println("Coin 2: " + coin2.toString());
    System.out.println("Are coin and coin2 equal? " + coin.equals(coin2));
  }
}
