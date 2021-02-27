package mundo;

public class Persona {
	
	//Atributos
	protected String nombre;
	protected int cedula;
	
	//Constructores
	public Persona(String nombre, int cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}
	
	public Persona() {
		this.nombre = "";
		this.cedula = 0;
	}
	
	public Persona(String nombre) {
		this.nombre = "nombre";
		this.cedula = 0;
	}

	//Metodos getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	//Metodo to String
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	
}
