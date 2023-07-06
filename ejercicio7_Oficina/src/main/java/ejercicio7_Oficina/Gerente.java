package ejercicio7_Oficina;

public class Gerente extends EmpleadoJerarquico {

	public double montoBasico() {
		return 57000;
	}
	
	public double aportes() {
		return this.montoBasico() * 0.05d;
	}

}
