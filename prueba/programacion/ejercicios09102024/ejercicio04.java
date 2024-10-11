package ejercicios09102024;
import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero positivo:");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("El número debe ser un entero positivo.");
        } else {
            int factorial = 1;
            for (int i = n; i > 0; i--) {
                factorial *= i;
            }
            System.out.println("El factorial de " + n + " es: " + factorial);
        }
        scanner.close();
    }
}
