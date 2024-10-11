package ejercicios09102024;
import java.util.Scanner;
public class ejercicio02 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa numero");
        double n = scanner.nextInt();
        int r = 0;
        for (int i = 0; i <= n; i++) {
        	r = i+r;
        	System.out.println(r);
        }
	}
}
