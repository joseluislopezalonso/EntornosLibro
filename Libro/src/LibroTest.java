import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibroTest {
	Libro l1;
	Libro l2;
	@Before
	public void setUp() throws Exception {
	l1=new Libro();
	l2=new Libro("informatica", 400, "si");
	}

	@Test
	public void testLibro() {
		assertNull(l1.getNombre());
	}

	@Test
	public void testLibroStringIntString() {
		assertEquals(400, l2.getNumpag());
	}

	@Test
	public void testToString() {
		assertEquals("El libro informatica de 400 pag esta disponible: si", l2.toString());
	}

	@Test
	public void testGetNombre() {
		String x=l2.getNombre();
		assertEquals("informatica", x);
	}

	@Test
	public void testSetNombre() {
		l2.setNombre("lengua");
		assertEquals("lengua", l2.getNombre());
	}

	@Test
	public void testGetNumpag() {
		int x=l2.getNumpag();
		assertEquals(400, x);
	}

	@Test
	public void testSetNumpag() {
		l2.setNumpag(452);
		assertEquals(452, l2.getNumpag());
	}

	@Test
	public void testGetDisponible() {
		String x=l1.getDisponible();
		assertEquals("no", x);
	}

	@Test
	public void testSetDisponible() {
		l1.setDisponible("si");
		assertEquals("si", l1.getDisponible());
	}

	@Test
	public void testPrestamo() {
		String x=l2.prestamo("informatica");
		assertEquals("aqui esta el libro", x);
	}
	
	@Test
	public void testPrestamo2() {
		String x=l2.prestamo("lengua");
		assertEquals("el libro no esta disponible", x);
	}

	@Test
	public void testDevolucion() {
		String x=l2.devolucion("informatica");
		assertEquals("gracias, vuelva pronto", x);
	}


	@Test
	public void testDevolucion2() {
		String x=l2.devolucion("lengua");
		assertEquals("no reconozco ese libro", x);
	}
}
