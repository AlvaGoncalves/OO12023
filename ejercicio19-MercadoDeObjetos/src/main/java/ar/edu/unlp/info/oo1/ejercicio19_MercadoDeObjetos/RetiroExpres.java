package ar.edu.unlp.info.oo1.ejercicio19_MercadoDeObjetos;

public class RetiroExpres implements MecanismoEnvio{
	private Mapa mapa;
	
	public RetiroExpres(Mapa mapa) {
		this.mapa = mapa;
	}
	
	
	@Override
	public double calcularCostoEnvio(String dirComercio, String dirDomicilio) {
		return 0.5 * this.mapa.distanciEntre(dirComercio, dirDomicilio);
	}

}
