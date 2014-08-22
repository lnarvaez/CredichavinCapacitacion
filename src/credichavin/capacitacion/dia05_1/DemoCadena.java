/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia05_1;

import java.util.Arrays;

/**
 *
 * @author lnarvaez
 */
public class DemoCadena {

    public static void main(String args[]) {
        /*
        //1° Inicializar String
        String sCadena01 = "ABCDE";        
        String sCadena02 = new String(new char[]{'a', 'b', 'c', 'd', 'e'});
        
        //2° Convertir a mayusculas / minusculas
        String sCadena03 = "     Caja de Ahorro y Credito Chavin    ";
        System.out.println(sCadena03);
        System.out.println(sCadena03.toUpperCase());
        System.out.println(sCadena03.toLowerCase());
        
        //3° Eliminar espacios
        System.out.println(sCadena03.trim());
        
        //4° Utilizar "split"
        String[] arPalabras =  sCadena03.trim().split("C");
        System.out.println(Arrays.asList(arPalabras));
        
        //5° Verificar si la cadena empieza con una serie de caracteres
        sCadena03 = sCadena03.trim();
        boolean lEmpiezaConCaracterC = sCadena03.startsWith("C");
        System.out.println("lEmpiezaConCaracterC: " + lEmpiezaConCaracterC);
        
        //6° Verificar si la cadena empieza con una serie de caracteres
        sCadena03 = sCadena03.trim();
        boolean lFinalizaConCaracterZ = sCadena03.endsWith("Z");
        System.out.println("lFinalizaConCaracterZ: " + lFinalizaConCaracterZ);
        
        //7° Subcadena        
        //a partir de 5° hasta el final, incluyendo 5°
        String sSubCadena01 = sCadena03.substring(5);
        //a partir de 5° hasta 10°, incluyendo 5° y excluyendo 10°
        String sSubCadena02 = sCadena03.substring(5, 10);
        
        System.out.println(sSubCadena01);
        System.out.println(sSubCadena02);
        
        //8° Validar cadena vacia
        System.out.println("Validando cadena vacia");
        String sCadenaVacia = "                ";
        boolean lEsVacio01 = sCadenaVacia.trim().equals("");
        boolean lEsVacio02 = sCadenaVacia.trim().isEmpty();
        System.out.println("lEsVacio01: " + lEsVacio01);
        System.out.println("lEsVacio02: " + lEsVacio02);
        */
        
        //9° Expresiones regulares
        String sExpresionRegNumeros = "[4]{1}\\d+";
        String sEntrada = "4";
        boolean lEntradaValida = sEntrada.matches(sExpresionRegNumeros);
        System.out.println("lEntradaValida01: " + lEntradaValida);
        
        String sExpresionRegNumeros02 = "[x-z]{1}[5-8]+";
        String sEntrada02 = "y57";
        lEntradaValida = sEntrada02.matches(sExpresionRegNumeros02);
        System.out.println("lEntradaValida02: " + lEntradaValida);
        
        String sExpresionRegNumeros03 = "[A-Za-z]{4,6}\\d{3}";
        String sEntrada03 = "abcdef285";
        lEntradaValida = sEntrada03.matches(sExpresionRegNumeros03);
        System.out.println("lEntradaValida03: " + lEntradaValida);                
        
        String sExpresionRegNumeros04 = "^[A-Za-z]{4,6}\\d{3}$";
        String sEntrada04 = "abcdef285";
        lEntradaValida = sEntrada04.matches(sExpresionRegNumeros04);
        System.out.println("lEntradaValida04: " + lEntradaValida);
        
        //String sExpresionRegNumeros05 = "^[5][6][7]{2}$";
        
        String sExpresionRegNumeros05 = "^[^5][^6][^7]$";        
        String sEntrada05 = "180";
        lEntradaValida = sEntrada05.matches(sExpresionRegNumeros05);
        System.out.println("lEntradaValida05: " + lEntradaValida);
    }
}
