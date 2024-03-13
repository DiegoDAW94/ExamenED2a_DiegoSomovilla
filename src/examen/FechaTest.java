package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {

	@Test
	void cp1() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = Fecha.validarFecha(2000, 2, 28);
		assertEquals(resultadoEsperado, resultadoObtenido);
		}
	
	@Test
	void cp2() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = Fecha.validarFecha(2000, 2, -1);
		assertEquals(resultadoEsperado, resultadoObtenido);
		}
	
	@Test
	void cp3() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = Fecha.validarFecha(0, 10, 15);
		assertEquals(resultadoEsperado, resultadoObtenido);
		}

	@Test
	void cp4() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = Fecha.validarFecha(2000, 24, 15);
		assertEquals(resultadoEsperado, resultadoObtenido);
		}
}
