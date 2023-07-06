package ar.edu.unlp.info.oo1.ejercicio20_FarolaConFocos;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Foco{
	private String fabricante;
	private int cicloEncendido;
	
	public Foco(String fabricante, int cicloEncendido) {
		this.setFabricante(fabricante);
		this.setCicloEncendido(cicloEncendido);	
	}
	
	public void decrementarCiclo() {
		this.cicloEncendido -=1;
	}
	
	public int getCicloEncendido() {
		return cicloEncendido;
	}

	public void setCicloEncendido(int cicloEncendido) {
		this.cicloEncendido = cicloEncendido;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public boolean estaVencido() {
		return this.cicloEncendido <= 0;
	}
	
	
}
