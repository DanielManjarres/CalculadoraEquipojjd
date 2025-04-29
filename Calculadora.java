import java.util.Scanner;

public class Calculadora {
    // Suma dos números enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Resta dos números enteros
    public static int restar(int a, int b) {
        return a - b;
    }

    // Multiplica dos números enteros
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Divide dos números enteros, manejando división por cero
    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Calculadora del Equipo JJD!");

        while (true) {
            // Mostrar menú
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Opción (1-5): ");

            int opcion;
            try {
                opcion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar buffer
                continue;
            }

            if (opcion == 5) {
                System.out.println("¡Gracias por usar la calculadora!");
                break;
            }

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción inválida. Seleccione 1, 2, 3, 4 o 5.");
                continue;
            }

            // Solicitar números
            System.out.print("Ingrese el primer número: ");
            int num1;
            try {
                num1 = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                scanner.nextLine();
                continue;
            }

            System.out.print("Ingrese el segundo número: ");
            int num2;
            try {
                num2 = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                scanner.nextLine();
                continue;
            }

            // Ejecutar operación
            try {
                if (opcion == 1) {
                    System.out.println("Resultado de la suma: " + sumar(num1, num2));
                } else if (opcion == 2) {
                    System.out.println("Resultado de la resta: " + restar(num1, num2));
                } else if (opcion == 3) {
                    System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
                } else {
                    System.out.println("Resultado de la división: " + dividir(num1, num2));
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
