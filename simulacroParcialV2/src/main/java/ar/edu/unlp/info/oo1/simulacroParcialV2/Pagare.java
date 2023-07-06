package ar.edu.unlp.info.oo1.simulacroParcialV2;

import java.time.LocalDateTime;

public class Pagare extends FormaDePago {
	private LocalDateTime fechaVencimiento;

	
	public Pagare(int monto, String destinatario, String originante, LocalDateTime fechaEmision, LocalDateTime fechaVencimiento) {
		super(monto, destinatario, originante, fechaEmision);
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	
	public LocalDateTime getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


	@Override
	public boolean estaVencido() {
		return LocalDateTime.now().isBefore(this.fechaVencimiento);
	}



	@Override
	public double valorLiquido() {
		return this.estaVencido() ? this.getMonto() : 0;
		// si esta vencido ? tomo el valor del monto : sino de 0
	}
	
}
