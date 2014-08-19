

package ejercicios01.bigdecimal.luriol;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Ejercicio 01
 * @author luriol
 * Observaciones
 * - Utilizar el estándar en la declaración de variables
 * - Simplificar la creación de variables con el fin de optimizar el uso de memoria.
 * - El capital del ejemplo es 1200000.
 * - Código ordenado.
 */

public class Ejercicio01 {

    private static BigDecimal Ejecicio01(BigDecimal nCapital, BigDecimal nInteres, int nAnio) {
        BigDecimal x = new BigDecimal("1.0");
        BigDecimal p = new BigDecimal("100.0");
        BigDecimal nInteresCompuesto = nInteres.divide(p, 2, RoundingMode.HALF_UP);
        BigDecimal nSumaInteres = nInteresCompuesto.add(x);
        BigDecimal nTotalCapital = nCapital.multiply(nSumaInteres.pow(nAnio));
        BigDecimal nTotalCapitalFinal = nTotalCapital.setScale(3, RoundingMode.HALF_UP);

        return (nTotalCapitalFinal);
    }

    public static void main(String[] args) {

        BigDecimal nCapital = new BigDecimal("1200.000");
        BigDecimal nInteres = new BigDecimal("8");
        int nAnio = 5;
        BigDecimal nCapitalfinal = Ejecicio01(nCapital, nInteres, nAnio);
        System.out.println(nCapitalfinal);

    }
}
