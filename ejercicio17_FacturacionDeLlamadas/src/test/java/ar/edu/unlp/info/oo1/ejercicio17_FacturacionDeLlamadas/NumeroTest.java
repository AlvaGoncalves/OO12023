package ar.edu.unlp.info.oo1.ejercicio17_FacturacionDeLlamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumeroTest {
	private Numero n;
	private Llamada local;
	private Llamada interUrbana;
	private Llamada interNacional;
	
	
	@BeforeEach
	void setUp() throws Exception {
		int num = 1;
		this.n = new Numero(num);
		this.local = n.registrarLlamadaLocal(10, num, n, n)
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
