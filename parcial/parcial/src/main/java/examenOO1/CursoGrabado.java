package examenOO1;

public class CursoGrabado extends Curso {
	public CursoGrabado(String nombre, String descripcion, double precio) {
		super(nombre, descripcion, precio);
	}
	
	public void cambiarPrecio(double nuevoPrecio) {
		this.precio = nuevoPrecio;
	}

	@Override
	public boolean estaGrabado() {
		return true;
	} 
}
