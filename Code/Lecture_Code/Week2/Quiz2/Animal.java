public class Animal {
    
    // Attribute
    private int legs;

    // Constructor
    public Animal(int legs) {
        this.legs = legs;
    }

    // Getter for legs
    public int getLegs() {
        return this.legs;
    }

    // Setter for legs
    public void setLegs(int legs) {
        this.legs = legs;
    }

    public static void main(String[] args) {
        Animal dog = new Animal(4);
        System.out.println("The animal has " + dog.getLegs() + " legs.");

        dog.setLegs(3);  // e.g., perhaps the dog had an accident
        System.out.println("Now, the animal has " + dog.getLegs() + " legs.");
    }
}
