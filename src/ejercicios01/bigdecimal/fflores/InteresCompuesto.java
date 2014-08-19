/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios01.bigdecimal.fflores;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author ffloresj
 * Observaciones
 * - Correcto uso de los estándares en la declaracion de las variables. Recomendación: evitar utilizar la ñ -> nAnio
 * - Correcta implementación de los métodos, optimizando el uso de la memoria.
 */
public class InteresCompuesto {

    private static BigDecimal calcularCapitalInicial02(BigDecimal nCapitalFinal, BigDecimal nTasaInteresCompuesto, int nAños, BigDecimal nConstante) {
        return nCapitalFinal.divide((nConstante.add(nTasaInteresCompuesto)).pow(nAños), 0, RoundingMode.HALF_UP);
    }

    public static void main(String args[]) {
        BigDecimal nCapitalFinal = new BigDecimal("1583945");
        BigDecimal nTasaInteresCompuesto = new BigDecimal("0.05");
        int nAños = 14;
        BigDecimal nConstante = new BigDecimal("1");
        BigDecimal nCapitalInicial = calcularCapitalInicial02(nCapitalFinal, nTasaInteresCompuesto, nAños, nConstante);
        System.out.println(nCapitalInicial);
    }

}//end class InteresCompuesto