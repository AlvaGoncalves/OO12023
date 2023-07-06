package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDateTime;

public class LlamadaInterUrbana extends Llamada {
	private int distancia;
	
	public LlamadaInterUrbana(LocalDateTime comienzo2, double duracion2, Numero emisor2, Numero receptor2, int distancia2) {
		super(comienzo2, duracion2, emisor2, receptor2);
		this.distancia = distancia2;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	@Override
	public double calcularCostoFijo() {
		return 5 + (this.calcularCostoDistancia() * super.getDuracion());
	}
	
	private double calcularCostoDistancia() {
		double costoxmin = 0;
		switch(this.distancia) {
			case 1:
				if(this.distancia < 100) {
					costoxmin = 2;
				}
				break;
			case 2:
				if(this.distancia >= 100 && this.distancia <= 500) {
					costoxmin = 2.5;
				}
				break;
			default:
				if(this.distancia > 500) {
					costoxmin = 5;
				}
		}
		return costoxmin;
	}
	
}
