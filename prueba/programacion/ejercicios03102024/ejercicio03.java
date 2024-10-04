package ejercicios03102024;
import java.util.Scanner;

public class ejercicio03 {
	public static void main (String[]agrs) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa la nota del alumno");
        int puntuacion = scanner.nextInt();
        scanner.close();
		
		if (puntuacion >=90) {
			System.out.println("A");
		}else if(puntuacion >=80) {
			System.out.println("B");
		}else if(puntuacion >=70) {
			System.out.println("C");
		}else if(puntuacion >=60) {
			System.out.println("D");
		}else if(puntuacion <60) {
			System.out.println("F");
		}
	}
}
