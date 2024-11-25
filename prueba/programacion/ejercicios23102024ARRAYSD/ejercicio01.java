package ejercicios23102024ARRAYSD;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        // 1. Crear un ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<>();

        // 2. Crear un Scanner
        Scanner scanner = new Scanner(System.in);

        // 3. Solicitar 5 num
        System.out.println("Por favor, ingresa 5 números enteros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();  // Leer el número ingresado
            numeros.add(numero);  // 4. Agregar el número al ArrayList
        }

        // 5. Imprimir el contenido del ArrayList
        System.out.println("\nContenido del ArrayList:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
