package examenOO1;

public class ReglaRangoFechas extends Regla {
	DateLapse rango;
	boolean esAumento;
	
	public ReglaRangoFechas(DateLapse rango, boolean esAumento, int porcentaje) {
		super(porcentaje);
		this.rango = rango;
		this.esAumento = esAumento;
	}
	
	public int prioridad() {
		return 1;
	}

	public double aplicarRegla(DateLapse fecha, double precioTotal, double precioNocheReal) {
		int diasQueAplicar = rango.daysThatOverlaps(fecha);
		
		double porcentaje = this.porcentaje/100.0; 
		if (this.esAumento) {
			porcentaje = porcentaje + 1;
		} else {
			porcentaje = 1 - porcentaje;
		}
		
		double precioPrevio = precioTotal - (diasQueAplicar * precioNocheReal);
		return precioPrevio + (diasQueAplicar * (precioNocheReal * porcentaje));
	}
}
