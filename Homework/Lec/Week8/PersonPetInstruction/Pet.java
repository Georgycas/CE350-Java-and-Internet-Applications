//Pet class for use in the Pet class hierarchy
class Pet implements Cloneable {
    private int age;
//default constructor
    public Pet(int age) {
        this.age = age;
    }
//Exception handling for clone method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//methods: isYoungPet, toString, equals
    public boolean isYoungPet() {
        return age < 10;
    }

    public String toString() {
        return "Pet, Age : " + age;
    }

    public boolean equals(Pet k) {
        return this.age == k.getAge();
    }
}
