/*Implementa una excepción personalizada llamada EdadInvalidaException
 * que se lance si se intenta establecer una edad negativa en una clase Persona.
 * Crea un método que permita establecer la edad y maneje la excepción en el main.*/

package execpciones04112024;
import java.util.Scanner;
import exceptions.EdadInvalidaException;
public class ejercicio02 {
	public static void main(String[]args) {
		//Crear Scanner
		 Scanner scanner = new Scanner(System.in);
		 try {
			//Preguntamos por edad
			 System.out.println("Escribe un numero entero");
			 int edad = scanner.nextInt();
			 if (edad < 0) {
				 throw new EdadInvalidaException("bruh");
			 }
		 	}catch (EdadInvalidaException e) {
			 System.out.println("Edad no valida");
		 }
	}
}
