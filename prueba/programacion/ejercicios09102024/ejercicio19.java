package ejercicios09102024;
import java.util.Random;
import java.util.Scanner;


public class ejercicio19 {
	public static void main(String[] args) {
        int intentos = 5;
        Random random = new Random();
        int nran = random.nextInt(100) + 1;
        System.out.println("Número aleatorio entre 1 y 100: " + nran);
        
        do {
        	Scanner scanner = new Scanner(System.in);
    		System.out.println("Ingresa numero");
            int n = scanner.nextInt();
            
            
            if (n ==  nran) {
            	System.out.println("acertaste siuuu");
            }else {
            	System.out.println("bruh");
            	intentos = intentos-1;
            	System.out.println("te quedan :" + intentos + " intentos");
            }
        }while(intentos >  0);

	}
}
