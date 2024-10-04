package ejercicios02102024;

public class ejercicio08 {
	public static void main(String[] agrs) {
		boolean a = true;
		boolean b = false;
		
		boolean And = a && b; 
        boolean Or = a || b;  
        boolean Nota = !a;
        boolean Notb = !b;
        
        System.out.println("a AND b: " + And);
        System.out.println("a OR b: " + Or);
        System.out.println("NOT a: " + Nota);
        System.out.println("NOT b: " + Notb);
	}
}
