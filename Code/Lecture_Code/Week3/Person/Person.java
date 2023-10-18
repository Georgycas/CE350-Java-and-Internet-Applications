import java.util.Arrays;

public class Person {
    private final String name;
    private final int[] eyeSizes;

    // Constructor
    public Person(String name, int[] eyeSizes) {
        this.name = name;
        this.eyeSizes = eyeSizes;
    }

    // Predicate: isBlind() - Check if all eye sizes are 0
    public boolean isBlind() {
        for (int size : eyeSizes) {
            if (size != 0) {
                return false;
            }
        }
        return true;
    }

    // Implementor: turnToBlind() - Set all eye sizes to 0
    public void turnToBlind() {
        Arrays.fill(eyeSizes, 0);
    }

    // Override toString for better formatting
    @Override
    public String toString() {
        return "Name: " + name + ", Eye Sizes: " + Arrays.toString(eyeSizes);
    }

    public static void main(String[] args) {
        // Test the code
        int[] jackEyeSizes = { 2, 3 };
        Person jack = new Person("Jack", jackEyeSizes);

        System.out.println("1. Created a person, Jack: " + jack);
        System.out.println("2. Is Jack blind? " + jack.isBlind());

        jack.turnToBlind();
        System.out.println("3. Jack turns blind: " + jack);
        System.out.println("4. Is Jack blind now? " + jack.isBlind());
    }
}
