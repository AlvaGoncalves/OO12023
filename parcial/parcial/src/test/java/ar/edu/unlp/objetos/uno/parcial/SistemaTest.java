package ar.edu.unlp.objetos.uno.parcial;

import examenOO1.CursoEnVivo;
import examenOO1.Inscripcion;
import examenOO1.Sistema;
import examenOO1.Usuario;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 

class SistemaTest {
	Sistema sistema;
	Usuario carlos, alicia;
	
	@BeforeEach 
	void setUp() {
		sistema = new Sistema();
		
		carlos = sistema.crearUsuario("carlos", "carlos@mail.com", "soycarlos123");
		alicia = sistema.crearUsuario("alicia", "alicia@mail.com", "maravillada");
	}
	
	@Test
	void incribirUsuarioEnCursoTest() {
		CursoEnVivo cursoEnVivo = sistema.crearCursoEnVivo("OO1", "El mejor curso", 100.0, LocalDate.now().plusDays(1), 1, 1, 20);
		
		//Incripcion exitosa -> hay cupo y no pasó fecha de inscripcion
		Inscripcion inscripcion = sistema.incribirUsuarioEnCurso(carlos, cursoEnVivo);
		assertNotNull(inscripcion);
		assertEquals(inscripcion.getMonto(), 100.0);
		
		//Inscripcion fallida -> no hay cupo
		assertNull(sistema.incribirUsuarioEnCurso(alicia, cursoEnVivo));
		
		//Inscripcion fallida -> pasó la fecha de inscripción
		CursoEnVivo cursoPasado = sistema.crearCursoEnVivo("OO2", "Otro buen curso", 100.0, LocalDate.now().minusDays(1), 1, 1, 20);
		assertNull(sistema.incribirUsuarioEnCurso(alicia, cursoPasado));
		
		//Inscripcion exitosa con monto a favor
		carlos.darBono(60.0);
		cursoEnVivo = sistema.crearCursoEnVivo("OO3", "¿Existe eso?", 100.0, LocalDate.now().plusDays(1), 1, 1, 20);
		inscripcion = sistema.incribirUsuarioEnCurso(carlos, cursoEnVivo);
		assertNotNull(inscripcion);
		assertEquals(inscripcion.getMonto(), 50.0);
	}

}
