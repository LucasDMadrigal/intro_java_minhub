public class Person {
    String firstName, lastName, identityCard;
    Integer age;
    Double height;
    Boolean married;
    String[] petsNames;

    public Person(String firstName, String lastName, String identityCard, Integer age, Double height, Boolean married, String[] petsNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.petsNames = petsNames;
    }

    public Person() {
    }

    public void presentacion() {
        System.out.println("Nombre: " + firstName);
        System.out.println("Apellido: " + lastName);
        System.out.println("Edad: " + age);
        System.out.println("Altura: " + height);
        System.out.println("Estado civil: " + (married ? "Casado/a" : "Soltero/a"));
        System.out.println("Nombres de las mascotas:");
        for (String petName : petsNames) {
            System.out.println("- " + petName);
        }
    }
}
