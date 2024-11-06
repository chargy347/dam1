/* Crea un programa que pida al usuario que ingrese un número positivo.
 * Si el usuario ingresa un número negativo o no numérico, debes lanzar y manejar una excepción
 * que imprima un mensaje de error adecuado.*/


package execpciones04112024;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio01 {
	public static void main (String[]args) {
		//Crear Scanner
		 Scanner scanner = new Scanner(System.in);
		 
		//creamos el try
		 try {
			 //Preguntamos por un numero
			 System.out.println("Escribe un numero entero");
			 int n = scanner.nextInt();
			 //Condicion de que sea positivo
			 if (n<0) {
				 throw new IllegalArgumentException ("Debe ser positivo");
			}
		 }
		 //catch con la excepcion de Input Mismach
		 catch(InputMismatchException e) {
			 System.out.println("Tiene que ser un número entero positivo");
		 }
	}
}
