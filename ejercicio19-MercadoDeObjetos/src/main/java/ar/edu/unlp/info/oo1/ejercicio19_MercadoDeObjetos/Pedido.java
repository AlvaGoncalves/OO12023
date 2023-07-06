package ar.edu.unlp.info.oo1.ejercicio19_MercadoDeObjetos;

public class Pedido {
	private Cliente c;
	private Producto p;
	private int cant;
	private MedioDePago MDP;
	private MecanismoEnvio ME;
	
	
	
	public Pedido(Cliente c, Producto p, int cant, MedioDePago MDP, MecanismoEnvio ME) {
		this.c = c;
		this.p = p;
		this.cant = cant;
		this.MDP = MDP;
		this.ME = ME;
	}
	
	public double calcularCosto() {
		return this.ME.calcularCostoEnvio(this.c.getDir(), this.p.direccionVendedor()) + this.MDP.calcularCostoPago(this.calcularCostoEnBaseACantidad());
	}
	
	private double calcularCostoEnBaseACantidad() {
		return this.p.calcularPrecioBase(cant);
	}
	
}
