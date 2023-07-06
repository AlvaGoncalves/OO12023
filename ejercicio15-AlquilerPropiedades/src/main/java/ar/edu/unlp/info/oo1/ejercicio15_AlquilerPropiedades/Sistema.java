package ar.edu.unlp.info.oo1.ejercicio15_AlquilerPropiedades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private ArrayList<Usuario> users = new ArrayList<Usuario>() ;
	private ArrayList<Propiedad> inmuebles = new ArrayList<Propiedad>();
	
	
	public Usuario registrarUsuario(String nom, String dir, String dni) {
		Usuario x = new Usuario(nom, dir, dni);
		this.users.add(x);
		return x;
	}
	
	
	public Propiedad registrarPropiedad(String nom, String desc, double precio, Usuario propie, String dir) {
		Propiedad y = new Propiedad(nom, desc, precio, propie, dir);
		this.inmuebles.add(y);
		return y;
	}
	
	
	public List<Propiedad> listarPropiedadesDisponibles (DateLapse periodo){
		return this.inmuebles.stream().filter(propiedad -> propiedad.disponibilidad(periodo)).collect(Collectors.toList());
	}
	
	public Reserva realizarReserva(Propiedad p, DateLapse periodo, Usuario inq) {
		if(p.disponibilidad(periodo) == true) {
			Reserva r = new Reserva(periodo, p);
			inq.agregarReserva(r);
			p.agregarReserva(r);
			return r;
		}else { 
			return null;
		}
	}
	
	//por esto es que se necesitan las List<> en usuario y propiedad
	public void eliminarReserva(Reserva r) {
		if(r.inicioPosteriorFechaActual()) {
			this.users.stream().forEach(Usuario -> Usuario.eliminarReserva(r));
			this.inmuebles.stream().forEach(Propiedad -> Propiedad.eliminarReserva(r));
		}
	}
	
	public List<Reserva> obtenerReservaUsuario(Usuario u){
		return u.getReservas();
	}
	
	public double calcularIngresoPropietario (Usuario usuario, DateLapse periodo) {
		return usuario.calcularIngresoPropietario(periodo);
	}
}
