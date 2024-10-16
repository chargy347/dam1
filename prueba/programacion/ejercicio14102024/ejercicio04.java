package ejercicio14102024;

public class ejercicio04 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        
        int[] inverso = new int[n.length];
        
        for (int i = 0; i < n.length; i++) {
            inverso[i] = n[n.length - 1 - i];
        }
        System.out.println("Array invertido:");
        for (int i = 0; i < inverso.length; i++) {
            System.out.print(inverso[i] + " ");
        }
    }
}
