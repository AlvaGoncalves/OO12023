package examenOO1;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
	private String nombreUsuario;
	private String email;
	private String clave;
	private double saldoFavor;
	
	public Usuario(String nombreUsuario, String email, String clave) {
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.clave = clave;
		this.saldoFavor = 0.0;
	}

	public void darBono(double bono) {
		this.saldoFavor += bono;		
	}
	
	public double cuantoDebePagar(double monto) {
		double medioMonto = monto/2.0;
		double medioMontoDescontado = this.descontarAFavor(medioMonto);
		return medioMonto + medioMontoDescontado;
	}
	
	private double descontarAFavor(double medioMonto) {
		double saldoRestante = this.saldoFavor - medioMonto;
		if (saldoRestante < 0.0) {
			this.saldoFavor = 0.0;
			return (saldoRestante * -1);
		}
		this.saldoFavor = saldoRestante;
		return 0.0;
	}
}
