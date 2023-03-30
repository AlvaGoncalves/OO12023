package ar.edu.unlp.info.oo1.ejercicio6_RedDeAlumbrado;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Farola {

	private Boolean interruptor;
	private List<Farola> Alumbrado = new ArrayList<Farola>();
	
	public Farola() {
		
	}
	
	public void pairWithNeightbor(Farola otraFarola) {
		
	}
	
	public List<Farola> getNeighbors(){
		return this.getAlumbrado();
	}
	
	public void CrearFarola() {
		
	}

	public List<Farola> getAlumbrado() {
		return Alumbrado;
	}

	public void setAlumbrado(List<Farola> alumbrado) {
		Alumbrado = alumbrado;
	}
	
	

}
