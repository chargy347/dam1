package ejercicios14102024;

public class ejercicio03 {
    public static void main(String[] args) {
    	//array  de 3 num
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //creamos 2 contendores donde se almacenaran los num
        int mayor = n[0];
        int menor = n[0];
        //recorrerá la cadena en busca del mayor y del menor
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
