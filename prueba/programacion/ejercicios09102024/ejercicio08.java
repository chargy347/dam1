package ejercicios09102024;
import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero:");
        String numero = scanner.nextLine();      
        String invertido = "";  
        
        for (int i = numero.length() - 1; i >= 0; i--) {
            invertido += numero.charAt(i);
        }
        System.out.println("El número invertido es: " + invertido);
    }
}
