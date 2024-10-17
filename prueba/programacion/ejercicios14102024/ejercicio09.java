package ejercicios14102024;

public class ejercicio09 {
    public static void main(String[] args) {
        // Array con char
        char[] arrayCaracteres = "Hola Mundo".toLowerCase().toCharArray();

        // Definimos un contador para las vocales
        int contadorVocales = 0;

        // leemos el array de caracteres
        for (int i = 0; i < arrayCaracteres.length; i++) {
            char c = arrayCaracteres[i];
            //condicion si el carácter actual es una vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++; // Incrementamos el contador si es vocal
            }
        }

        // devuelve el resulltado
        System.out.println("Número de vocales en la cadena: " + contadorVocales);
    }
}
