package ar.edu.unlp.info.oo1.ejercicio15_AlquilerDePropiedades;

public class Reserva {
	private DateLapse periodo;
	private Propiedad inmueble;
	

	public Reserva(DateLapse periodo, Propiedad inmueble) {
		this.periodo = periodo;
		this.inmueble = inmueble;
	}
	
	public double calcularReserva() {
		//return inmueble.calcularPrecio(periodo.sizeInDays());--> no se cual es mejor solucion
		return periodo.sizeInDays() * inmueble.getPrecio_x_noche(); 
	}
	
	
	public boolean overlaps(DateLapse another) {
		return periodo.overlaps(another);
	}
	
	public boolean inicioPosteriorFechaActual(){
		return periodo.laterFrom();
	}
	
}
