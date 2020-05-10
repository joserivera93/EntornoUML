package Clases_UML;

public class Instituto {

	String nombre;
	String Ubicacion;
	Boolean Bilingue;
	
	public Instituto() {}
	public Instituto(String nombre, String Ubucacion, Boolean Bilingue) {
		this.nombre=nombre;
		this.Bilingue=Bilingue;
		this.Ubicacion=Ubucacion;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return this.Ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.Ubicacion = ubicacion;
	}
	public Boolean getBilingue() {
		return this.Bilingue;
	}
	public void setBilingue(Boolean bilingue) {
		this.Bilingue = bilingue;
	}
	public void Atraer_Alumno(String Alumno){
		
		
	}
	public void formar(String Persona) {
		
	}
}
