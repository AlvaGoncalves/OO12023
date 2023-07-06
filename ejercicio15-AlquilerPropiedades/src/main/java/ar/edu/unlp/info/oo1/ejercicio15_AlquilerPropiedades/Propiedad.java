package ar.edu.unlp.info.oo1.ejercicio15_AlquilerPropiedades;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String nombre;
	private String descripcion;
	private double precioxnoche;
	private String direccion;
	private Usuario propietario;
	private List<Reserva> reservas;
	
	public Propiedad(String nombre, String descripcion, double precioxnoche, Usuario propietario, String direccion){
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.propietario = propietario;
		this.direccion = direccion;
		this.reservas = new ArrayList<Reserva>();
	}

	public boolean disponibilidad(DateLapse periodo) {
		return this.reservas.stream().noneMatch(reserva -> reserva.overlaps(periodo));
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecioxnoche() {
		return precioxnoche;
	}


	public void setPrecioxnoche(double precioxnoche) {
		this.precioxnoche = precioxnoche;
	}


	public Usuario getPropietario() {
		return propietario;
	}


	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public void agregarReserva(Reserva r) {
		this.reservas.add(r);
	}


	public void eliminarReserva(Reserva r) {
		this.reservas.remove(r);
	}

	//----------------------aaaaatenciooooooon------------------------------
	public double calcularIngresoPropiedad(DateLapse periodo) {
		return this.reservas.stream().filter(reserva -> reserva.overlaps(periodo)).mapToDouble(reserva -> reserva.calcularReserva()).sum();
		
	}
	
	public double calcularPrecio (int dias) {
		return dias * this.precioxnoche;
	}
	
}
