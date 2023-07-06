package ar.edu.unlp.info.oo1.simulacroParcial;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Pagare extends Documento {
	private LocalDateTime fechaVencimiento;

	
	public Pagare(float unMonto, String destinatario, String originante, LocalDateTime fechaEmision, LocalDateTime fechaVencimiento) {
		super(unMonto, destinatario, originante, fechaEmision);
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	public LocalDateTime getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


	@Override
	public Boolean estaVencido() {
		return LocalDateTime.now().getDayOfYear() >= this.getFechaVencimiento().getDayOfYear();
	}
	
	
}	
