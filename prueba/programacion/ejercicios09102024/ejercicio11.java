package ejercicios09102024;
import java.util.Scanner;
import java.util.Random;

public class ejercicio11 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa numero");
        int n = scanner.nextInt();
        
        Random random = new Random();
        int nran = random.nextInt(100) + 1;
        System.out.println("Número aleatorio entre 1 y 100: " + nran);
        
        if (n ==  nran) {
        	System.out.println("acertaste siuuu");
        }else {
        	System.out.println("bruh");
        }
	}
}
