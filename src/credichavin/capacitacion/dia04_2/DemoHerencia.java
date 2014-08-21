/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia04_2;

/**
 *
 * @author USER
 */
public class DemoHerencia {

    public static void main(String args[]) {

        /*
         Figura figura01 = new Rectangulo(10, 20);
         figura01.calcularArea();
         figura01.calcularPerimetro(10);
        
         Figura figura02 = new Circulo(5);
         figura02.calcularArea();
         figura02.calcularPerimetro(10);
        
         System.out.println("nArea 01: " + figura01.getnArea());
         System.out.println("nPerimetro 01: " + figura02.getnPerimetro());
        
         System.out.println("nArea 02: " + figura02.getnArea());
         System.out.println("nPerimetro 02: " + figura01.getnPerimetro());      
         */
        
        //procesarFigura(new Rectangulo());
        //procesarFigura(new Circulo());
        
        Figura figuraA = new Rectangulo(10, 2);
        Figura figuraB = new Rectangulo(5, 4);
        
        procesarIgualdadFigura(figuraA, figuraB);

    }//end method main    

    public static void procesarIgualdadFigura(Figura oFigura01, Figura oFigura02) {
       
        boolean lIgualdadTipoA = (oFigura01 == oFigura02);
        
        System.out.println("lIgualdadTipoA: " + lIgualdadTipoA);
        
        boolean lIgualdadTipoB = (oFigura01.equals(oFigura02));                
        
        System.out.println("lIgualdadTipoB: " + lIgualdadTipoB);              
    }

    public static void procesarFigura(Figura oFigura) {

        if (oFigura instanceof Rectangulo) {
            System.out.println("Es un rectangulo");
        }

        if (oFigura instanceof Circulo) {
            System.out.println("Es un circulo");
        }
    }
}//end class DemoHerencia
