package miw;

public class Deporte {
	private int id;
	private String nombre;
	private String descripion;
	private int tiempo;
	private int numeroJugadores;
	
	public Deporte(){
		
	}	
	
	public Deporte(int id, String nombre, String descripion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripion = descripion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripion() {
		return descripion;
	}

	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getNumeroJugadores() {
		return numeroJugadores;
	}

	public void setNumeroJugadores(int numeroJugadores) {
		this.numeroJugadores = numeroJugadores;
	}	
	
	public String mayuscula(){
		return this.nombre.toUpperCase();
	}
	
	public String minuscula(){
		return this.nombre.toLowerCase();
	}

	public String siglas(){
		return this.nombre.substring(0, 3);
	}
	
	public String presentar(){
		return this.nombre+" "+this.descripion+" "+this.numeroJugadores+this.siglas();
	}	
	
	public int duracion(){
		return this.tiempo*2;
	}
	
	public boolean isDeporteLargo(){
		return this.tiempo > 60;
	}
	
	@Override
	public String toString() {
		return "Deporte [id=" + id + ", nombre=" + nombre + ", descripion="
				+ descripion + "]";
	}
	
	public double medioTiempo(){
		return this.tiempo/3;
	}
}
