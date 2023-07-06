package ar.edu.unlp.info.oo1.ejercicio20_FarolaConFocos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Farola {

	private Boolean interruptor;
	private List<Farola> Alumbrado;
	private Foco foco;
	
	public Farola(String fabricante, int cicloEncendido) {
		this.foco = new Foco(fabricante, cicloEncendido);
		this.interruptor = false;
		this.Alumbrado = new ArrayList<Farola>();
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if(!this.Alumbrado.contains(otraFarola)) {
			this.Alumbrado.add(otraFarola);
			otraFarola.Alumbrado.add(this);
		}	
	}
	
	public List<Farola> getNeighbors(){
		return this.Alumbrado;
	}
	
	public void turnOn() {
		if(!isOn()) {
			this.interruptor = true;
			this.foco.decrementarCiclo();
			this.Alumbrado.forEach(Farola -> Farola.turnOn());
		}
			
	}

	public void turnOff() {
		if(isOn()) {
			this.interruptor = false;
			this.foco.decrementarCiclo();
			this.Alumbrado.forEach(Farola -> Farola.turnOff());
		}
	}
	
	public boolean isOn() {
		return this.interruptor;
	}
	//recupero la lista con las farolas ya obtenidas y luego la modifico filtrando los focos vencidos con los cuales me quedo unicamente
	public List<Farola> farolasConFocosVencidos(){
		List<Farola> l = new ArrayList<Farola>();
		this.conseguirRedFarolas(l);
		return l.stream().filter(Farola -> Farola.focoVencido()).collect(Collectors.toList());
	}
	
	private boolean focoVencido() {
		return this.foco.estaVencido();
	}
	
	//recursivamente voy agregando a l cada una de las farolas de la red
	private List<Farola> conseguirRedFarolas(List<Farola> lista){
		if(!lista.contains(this)) {
			lista.add(this);
			this.Alumbrado.stream().forEach(Farola -> Farola.conseguirRedFarolas(lista));;
		}
		return lista;
	}
	
	public int getCantidadMaximaCiclo() {
		return this.foco.getCicloEncendido();
	}
	

	public List<Farola> getAlumbrado() {
		return Alumbrado;
	}

	public void setAlumbrado(List<Farola> alumbrado) {
		Alumbrado = alumbrado;
	}

	public Boolean getInterruptor() {
		return interruptor;
	}

	public void setInterruptor(Boolean interruptor) {
		this.interruptor = interruptor;
	}
	
	

}
