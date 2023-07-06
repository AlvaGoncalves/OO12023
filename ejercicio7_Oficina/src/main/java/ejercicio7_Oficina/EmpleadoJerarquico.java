package ejercicio7_Oficina;

public class EmpleadoJerarquico extends Empleado{
	public double montoBasico() {
		return 45000;
	}
	
	public double bonoPorCategoria() {
		return 8000;
	}
	
	public double sueldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	

}
