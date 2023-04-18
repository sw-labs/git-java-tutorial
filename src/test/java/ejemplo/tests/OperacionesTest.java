package ejemplo.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ejemplo.Operaciones;

public class OperacionesTest {

	@Test
	public void pruebaSuma() {

		assertEquals(1, Operaciones.suma(1, 0), "1+0 no da 1");
		assertEquals(2, Operaciones.suma(1, 1), "1+1 no da 2");
		assertEquals(4, Operaciones.suma(2, 2), "2+2 no da 4");
		assertEquals(8, Operaciones.suma(4, 4), "4+4 no da 8");
	}

	@Test
	public void pruebaResta() {

		assertEquals(2, Operaciones.resta(2, 0), "2-0 no da 2");
		assertEquals(0, Operaciones.resta(2, 2), "2-2 no da 0");
		assertEquals(1, Operaciones.resta(2, 1), "2-1 no da 1");
		assertEquals(2, Operaciones.resta(4, 2), "4-2 no da 2");
	}

	
}
