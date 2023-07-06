package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDateTime;

public class LlamadaLocal extends Llamada {

	public LlamadaLocal(LocalDateTime comienzo, double duracion, Numero emisor, Numero receptor) {
		super(comienzo, duracion, emisor, receptor);
	}
	
	public double calcularCostoFijo() {
		return super.getDuracion();
	}
	
}
