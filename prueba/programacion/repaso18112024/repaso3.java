package repaso18112024;
import java.util.ArrayList;
import java.util.Scanner;
public class repaso3 {

	public static void main(String[] args) {
		//Scanner
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int number = leer.nextInt();
		//ARRAY
		int[] valores = {3,7,2,8,4};
		int mayor = valores[0];
		//for
		for (int i=1; i<valores.length;i++) {
			if(valores[i]>mayor) {
				mayor = valores[i];
				System.out.println(mayor);
			}
		}
		//crear array
        // 1. Crear un ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<>();

        // 2. Crear un Scanner
        Scanner scanner = new Scanner(System.in);

        // 3. Solicitar 5 num
        System.out.println("Por favor, ingresa 5 números enteros:");
        
        //
	}

}
