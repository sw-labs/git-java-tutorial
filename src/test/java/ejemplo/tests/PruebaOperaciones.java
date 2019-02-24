package ejemplo.tests;

import org.junit.Test;

import ejemplo.Operaciones;

import static org.junit.Assert.*;

public class PruebaOperaciones {

	@Test
	public void pruebaSuma() {

		assertEquals("1+0 no da 1", 1, Operaciones.suma(1, 0));
		assertEquals("1+1 no da 2", 2, Operaciones.suma(1, 1));
		assertEquals("2+2 no da 4", 4, Operaciones.suma(2, 2));
		assertEquals("4+4 no da 8", 8, Operaciones.suma(4, 4));
	}

	@Test
	public void pruebaResta() {

		assertEquals("2-0 no da 2", 2, Operaciones.resta(2, 0));
		assertEquals("2-2 no da 0", 0, Operaciones.resta(2, 2));
		assertEquals("2-1 no da 1", 1, Operaciones.resta(2, 1));
		assertEquals("4-2 no da 2", 2, Operaciones.resta(4, 2));
	}

	
}
