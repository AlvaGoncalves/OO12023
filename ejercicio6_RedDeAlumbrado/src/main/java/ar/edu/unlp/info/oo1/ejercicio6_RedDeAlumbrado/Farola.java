package ar.edu.unlp.info.oo1.ejercicio6_RedDeAlumbrado;

import java.util.ArrayList;
import java.util.List;


public class Farola {
	private boolean interruptor = false;
	private List<Farola> vecinos = new ArrayList<Farola>();
	
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola () {
		
	}
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca,
	* es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá
	* en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor(Farola otraFarola ) {
		this.vecinos.add(otraFarola);
		otraFarola.vecinos.add(this);
	}
																			
	
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return this.vecinos;
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(this.interruptor = false) {
			for(Farola farola : vecinos) {
				this.setInterruptor(true);
				farola.setInterruptor(true);
			}
		}
	}
	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(this.interruptor = true) {
			for(Farola farola : vecinos) {
				this.setInterruptor(false);
				farola.setInterruptor(false);
			}
		}
	}
	
	private void setInterruptor(boolean ok) {
		this.interruptor = ok;
	}
	
	public boolean isOn() {
		return this.interruptor;
	}


}
