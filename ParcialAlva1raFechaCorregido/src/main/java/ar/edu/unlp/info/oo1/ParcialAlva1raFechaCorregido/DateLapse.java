package ar.edu.unlp.info.oo1.ParcialAlva1raFechaCorregido;

import java.time.LocalDate;

public class DateLapse {
	LocalDate from;
	LocalDate to;
	
	// Esta clase deriva de una que implementaron en el cuadernillo
	// de ejercicios, tambien utilizada en el ejercicio de alquileres
	
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
		return this.sizeInDays(this.from, this.to);
	}
	
	public boolean overlaps(LocalDate from, LocalDate to) {
		boolean primera = this.from.isBefore(to);
		boolean segunda = this.to.isAfter(from);
		return primera && segunda;
	}
	
	public boolean overlaps(DateLapse dateLapse) {
		return this.overlaps(dateLapse.getFrom(), dateLapse.getTo());
	}

	public boolean includesDate(LocalDate other) {
		return this.overlaps(other, other);
	}
	
	public int daysThatOverlaps(DateLapse dateLapse) {
		if (this.overlaps(dateLapse)) {
			LocalDate latestFrom = dateLapse.getFrom();
			if (this.from.isAfter(latestFrom)) {
				latestFrom = this.from;
			}
			
			LocalDate earliestTo = dateLapse.getTo(); 
			if (this.to.isBefore(earliestTo)) {
				earliestTo =  this.to;
			}
			
			return this.sizeInDays(latestFrom, earliestTo);
		}
		return 0;
	}
	
	private int sizeInDays(LocalDate from, LocalDate to){ 
		return from.until(to).getDays() + 1;
	}
}
