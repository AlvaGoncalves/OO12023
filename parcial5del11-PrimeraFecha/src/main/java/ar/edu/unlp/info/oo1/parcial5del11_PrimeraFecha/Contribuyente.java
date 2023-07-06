package ar.edu.unlp.info.oo1.parcial5del11_PrimeraFecha;

import java.util.ArrayList;
import java.util.List;

public class Contribuyente {
	private String nom;
	private int dni;
	private String email;
	private String loc;
	private List<Dominio> dominios;
	
	
	public Contribuyente(String nom, String email, String loc, int dni) {
		this.setDni(dni);
		this.setEmail(email);
		this.setNom(nom);
		this.setLoc(loc);
		this.dominios = new ArrayList<Dominio>();
	}

	public Inmueble altaInmueble(int num, double vl, double ve, Contribuyente propie) {
		Inmueble i = new Inmueble(num, vl, ve, propie);
		dominios.add(i);
		return i;
	}	
	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
