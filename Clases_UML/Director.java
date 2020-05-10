package Clases_UML;

public class Director {
	String nombre;
	String Apellido;
	int edad;
	
	public Director() {}
	public Director(String nombre,String Apellido, int edad) {
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
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void Contratar(String Trabajador) {
		
	}
	public void Despedir(String Trabajador) {
		
	}
}
