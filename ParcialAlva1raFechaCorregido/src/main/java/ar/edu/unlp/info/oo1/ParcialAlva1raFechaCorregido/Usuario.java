package ar.edu.unlp.info.oo1.ParcialAlva1raFechaCorregido;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Usuario {

	private String dni;
	private List<Propiedad> inmuebles;
	private List<Reserva> reservas;
	

	public Usuario(String dni) {
		this.dni = dni;
		this.inmuebles = new ArrayList<Propiedad>();
		this.reservas = new ArrayList<Reserva>();
	}	
	
	public Propiedad registrarPropiedad(double pxn, String nom, String dir) {
		Propiedad p = new Propiedad(dir, nom, pxn);
		this.inmuebles.add(p);
		return  p;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public List<Propiedad> getInmuebles() {
		return inmuebles;
	}



	public void setInmuebles(List<Propiedad> inmuebles) {
		this.inmuebles = inmuebles;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

}
