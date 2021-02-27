
public class Empleado extends Persona{ //Extension de la clase Persona
	
	private String cargo;
	private String sueldo;
	
	//CONSTRUCTOR
	public Empleado(String nombre, int cedula,String cargo, String sueldo) {
		super(nombre, cedula);
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
}
