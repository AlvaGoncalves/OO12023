package ar.edu.unlp.info.oo1.parcial5del11_PrimeraFecha;

import java.util.Date;

public class Embarcación extends Motorizado implements Dominio {
	private String patente;
	private String nom;
	private Date fecha;
	private double valor;
	private Contribuyente propie;
	
	public Embarcación(String patente, String nom, Date fecha, double valor, Contribuyente propie) {
		this.patente = patente;
		this.nom = nom;
		this.fecha = fecha;
		this.valor = valor;
		this.propie = propie;
	}
	
	@Override
	public double calcularImp() {
		return 0;
	}
	

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Contribuyente getPropie() {
		return propie;
	}

	public void setPropie(Contribuyente propie) {
		this.propie = propie;
	}

	
	
}
