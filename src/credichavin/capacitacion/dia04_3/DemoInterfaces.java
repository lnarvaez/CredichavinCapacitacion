/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package credichavin.capacitacion.dia04_3;

import credichavin.capacitacion.dia04_2.Figura;
import credichavin.capacitacion.dia04_2.Rectangulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author USER
 */
public class DemoInterfaces {
    public static void main(String args[]){
        
        /*
        String sCadena01 = "ABC";
        
        String sCadena02 = "CDE";

        String sCadena03 = "FGH";

        List<String> listaCadenas = new ArrayList<String>();
        listaCadenas.add(sCadena02);
        listaCadenas.add(sCadena01);
        listaCadenas.add(sCadena03);
        
        System.out.println(listaCadenas);
        
        Collections.sort(listaCadenas);
        
        System.out.println(listaCadenas);
        */
        
        /**********************************/
        
        Figura oFiguraA = new Rectangulo(10, 4);
        Figura oFiguraB = new Rectangulo(20, 4);
        Figura oFiguraC = new Rectangulo(50, 4);
        Figura oFiguraD = new Rectangulo(100, 4);
        Figura oFiguraE = new Rectangulo(70, 4);
        Figura oFiguraF = new Rectangulo(30, 4);
        Figura oFiguraG = new Rectangulo(50, 4);
        Figura oFiguraH = new Rectangulo(20, 4);
        Figura oFiguraI = new Rectangulo(30, 4);
        Figura oFiguraJ = new Rectangulo(50, 4);
        
        List<Figura> listaFiguras = new ArrayList<Figura>();
        
        listaFiguras.add(oFiguraA);
        listaFiguras.add(oFiguraB);
        listaFiguras.add(oFiguraC);
        listaFiguras.add(oFiguraD);
        listaFiguras.add(oFiguraE);
        listaFiguras.add(oFiguraF);
        listaFiguras.add(oFiguraG);
        listaFiguras.add(oFiguraH);
        listaFiguras.add(oFiguraI);
        listaFiguras.add(oFiguraJ);
        
        //Imprimir figuras en desorden
        System.out.println("Figuras desordenadas:");
        for(Figura oFigura : listaFiguras){
            System.out.println("nAreaFigura: " + oFigura.getnArea());
        }//end for
        System.out.println();
        
        Collections.sort(listaFiguras);
        
        //Imprimir figuras en orden
         System.out.println("Figuras ordenadas:");
        for(Figura oFigura : listaFiguras){
            System.out.println("nAreaFigura: " + oFigura.getnArea());
        }//end for
        System.out.println();
    }
}