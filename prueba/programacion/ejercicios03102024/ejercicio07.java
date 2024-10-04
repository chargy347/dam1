package ejercicios03102024;
import java.util.Scanner;
public class ejercicio07 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa numero: ");
        String n = scanner.nextLine();
        scanner.close();
        
        int largo = n.length();
        System.out.println("el " + n + " tiene: " + largo + " digitos");
	}
}