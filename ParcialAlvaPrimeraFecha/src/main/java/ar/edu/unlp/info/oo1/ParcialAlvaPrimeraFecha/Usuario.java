package ar.edu.unlp.info.oo1.ParcialAlvaPrimeraFecha;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Usuario {

	private String nombre;
	private String apellido;
	private String dni;
	private List<Propiedad> inmuebles;
	private List<Reserva> reservas;
	

	public Usuario(String nombre, String apellido, String dni) {
		this.apellido = apellido;
		this.dni = dni;
		this.nombre = nombre;
		this.inmuebles = new ArrayList<Propiedad>();
		this.reservas = new ArrayList<Reserva>();
	}	
	
	public Propiedad registrarPropiedad(double pxn, String nom, String dir) {
		Propiedad p = new Propiedad(dir, nom, pxn);
		this.inmuebles.add(p);
		return  p;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * Retorna el nombre completo de la persona de la forma apellido, nombre
	 * @return
	 */
	public String getNombreCompleto() {
		return this.getApellido() + ", " + this.getNombre();
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
