package ar.edu.unlp.info.oo1.simulacroParcialV2;

import java.time.LocalDateTime;

public class Cheque extends FormaDePago {
	
	public Cheque(int monto, String destinatario, String originante, LocalDateTime fechaEmision) {
		super(monto, destinatario, originante, fechaEmision);
	}

	@Override
	public boolean estaVencido() {
		return !LocalDateTime.now().isBefore(getFechaEmision().plusDays(30)); 
	}

	@Override
	public double valorLiquido() {
		return (!this.estaVencido()) ? this.getMonto() : 0;
		// si no esta vencido ? tomo el valor del monto : sino de 0
	}
	
	
}
