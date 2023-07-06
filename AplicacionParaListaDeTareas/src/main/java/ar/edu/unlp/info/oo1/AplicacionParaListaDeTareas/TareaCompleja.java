package ar.edu.unlp.info.oo1.AplicacionParaListaDeTareas;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja extends Tarea {
	private String titulo;
	private String desc;
	private List<Tarea> dependencia;
	private Object material;
	
	
	public TareaCompleja(String titulo, Object material) {
		this.titulo = titulo;
		this.material = material;
		this.dependencia = new ArrayList<Tarea>();
	}
	

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public Object getMaterial() {
		return material;
	}


	public void setMaterial(Object material) {
		this.material = material;
	}


	public List<Tarea> getDependencia() {
		return dependencia;
	}


	public void setDependencia(List<Tarea> dependencia) {
		this.dependencia = dependencia;
	}
	
	
}
