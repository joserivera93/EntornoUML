package Clases_UML;

public class Formacion {

	String NombreEstudio;
	String Fecha;
	
	public Formacion() {}
	public Formacion(String NombreEstudio, String Fecha) {
		this.NombreEstudio=NombreEstudio;
		this.Fecha=Fecha;
	}
	public String getNombreEstudio() {
		return NombreEstudio;
	}
	public void setNombreEstudio(String nombreEstudio) {
		NombreEstudio = nombreEstudio;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public boolean Habilitado(String Persona) {
		return true;
	}
}
