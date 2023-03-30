package ar.edu.unlp.info.oo1.ejercicio5_GenealogiaSalvaje;

import static org.junit.jupiter.api.Assertions.assertEquals; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class MamiferoTest {
	
	Mamifero alexa, mufasa, sarabi, elsa, scar, nala, melquiades;
	
	@BeforeEach
	void setUp() throws Exception {
		alexa = new Mamifero();
		mufasa = new Mamifero();
		sarabi = new Mamifero();
		elsa = new Mamifero();
		scar = new Mamifero();
		nala = new Mamifero();
		melquiades = new Mamifero();
		alexa.setPadre(mufasa);
		alexa.setMadre(sarabi);
		alexa.getPadre().setMadre(nala);
		alexa.getPadre().setPadre(melquiades);
		alexa.getMadre().setMadre(elsa);
		alexa.getMadre().setPadre(scar);
	}
	
	
    @Test
    public void testTieneComoAncestroA() {
      //casos limites, ser abuelo y otro es no conocer a ese ancestro
      Mamifero juan = new Mamifero();
      assertEquals(alexa.tieneComoAncestroA(juan), false);
      assertEquals(alexa.tieneComoAncestroA(elsa), true);
    }
}
