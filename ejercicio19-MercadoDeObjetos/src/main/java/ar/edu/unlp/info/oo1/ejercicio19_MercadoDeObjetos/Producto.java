package ar.edu.unlp.info.oo1.ejercicio19_MercadoDeObjetos;

public class Producto {
	private String nom;
	private String desc;
	private double precio;
	private int stock;
	private Vendedor vend;
	
	
	public Producto(String n, String d, double p, int stock, Vendedor v) {
		this.nom = n;
		this.desc = d;
		this.precio = p;
		this.stock = stock;
		this.vend = v;
	}

	public String getNom() {
		return nom;
	}

	public void decrementarUnidades(int cant) {
		this.stock -= cant;
	}
	
	public boolean quedanUnidades(int cant) {
		return (this.stock - cant >= 1);
	}
	
	
	public double calcularPrecioBase(int cantidad) {
		return this.precio * cantidad;
	}
	
	public String direccionVendedor() {
		return this.vend.getDir();
	}
	
	
}
