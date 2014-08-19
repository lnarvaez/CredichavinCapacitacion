/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios01.bigdecimal.luriol;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * Ejercicio 03
 * @author luriol
 * Observaciones
 * - Utilizar el estándar en la declaración de variables
 * - Simplificar la creación de variables con el fin de optimizar el uso de memoria.
 * - El capital inicial y el capital final no se calculan de acuerdo a la fórmula de la ecuación
 * - Código ordenado
 */

public class Ejercicio03 {

    private static BigDecimal Ejecicio03(BigDecimal nCapitalInicial, BigDecimal nCapitalFinal, int nAnio) {

        BigDecimal p = new BigDecimal("100.0");
        BigDecimal x = new BigDecimal("1.0");
        BigDecimal nDivCapital = nCapitalInicial.divide(nCapitalFinal, 7, RoundingMode.HALF_UP);

        Double nRaizCapital = Math.pow(nDivCapital.doubleValue(), (1.0 / nAnio));
        BigDecimal NRaizCapitalC = new BigDecimal(nRaizCapital);
        BigDecimal nInteres = ((NRaizCapitalC.subtract(x)).multiply(p));

        return nInteres.setScale(2, RoundingMode.HALF_UP);

    }

    public static void main(String[] args) {

        BigDecimal nCapitalInicial = new BigDecimal("2360.279");
        BigDecimal nCapitalFinal = new BigDecimal("1500.00");
        int nAnio = 4;
        BigDecimal nTasaInteres = Ejecicio03(nCapitalInicial, nCapitalFinal, nAnio);
        System.out.println(nTasaInteres);
    }
}
