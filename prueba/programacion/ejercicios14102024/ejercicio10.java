//chat gpt, ni idea

package ejercicios14102024;

public class ejercicio10 {
    public static void main(String[] args) {
        // Creamos un array de ejemplo con 5 números
        int[] array = {1, 2, 3, 4, 5};

        // Imprimimos el array original
        System.out.print("Array original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Almacenamos el último elemento del array
        int ultimoElemento = array[array.length - 1];

        // Desplazamos los demás elementos una posición hacia la derecha
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        // Colocamos el último elemento en la primera posición
        array[0] = ultimoElemento;

        // Imprimimos el array rotado
        System.out.print("\nArray rotado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
