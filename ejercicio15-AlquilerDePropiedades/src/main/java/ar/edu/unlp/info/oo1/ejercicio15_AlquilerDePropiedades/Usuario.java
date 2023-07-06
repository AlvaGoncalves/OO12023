package ar.edu.unlp.info.oo1.ejercicio15_AlquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Usuario {
	private String nombre;
	private String direc;
	private int dni;
	private List<Reserva> reservadas;
	private List<Propiedad> propiedades;
	
	public Usuario(String nombre, String direc, int dni) {
		this.nombre = nombre;
		this.direc = direc;
		this.dni = dni;
		this.reservadas = new ArrayList<Reserva>();
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public double calcularIngresoPropietario (DateLapse periodo) {
		return this.propiedades.stream().mapToDouble(propiedad -> propiedad.calcularIngresosPropiedad(periodo)).sum();
	}
	
	public void agregarReserva (Reserva reserva) {
		this.reservadas.add(reserva);
	}
	
	public void eliminarReserva (Reserva reserva){
		this.reservadas.remove(reserva);
	}
	
	public void agregarPropiedad (Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public void eliminarPropiedad (Propiedad propiedad) {
		this.propiedades.remove(propiedad);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getDirec() {
		return direc;
	}
	public void setDirec(String direc) {
		this.direc = direc;
	}

	public List<Reserva> getReservadas() {
		return reservadas;
	}


	public void setReservadas(List<Reserva> reservadas) {
		this.reservadas = reservadas;
	}


	public List<Propiedad> getPropiedades() {
		return propiedades;
	}


	public void setPropiedades(List<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}
}
