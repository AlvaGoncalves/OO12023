package examenOO1;

import java.time.LocalDate;

public class Valoracion {
	private int calificacion;
	private LocalDate fechaCreacion;
	private String comentario;
	private Usuario usuario;
	
	public Valoracion(int calificacion, String comentario, Usuario usuario) {
		this.calificacion = calificacion;
		this.comentario = comentario;
		this.usuario = usuario;
		this.fechaCreacion = LocalDate.now();
	}
	
	public int calificacion() {
		return calificacion;
	}
}
