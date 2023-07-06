package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

public class PersonaJuridica extends Persona {
	private int CUIT;
	private String tipo;
	
	
	public PersonaJuridica(String nombre, String dir, int CUIT, String tipo) {
		super(nombre, dir);
		this.CUIT = CUIT;
		this.tipo = tipo;
	}


	public int getCUIT() {
		return CUIT;
	}


	public void setCUIT(int cUIT) {
		CUIT = cUIT;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
