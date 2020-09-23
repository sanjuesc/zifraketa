package Zifratu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {


    @Before
    public void setUp(){
    }

    @Test
    public void testZifratu1() {
        App ordezkatzeHiztegia = new App("ZXCVBNMASDFGHJKLQWERTYUIOP");
        assertEquals("BP MZTVB MBWWZWBJ ZGVB", ordezkatzeHiztegia.zifratu("EZ GAUDE GERRAREN ALDE"));
    }

    @Test
    public void testDeszifratu() {
        App ordezkatzeHiztegia = new App("ZXCVBNMASDFGHJKLQWERTYUIOP");
        assertEquals("EZ GAUDE GERRAREN ALDE",
                ordezkatzeHiztegia.deszifratu(
                        ordezkatzeHiztegia.zifratu("EZ GAUDE GERRAREN ALDE")));
    }
}