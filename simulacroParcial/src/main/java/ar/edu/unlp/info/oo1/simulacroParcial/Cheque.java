package ar.edu.unlp.info.oo1.simulacroParcial;

import java.time.LocalDateTime;

public class Cheque extends Documento {

	public Cheque(float unMonto, String destinatario, String originante, LocalDateTime fechaEmision) {
		  super(unMonto, destinatario, originante, fechaEmision);
	}
	
	

	@Override
	public Boolean estaVencido() {
		return this.getFechaEmision().compareTo(LocalDateTime.now()) >= 30;
	}	
}
