import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
//    MostrarNombreYApellido();
//    WelcomeMessage();
//    LargestNumber();
//    evenOrOdd();
//    sameString();
//    numeroPrimo();
//    sumandoImpares();
//    sumandoPrimos();
//    MenuCalculadora();
//    sumandoPrimos();
//        MenuCalculadora();
        Bowling();
    }

    public static void MostrarNombreYApellido() {
        Scanner prompt = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = prompt.next();

        System.out.println("ingresa tu apellido: ");
        String apellido = prompt.next();

        System.out.println("Nombre y apellido: " + nombre + " " + apellido);
    }

    public static void WelcomeMessage() {
        System.out.println("Welcome!");
    }

    public static void LargestNumber() {
        Scanner prompt = new Scanner(System.in);

        Byte largestNum;
        System.out.println("ingresa un numero: ");
        Byte num1 = prompt.nextByte();

        System.out.println("ingresa otro numero: ");
        Byte num2 = prompt.nextByte();

        System.out.println("ingresa el ultimo numero: ");
        Byte num3 = prompt.nextByte();

        largestNum = num1;

        if ((num2 >= num1) && (num2 >= num3)) {
            largestNum = num2;
        } else if ((num3 >= num1) && (num3 >= num2)) {
            largestNum = num3;
        }

        System.out.println("El numero mas grande es:" + largestNum);
    }

    public static void evenOrOdd() {
        Scanner prompt = new Scanner(System.in);

        System.out.println("ingrese un numero: ");
        Byte num = prompt.nextByte();

        if (num == 0) {
            System.out.println("El numero es 0");
        } else if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("EL numero es impar");
        }
    }

    public static void sameString() {
        Scanner prompt = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase");
        String str1 = prompt.next();
        prompt.skip("\n");
        System.out.println("Ingrese otra palabra o frase");
        String str2 = prompt.next();

        if (str1 == str2) {
            System.out.println("las cadenas son iguales");
        } else {
            System.out.println("las cadenas no son iguales");
        }
    }

    public static void numeroPrimo() {
        Scanner prompt = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        Integer num = prompt.nextInt();
        Integer count = num;
        Boolean isPrime = true;


        if (isPrime(num)) {
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }
    }

    public static void sumandoImpares() {
        Scanner prompt = new Scanner(System.in);

        /*
        POR QUE NO FUNCIONA SI DEFINO con tipo Byte?
        * */
        Integer[] nums = new Integer[0];
        Integer sumaDeImpares = 0;
        Integer num;

        do {
            System.out.println("ingrese un numero mayor a 0, o ingrese 0 para terminar");
            num = prompt.nextInt();
            if (num != 0) {
                nums = Arrays.copyOf(nums, nums.length + 1);
                nums[nums.length - 1] = num;
            }
        }
        while (num != 0);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                sumaDeImpares += nums[i];
            }
        }

        System.out.println("Suma de impares: " + sumaDeImpares);
    }

    //
    public static void sumandoPrimos() {
        Scanner prompt = new Scanner(System.in);
        int sumOfPrimes = 0;
        Integer[] nums = new Integer[0];
        Integer num;


        do {
            System.out.println("ingrese un numero mayor a 0, o ingrese 0 para terminar");
            num = prompt.nextInt();
            if (num != 0) {
                nums = Arrays.copyOf(nums, nums.length + 1);
                nums[nums.length - 1] = num;
            }
        }
        while (num != 0);

        for (int n : nums) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            if (isPrime(n)) {
                sumOfPrimes += n;
            }
        }

        System.out.println("Suma de primos: " + sumOfPrimes);
    }

    public static boolean isPrime(int num) {

        Boolean isPrime = true;

        if (num < 1) {
            isPrime = false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void MenuCalculadora() {
        Scanner prompt = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Calculator Menu");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Ingrese su opcion: ");
            opcion = prompt.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-----------------------------------------");
                    System.out.println("Operacion Suma...");

                    realizarOperacion("suma");
                    System.out.println("-----------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------");
                    System.out.println("Operacion Resta...");
                    System.out.println("-----------------------------------------");
                    realizarOperacion("resta");
                    break;
                case 3:
                    System.out.println("-----------------------------------------");
                    System.out.println("Operacion multiplicacion...");
                    System.out.println("-----------------------------------------");
                    realizarOperacion("multiplicacion");
                    break;
                case 4:
                    System.out.println("-----------------------------------------");
                    System.out.println("Operacion division...");
                    System.out.println("-----------------------------------------");
                    realizarOperacion("division");
                    break;
                case 0:
                    System.out.println("Saliendo! gracias Vuelva prontos...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);

    }

    public static void realizarOperacion(String operation) {
        Scanner prompt = new Scanner(System.in);
        double result;

        System.out.println("Perform " + operation + " operation...");
        System.out.print("Ingrese el primer numero: ");
        double num1 = prompt.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = prompt.nextDouble();

        switch (operation) {
            case "suma":
                result = num1 + num2;
                System.out.println("Resultado: " + result);
                break;
            case "resta":
                result = num1 - num2;
                System.out.println("Resultado: " + result);
                break;
            case "multiplicacion":
                result = num1 * num2;
                System.out.println("Resultado: " + result);
                break;
            case "division":
                if (num2 == 0) {
                    System.out.println("-------------------------------------");
                    System.out.println("Error: No se puede dividir en cero");
                    System.out.println("-------------------------------------");
                } else {
                    result = num1 / num2;
                    System.out.println("-------------------------------------");
                    System.out.println("Resultado: " + result);
                    System.out.println("-------------------------------------");
                }
                break;
            default:
                System.out.println("-------------------------------------");
                System.out.println("Invalid operation.");
                System.out.println("-------------------------------------");
        }
    }


//    public class Bowling {
        private static int capacidadDisponible = 500;
        private static double dineroRecaudado = 0;

        public static void Bowling() {
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\nMenú de la Bowling");
                System.out.println("1. Entrada de datos");
                System.out.println("2. Capacidad disponible");
                System.out.println("3. Dinero recaudado");
                System.out.println("4. Salir del sistema");
                System.out.print("Ingrese su opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        entradaDatos();
                        break;
                    case 2:
                        System.out.println("La capacidad disponible es: " + capacidadDisponible);
                        break;
                    case 3:
                        System.out.println("El dinero recaudado es: $" + dineroRecaudado);
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, intente de nuevo.");
                }
            } while (opcion != 4);

            scanner.close();
        }

        public static void entradaDatos() {
            Scanner scanner = new Scanner(System.in);
            String nombre, id, tipoPase;
            int edad;
            double precioPase;

            System.out.print("Ingrese su nombre: ");
            nombre = scanner.nextLine();
            System.out.print("Ingrese su edad: ");
            edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente
            System.out.print("Ingrese su ID: ");
            id = scanner.nextLine();
            System.out.print("¿Tiene un pase VIP? (Sí/No): ");
            String respuestaVIP = scanner.nextLine().toLowerCase();

            if (edad < 21) {
                System.out.println("Lo siento, solo las personas mayores de 21 años pueden ingresar.");
                return;
            }

            if (respuestaVIP.equals("si")) {
                tipoPase = "VIP";
                precioPase = 0;
            } else {
                System.out.print("¿Tiene un pase con descuento? (Sí/No): ");
                String respuestaDescuento = scanner.nextLine().toLowerCase();
                if (respuestaDescuento.equals("si")) {
                    System.out.println("respuestaDescuento: "+respuestaDescuento);
                    precioPase = 750;
                } else {
                    System.out.print("¿Quiere comprar un pase normal o VIP? (Normal/VIP): ");
                    tipoPase = scanner.nextLine().toUpperCase();
                    precioPase = tipoPase.equals("VIP") ? 2000 : 1500;
                }
            }

            if (precioPase > 0) {
                if (dineroRecaudado + precioPase > Double.MAX_VALUE) {
                    System.out.println("Lo siento, no podemos procesar esta transacción debido a limitaciones de dinero.");
                    return;
                }

                if (precioPase <= dineroRecaudado) {
                    dineroRecaudado -= precioPase;
                } else {
                    System.out.println("No hay suficiente dinero recaudado para comprar el pase.");
                    return;
                }
            }

            if (capacidadDisponible > 0) {
                capacidadDisponible--;
                System.out.println("¡Bienvenido a la bolera, " + nombre + "! Disfrute su tiempo aquí.");
            } else {
                System.out.println("Lo siento, la bolera está llena en este momento.");
            }
//        }
    }
}
