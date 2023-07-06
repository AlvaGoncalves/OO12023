package ar.edu.unlp.info.oo1.simulacroParcialV2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class ChequeTest {
	private Cheque vencido;
	private Cheque noVencido;
	
	
	@BeforeEach
	void setUp() throws Exception{
		this.noVencido = new Cheque(20, "juan", "pedro", LocalDateTime.now().minusDays(29));
		this.vencido = new Cheque(20, "juan", "pedro", LocalDateTime.now().minusDays(30));
	}
	
	
	@Test
	void estaVencido() {
		assertTrue(this.vencido.estaVencido());
		assertFalse(this.noVencido.estaVencido());
	}
	
}
