package ar.edu.unlp.info.oo1.ejercicio15_AlquilerPropiedades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.setFrom(from);
		this.setTo(to);
	}

	
	/*
	 * Retorna la fecha de inicio del rango
	 */
	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}
	
	
	/*
	 * Retorna la fecha de fin del rango
	 */
	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
	}
	
	/*
	 * Retorna la cantidad de días entre la fecha 'from' y la fecha 'to'
	 */
	public int sizeInDayz() {
		return (int) this.getFrom().until(this.getTo(),ChronoUnit.DAYS);
	}
	
	public boolean includesDate(LocalDate other) {
		return other.isAfter(this.getFrom()) && other.isBefore(this.getTo());
	}
	
	
	/**
		Retorna true si el período de tiempo del receptor se superpone con el recibido por parámetro
	**/
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
