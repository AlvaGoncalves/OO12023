package ar.edu.unlp.info.oo1.ejercicio15_AlquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Propiedad> propiedades = new ArrayList<Propiedad>();

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public Usuario registrarUsuario(String nom, String direc, int dni) {
		Usuario x = new Usuario(nom, direc, dni);
		this.usuarios.add(x);
		return x;
	}
	
	public Propiedad registrarPropiedad(String nom, String desc, double precio, String direc, Usuario user) {
		Propiedad p = new Propiedad(nom, desc, precio, direc, user);
		this.propiedades.add(p);
		return p;
	}
	
	public List<Propiedad> buscarPropiedadesDisponibles(DateLapse periodo) {
		return this.propiedades.stream().filter(propiedad -> propiedad.disponibilidad(periodo)).collect(Collectors.toList());	
	}
	
	public Reserva realizarReserva (Propiedad propiedad, DateLapse periodo, Usuario usuario){
		if (propiedad.disponibilidad(periodo)){
			Reserva reserva = new Reserva (periodo, propiedad);
			usuario.agregarReserva(reserva);
			propiedad.agregarReserva(reserva);
			return reserva;
		}
		return null;
	}
	
	public void eliminarReserva (Reserva reserva){
		if (reserva.inicioPosteriorFechaActual()) {
			this.usuarios.stream().forEach(usuario -> usuario.eliminarReserva(reserva));
			this.propiedades.stream().forEach(propiedad -> propiedad.eliminarReserva(reserva));
		}
	}
	
	
	public List<Reserva> obtenerReservaUsuario (Usuario usuario){
		return usuario.getReservadas();
	}
	
	
}
