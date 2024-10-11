package ejercicios09102024;
import java.util.Scanner;
import java.util.Random;

public class buscaminas {
	
	public static void main (String[]args) {
		 int filas = 5;  // Número de filas del tablero
	        int columnas = 5; // Número de columnas del tablero
	        int minas = 5; // Número de minas
	        char[][] tablero = new char[filas][columnas];
	        boolean[][] minasUbicadas = new boolean[filas][columnas];
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        // Inicializa el tablero
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                tablero[i][j] = '-'; // Marcador de espacio no descubierto
	                minasUbicadas[i][j] = false; // Marca si hay mina
	            }
	        }

	        // Coloca las minas en el tablero
	        for (int i = 0; i < minas; i++) {
	            int fila, columna;
	            do {
	                fila = random.nextInt(filas);
	                columna = random.nextInt(columnas);
	            } while (minasUbicadas[fila][columna]); // Evita colocar una mina donde ya hay una
	            minasUbicadas[fila][columna] = true;
	            tablero[fila][columna] = '*'; // Marca la mina en el tablero
	        }

	        // Juego
	        int descubiertos = 0;
	        while (descubiertos < (filas * columnas - minas)) {
	            // Muestra el tablero
	            mostrarTablero(tablero);
	            System.out.print("Ingresa fila (0-" + (filas - 1) + "): ");
	            int fila = scanner.nextInt();
	            System.out.print("Ingresa columna (0-" + (columnas - 1) + "): ");
	            int columna = scanner.nextInt();

	            // Verifica si la posición es válida
	            if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas) {
	                System.out.println("Posición inválida. Intenta de nuevo.");
	                continue;
	            }

	            // Descubre la celda
	            if (minasUbicadas[fila][columna]) {
	                System.out.println("¡Has perdido! Encontraste una mina.");
	                break;
	            } else {
	                tablero[fila][columna] = '0'; // Marca como descubierto
	                descubiertos++;
	            }
	        }

	        // Fin del juego
	        if (descubiertos == (filas * columnas - minas)) {
	            System.out.println("¡Felicidades! Has descubierto todas las celdas sin minas.");
	        }
	        scanner.close();
	    }

	    // Método para mostrar el tablero
	    public static void mostrarTablero(char[][] tablero) {
	        System.out.println("Tablero:");
	        for (char[] fila : tablero) {
	            for (char celda : fila) {
	                System.out.print(celda + " ");
	            }
	            System.out.println();
	        }
	    }
	}

