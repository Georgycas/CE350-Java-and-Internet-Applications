public class Cylinder {
    // Data members
    private int radius;
    private int height;

    // Constructor
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    // Getters and setters for radius and height
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Helper function to calculate pi
    private int pi() {
        return 3;
    }

    // Predicate function to check if the cylinder is a disk
    public boolean isDisk() {
        return height == 1;
    }

    // Implementor functions
    public int volume() {
        return pi() * radius * radius * height;
    }

    public int area() {
        int lateralSurfaceArea = 2 * pi() * radius * height;
        int baseArea = 2 * pi() * radius * radius;
        return lateralSurfaceArea + baseArea;
    }

    public static void main(String[] args) {
        // Create a Cylinder object named "cup"
        Cylinder coster = new Cylinder(5, 1);

        // Display the content of the object
        System.out.println("Cylinder Properties:");
        System.out.println("Radius: " + coster.getRadius());
        System.out.println("Height: " + coster.getHeight());

        // Check if the cup is a disk
        if (coster.isDisk()) {
            System.out.println("The cup is a disk.");
        } else {
            System.out.println("The cup is not a disk.");
        }

        // Display the volume and area of the cup
        System.out.println("Volume: " + coster.volume());
        System.out.println("Surface Area: " + coster.area());
    }
}