package ar.edu.unlp.objetos.uno.parcial;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import examenOO1.DateLapse;
import examenOO1.Propiedad;
import examenOO1.Reserva;
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
		propiedad = sistema.registrarPropiedad(dueno, 100.0, "estancia", "villa elisa");
		inquilino = sistema.crearUsuario("2");
	}
	
	@Test
	void crearReservaTest() {
		LocalDate hoy = LocalDate.now();
		LocalDate manana = hoy.plusDays(1);
		// Otra idea es que en vez de devolver la Reserva
		// devuelva True o False, para pode usar el
		// assertTrue o assertFalse respectivamente
		Reserva reserva = sistema.crearReserva(inquilino, propiedad, hoy, manana);
		assertNotNull(reserva);
		assertEquals(reserva.getPrecioFinal(), 200.0);
		assertNull(sistema.crearReserva(inquilino, propiedad, hoy, manana));
		assertNull(sistema.crearReserva(inquilino, propiedad, hoy.minusDays(1), manana.plusDays(1)));
		
		// caso raro de ayer:
		// reserva de 10 dias con 2 reglas de rango
		LocalDate reservaLargaFrom = hoy.plusDays(10);
		LocalDate reservaLargaTo = reservaLargaFrom.plusDays(9);
		LocalDate diaIntermedio = reservaLargaFrom.plusDays(4);
		sistema.crearReglaPorRangoFechas(propiedad, new DateLapse(reservaLargaFrom, diaIntermedio), false, 10);
		sistema.crearReglaPorRangoFechas(propiedad, new DateLapse(diaIntermedio.plusDays(1), reservaLargaTo), false, 10);
		reserva = sistema.crearReserva(inquilino, propiedad, reservaLargaFrom, reservaLargaTo);
		assertEquals(reserva.getPrecioFinal(), 900.0);
	}
}
