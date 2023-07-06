package ar.edu.unlp.info.oo1.ejercicio19_MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vendedor {
	private String nom;
	private String dir;
	private List<Producto> productos;
	
	
	public Vendedor(String n, String d) {
		this.nom = n;
		this.dir = d;
		this.productos = new ArrayList<Producto>();
	}


	public String getNom() {
		return nom;
	}

	public Producto ponerALaVenta(String n, String d, double p, int cant) {
		Producto pro = new Producto(n, d, p, cant, this);
		this.productos.add(pro);
		return pro;
	}
	
	public List<Producto> buscarProducto(String n) {
		return this.productos.stream().filter(Producto -> Producto.getNom() == n).collect(Collectors.toList());
	}


	public String getDir() {
		return dir;
	}
	
	
	
}
