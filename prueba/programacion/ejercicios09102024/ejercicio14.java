package ejercicios09102024;
import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int d = n; d > i; d--) {
                System.out.print(" ");
            }
            for (int d = 1; d <= (2 * i - 1); d++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
	}

}
