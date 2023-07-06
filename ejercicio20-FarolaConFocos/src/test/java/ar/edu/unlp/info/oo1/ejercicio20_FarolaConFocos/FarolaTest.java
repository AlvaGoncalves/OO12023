package ar.edu.unlp.info.oo1.ejercicio20_FarolaConFocos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class FarolaTest {
	private Farola f1;
	private Farola f2;
	private Farola f3;
	private Farola f4;
	
	
	@BeforeEach
	void setUp() throws Exception {
		this.f1 = new Farola("phillips", 5);
		this.f2 = new Farola("whatts", 5);
		this.f3 = new Farola("philco", 0);
		this.f4 = new Farola("samsung", 0);
		
	}	
	
	
	@Test
	void testConstructor() {
		assertFalse(f1.isOn(), "La farolaUno no está apagada");
		assertFalse(f1.isOn(), "La farolaUno no está apagada");
		assertTrue(f1.getNeighbors().isEmpty(), "La farolaUno no deberia tener vecinos");
	}
	
	
	@Test
	void testPairWithNeighbors() {
		f1.pairWithNeighbor(f2);		
		f1.pairWithNeighbor(f3);
		f1.pairWithNeighbor(f4);
		
		assertTrue(f1.getAlumbrado().contains(f2));
		assertTrue(f1.getAlumbrado().contains(f3));
		assertTrue(f1.getAlumbrado().contains(f4));
		
	}
	
	@Test
	void testIsOnOf(){
		f1.pairWithNeighbor(f2);
		f1.pairWithNeighbor(f3);
		f1.pairWithNeighbor(f4);
		f1.turnOn();
		assertEquals(4, f1.getCantidadMaximaCiclo());
		
		assertTrue(f1.isOn());
		assertTrue(f2.isOn());
		assertTrue(f3.isOn());
		assertTrue(f4.isOn());
		
		f1.turnOff();
		assertEquals(3, f1.getCantidadMaximaCiclo());
		assertFalse(f1.isOn());
		assertFalse(f2.isOn());
		assertFalse(f3.isOn());
		assertFalse(f4.isOn());
		
		f2.turnOn();
		assertEquals(2, f2.getCantidadMaximaCiclo());
		assertTrue(f1.isOn());
		assertTrue(f2.isOn());
		assertTrue(f3.isOn());
		assertTrue(f4.isOn());
		
		f2.turnOff();
		assertEquals(1,f2.getCantidadMaximaCiclo());
		assertFalse(f1.isOn());
		assertFalse(f2.isOn());
		assertFalse(f3.isOn());
		assertFalse(f4.isOn());
	}
	
	
	@Test
	void testFocosVencidos() {
		f1.pairWithNeighbor(f2);
	    f2.pairWithNeighbor(f3);
	    f3.pairWithNeighbor(f4);
	    
	    assertEquals(2,f1.farolasConFocosVencidos().size());
	    assertTrue(f1.farolasConFocosVencidos().contains(f4));
	    assertTrue(f2.farolasConFocosVencidos().contains(f3));
	}
	
	
}
