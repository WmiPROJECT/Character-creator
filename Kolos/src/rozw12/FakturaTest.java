package rozw12;

import static org.junit.Assert.*;

import org.junit.Test;

public class FakturaTest {

	@Test
	public void testpodajNetto1() {
        Faktura f = new Faktura(1123.0, 0.23);
        assertEquals(1123.0, f.podajNetto(), 0.0);
	}
	
    @Test
    public void testPodajNetto2() {
            Faktura f = new Faktura(-431.0, 0.23);
            assertEquals(-431.0, f.podajNetto(), 0.0);
    }


    @Test
    public void testPodajBrutto() {
            Faktura f = new Faktura(100.0, 0.23);
            assertEquals(123.0, f.podajBrutto(), 0.0);
    }
}
