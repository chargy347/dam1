package ejercicios14102024;

public class ejercicioj08 {
    public static void main(String[] args) {
        //2Arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        //Creamos el array de fusión
        int[] arrayFusionado = new int[array1.length + array2.length];

        //Copiamos los elementos del primer array
        for (int i = 0; i < array1.length; i++) {
            arrayFusionado[i] = array1[i];
        }

        //Copiamos los elementos del segundo array
        for (int i = 0; i < array2.length; i++) {
            arrayFusionado[array1.length + i] = array2[i];
        }

        //nuevo array fusionado
        System.out.print("Array fusionado: ");
        for (int i = 0; i < arrayFusionado.length; i++) {
            System.out.print(arrayFusionado[i] + " ");
        }
    }
}
