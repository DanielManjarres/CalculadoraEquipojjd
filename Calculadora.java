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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Calculadora del Equipo JJD!");

        while (true) {
            // Mostrar menú
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Salir");
            System.out.print("Opción (1-3): ");

            int opcion;
            try {
                opcion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar buffer
                continue;
            }

            if (opcion == 3) {
                System.out.println("¡Gracias por usar la calculadora!");
                break;
            }

            if (opcion != 1 && opcion != 2) {
                System.out.println("Opción inválida. Seleccione 1, 2 o 3.");
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
            if (opcion == 1) {
                System.out.println("Resultado de la suma: " + sumar(num1, num2));
            } else {
                System.out.println("Resultado de la resta: " + restar(num1, num2));
            }
        }

        scanner.close();
    }
}
