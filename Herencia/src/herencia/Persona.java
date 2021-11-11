package herencia;

public class Persona {
//Java no tiene herencia multiple
	//1-1
	private int edad;
	private float peso;
	private String nombre;
	
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//constructor con parametros
	public Persona(int edad, float peso, String nombre) {
		super();
		this.edad = edad;
		this.peso = peso;
		this.nombre = nombre;
			}
	public Persona() {};
	//constructor sin parametros
}
