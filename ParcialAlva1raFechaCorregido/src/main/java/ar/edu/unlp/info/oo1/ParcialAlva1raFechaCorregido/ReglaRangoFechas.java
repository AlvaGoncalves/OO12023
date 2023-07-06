package ar.edu.unlp.info.oo1.ParcialAlva1raFechaCorregido;

public class ReglaRangoFechas extends Regla {
	DateLapse rango;
	boolean aumenta;
	
	protected ReglaRangoFechas(int porcentaje, DateLapse rango, boolean aumenta) {
		super(porcentaje);
		this.aumenta = aumenta;
		this.rango = rango;
	}

	@Override
	public double aplicarRegla(DateLapse fecha, double precioTotal, double precioNocheReal) {
		//dias que se pasen del rango
		int diasQueAplicar = rango.daysThatOverlaps(fecha);
		
		double porcentaje = this.porcentaje/100.0; 
		if (this.aumenta) {
			porcentaje = porcentaje + 1; //queda positivo
		} else {
			porcentaje = 1 - porcentaje; //queda negativo
		}
		
		double precioPrevio = precioTotal - (diasQueAplicar * precioNocheReal);
		return precioPrevio + (diasQueAplicar * (precioNocheReal * porcentaje));
	}


	@Override
	public int prioridad() {
		return 1;
	}

}
