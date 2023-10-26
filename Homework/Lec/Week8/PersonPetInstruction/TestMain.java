import java.util.Vector;
//TestMain class
public class TestMain {
    public static void main(String[] args) {
        try {
            // Testing Pet class
            System.out.println("Testing Pet Class:");
            Pet pet1 = new Pet(5);
            Pet pet2 = new Pet(10);
            Pet pet3 = (Pet) pet1.clone();

            System.out.println("Pet1: " + pet1);
            System.out.println("Pet2: " + pet2);
            System.out.println("Pet3 (clone of Pet1): " + pet3);

            System.out.println("Is Pet1 young? " + pet1.isYoungPet());
            System.out.println("Is Pet2 young? " + pet2.isYoungPet());
            System.out.println("Does Pet1 equal Pet3? " + pet1.equals(pet3));
            System.out.println();

            // Testing Person class
            System.out.println("Testing Person Class:");
            Vector<Pet> pets = new Vector<>();
            pets.add(pet1);
            pets.add(pet2);
            Person person1 = new Person("Alice", pets);
            Person person2 = (Person) person1.clone();
            person2.setName("Bob");
            person2.addPet(7);

            System.out.println("Person1: " + person1);
            System.out.println("Person2 (clone of Person1, name changed, one pet added): " + person2);
            System.out.println("Does Person1 equal Person2? " + person1.equals(person2));
            System.out.println("Is Person1 a pet lover? " + person1.isPetLover());
            System.out.println("Is Person2 a pet lover? " + person2.isPetLover());
            System.out.println();

            // Testing Instructor class
            System.out.println("Testing Instructor Class:");
            Instructor instructor1 = new Instructor(3, "Charlie", pets);
            Instructor instructor2 = (Instructor) instructor1.clone();
            instructor2.setCourses(4);
            instructor2.setName("David");

            System.out.println("Instructor1: " + instructor1);
            System.out.println("Instructor2 (clone of Instructor1, name and courses changed): " + instructor2);
            System.out.println("Does Instructor1 equal Instructor2? " + instructor1.equals(instructor2));
            System.out.println();

        }
//Exception handling for clone method 
        catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported: " + e.getMessage());
        }
    }
}
