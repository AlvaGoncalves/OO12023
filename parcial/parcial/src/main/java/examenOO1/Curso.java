package examenOO1;

import java.util.List;
import java.util.ArrayList;

public abstract class Curso {
	protected String nombre;
	protected String descripcion;
	protected List<Valoracion> valoraciones;
	protected double precio;
	protected List<Inscripcion> inscripciones;
	
	protected Curso(String nombre, String descripcion, double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.valoraciones = new ArrayList<Valoracion>();
		this.inscripciones = new ArrayList<Inscripcion>();
	}
	
	public Inscripcion inscribir(Usuario usuario) {
		Inscripcion inscripcion = new Inscripcion(usuario.cuantoDebePagar(this.precio), usuario, this);
		this.inscripciones.add(inscripcion);
		return inscripcion;
	}
	
	public Valoracion valorar(Usuario usuario, int calificacion, String comentario) {
		Valoracion valoracion = null;
		if (this.usuarioInscripto(usuario) && (0 < calificacion) && (calificacion < 6)) {
			valoracion = new Valoracion(calificacion, comentario, usuario);
			valoraciones.add(valoracion);
		}
		return valoracion;
	}
	
	public boolean usuarioInscripto(Usuario usuario) {
		return this.inscripciones.stream().anyMatch(inscripcion -> inscripcion.estaInscripto(usuario));
	}
	
	public double valoracionPromedio() {
		return this.valoraciones.stream().mapToDouble(valoracion -> valoracion.calificacion()).average().orElse(0);
	}

	public Inscripcion getInscripcionDeUsuario(Usuario usuario) {
		return this.inscripciones.stream().filter(inscripcion -> inscripcion.estaInscripto(usuario)).findFirst().orElse(null);
	}

	public int cantidadInscriptos() {
		return this.inscripciones.size();
	}

	public abstract boolean estaGrabado();
}
