package ar.edu.unlp.info.oo1.ParcialAlva1raFechaCorregido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Propiedad {
	private String dir;
	private String nom;
	private double precioxnoche;
	private List<Reserva> reservas;
	private List<Regla> reglas;
 	
	
	public Propiedad(String dir, String nom, double precioxnoche) {
		this.dir = dir;
		this.nom = nom;
		this.precioxnoche = precioxnoche;
		this.reservas = new ArrayList<Reserva>();
		this.reglas = new ArrayList<Regla>();
	}

	
	//se crea la reserva y en el mismo momento se calcula si esta no se sobrepone a otra reserva, y se calcula el monto total del costo
	public Reserva crearReserva(Usuario inquilino, LocalDate fechaInicio, LocalDate fechaFin){
		DateLapse posibleFecha = new DateLapse(fechaInicio, fechaFin);
		
		if(!this.estaDisponible(posibleFecha)) {
			//tomo el valor del prescio de la reserva
			double precioReserva = this.calcularPrecioBase(posibleFecha);
			
			//--------------------------------------------------------------------------------------------
			this.reglas.sort((r1,r2) -> r1.prioridad() - r2.prioridad());
			for (Regla regla: this.reglas) {
				precioReserva = regla.aplicarRegla(posibleFecha, precioReserva, this.precioxnoche);
			}
			Reserva r = new Reserva(inquilino, fechaInicio, fechaFin, precioReserva);
			this.reservas.add(r);
			return r;
		}
		return null;
	}
	
	private double calcularPrecioBase(DateLapse fecha) {
		return (fecha.sizeInDays() * this.precioxnoche);
	}
	
	//chequeo que no exista una reserva previa en la lista de reserva que tengo en la propiedad
	//de existir alguna reserva que coincida con el periodo, devuelvo false
	private boolean estaDisponible(DateLapse fecha) {
		return !this.reservas.stream().anyMatch(reserva -> reserva.estaOcupada(fecha));
	}

	
	public ReglaEstanciasProlongadas agregarRegla(int porcentaje, int cantidadMinimaDias) {
		// Tengo que asegurarme que haya solo una.
		// Lo que no me gusta de esta solucion es que
		// es basicamente preguntar por clase, pero me 
		// deja mantener el polimorfismo y usar una 
		// sola coleccion.
		ReglaEstanciasProlongadas nuevaRegla = null;
		if (this.reglas.stream().noneMatch(regla -> regla.esUnica())) {
			nuevaRegla = new ReglaEstanciasProlongadas(porcentaje, cantidadMinimaDias);
			this.reglas.add(nuevaRegla);
		}
		return nuevaRegla;
	}
	
	public ReglaRangoFechas agregarRegla(DateLapse rango, boolean esAumento, int porcentaje) {
		// asumo que el sistema no deja que se overlapeen
		// ya que lo dice el enunciado
		ReglaRangoFechas nuevaRegla = null;
		nuevaRegla = new ReglaRangoFechas(porcentaje, rango, esAumento);
		this.reglas.add(nuevaRegla);
		return nuevaRegla;
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
