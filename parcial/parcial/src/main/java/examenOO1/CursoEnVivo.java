package examenOO1;

import java.time.LocalDate;

public class CursoEnVivo extends Curso {
	private LocalDate fechaComienzo;
	private int cupoMinimo;
	private int cupoMaximo;
	private boolean comenzado;
	private double porcentajeBono;
	
	public CursoEnVivo(String nombre, String descripcion, double precio, LocalDate fechaComienzo, int cupoMinimo, int cupoMaximo, double porcentajeBono) {
		super(nombre, descripcion, precio);
		this.fechaComienzo = fechaComienzo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.comenzado = false;
		this.porcentajeBono = porcentajeBono;
	}

	@Override
	public Inscripcion inscribir(Usuario usuario) {
		Inscripcion inscripcion = null;
		if (this.noSuperaInscriptos() && !this.pasoFechaComienzo()) {
			inscripcion = super.inscribir(usuario);
		}
		return inscripcion;
	}
	
	private boolean noSuperaInscriptos() {
		return this.inscripciones.size() < cupoMaximo;
	}
	
	private boolean pasoFechaComienzo() {
		return LocalDate.now().isAfter(this.fechaComienzo);
	}
	
	public boolean comenzarCurso() {
		if (this.comenzado) {
			return false;
		}
		
		this.comenzado = true;
		if (this.superaCupoMinimo()) {
			this.inscripciones.stream().forEach(inscripcion -> inscripcion.darBonoAInscripto(this.bono()));
		}
		return true;
	}
	
	private boolean superaCupoMinimo() {
		return this.inscripciones.size() >= cupoMinimo;
	}
	
	private double bono() {
		return this.precio * (this.porcentajeBono/100.0);
	}

	@Override
	public boolean estaGrabado() {
		return false;
	}
}
