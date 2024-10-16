package ejercicio14102024;

public class ejercicio06 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6};
        int suma = 0;

        for (int num : n) {
            suma += num;
        }

        double promedio = (double) suma / n.length;
        System.out.println("El promedio de los números es: " + promedio);
    }
}
