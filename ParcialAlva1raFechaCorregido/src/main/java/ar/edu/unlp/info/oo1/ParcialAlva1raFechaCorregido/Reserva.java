package ar.edu.unlp.info.oo1.ParcialAlva1raFechaCorregido;

import java.time.LocalDate;

public class Reserva {
	private DateLapse dateLapse;
	private Usuario inquilino;
	private double precioFinal;
	
	
	public Reserva(Usuario inquilino, LocalDate fechaInicio, LocalDate fechaFin, double precioFinal) {
		this.dateLapse = new DateLapse(fechaInicio, fechaFin);
		this.precioFinal = precioFinal;
		this.inquilino = inquilino;
	}
	
	public boolean estaOcupada(DateLapse dateLapse) {
		return this.dateLapse.overlaps(dateLapse);
	}
	
	public double getPrecioFinal() {
		return this.precioFinal;
	}	
	
}
