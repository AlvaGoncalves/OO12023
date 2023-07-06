package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

public class PersonaJur extends Persona{
	private int dni;
	private String nom;
	private String dir;
	private String cuit;
	private String tipo;
	private int num;
	
	public PersonaJur(int dni, String nom, String dir, String cuit, String tipo) {
		this.dni = dni;
		this.nom = nom;
		this.dir = dir;
		this.cuit = cuit;
		this.tipo = tipo;
	}
	
	
	@Override
	public void recibirNumero(int n) {
		this.num = n;
	}
	
	@Override
	public void registarLlamadaLocal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registarLlamadaInterurbana() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registarLlamadaInternacional() {
		// TODO Auto-generated method stub
		
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
