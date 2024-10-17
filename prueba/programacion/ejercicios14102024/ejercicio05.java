package ejercicios14102024;
import java.util.HashSet;

public class ejercicio05 {
    public static void main(String[] args) {
    	// Array de 10
        int[] n = {1, 2, 3, 4, 5, 6, 7, 7, 9};
        //Busca num repetidos
        HashSet<Integer> vistos = new HashSet<>();
        HashSet<Integer> repetidos = new HashSet<>();
        //los repetidos se incluiran en una lista
        for (int num : n) {
            if (!vistos.add(num)) {
                repetidos.add(num);
            }
        }

        System.out.println("Números repetidos: " + repetidos);
    }
}
