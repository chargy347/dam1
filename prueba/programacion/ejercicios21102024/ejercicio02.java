package ejercicios21102024;

public class ejercicio02 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int indiceFilaMax = 0;
        int sumaMax = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }

            if (sumaFila > sumaMax) {
                sumaMax = sumaFila;
                indiceFilaMax = i;
            }
        }

        System.out.println(indiceFilaMax);
    }
}
