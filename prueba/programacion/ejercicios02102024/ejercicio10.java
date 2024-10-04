package ejercicios02102024;

public class ejercicio10 {
	public static void main(String[]agrs) {
		int precioBase = 20;
		double iva = 0.21;
		double precioFinal = precioBase + (precioBase*iva);
		System.out.println("El precio final con IVA es: " + precioFinal);
	}
}

