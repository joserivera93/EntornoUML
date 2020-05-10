package Clases_UML;

public class Examen {

	float nota;
	String Asignatura;
	
	public Examen() {}
	public Examen(float nota, String Asignatura) {
		this.nota=nota;
		this.Asignatura=Asignatura;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public String getAsignatura() {
		return Asignatura;
	}
	public void setAsignatura(String asignatura) {
		Asignatura = asignatura;
	}
	public boolean nota(String Examen) {
		return false;
	}
	public boolean Realizar_Examen(String Profesor) {
		return true;
	}
}
