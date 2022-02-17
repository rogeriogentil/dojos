package dojo.dominio;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnoTest {

    @Test
    public void test1() {
        boolean isBissexto = Ano.isBissexto(2020);
        assertTrue(isBissexto);
    }

    @Test
    public void test2() {
        boolean isBissexto = Ano.isBissexto(2005);
        assertFalse(isBissexto);
    }

    @Test
    public void testAnoDivisivelPor400() {
        boolean isBissexto = Ano.isBissexto(2400);
        assertTrue(isBissexto);
    }
}