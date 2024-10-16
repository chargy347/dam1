package ejercicio14102024;

public class ejercicio03 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int mayor = n[0];
        int menor = n[0];
        
        for (int i = 1; i < n.length; i++) {
            if (n[i] > mayor) {
                mayor = n[i];
            }
            if (n[i] < menor) {
                menor = n[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
