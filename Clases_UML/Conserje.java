package Clases_UML;

public class Conserje {
	String nombre;
	String Apellido;
	int edad;
	
	public Conserje() {}
	public Conserje(String nombre,String Apellido, int edad) {
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
	public boolean cobrar(String Trabajador) {
		return true;
	}
	public void Abrir_Centro(String Instituto) {
		
	}
}
