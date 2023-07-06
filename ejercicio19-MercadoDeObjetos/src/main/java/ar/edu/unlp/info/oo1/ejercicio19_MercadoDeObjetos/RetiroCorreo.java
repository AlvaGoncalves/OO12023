package ar.edu.unlp.info.oo1.ejercicio19_MercadoDeObjetos;

public class RetiroCorreo implements MecanismoEnvio {
	

	@Override
	public double calcularCostoEnvio(String dir1, String dir2) {
		return 50;
	}

}
