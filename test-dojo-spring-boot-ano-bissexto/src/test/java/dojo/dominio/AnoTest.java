package dojo.dominio;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnoTest {

    @Test
    public void test1() {
        boolean isBissexto = Ano.isBissexto(2020);
        assertTrue(isBissexto);
    }

    @Test
    public void todoAnoDivisivelPor400(){
       boolean isBissexto =  Ano.isBissexto(2100);
       assertTrue(isBissexto);
    }

    @Test
    public void todoAnoDivisivelPor100MasNaoPor400(){
        boolean isBissexto =  Ano.isBissexto(1700);
       assertFalse(isBissexto);
    }

    @Test
    public void anoDivisivelPor4MasNaoPor100(){
        boolean isBissexto = Ano.isBissexto(2008);
        assertTrue (isBissexto);
    }
}