public class Pet {
    String name;
    PetType type;
    int age;
    Person owner;

    public Pet(String name, PetType type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public PetType getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}