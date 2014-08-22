/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia04_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lnarvaez
 */
public class Prueba {

    public static void main(String args[]) {
        verificarCadena("y2@ass", "^[x-z][\\d]@.*");
    }

    private static void verificarCadena(String sCadena, final String sExpresionRegular) {
        Pattern pat = Pattern.compile(sExpresionRegular);
        Matcher mat = pat.matcher(sCadena);

        boolean b1 = mat.matches();
        boolean b2 = sCadena.matches(sExpresionRegular);

        System.out.println("Caso 01: " + b1);
        System.out.println("Caso 02: " + b2);
    }
}
