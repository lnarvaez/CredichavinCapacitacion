package credichavin.capacitacion.dia01;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author lnarvaez
 */
public class BigDecimalEjercicio01 {

    private static double calcularRaiz(double nNumero, int nRaiz) {
        return Math.pow(nNumero, (1.0 / nRaiz));
    }

    private static BigDecimal calcularFuerza(BigDecimal nMasa, BigDecimal nAceleracion) {
        return nMasa.multiply(nAceleracion).setScale(2, RoundingMode.HALF_UP);
    }

    public static void main(String args[]) {
        BigDecimal nMasa = new BigDecimal("50.855");
        BigDecimal nAceleracion = new BigDecimal("8.787");

        BigDecimal nFuerza = calcularFuerza(nMasa, nAceleracion);
        System.out.println(nFuerza);
        /*
         BigDecimal nDecimal01 = new BigDecimal("150");
         BigDecimal nDecimal02 = new BigDecimal("17.16464654");

         BigDecimal nDecimalDivision = nDecimal01.divide(nDecimal02, 4, RoundingMode.HALF_UP);
         BigDecimal nDecimalDivisionCentesima = nDecimalDivision.setScale(2, RoundingMode.HALF_UP);

         System.out.println(nDecimal01);
         System.out.println(nDecimal02);
         System.out.println(nDecimalDivision);
         System.out.println(nDecimalDivisionCentesima);
         */
    }
}
