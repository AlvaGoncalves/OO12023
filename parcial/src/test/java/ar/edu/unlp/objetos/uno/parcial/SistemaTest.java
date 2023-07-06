package ar.edu.unlp.objetos.uno.parcial;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import examenOO1.Propiedad;
import examenOO1.Sistema;
import examenOO1.Usuario;


class SistemaTest {
	Usuario dueno, inquilino;
	Propiedad propiedad;
	Sistema sistema;
	
	@BeforeEach 
	void setUp() {
		sistema = new Sistema();
		dueno = sistema.crearUsuario("1");
		propiedad = sistema.registrarPropiedad(dueno, 10.0, "estancia", "villa elisa");
		inquilino = sistema.crearUsuario("2");
	}
	
	@Test
	void crearReservaTest() {
		LocalDate hoy = LocalDate.now();
		LocalDate manana = hoy.plusDays(1);
		// Otra idea es que en vez de devolver la Reserva
		// devuelva True o False, para pode usar el
		// assertTrue o assertFalse respectivamente
		assertNotNull(sistema.crearReserva(inquilino, propiedad, hoy, manana));
		assertNull(sistema.crearReserva(inquilino, propiedad, hoy, manana));
		assertNull(sistema.crearReserva(inquilino, propiedad, hoy.minusDays(1), manana.plusDays(1)));
	}

}
