package ar.edu.unlp.info.oo1.ParcialAlvaPrimeraFecha;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Usuario> clientes = new ArrayList<Usuario>();
	
	
	public Usuario registrarUsuario(String nombre, String apellido, String dni){
		Usuario cli = new Usuario(nombre, apellido, dni);
		this.clientes.add(cli);
		return cli;
	}
	
	
	
	
}
