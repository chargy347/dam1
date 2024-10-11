package ejercicios09102024;
public class ejercicio07 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 y 100:");
        
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            
            for (int p = 2; p <= Math.sqrt(i); p++) {
                if (i % p == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
    }
}
