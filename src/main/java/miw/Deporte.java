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
	
	public String mayuscula(){
		return this.nombre.toUpperCase();
	}
	
	public String minuscula(){
		return this.nombre.toLowerCase();
	}
}
