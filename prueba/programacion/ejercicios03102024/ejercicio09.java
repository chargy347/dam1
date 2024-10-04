package ejercicios03102024;
import java.util.Random;
import java.util.Scanner;

public class ejercicio09 {
	public static void main(String[] args) {
		Random randomN = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un número entre 1 y 100:");
		int n = scanner.nextInt();
		scanner.close();
		
		int numeroAleatorio = randomN.nextInt(100) + 1;
		
        if(n == numeroAleatorio) {
        	System.out.println("¡Has acertado! El número era: " + numeroAleatorio);
        } else {
        	System.out.println("Bruh. El número correcto era: " + numeroAleatorio);
        }
	}
}

