package dojo.dominio;

public class Ano {

    /**
     * Indica se ano é bissexto (ou seja, se ano tem 366 dias).
     *
     * @param ano Ano
     * @return {@code true} se ano for bissexto, caso contrário {@code false}
     */
    public static boolean isBissexto(int ano) {
        boolean isDivisivelPor400 = (ano % 400 == 0);
        if (isDivisivelPor400) {
            return true;
        }

        boolean isDivisivelPor100 = (ano % 100 == 0);
        if (isDivisivelPor100 && !isDivisivelPor400) {
            return false;
        }

        boolean isDivisivelPor4 = (ano % 4 == 0);
        if (isDivisivelPor4 && !isDivisivelPor100) {
            return true;
        }

        if (!isDivisivelPor4) {
          return false;
        }

        return false;
    }
}
