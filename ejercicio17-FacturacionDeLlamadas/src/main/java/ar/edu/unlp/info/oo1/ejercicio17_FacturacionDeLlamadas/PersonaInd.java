package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

public class PersonaInd extends Persona {
	private int dni;
	private String nom;
	private String dir;
	private int num;
	
	public PersonaInd(int dni, String nom, String dir) {
		this.dir = dir;
		this.dni = dni;
		this.nom = nom;
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

}
