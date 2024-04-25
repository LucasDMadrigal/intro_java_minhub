//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person persona1 = new Person("Lucas", "Madrigal", "123456789", 30, 1.75, true, new String[]{"Seneca", "Camila", "Molly"});
        Person persona2 = new Person("Daniel", "Beltran", "987654321", 25, 1.80, false, new String[]{"Duke", "Teo"});

        System.out.println("Tus detalles:");
        persona2.presentacion();
        System.out.println("\nDetalles de tu amigo:");
        persona1.presentacion();

    }
}