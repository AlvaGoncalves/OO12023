package ar.edu.unlp.info.oo1.ParcialAlva1raFechaCorregido;

public class ReglaEstanciasProlongadas extends Regla {
	private int cantMinDias;
	
	protected ReglaEstanciasProlongadas(int porcentaje, int cantMinDias) {
		super(porcentaje);
		this.cantMinDias = cantMinDias;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double aplicarRegla(DateLapse fecha, double precioTotal, double precioNocheReal) {
		return (fecha.sizeInDays() > this.cantMinDias)? precioTotal * (1 - (this.porcentaje/100)) : precioTotal;
	}

	@Override
	public int prioridad() {
		return 2;
	}

}
