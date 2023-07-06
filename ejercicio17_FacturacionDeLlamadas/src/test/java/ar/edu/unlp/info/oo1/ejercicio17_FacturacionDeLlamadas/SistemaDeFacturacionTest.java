package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
class SistemaDeFacturacionTest {
	private SistemaDeFacturacion sistema;
	private Numero n1;
	private Numero n2;
	private Numero n3;
	private Persona p1;
	private Persona p2;
	
	
	//en el before each los creo con sus metodos y parametros correspondientes
	
	@BeforeEach
	void setUp() throws Exception{
		this.sistema = new SistemaDeFacturacion();
		this.n1 = sistema.agregarNumero(1);
		this.n2 = sistema.agregarNumero(2);
		this.n3 = sistema.agregarNumero(3);
		this.p1 = sistema.registrarPersonaFisica("juan","57 n°32", 32);
		this.p2 = sistema.registrarPersonaJuridica("pedro S.A", "57 n° 43", 201232555, "empresa");
	}
	
	@Test
	void testCalcularGastos() {
		
	}
	
	
}
