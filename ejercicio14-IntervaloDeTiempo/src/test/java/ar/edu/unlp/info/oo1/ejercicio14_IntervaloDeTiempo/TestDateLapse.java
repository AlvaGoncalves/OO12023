package ar.edu.unlp.info.oo1.ejercicio14_IntervaloDeTiempo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class TestDateLapse {
	
	DateLapse periodo;
	
	@BeforeEach
	void setUp() throws Exception {
		periodo = new DateLapse(LocalDate.of(2022, 9, 1), LocalDate.of(2022, 10, 1));
	}
	
    @Test
    public void testSize() {
    	assertEquals(30, periodo.sizeInDays());
    }
    
    @Test
    public void testIncludes() {
    	LocalDate fecha = LocalDate.of(2022, 9, 25);
    	assertTrue(periodo.includesDate(fecha));
    }
    
}