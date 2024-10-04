package ejercicios03102024;
import java.util.Scanner;
public class ejercicio06 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa numero");
        int n = scanner.nextInt();
        scanner.close();
        
        for (int i = 1; i <= 10; i++) {
        	int r = n*i;
        	System.out.println(r);
        }
	}

}
