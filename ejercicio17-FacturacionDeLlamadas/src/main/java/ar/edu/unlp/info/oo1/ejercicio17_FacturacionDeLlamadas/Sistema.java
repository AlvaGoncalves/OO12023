package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

import java.util.ArrayList;
import java.util.List;

public class Sistema{
	private List<Integer> telefonos = new ArrayList<Integer>();
	private List<PersonaInd> individuos = new ArrayList<PersonaInd>();
	private List<PersonaJur> juridicos = new ArrayList<PersonaJur>();
	
	
	public void AgregarNumero(int num) {
		this.telefonos.add(num);
	}
	
	
	public PersonaInd altaFisica(int dni, String nom, String dir) {
		PersonaInd x = new PersonaInd(dni, nom, dir);
		//hago esto para eliminar el numero asignado de la lista de disponibles
		x.recibirNumero(this.telefonos.size());
		this.individuos.add(x);
		this.telefonos.remove(this.telefonos.size());
		
		return x;
	}
	
	public PersonaJur altaJuridica(int dni, String nom, String dir, String cuit, String tipo) {
		PersonaJur x = new PersonaJur(dni, nom, dir, cuit, tipo);
		//hago esto para eliminar el numero asignado de la lista de disponibles
		x.recibirNumero(this.telefonos.size());
		this.juridicos.add(x);
		this.telefonos.remove(this.telefonos.size());
		
		return x;
	}
}

