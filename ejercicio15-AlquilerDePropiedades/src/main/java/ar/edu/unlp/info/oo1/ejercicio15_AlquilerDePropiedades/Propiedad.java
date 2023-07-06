package ar.edu.unlp.info.oo1.ejercicio15_AlquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String nombre;
	private String direc;
	private String descripcion;
	private Usuario propietario;
	private double precio_x_noche;
	private List<Reserva> reservas;
	
	
	public Propiedad(String nom, String desc, double precio, String dir, Usuario user) {
		this.nombre = nom;
		this.direc = dir;
		this.descripcion = desc;
		this.precio_x_noche = precio;
		this.setPropietario(user);
		this.reservas = new ArrayList<Reserva>();
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


	public String getDirec() {
		return direc;
	}


	public void setDirec(String direc) {
		this.direc = direc;
	}


	public double getPrecio_x_noche() {
		return precio_x_noche;
	}

	public Usuario getPropietario() {
		return propietario;
	}


	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}
	

	public void agregarReserva (Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void eliminarReserva (Reserva reserva){
		this.reservas.remove(reserva);
	}
	
	public void setPrecio_x_noche(double precio_x_noche) {
		this.precio_x_noche = precio_x_noche;
	}

	public boolean disponibilidad(DateLapse periodo) {
		return this.reservas.stream().noneMatch(Reserva -> Reserva.overlaps(periodo));
	}

	public double calcularIngresosPropiedad(DateLapse periodo) {
		return this.reservas.stream().filter(reserva -> reserva.overlaps(periodo)).mapToDouble(reserva -> reserva.calcularReserva()).sum();
	}
	
	public double calcularPrecio(int dias) {
		return dias * this.precio_x_noche;
	}
}
