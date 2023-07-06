package ar.edu.unlp.info.oo1.AplicacionParaListaDeTareas;

public class TareaSimple extends Tarea {
	private String titulo;
	private String desc;
	
	public TareaSimple(String titulo) {
		this.titulo = titulo;
	}
	
	

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
