package ar.edu.unlp.info.oo1.ejercicio19_MercadoDeObjetos;

public class Cuotas implements MedioDePago {

	@Override
	public double calcularCostoPago(double costo) {
		return costo + (costo * 0.5);
	}

}
