package ejecucion;

import mundo.Empleado;
import mundo.Estudiante;
import mundo.Persona;

public class Ejecutable {
	
	public static void main(String []args) {
		
		Persona p1 = new Persona("Juan Perez", 78748374);
		
		System.out.println(p1.toString());
		
		Estudiante e1 = new Estudiante("Juan Perez", 78748374, "L000123", "juan@espe.edu.ec", "ITIN");
		System.out.println(e1.toString());
		Empleado emple1 = new Empleado("Maria", 424342234, "Gerente", "1800");
		System.out.println(emple1.toString());
	}
}
