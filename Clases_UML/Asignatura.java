package Clases_UML;

public class Asignatura {

	String Nombre;
	String Profesor;
	int Curso;
	
	public Asignatura(String nombre, String profesor, int curso) {
		super();
		Nombre = nombre;
		Profesor = profesor;
		Curso = curso;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getProfesor() {
		return Profesor;
	}

	public void setProfesor(String profesor) {
		Profesor = profesor;
	}

	public int getCurso() {
		return Curso;
	}

	public void setCurso(int curso) {
		Curso = curso;
	}
	public void Dar(String Profesor)	{
		
	}
	public boolean Aprobar(String Alumno) {
		return true;
	}
}
