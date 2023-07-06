package ar.edu.unlp.info.oo1.simulacroParcialV2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PagareTest {
	private Pagare vencido;
	private Pagare noVencido;
	
	
	@BeforeEach
	void setUp() throws Exception {
		this.vencido = new Pagare(20, "juan", "pedro", LocalDateTime.now(), LocalDateTime.now().plusDays(1));
		this.noVencido = new Pagare(20, "pedro", "juan", LocalDateTime.now(), LocalDateTime.now());
	}
	
	
	@Test
	void estaVencido() {
		assertTrue(this.vencido.estaVencido());
		assertFalse(this.noVencido.estaVencido());
	}
}
