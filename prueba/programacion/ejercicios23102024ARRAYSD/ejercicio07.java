package ejercicios23102024ARRAYSD;

import java.util.ArrayList;
import java.util.Random;

public class ejercicio07 {

    public static void main(String[] args) {
        // Crear un ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        // Llenar el ArrayList con 10 números aleatorios entre 1 y 100
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100) + 1); // Genera un número entre 1 y 100
        }

        // Imprimir el ArrayList
        System.out.println("ArrayList: " + numeros);

        // Convertir el ArrayList en un array normal de enteros
        Integer[] array = numeros.toArray(new Integer[0]);

        // Imprimir el array
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
