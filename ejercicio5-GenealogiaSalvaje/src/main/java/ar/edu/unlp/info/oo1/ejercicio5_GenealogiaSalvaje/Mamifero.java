package ar.edu.unlp.info.oo1.ejercicio5_GenealogiaSalvaje;

import java.time.LocalDate;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Mamifero {

	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	public Mamifero() {
		
	}
	
	public boolean tieneComoAncestroA(Mamifero eslavonPerdido) {
		return (!this.getPadre().equals(null) & (tieneComoAncestroA(eslavonPerdido)) || (!this.getMadre().equals(null) & (tieneComoAncestroA(eslavonPerdido))));
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
	/*
	 * if(!this.getPadre().equals(null))
			return this.padre().getPadre();
		else return null;
	 */
	public Mamifero getAbueloPaterno() {
		if(!this.getPadre().equals(null))
			return this.getPadre().getPadre();
		else return null;
	}
	
	public Mamifero getAbueloMaterno() {
		if(!this.getMadre().equals(null))
			return this.getMadre().getPadre();
		else return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if(!this.getPadre().equals(null))
			return this.getPadre().getMadre();
		else return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if(!this.getMadre().equals(null))
			return this.getMadre().getMadre();
		else return null;
	}
	
	
}
