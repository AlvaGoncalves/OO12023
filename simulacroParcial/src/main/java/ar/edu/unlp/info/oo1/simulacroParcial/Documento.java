package ar.edu.unlp.info.oo1.simulacroParcial;
import java.time.LocalDateTime;

public abstract class Documento {
	protected float monto;
	protected LocalDateTime fechaEmision;
	protected String destinatario;
	protected String originante;
	
	
	public Documento(float unMonto, String destinatario2, String originante2, LocalDateTime fechaEmision2) {
		this.monto = unMonto;
		this.destinatario = destinatario2;
		this.originante = originante2;
		this.fechaEmision = fechaEmision2;
	}


	public abstract Boolean estaVencido();
	
	
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	
	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
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
	
	
	
}
