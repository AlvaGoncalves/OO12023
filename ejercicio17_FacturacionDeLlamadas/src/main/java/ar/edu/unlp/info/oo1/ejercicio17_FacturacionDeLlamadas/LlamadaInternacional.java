package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDateTime;

public class LlamadaInternacional extends Llamada {
	
	private String paisOrigen;
	private String paisDestino;
	
	
	public LlamadaInternacional(LocalDateTime comienzo2, double duracion2, Numero emisor2, Numero receptor2, String paisOrigen2, String paisDestino2) {
		super(comienzo2, duracion2, emisor2, receptor2);
		this.paisOrigen = paisOrigen2;
		this.paisDestino = paisDestino2;
	}

	@Override
	public double calcularCostoFijo() {
		if(esDiurno())
			return 4 * super.getDuracion();
		else
			return 3 * super.getDuracion();
	}
	
	private boolean esDiurno() {
		return (this.getComienzo().getHour() >= 8 && this.getComienzo().getMinute() >= 0)&&(this.getComienzo().getHour() < 20);
	}
	
	
	public String getPaisOrigen() {
		return paisOrigen;
	}


	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}


	public String getPaisDestino() {
		return paisDestino;
	}


	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}


	
}
