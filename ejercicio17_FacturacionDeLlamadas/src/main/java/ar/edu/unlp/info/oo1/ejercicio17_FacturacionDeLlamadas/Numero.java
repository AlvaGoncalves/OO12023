package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Numero {
	private int num;
	private Persona cliente;
	private List<Llamada> historial;

	public Numero(int num) {
		this.num = num;
		this.historial = new ArrayList<Llamada>();
	}
	
	public Llamada registrarLlamadaLocal(LocalDateTime comienzo, int duracion, Numero emisor, Numero receptor) {
		Llamada l = new LlamadaLocal(comienzo, duracion, emisor, receptor);
		this.historial.add(l);
		return l;
	}
	
	
	public Llamada registrarLlamadaInterUrbana(LocalDateTime comienzo, int duracion, Numero emisor, Numero receptor, int distancia) {
		Llamada l = new LlamadaInterUrbana(comienzo, duracion, emisor, receptor, distancia);
		this.historial.add(l);
		return l;
	}
	
	public Llamada registrarLlamadaInternacional(LocalDateTime comienzo, int duracion, Numero emisor, Numero receptor, String origen, String destino) {
		Llamada l = new LlamadaInternacional(comienzo, duracion, emisor, receptor, origen, destino);
		this.historial.add(l);
		return l;
	}
	
	//........
	public double calcularCostoLlamadas(LocalDateTime inicio, LocalDateTime fin) {
		return this.historial.stream().filter(Llamada -> Llamada.entraEnElLapso(inicio, fin)).mapToDouble(llamada -> llamada.calcularCostoFijo()).sum();
	
	}
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	
}
