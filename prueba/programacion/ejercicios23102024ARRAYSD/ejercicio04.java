package ejercicios23102024ARRAYSD;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        // Crear un ArrayList de enteros con 10 elementos
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Inicializar el ArrayList con 10 elementos (valores por defecto del 1 al 10, por ejemplo)
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        // Imprimir el ArrayList inicial
        System.out.println("Lista inicial: " + numeros);

        while (true) {
            // Solicitar al usuario que ingrese el índice del elemento a modificar
            System.out.println("Ingrese el índice del elemento que desea actualizar (0-9) o un número negativo para salir:");
            int indice = scanner.nextInt();

            // Si el usuario ingresa un índice negativo, salir del bucle
            if (indice < 0) {
                break;
            }

            // Validar que el índice esté en el rango permitido (0-9)
            if (indice >= 0 && indice < numeros.size()) {
                // Solicitar el nuevo valor para la posición indicada
                System.out.println("Ingrese el nuevo valor para la posición " + indice + ":");
                int nuevoValor = scanner.nextInt();

                // Actualizar el elemento en la posición indicada
                numeros.set(indice, nuevoValor);

                // Imprimir el ArrayList actualizado
                System.out.println("Lista actualizada: " + numeros);
            } else {
                System.out.println("Índice fuera de rango. Intente nuevamente.");
            }
        }

        // Cerrar el escáner
        scanner.close();
    }
}
