package ejercicios09102024;
import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero:");
        int n = scanner.nextInt();
        if (n < 0) {
            n = -n;
        }    
        int contador = 0;
        do {
            n /= 10;
            contador++;
        } while (n > 0); 
        System.out.println("El número tiene " + contador + " dígito(s).");
    }
}
