package Quiz5;
import java.util.Arrays;

public class Person {

  private int age;
  private String name;
  private int[] handLengths;

  // Constructor
  public Person(int age, String name, int[] handLengths) {
    this.age = age;
    this.name = name;
    this.handLengths = Arrays.copyOf(handLengths, handLengths.length);
  }

  // toString() method
  @Override
  public String toString() {
    return (
      "Person [age=" +
      age +
      ", name=" +
      name +
      ", handLengths=" +
      Arrays.toString(handLengths) +
      "]"
    );
  }

  // clone() method
  public Person clone() {
    return new Person(this.age, this.name, this.handLengths);
  }

  // equals() method
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Person otherPerson = (Person) obj;
    return (
      age == otherPerson.age &&
      name.equals(otherPerson.name) &&
      Arrays.equals(handLengths, otherPerson.handLengths)
    );
  }

  public static void main(String[] args) {
    int[] handLengths = { 10, 12, 11 };
    Person person1 = new Person(30, "John", handLengths);
    Person person2 = person1.clone();

    System.out.println("Person 1: " + person1.toString());
    System.out.println("Person 2: " + person2.toString());

    System.out.println(
      "Are person1 and person2 equal? " + person1.equals(person2)
    );
  }
}
