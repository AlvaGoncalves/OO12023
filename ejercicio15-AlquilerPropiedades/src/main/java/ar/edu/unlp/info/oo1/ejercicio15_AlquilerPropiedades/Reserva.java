package ar.edu.unlp.info.oo1.ejercicio15_AlquilerPropiedades;

public class Reserva {
	/*
	private Propiedad P;
	private Usuario inquilino;
	private Date periodo;
	private boolean libre;
	
	public Reserva(Propiedad P, Usuario inquilino, Date periodo, boolean libre) {
		this.P = P;
		this.inquilino = inquilino;
		this.periodo = periodo;
		this.libre = libre;
	}
	
	public Reserva hacerUnaReserva(Propiedad p, Date periodo, Usuario inquilino){
		Reserva nueva;
		if(!libre) 
			return null;
		else 
			libre = false;
			nueva = new Reserva(p, inquilino, periodo, libre);
			return nueva;
	}

	public Propiedad getP() {
		return P;
	}

	public void setP(Propiedad p) {
		P = p;
	}

	public Usuario getInquilino() {
		return inquilino;
	}

	public void setInquilino(Usuario inquilino) {
		this.inquilino = inquilino;
	}

	public Date getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Date periodo) {
		this.periodo = periodo;
	}
	*/
	
	private DateLapse periodo;
	private Propiedad propiedad;
	
	public Reserva(DateLapse periodo, Propiedad propiedad) {
		this.periodo = periodo;
		this.propiedad = propiedad;
	}
	
	public double calcularReserva() {
		//return propiedad.calcularPrecio(periodo.sizeInDays());--> no se cual es mejor solucion
		return periodo.sizeInDayz() * propiedad.getPrecioxnoche(); 
	}
	
	public boolean overlaps (DateLapse another) {
		return periodo.overlaps(another);
	}
	
	public boolean inicioPosteriorFechaActual() {
		return periodo.laterFrom();
		
	}
	
}
	
	

