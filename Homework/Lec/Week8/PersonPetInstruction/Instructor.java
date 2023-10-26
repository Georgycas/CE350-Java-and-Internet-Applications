import java.util.Vector;
//Instructor class with courses, name, and pets
class Instructor extends Person {
    private int courses;
//default constructor
    public Instructor(int courses, String name, Vector<Pet> pets) {
        super(name, pets);
        this.courses = courses;
    }
//copy constructor  
    public void setCourses(int courses) {
        this.courses = courses;
    }
//Exception handling for clone method
    public Object clone() throws CloneNotSupportedException {
        Instructor cloned = (Instructor) super.clone();
        cloned.courses = this.courses;
        return cloned;
    }
//string method
    public String toString() {
        return "The instructor teaches " + courses + " courses\n" + super.toString();
    }
//equals method
    public boolean equals(Instructor t) {
        return (courses == t.courses && super.equals(t));
    }
}
