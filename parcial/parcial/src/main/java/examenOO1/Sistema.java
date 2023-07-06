package examenOO1;

import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
	List<Usuario> usuarios;
	List<Curso> cursos;
	
	public Sistema() {
		this.usuarios = new ArrayList<Usuario>();
		this.cursos = new ArrayList<Curso>();
	}
	
	public Usuario crearUsuario(String nombreUsuario, String email, String clave) {
		Usuario nuevoUsuario = new Usuario(nombreUsuario, email, clave);
		this.usuarios.add(nuevoUsuario);
		return nuevoUsuario;
	}
	
	public Inscripcion incribirUsuarioEnCurso(Usuario usuario, Curso curso) {
		return curso.inscribir(usuario);
	}
	
	public Valoracion valorarCurso(Usuario usuario, Curso curso, int calificacion, String comentario) {
		return curso.valorar(usuario, calificacion, comentario);
	}
	
	public CursoGrabado crearCursoGrabado(String nombre, String descripcion, double precio) {
		CursoGrabado cursoGrabado = new CursoGrabado(nombre, descripcion, precio);
		this.cursos.add(cursoGrabado);
		return cursoGrabado;
	}
	
	public CursoEnVivo crearCursoEnVivo(String nombre, String descripcion, double precio, LocalDate fechaComienzo, int cupoMinimo, int cupoMaximo, double porcentajeBono) {
		CursoEnVivo cursoEnVivo = new CursoEnVivo(nombre, descripcion, precio, fechaComienzo, cupoMinimo, cupoMaximo, porcentajeBono);
		this.cursos.add(cursoEnVivo);
		return cursoEnVivo;
	}
	
	// Una alternativa para no hacer esta consulta
	// es hacer que el usuario conozca también a la inscripción
	// pero OJO que puede traer problemas de consistencia
	public List<Inscripcion> inscripcionesDeUsuario(Usuario usuario) {
		return this.cursos.stream().map(curso -> curso.getInscripcionDeUsuario(usuario)).filter(curso -> curso != null).collect(Collectors.toList());
	}
	
	public double promedioInscriptosEnCursosGrabados() {
		return this.cursos.stream().filter(curso -> curso.estaGrabado()).mapToDouble(curso -> curso.cantidadInscriptos()).average().orElse(0);
	}
	
	public double promedioInscriptosEnCursosEnVivo() {
		return this.cursos.stream().filter(curso -> !curso.estaGrabado()).mapToDouble(curso -> curso.cantidadInscriptos()).average().orElse(0);
	}
	
	public List<Curso> cursosMejorValorados() {
		return this.cursos.stream().sorted((c1,c2) -> Double.compare(c2.valoracionPromedio(), c1.valoracionPromedio())).limit(10).collect(Collectors.toList());
	}
	
}
