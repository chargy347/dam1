package ejercicios23102024ARRAYSD;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        // 1. Crear un ArrayList de cadenas (String)
        ArrayList<String> nombres = new ArrayList<>();

        // 2. Crear un Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa nombres. Escribe 'fin' para terminar.");

        // 3. Usar un bucle while para permitir la entrada hasta que el usuario escriba "fin"
        String nombre;
        while (true) {
            System.out.print("Ingresa un nombre: ");
            nombre = scanner.nextLine();
            
            // Si el usuario escribe "fin", se corta
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            // Agregar el nombre
            nombres.add(nombre);
        }

        // 4. Imprimir los  nombre
        System.out.println("Nombres ingresados:");
        for (String n : nombres) {
            System.out.println(n);
        }

        // 5. Eliminar un nommbre
        System.out.print("Ingresa el nombre que deseas eliminar: ");
        String nombreEliminar = scanner.nextLine();

        // 6. Eliminar el nombre si existe
        if (nombres.remove(nombreEliminar)) {
            System.out.println(nombreEliminar + " ha sido eliminado de la lista.");
        } else {
            System.out.println("El nombre no está en la lista.");
        }

        // Mostrar la lista de nuevo
        System.out.println("Lista actualizada de nombres:");
        for (String n : nombres) {
            System.out.println(n);
        }
        scanner.close();
    }
}
