package ar.edu.unlp.info.oo1.ParcialAlvaPrimeraFecha;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Propiedad {
	private String dir;
	private String nom;
	private double precioxnoche;
	private List<Reserva> reservas;
	
	
	public Propiedad(String dir, String nom, double precioxnoche) {
		this.dir = dir;
		this.nom = nom;
		this.precioxnoche = precioxnoche;
		this.reservas = new ArrayList<Reserva>();
	}

	
	//se crea la reserva y en el mismo momento se calcula si esta no se sobrepone a otra reserva, y se calcula el monto total del costo
	public Reserva crearReserva(Usuario inquilino, LocalDateTime fechaInicio, LocalDateTime fechaFin){
		Reserva r = new Reserva(inquilino, fechaInicio, fechaFin);
		if(!r.estaOcupada(fechaInicio, fechaFin)) {
			this.chequearSiEstaOcupada(fechaInicio, fechaFin);
			this.reservas.add(r);
		}
		
		return r;
	}
	
	private void chequearSiEstaOcupada(LocalDateTime inicio, LocalDateTime fin) {
		this.reservas.forEach(Reserva -> Reserva.estaOcupada(inicio, fin));
	}
	
	

	public String getDir() {
		return dir;
	}


	public void setDir(String dir) {
		this.dir = dir;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getPrecioXNoche() {
		return precioxnoche;
	}


	public void setPrecioXNoche(double precioxnoche) {
		this.precioxnoche = precioxnoche;
	}


	public List<Reserva> getReservas() {
		return reservas;
	}


	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
}
