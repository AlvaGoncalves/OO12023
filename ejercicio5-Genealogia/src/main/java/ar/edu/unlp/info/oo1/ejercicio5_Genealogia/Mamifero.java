package ar.edu.unlp.info.oo1.ejercicio5_Genealogia;

import java.util.Date;

public class Mamifero {

	private String identificador;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	private Mamifero abueloPaterno;
	private Mamifero abuelaPaterna;
	private Mamifero abueloMaterno;
	private Mamifero abuelaMaterna;
	
	//es correcta la utilización de estos dos constructores para devolver el que no chille el test?
	//-------------------------------------------------------- !
	public Mamifero(String n) {
		this.setIdentificador(n);
	}
	
	public Mamifero() {
	}

	//--------------------------------------------------------- !
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloPaterno() {
		return abueloPaterno;
	}
	public void setAbueloPaterno(Mamifero abueloPaterno) {
		this.abueloPaterno = abueloPaterno;
	}
	public Mamifero getAbuelaPaterna() {
		return abuelaPaterna;
	}
	public Mamifero getAbueloMaterno() {
		return abueloMaterno;
	}
	public Mamifero getAbuelaMaterna() {
		return abuelaMaterna;
	}

	public Boolean tieneComoAncestroA(Mamifero anonimo) {
		boolean ok = true;
		if(!this.getPadre().equals(anonimo)) {
			 ok = this.getPadre().tieneComoAncestroA(anonimo);
		}
		if(!this.getMadre().equals(anonimo)) {
			ok = this.getMadre().tieneComoAncestroA(anonimo);
			
		}
		return ok; 
	}
}
