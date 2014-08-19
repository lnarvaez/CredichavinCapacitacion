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
 * - Ninguna.
 */
public class InteresCompuesto2 {
    
    //Uso de FLOOR
    private static BigDecimal calcularCapitalInicial04(BigDecimal nCapitalFinal, BigDecimal nTasaInteresCompuesto, int nAños, BigDecimal nConstante) {
        return nCapitalFinal.divide(nConstante.add(nTasaInteresCompuesto).pow(nAños), 2, RoundingMode.FLOOR);
    }

    public static void main(String args[]) {
        BigDecimal nCapitalFinal = new BigDecimal("2000000");
        BigDecimal nTasaInteresCompuesto = new BigDecimal("0.1");
        int nAños = 5;
        BigDecimal nConstante = new BigDecimal("1");
        BigDecimal nCapitalInicial = calcularCapitalInicial04(nCapitalFinal, nTasaInteresCompuesto, nAños, nConstante);
        System.out.println(nCapitalInicial);
    }

}//end class InteresCompuesto2