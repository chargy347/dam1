package biblioteca;
import java.util.Scanner;
public class biblioteca {
	public static void main (String [] args) {
		//home
		System.out.println("Hola mundo");
		System.out.println("Selecctiona una opcion \n 1.inicio \n 2.registo \n 3.consultar libros"  );
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un número entre 1 y 100:");
		int opcion = scanner.nextInt();
		scanner.close();
	}
}
