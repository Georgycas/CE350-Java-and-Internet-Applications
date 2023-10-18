public class Face {
    private int numberOfEyes;
    private int numberOfNoses;
    private int numberOfMouths;

    // Constructor to initialize the attributes
    public Face(int eyes, int noses, int mouths) {
        numberOfEyes = eyes;
        numberOfNoses = noses;
        numberOfMouths = mouths;
    }

    // Implementor function to convert any face to a normal face
    public void convertToNormal() {
        numberOfEyes = 2;
        numberOfNoses = 1;
        numberOfMouths = 1;
    }

    // Access functions to get the attributes
    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public int getNumberOfNoses() {
        return numberOfNoses;
    }

    public int getNumberOfMouths() {
        return numberOfMouths;
    }

    // Access functions to set the attributes
    public void setNumberOfEyes(int eyes) {
        numberOfEyes = eyes;
    }

    public void setNumberOfNoses(int noses) {
        numberOfNoses = noses;
    }

    public void setNumberOfMouths(int mouths) {
        numberOfMouths = mouths;
    }

    // Predicate function to check if the face is normal
    public boolean isNormal() {
        return numberOfEyes == 2 && numberOfNoses == 1 && numberOfMouths == 1;
    }

    public static void main(String[] args) {
        // Step 1: Create 3 Face objects
        Face f1 = new Face(2, 2, 1);
        Face f2 = new Face(1, 1, 2);
        Face f3 = new Face(2, 1, 1);

        // Step 2: Check whether the objects are normal after the conversion
        System.out.println("Is f1 normal? " + f1.isNormal());
        System.out.println("Is f2 normal? " + f2.isNormal());
        System.out.println("Is f3 normal? " + f3.isNormal());

        // Step 2: Convert these three objects into normal ones
        f1.convertToNormal();
        f2.convertToNormal();
        f3.convertToNormal();
        System.out.println("After conversion: ");

        // Step 3: Check whether the objects are normal after the conversion
        System.out.println("Is f1 normal? " + f1.isNormal());
        System.out.println("Is f2 normal? " + f2.isNormal());
        System.out.println("Is f3 normal? " + f3.isNormal());
    }
}
