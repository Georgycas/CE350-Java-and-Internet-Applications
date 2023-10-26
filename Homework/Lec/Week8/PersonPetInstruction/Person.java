import java.util.Vector;

//Person class with name and pets
class Person implements Cloneable {
    String name;
    private Vector<Pet> pets;
//default constructor
    public Person(String name, Vector<Pet> pets) {
        this.name = name;
        this.pets = pets;
    }
//Exception handling for clone method
    public Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.pets = (Vector<Pet>) this.pets.clone();
        return cloned;
    }
    
    
//getters and setters
    public Pet getPet(int i) {
        return pets.get(i);
    }

    public int getPetAge(int i) {
        return pets.get(i).getAge();
    }

    public Vector<Pet> getPets() {
        return pets;
    }

    public int getNumOfPets() {
        return pets.size();
    }

    public void setPet(int i, int age) {
        pets.get(i).setAge(age);
    }

    public void setPets(Vector<Pet> pets) {
        this.pets = pets;
    }

    public void setName(String name) {
        this.name = name;
    }
//methods: isPetLover, removeAllPets, addPet, insertPet, firstPet, lastPet, removePet, toString, equals
    public boolean isPetLover() {
        return pets.size() > 3;
    }

    public void removeAllPets() {
        pets.clear();
    }

    public void addPet(int age) {
        pets.add(new Pet(age));
    }

    public void insertPet(int age, int index) {
        pets.add(index, new Pet(age));
    }

    public Pet firstPet() {
        return pets.firstElement();
    }

    public Pet lastPet() {
        return pets.lastElement();
    }

    public void removePet(int i) {
        pets.remove(i);
    }
//toString and equals methods
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: ").append(name).append("\n");
        for (int i = 0; i < pets.size(); i++) {
            sb.append("Pet ").append(i).append(", ").append(pets.get(i).toString()).append("\n");
        }
        return sb.toString();
    }
//equals method
    public boolean equals(Person t) {
        if (!name.equals(t.name)) {
            return false;
        }
        if (getNumOfPets() != t.getNumOfPets()) {
            return false;
        }
        for (int i = 0; i < getNumOfPets(); i++) {
            if (!getPet(i).equals(t.getPet(i))) {
                return false;
            }
        }
        return true;
    }
//Destructor
    public void removePets() {
        pets.clear();
    }
}
