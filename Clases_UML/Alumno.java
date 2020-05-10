package Clases_UML;

public class Alumno {
	String nombre;
	String Apellido;
	int edad;
	
	public Alumno() {}
	public Alumno(String nombre,String Apellido, int edad) {
		this.nombre= nombre;
		this.Apellido= Apellido;
		this.edad=edad;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return this.Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	public void Aprobar_Examen(String Examen) {
		
	}
	public void Asistir_Clase(String Aula) {
		
	}
}


