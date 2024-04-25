import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu {
    private CalculatorOperations calculator;
    private Scanner scanner;

    public CalculatorWithMenu(CalculatorOperations calculator) {
        this.calculator = calculator;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void displayMenu() {
        System.out.println("Calculadora Menu");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    @Override
    public void executeOperation(int choice) {
        double num1, num2, result;
        switch (choice) {
            case 1:
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                result = calculator.add(num1, num2);
                System.out.println("El resultado de la suma es: " + result);
                break;
            case 2:
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                result = calculator.subtract(num1, num2);
                System.out.println("El resultado de la resta es: " + result);
                break;
            case 3:
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
                result = calculator.multiply(num1, num2);
                System.out.println("El resultado de la multiplicación es: " + result);
                break;
            case 4:
                System.out.print("Ingrese el numerador: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el denominador: ");
                num2 = scanner.nextDouble();
                try {
                    result = calculator.divide(num1, num2);
                    System.out.println("El resultado de la división es: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case 5:
                System.out.println("Saliendo de la calculadora.");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
