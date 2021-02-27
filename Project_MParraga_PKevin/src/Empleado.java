
public class Empleado extends Persona{ //Extension de la clase Persona
	
	private String cargo;
	private String sueldo;
	
	//CONSTRUCTOR
	public Empleado(String nombre, int cedula,String cargo, String sueldo) {
		super(nombre, cedula);
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSueldo() {
		return sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [ nombre=" + nombre + ", cedula=" + cedula + "cargo=" + cargo + ", sueldo=" +sueldo + "]";
	}
}
