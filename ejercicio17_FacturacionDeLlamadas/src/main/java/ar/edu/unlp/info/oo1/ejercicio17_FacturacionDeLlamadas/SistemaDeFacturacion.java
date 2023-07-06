package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 * @param <SistemaDeFacturacion>
 *
 */
public class SistemaDeFacturacion {
	private List<Numero> numeros = new ArrayList<Numero>();
	private List<Persona> clientes = new ArrayList<Persona>();
	
	//num (obj)  =/= n (int)
	public Numero agregarNumero(int n) {
		Numero Num = new Numero(n);
		this.numeros.add(Num);
		return Num;
	}
	
	public Persona registrarPersonaFisica(String nom, String dir, int dni) {
		Persona p = new PersonaFisica(nom, dir, dni);
		this.clientes.add(p);
		p.setN(this.numeros.remove(this.numeros.size()));
		return p;
		
	}
	
	public Persona registrarPersonaJuridica(String nom, String dir, int CUIT, String tipo) {
		Persona p = new PersonaJuridica(nom, dir, CUIT, tipo);
		this.clientes.add(p);
		p.setN(this.numeros.remove(this.numeros.size()));
		return p;
	}
	
	
	public void calcularGastos(Persona cliente, LocalDateTime inicio, LocalDateTime fin) {
		Factura f = new Factura();
		cliente.getN().calcularCostoLlamadas(inicio, fin);
	}

}