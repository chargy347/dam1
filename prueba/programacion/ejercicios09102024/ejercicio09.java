package ejercicios09102024;
import java.util.Scanner;
public class ejercicio09 {
    public static void main(String[] args) {
    	//declaramos numeros
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[10];
        int sumaPares = 0, sumaImpares = 0;
        //preguntar numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            n[i] = scanner.nextInt();
            //condicion de par o impar
            if (n[i] % 2 == 0) {
                sumaPares += n[i]; //2+4+6+8+10=30
            } else {
                sumaImpares += n[i]; //1+3+5+7+9=25
            }
        }
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);
    }
}