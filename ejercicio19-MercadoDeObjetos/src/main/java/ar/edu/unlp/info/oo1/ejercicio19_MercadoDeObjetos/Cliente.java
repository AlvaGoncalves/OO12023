package ar.edu.unlp.info.oo1.ejercicio19_MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nom;
	private String dir;
	private List<Pedido> pedidos;
	
	
	public Cliente(String n, String d) {
		this.nom = n;
		this.dir = d;
		this.pedidos = new ArrayList<Pedido>();
	}

 
	public String getNom() {
		return nom;
	}
	
	
	public Pedido crearPedido(Producto producto, int cant, MedioDePago MDP, MecanismoEnvio ME){
		Pedido pedido = new Pedido(this, producto, cant, MDP, ME);
		this.pedidos.add(pedido);
		return pedido;
	}


	public String getDir() {
		return dir;
	}
	
	
}
