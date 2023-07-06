package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDateTime;

public class PersonaFisica extends Persona{
	private int dni;
	
	public PersonaFisica(String nom, String dir, int dni) {
		super(nom, dir);
		this.dni = dni;
	}

	public double calcularMontoTotal(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		double monto = calcularMontoFijo(fechaInicio, fechaFin);
		return monto - monto * 0.1;
	}
}
