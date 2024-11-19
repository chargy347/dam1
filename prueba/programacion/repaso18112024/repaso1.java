package repaso18112024;
import java.util.Scanner;

public class repaso1 {
	public static void main (String []args) {
		//leer numero
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un numero enntero");
		int n = leer.nextInt();
		//numeros pares hasta n
		int suma = 0;
		for(int i=0; i<=n; i = i+2) {
			suma = suma +  i;
			System.out.println(suma);
		}
			
	}
}