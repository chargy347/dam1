package ejercicios14102024;

import java.util.Arrays;
import java.util.Random;

public class ejercicio07 {

    public static void main(String[] args) {
        Random random = new Random();

        // Crear un array de 10
        int[] n = new int[10];
        
        for (int i = 0; i < n.length; i++) {
            n[i] = random.nextInt(10) + 1;
        }

        System.out.print("Array original: ");
        System.out.println(Arrays.toString(n));

        Arrays.sort(n);
        
        System.out.print("Array ordenado: ");
        System.out.println(Arrays.toString(n));
    }
}
