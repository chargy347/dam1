package ejercicios23102024ARRAYSD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) {
        // Crear un ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Solicitar números al usuario
        System.out.println("Ingrese números (ingrese un número negativo para finalizar):");
        
        while (true) {
            numero = scanner.nextInt();
            
            // Salir si el número es negativo
            if (numero < 0) {
                break;
            }

            // Agregar el número a la lista
            numeros.add(numero);
        }

        // Ordenar el ArrayLITS
        Collections.sort(numeros);

        // Imprimir el ArrayList
        System.out.println("Lista ordenada: " + numeros);

        // Cerrar el escáner
        scanner.close();
    }
}
