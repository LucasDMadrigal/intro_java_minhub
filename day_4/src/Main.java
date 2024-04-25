import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculatorOperations calculator = new Calculator();
        CalculatorMenu calculatorMenu = new CalculatorWithMenu(calculator);

        while (true) {
            calculatorMenu.displayMenu();

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            calculatorMenu.executeOperation(choice);

            if (choice == 5) {
                break;
            }
        }
    }
}