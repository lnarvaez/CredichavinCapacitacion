/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios01.bigdecimal.luriol;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CapacitacionClase01 {

    private static BigDecimal calcularFuerzaa(BigDecimal nMasa, BigDecimal nAceleration) {

        return nMasa.multiply(nAceleration).setScale(2, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
     //   System.out.println(raiz(81.0, 4));
        /*
         BigDecimal nMasa = new BigDecimal("50.855");
         BigDecimal nAceleration = new BigDecimal("8.787");
         BigDecimal nFuerza = calcularFuerzaa(nMasa, nAceleration);
         System.out.println(nFuerza);
         */
        ejemplo();
 
    }

    private static void ejemplo() {

        BigDecimal nDecimal01 = new BigDecimal("1200.00");
        BigDecimal nDecimal02 = new BigDecimal("0.08");

        BigDecimal nDecimalDivision = nDecimal01.divide(nDecimal02, 5, RoundingMode.HALF_UP);

        BigDecimal nDecimalDivisionCentesima = nDecimalDivision.setScale(2, RoundingMode.HALF_UP);

        //nDecimalDivision
        System.out.println(nDecimalDivision);
        System.out.println(nDecimalDivisionCentesima);
    }



   

    private static double raiz(double nNumero, int nRaiz) {
        return Math.pow(nNumero, (1.0 / nRaiz));
    }
}
