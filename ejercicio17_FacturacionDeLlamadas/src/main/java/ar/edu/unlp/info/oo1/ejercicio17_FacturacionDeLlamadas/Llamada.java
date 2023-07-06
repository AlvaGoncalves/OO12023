package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDateTime;

public abstract class Llamada {
	
	private LocalDateTime comienzo;
	private double duracion;
	private Numero emisor;
	private Numero receptor;

	public Llamada(LocalDateTime comienzo2, double duracion2, Numero emisor2, Numero receptor2) {
		this.comienzo = comienzo2;
		this.duracion = duracion2;
		this.emisor = emisor2;
		this.receptor = receptor2;
	}
	
	public abstract double calcularCostoFijo();

	//retorna true si la fecha de inicio se encuentra dentro del preiodo o si es igual a los limites
	public boolean entraEnElLapso(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		return this.comienzo.isAfter(fechaInicio) || this.comienzo.isBefore(fechaFin) || this.comienzo.equals(fechaInicio) || this.comienzo.equals(fechaFin);
	}
	
	
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public Numero getEmisor() {
		return emisor;
	}
	public void setEmisor(Numero emisor) {
		this.emisor = emisor;
	}
	public Numero getReceptor() {
		return receptor;
	}
	public void setReceptor(Numero receptor) {
		this.receptor = receptor;
	}

	public LocalDateTime getComienzo() {
		return comienzo;
	}

	public void setComienzo(LocalDateTime comienzo) {
		this.comienzo = comienzo;
	}
}
