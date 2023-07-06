package ar.edu.unlp.info.oo1.ejercicio19_MercadoDeObjetos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class SistemaTest {
	private Sistema sistema;
	
	private Pedido AlContadoCorreo;
	private Pedido AlContadoADomicilio;
	private Pedido EnCuotasComercio;
	
	private Producto producto1;
	private Producto producto2;
	private Vendedor vendedor;
	private Cliente cliente;
	
	@BeforeEach
	void setUp() throws Exception {
		this.sistema = new Sistema();
		this.cliente = this.sistema.registrarCliente("Pedro", "2");
		this.vendedor = this.sistema.registrarVendedor("Juan","1");
		this.producto1 = this.sistema.registrarProducto("jabon", "feo", 20, 1, this.vendedor);
		this.producto2 = this.sistema.registrarProducto("dado", "cuadrado", 15, 2, this.vendedor);
	}
	
	@Test
	void crearPedido() {
		AssertNull(this.sistema);
		this.AlContadoCorreo =
		this.EnCuotasComercio = 
	}
	
	
	
}
