package ar.edu.unlp.info.oo1.parcial5del11_PrimeraFecha;

import java.util.Date;

public class Automotor extends Motorizado implements Dominio {
	private String patente;
	private String marca;
	private String modelo;
	private Date fecha;
	private double valor;
	private Contribuyente propie;
	
	public Automotor(String patente, String marca, String modelo, Date fecha, double valor, Contribuyente propie) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.fecha = fecha;
		this.valor = valor;
		this.propie = propie;
	}

	@Override
	public double calcularImp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
