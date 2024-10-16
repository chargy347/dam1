package biblioteca;
import java.util.Scanner;
public class biblioteca {
	public static void main (String [] args) {
		//home
		Scanner scanner = new Scanner(System.in);

		System.out.println("Selecctiona una opcion \n 1.inicio \n 2.registo \n 3.consultar disponibilidad libros"  );
		
	
		int opcion = scanner.nextInt();
	
		switch (opcion){
		//iniciar sesion
		case 1:
			System.out.println("Introduzca el usuario: ");
			int user = scanner.nextInt();
			System.out.println("Introduzca la contraseña: ");
			int pass = scanner.nextInt();
		break;
		
		//registro
		case 2:
			System.out.println("Introduzca el nombre usuario: ");
			int user2 = scanner.nextInt();
			System.out.println("Introduzca el contraseña: ");
			int pass2 = scanner.nextInt();
			System.out.println("Introduzca el nombre: ");
			int name = scanner.nextInt();
			System.out.println("Introduzca el apellido: ");
			int surname = scanner.nextInt();
			System.out.println("Introduzca el Fecha de nacimiento: ");
			int date = scanner.nextInt();
			System.out.println("Introduzca el DNI: ");
			int dni = scanner.nextInt();
		break;
		//
		case 3:
			System.out.println("bruh");
		break;
		}
	}
}
