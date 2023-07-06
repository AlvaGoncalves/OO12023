package ar.edu.unlp.info.oo1.ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class DateLapse {
	private LocalDate from;
	private LocalDate to;

	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}

	public LocalDate getTo() {
		return this.to;
	}

	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from, to);
	}
	
	/*
	 * Recibe un objeto LocalDate y 
	 * retorna true si la fecha está entre el from y el to del receptor y false en caso contrario.
	 */
	public boolean includesDate(LocalDate other) {
		return getFrom().isBefore(other) && getTo().isAfter(other);
	}
	
	
	public boolean overlaps (DateLapse another) {
		return another.includesDate(this.getFrom()) || another.includesDate(this.getTo()) || another.equalsFrom(this.getFrom()) || another.equalsTo(this.getTo());
	}
	
	public boolean laterFrom () {
		return this.getFrom().isAfter(LocalDate.now());
	}
	
	public boolean equalsTo(LocalDate date) {
		return this.getTo().equals(date);
	}
	
	public boolean equalsFrom(LocalDate date) {
		return this.getFrom().equals(date);
	}

}