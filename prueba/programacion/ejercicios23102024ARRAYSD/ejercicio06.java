package ejercicios23102024ARRAYSD;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ejercicio06 {

    public static void main(String[] args) {
        // Crear un ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese números
        System.out.println("Ingrese números (ingrese un número negativo para finalizar):");
        while (true) {
            int numero = scanner.nextInt();
            // Terminar si el usuario ingresa un número negativo
            if (numero < 0) {
                break;
            }
            // Agregar el número a la lista
            numeros.add(numero);
        }

        // Imprimir el ArrayList original
        System.out.println("Lista original: " + numeros);

        // Eliminar duplicados utilizando un HashSet
        HashSet<Integer> sinDuplicados = new HashSet<>(numeros);
        
        // Convertir de nuevo el HashSet a ArrayList
        numeros.clear();
        numeros.addAll(sinDuplicados);

        // Imprimir el ArrayList sin duplicados
        System.out.println("Lista sin duplicados: " + numeros);

        // Cerrar el escáner
        scanner.close();
    }
}
