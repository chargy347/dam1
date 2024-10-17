package ejercicios14102024;
import java.util.HashSet;

public class ejercicio05 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 7, 9};

        HashSet<Integer> vistos = new HashSet<>();
        HashSet<Integer> repetidos = new HashSet<>();

        for (int num : n) {
            if (!vistos.add(num)) {
                repetidos.add(num);
            }
        }

        System.out.println("Números repetidos: " + repetidos);
    }
}
