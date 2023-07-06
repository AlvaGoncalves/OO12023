package ar.edu.unlp.info.oo1.ParcialAlva1raFechaCorregido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Usuario> clientes = new ArrayList<Usuario>();
	
	
	public Usuario registrarUsuario(String dni){
		Usuario cli = new Usuario(dni);
		this.clientes.add(cli);
		return cli;
	}
	
	public Propiedad registrarPropiedad(Usuario usuario,  double pxn, String dir, String nom) {
		return usuario.registrarPropiedad(pxn, nom, dir);
	}
	
	public Reserva registrarReserva(Usuario inquilino, Propiedad p, LocalDate inicio, LocalDate fin) {
		return p.crearReserva(inquilino, inicio, fin);
	}

	public ReglaRangoFechas crearReglaPorRangoFechas(Propiedad propiedad, DateLapse rango, boolean esAumento, int porcentaje) {
		return propiedad.agregarRegla(rango, esAumento, porcentaje);
	}
	
	public ReglaEstanciasProlongadas crearReglaPorEstanciaProlongada(Propiedad propiedad, int porcentaje, int cantidadMinimaDias) {
		return propiedad.agregarRegla(porcentaje, cantidadMinimaDias);
	}
	
	
}
