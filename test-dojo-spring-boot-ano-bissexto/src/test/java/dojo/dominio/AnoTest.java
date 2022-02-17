package dojo.dominio;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AnoTest {

    @Test
    public void test1() {
        boolean isBissexto = Ano.isBissexto(2020);
        assertTrue(isBissexto);
    }
}