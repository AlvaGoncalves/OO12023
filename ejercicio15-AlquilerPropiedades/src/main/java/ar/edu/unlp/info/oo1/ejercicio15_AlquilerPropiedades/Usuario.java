package ar.edu.unlp.info.oo1.ejercicio15_AlquilerPropiedades;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Usuario {

	private String nombre;
	private String direccion;
	private String dni;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	
	public Usuario() {
		
	}

	public Usuario(String nombre, String direccion, String dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.reservas = new ArrayList<Reserva>();
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void agregarReserva (Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void eliminarReserva (Reserva reserva){
		this.reservas.remove(reserva);
	}
	
	public void agregarPropiedad (Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public void eliminarPropiedad (Propiedad propiedad) {
		this.propiedades.remove(propiedad);
	}

	public List<Reserva> getReservas() {
		return reservas;
	}
	
	public double calcularIngresoPropietario (DateLapse periodo) {
		return this.propiedades.stream().mapToDouble(propiedad -> propiedad.calcularIngresoPropiedad(periodo)).sum();
	}
	
}
