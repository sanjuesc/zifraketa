package Zifratu;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    App ordezkatzeHiztegia = null;

    public void setUp() throws Exception {
        super.setUp();
        ordezkatzeHiztegia = new App();
    }

    public void tearDown() throws Exception {
    }

    public void testZifratu() {
        assertEquals("BP MZTVB MBWWZWBJ ZGVB", ordezkatzeHiztegia.zifratu("EZ GAUDE GERRAREN ALDE"));
    }
    public void testDeszifratu() {

        assertEquals("EZ GAUDE GERRAREN ALDE",
                ordezkatzeHiztegia.deszifratu(
                        ordezkatzeHiztegia.zifratu("EZ GAUDE GERRAREN ALDE")));

    }
}