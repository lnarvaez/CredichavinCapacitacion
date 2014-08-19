/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios01.bigdecimal.icolqui;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author ivasquez
 * 
 * Observaciones
 * - Utilizar los estándares en la declaración de variables
 * - No declarar variables que no se van a utilizar
 * - Mejorar el orden del código
 * - El método del ejercicio 01 debe tener como tercer parámetro a la tasa
 * - Explicar el uso de MathContext.DECIMAL32 en el método del ejercicio 01
 * - Correcto uso de los métodos, optimizando el uso de la memoria en el ejercicio 02
 * 
 */
public class BigDecimalColqui {

    private static BigDecimal Ejercicio01(BigDecimal CapitalInicial, int Tiempo) {
        BigDecimal Tasa = new BigDecimal(1 + 0.08);
        BigDecimal Potencia = Tasa.pow(Tiempo);
        return CapitalInicial.multiply(Potencia, MathContext.DECIMAL32);
    }

    private static double Ejercicio02(double CapitalFinal1, double CapitalInicial,
            double TiempoAños) {
        return Math.pow((CapitalFinal1 / CapitalInicial), (1.0 / TiempoAños));

    }

    public static void main(String[] args) {
        
        BigDecimal nDecimalMath = new BigDecimal("150000").multiply(BigDecimal.ONE, MathContext.DECIMAL32);
        System.out.println(nDecimalMath);
        
        /*
        // TODO code application logic here
        System.out.println("Ejercicio 01");
        BigDecimal Tasa = new BigDecimal(1200000.0);
        int Potencia = 5;
        BigDecimal CapitalFinal = Ejercicio01(Tasa, Potencia);
        System.out.println(CapitalFinal);
        
        
        System.out.println("Ejercicio 02");
        double CapitalInicial = 1500000;
        double CapitalFinal1 = 2360279;
        double todo = 0;

        int TiempoAños = 4;

        double Tasa1 = (Ejercicio02(CapitalFinal1, CapitalInicial, TiempoAños)) - 1;

        todo = Math.pow((CapitalFinal1 / CapitalInicial), (1.0 / TiempoAños));

        System.out.println(Tasa1);

        /*BigDecimal nDecimal01 = new BigDecimal("150");
         BigDecimal nDecimal02 = new BigDecimal(10.0);
         BigDecimal nDecimal03 = new BigDecimal("17.65432");
        
         BigDecimal nDecimalSuma = nDecimal01.add (nDecimal02);
        
         BigDecimal nDecimalDivision = nDecimal01.divide(nDecimal02);
        
         BigDecimal nDecimalDivision2 = nDecimal01.divide(nDecimal03, 4, RoundingMode.HALF_UP);
        
         BigDecimal nDecimalDivisionCentesima = nDecimalDivision2.setScale(2, RoundingMode.HALF_UP);
                
         System.out.println(nDecimal01);
         System.out.println(nDecimal02);
        
         System.out.println(nDecimalSuma);
        
         System.out.println(nDecimalDivision);
         System.out.println(nDecimalDivision2);
         System.out.println(nDecimalDivisionCentesima);*/
    }

}