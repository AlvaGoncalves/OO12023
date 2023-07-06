package ar.edu.unlp.info.oo1.AplicacionParaListaDeTareas;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nom;
	private String ape;
	private List<Tarea> tareas;
	
	
	public Usuario(String nom, String ape) {
		this.nom = nom;
		this.ape = ape;
		this.tareas = new ArrayList<Tarea>();
	}

	
	public void eliminarTarea(Tarea t) {
		this.tareas.remove(t);
	}
	
	public void editarTarea() {
		
	}
	
	
	public void marcarComoTerminada(Tarea t) {

	}
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getApe() {
		return ape;
	}


	public void setApe(String ape) {
		this.ape = ape;
	}


	public List<Tarea> getTareas() {
		return tareas;
	}


	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}
	
	
	
	
}
