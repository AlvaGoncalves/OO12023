package examenOO1;

import java.time.LocalDate;

public class Inscripcion {
	private LocalDate fecha;
	private double monto;
	private Usuario usuario;
	private Curso curso;
	
	public Inscripcion(double monto, Usuario usuario, Curso curso) {
		this.fecha = LocalDate.now();
		this.monto = monto;
		this.usuario = usuario;
		this.curso = curso;
	}

	public boolean estaInscripto(Usuario usuario) {
		return this.usuario.equals(usuario);
	}

	public void darBonoAInscripto(double bono) {
		usuario.darBono(bono);
	}
	
	public Curso getCurso() {
		return this.curso;
	}
	
	public double getMonto() {
		return this.monto;
	}
	
}
