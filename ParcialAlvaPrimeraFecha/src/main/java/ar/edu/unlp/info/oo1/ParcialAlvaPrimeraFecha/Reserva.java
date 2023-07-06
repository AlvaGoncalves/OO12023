package ar.edu.unlp.info.oo1.ParcialAlvaPrimeraFecha;

import java.time.LocalDateTime;

public class Reserva {
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private Propiedad inmueble;
	private Usuario inquilino;
	
	
	public Reserva(Usuario inquilino, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
		this.fechaInicio = fechaInicio;
		this.inquilino = inquilino;
	}
	
	
	
	// 	fi			ff	i2                  f2   fi           ff
	// 	<------------>	|-------------------|    <------------->
	//			<------------->        <------------->    										
	//			fi            ff       fi            ff
	//                  <------------------->  

	public boolean estaOcupada(LocalDateTime inicio2, LocalDateTime fin2) {
		return  (getFechaInicio().isBefore(inicio2) && getFechaFin().isAfter(inicio2)) 
				||  (this.fechaInicio.equals(inicio2) || this.fechaFin.equals(fin2))
				|| (getFechaInicio().isBefore(fin2) && getFechaFin().isAfter(fin2)) ;
	}
	
	
	public double calcularPrecioBase() {
		return cantidadDias() * this.inmueble.getPrecioXNoche();
	}
	
	public int cantidadDias() {
		//return this.fechaFin.getDayOfYear() - this.fechaInicio.getDayOfYear();
		return this.fechaInicio.compareTo(fechaFin);
	}
	
	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDateTime getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}
	

	public Usuario getInquilino() {
		return inquilino;
	}


	public void setInquilino(Usuario inquilino) {
		this.inquilino = inquilino;
	}
	
	
	
	
	
}
