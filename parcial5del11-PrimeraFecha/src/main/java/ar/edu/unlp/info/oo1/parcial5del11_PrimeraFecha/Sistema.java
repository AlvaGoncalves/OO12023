package ar.edu.unlp.info.oo1.parcial5del11_PrimeraFecha;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Sistema {
	private List<Contribuyente> clientes = new ArrayList<Contribuyente>();
	

	
	public Contribuyente altaContribuyente(String nom, String email, String loc, int dni) {
		Contribuyente c = new Contribuyente(nom, email, loc, dni);
		clientes.add(c);
		return c;
	}
	

	
	
}
