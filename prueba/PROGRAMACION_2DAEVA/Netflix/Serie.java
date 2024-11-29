package Netflix;

public class Serie {
	
	private String nombre;
	private int temporada;
	private int captitulo;
	
	//constructor-------------------------------
	
	public Serie(String nombre, int temporada, int captitulo) {
		super();
		this.nombre = nombre;
		this.temporada = temporada;
		this.captitulo = captitulo;
	}
	
	//getters y setters-------------------------------
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public int getCaptitulo() {
		return captitulo;
	}

	public void setCaptitulo(int captitulo) {
		this.captitulo = captitulo;
	}


}
