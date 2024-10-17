package ejercicios14102024;

public class ejercicio04 {
    public static void main(String[] args) {
    	//array de 5
        int[] n = {1, 2, 3, 4, 5};
        //longitud del array con leght
        int[] inverso = new int[n.length];
        //bucle
        for (int i = 0; i < n.length; i++) {
            inverso[i] = n[n.length - 1 - i];
        }//bucle para añadir para nuevo array
        System.out.println("Array invertido:");
        for (int i = 0; i < inverso.length; i++) {
            System.out.print(inverso[i] + " ");
        }
    }
}
