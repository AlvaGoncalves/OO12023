package ar.edu.unlp.info.oo1.ejercicio19_MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Sistema{
	private List<Vendedor> vendedores = new ArrayList<Vendedor>();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	
	public Vendedor registrarVendedor(String nom, String dir) {
		Vendedor v = new Vendedor(nom, dir);
		this.vendedores.add(v);
		return v;
	}
	
	public Cliente registrarCliente(String nom, String dir) {
		Cliente c = new Cliente(nom, dir);
		this.clientes.add(c);
		return c;
	}
	
	public Vendedor buscarVendedor(String nom) {
		return this.vendedores.stream().filter(Vendedor -> Vendedor.getNom() == nom).findAny().orElse(null);
	}
	
	public Cliente buscarCliente(String nom) {
		return this.clientes.stream().filter(Cliente -> Cliente.getNom() == nom).findAny().orElse(null);
	}
	
	
	//llamado en cadena
	public Producto registrarProducto(String n, String d, double p, int cant, Vendedor v) {
		return v.ponerALaVenta(n, d, p, cant);
	}
	
	public double calcularCostoTotal(Pedido p) {
		return p.calcularCosto();
	}
	
	
}
