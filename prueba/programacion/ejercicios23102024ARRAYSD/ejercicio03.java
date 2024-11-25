package ejercicios23102024ARRAYSD;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        // 1. Crear un ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Crear un Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar 10 num
        System.out.println("Por favor, ingresa 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int numero = scanner.nextInt(); // Leer el n
            numeros.add(numero); // Agregarlo n al ArrayList
        }

        // 2. Solicitar al usuario un número para buscar en el ArrayList
        System.out.print("\nIngresa un número para buscar en el ArrayList: ");
        int numeroBuscar = scanner.nextInt();

        // 3. Verificar num 
        if (numeros.contains(numeroBuscar)) {
            int indice = numeros.indexOf(numeroBuscar); // decir la posicion
            System.out.println("El número " + numeroBuscar + " se encuentra en el índice: " + indice);
        } else {
            System.out.println("El número " + numeroBuscar + " no está presente en el ArrayList.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}