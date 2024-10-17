package ejercicios14102024;

public class ejercicio02 {
    public static void main(String[] args) {
    	//array
        int[] n = {1, 2, 3, 4, 5};
        int suma = 0;
        //Bucle para sumar cada caracter dentro del aarray
        for (int i = 0; i < n.length; i++) {
            suma += n[i];
        }

        System.out.println("La suma de los elementos del array es: " + suma);
    }
}
