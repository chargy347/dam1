package ejercicios09102024;
import java.util.Scanner;
public class ejercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa numero");
        double n = scanner.nextInt();
        
		System.out.println("Ingresa numero2");
        double n2 = scanner.nextInt();
        
		System.out.println("Ingresa opeeracion: ");
		System.out.println("1.suma, 2.resta, 3.multi, 4.divi");
        int q = scanner.nextInt();
        scanner.close();
        
        switch(q) {
        case 1:
        	double  suma = n + n2;
        	System.out.println("El resultado es: " + suma);
        	break;
        case 2:
        	double  resta = n - n2;
        	System.out.println("El resultado es: " + resta);
        	break;
        case 3:
        	double  mult = n * n2;
        	System.out.println("El resultado es: " + mult);
        	break;
        case 4:
        	double  div = n / n2;
        	System.out.println("El resultado es: " + div);
        	break;
        }
	}

}
