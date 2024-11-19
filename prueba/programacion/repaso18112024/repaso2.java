package repaso18112024;

public class repaso2 {
	public static void main(String[]args){
		int[] valores = {3,7,2,8,4};
		int mayor = valores[0];
		for (int i=1; i<valores.length;i++) {
			if(valores[i]>mayor) {
				mayor = valores[i];
				System.out.println(mayor);
			}
		}
		int menor = valores[0];
		for (int i=1; i>valores.length;i++) {
			if(valores[i]<menor) {
				menor = valores[i];
				System.out.println(menor);
			}
		}
	}
}
