package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
	private String nombre;
	private String dir;
	private Numero n;
	private List<Factura> facturas;
	
	public Persona(String nombre, String dir) {
		this.nombre = nombre;
		this.dir = dir;
		this.facturas = new ArrayList<Factura>();
	}
	
	public abstract Factura registrarFactura();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dir;
	}
	public void setDni(String dir) {
		this.dir = dir;
	}
	
	public Numero getN() {
		return n;
	}
	public void setN(Numero n) {
		this.n = n;
	}
	
	
}
