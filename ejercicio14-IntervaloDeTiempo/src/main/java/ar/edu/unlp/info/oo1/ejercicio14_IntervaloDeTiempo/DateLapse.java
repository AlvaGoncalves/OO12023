package ar.edu.unlp.info.oo1.ejercicio14_IntervaloDeTiempo;

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

	public boolean includesDate(LocalDate other) {
		return getFrom().isBefore(other) && getTo().isAfter(other);
	}

}