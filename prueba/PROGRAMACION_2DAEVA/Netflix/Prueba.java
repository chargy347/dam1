package Netflix;


public class Prueba {

	public static void main(String[] args) {
		
		Serie ac1 = new Serie ("One piece", 10,  5);
		Serie ac2 = new Serie("Bruh", 3, 5);
		
		System.out.println(ac1.getNombre() + ac1.getCaptitulo() + ac1.getTemporada());
		
		System.out.println(ac2.getNombre() + ac2.getCaptitulo() + ac2.getTemporada());

	}

}
