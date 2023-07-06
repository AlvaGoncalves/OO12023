package ar.edu.unlp.info.oo1.simulacroParcialV2;

import java.time.LocalDateTime;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class FormaDePago {
	private int monto;
	private String destinatario;
	private String originante;
	private LocalDateTime fechaEmision;
	
	
	public FormaDePago(int monto, String destinatario, String originante, LocalDateTime fechaEmision) {
		this.monto = monto;
		this.destinatario = destinatario;
		this.originante = originante;
		this.fechaEmision = fechaEmision;
	}
	
	public abstract double valorLiquido();
	public abstract boolean estaVencido();
	
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getOriginante() {
		return originante;
	}
	public void setOriginante(String originante) {
		this.originante = originante;
	}
	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	
	
}
