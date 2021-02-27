
public class Estudiante extends Persona{ 	//Extension de la clase Persona
	
	//atributos
	
		private String codigo;
		private String email;
		private String carrera;
		
		//Constructor 
		// Aqui ya se aplica Herencia porque hereda atributos de la superclase Persona
		public Estudiante(String nombre, int cedula, String codigo, String email, String carrera) {   //datos para crear el constructor estudiante
			super(nombre, cedula);   //manda a ejecutar a super, de la superclase Persona, que se inicializa sus atributos
			//inicializa los atributos propios de la clase estudiante
			this.codigo = codigo;
			this.email = email;
			this.carrera = carrera;
		}
		
		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCarrera() {
			return carrera;
		}

		public void setCarrera(String carrera) {
			this.carrera = carrera;
		}

		@Override
		public String toString() {
			super.toString();
			return "Persona "+ super.toString()+"Estudiante [codigo=" + codigo + ", email=" + email + ", carrera=" + carrera + "]";
		}
}
