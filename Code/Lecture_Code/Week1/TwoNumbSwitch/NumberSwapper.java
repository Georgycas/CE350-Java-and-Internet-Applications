import java.util.Scanner;

public class NumberSwapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, temp;

        /* Step 1: Read two numbers */
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();

        /* Step 2: Switch the two numbers */
        temp = a;
        a = b;
        b = temp;

        /* Step 3: Print the switched two numbers */
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        scanner.close();
    }
}
