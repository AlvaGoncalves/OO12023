package ar.edu.unlp.info.oo1.ejercicio15_AlquilerDePropiedades;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class UsuarioTest {
	
	private Usuario usuarioSinPropiedades;
	private Usuario propietario;
	private Usuario usuarioSinReservas;
	private Usuario	usuarioConReservas;
	private Reserva reserva1;
	private Reserva reserva2;
	private Reserva reserva3;
	private DateLapse lapso1;
	private DateLapse lapso2;
	private DateLapse lapso3;
	private Propiedad propiedad1;
	private Propiedad propiedad2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		this.usuarioSinPropiedades = new Usuario("juan","493 e/ 29 y 30",43107340);
		this.propietario = new Usuario("Pedro","493 e/ 30 y 31",43107340);
		this.usuarioSinReservas = new Usuario("ramon","abc",43107340);
		this.usuarioConReservas = new Usuario("","493 e/ 30 y 31",43107340);
		this.lapso1 = new DateLapse(LocalDate.of(2022, 10, 5), LocalDate.of(2022, 10, 15));
		this.lapso2 = new DateLapse(LocalDate.of(2022, 10, 1), LocalDate.of(2022, 10, 6));
		this.lapso3 = new DateLapse(LocalDate.of(2025, 11, 1), LocalDate.of(2025, 11, 15));
		this.propiedad1 = new Propiedad("mansion en venta", "casa de 2 pisos", 10, "512", propietario);
		this.propiedad1 = new Propiedad("depto en venta", "monoambiente", 20, "420", propietario);		
		this.reserva1 = new Reserva(this.lapso1, this.propiedad1);
		this.reserva2 = new Reserva(this.lapso2, this.propiedad2);
		this.reserva3 = new Reserva(this.lapso2, this.propiedad2);
		this.usuarioConReservas.agregarReserva(reserva1);
		this.usuarioConReservas.agregarReserva(reserva2);
		this.usuarioConReservas.agregarReserva(reserva3);
		this.propietario.agregarPropiedad(propiedad1);
		this.propietario.agregarPropiedad(propiedad2);
		this.propiedad1.agregarReserva(reserva1);
		this.propiedad2.agregarReserva(reserva2);
		this.propiedad2.agregarReserva(reserva3);
		
	}
	
    @Test
	void testAgregarReserva() {
		assertEquals(3, this.usuarioConReservas.getReservadas().size());
		assertEquals(0, this.usuarioSinReservas.getReservadas().size());
	}
    
    @Test
    void testEliminarReserva() {
    	this.usuarioConReservas.eliminarReserva(reserva1);
    	this.usuarioConReservas.eliminarReserva(reserva2);
    	this.usuarioConReservas.eliminarReserva(reserva3);
    	assertEquals(0,this.usuarioConReservas.getReservadas().size());
    	this.usuarioSinReservas.eliminarReserva(reserva1);
    	assertEquals(0,this.usuarioSinReservas.getReservadas().size());
    }
    
    @Test
    void testCalcularIngresosPropietario() {
    	assertEquals(8800, this.propietario.calcularIngresoPropietario(new DateLapse (LocalDate.of(2022, 9, 30), LocalDate.of(2025, 11, 15))));
    	assertEquals(7800, this.propietario.calcularIngresoPropietario(new DateLapse (LocalDate.of(2022, 10, 13), LocalDate.of(2025, 11, 15))));
    	assertEquals(2800, this.propietario.calcularIngresoPropietario(new DateLapse (LocalDate.of(2022, 10, 16), LocalDate.of(2025, 11, 15))));
    	assertEquals(0, this.usuarioSinPropiedades.calcularIngresoPropietario(lapso1));
    }
    
    
}
