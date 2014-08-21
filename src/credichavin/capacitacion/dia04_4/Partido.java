/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia04_4;

/**
 *
 * @author USER
 */
public class Partido {

    private Futbolista oFutbolistaA;
    private Futbolista oFutbolistaB;

    public Partido(Futbolista oFutbolistaA, Futbolista oFutbolistaB) {
        this.oFutbolistaA = oFutbolistaA;
        this.oFutbolistaB = oFutbolistaB;
    }

    public Futbolista getoFutbolistaA() {
        return oFutbolistaA;
    }

    public void setoFutbolistaA(Futbolista oFutbolistaA) {
        this.oFutbolistaA = oFutbolistaA;
    }

    public Futbolista getoFutbolistaB() {
        return oFutbolistaB;
    }

    public void setoFutbolistaB(Futbolista oFutbolistaB) {
        this.oFutbolistaB = oFutbolistaB;
    }
    
    public void ejecutarJuego(){
        System.out.println("Juego");
        System.out.println();
        System.out.println("Jugada de: " + oFutbolistaA.getsNombre());
        oFutbolistaA.ejecutarJugada();
        System.out.println();
        System.out.println("Jugada de: " + oFutbolistaB.getsNombre());
        oFutbolistaB.ejecutarJugada();
    }
    
    public static void main(String args[]) {
        //Comportamientos de disparo
        Disparar oDisparoBolea = new DisparoBolea();
        Disparar oDisparoBordeInterno = new DisparoBordeInterno();
        Disparar oDisparoBordeExterno = new DisparoBordeExterno();
        
        //Comportamientos de regateo
        Regatear oRegateoZigZag = new RegateoZigZag();
        Regatear oRegateoMarsellesa = new RegateoMarsellesa();               
        
        Futbolista oFutbolista01 = new Futbolista();
        oFutbolista01.setsNombre("Irvin Vasquez");
        oFutbolista01.setoRegatear(oRegateoZigZag);
        oFutbolista01.setoDisparo(oDisparoBordeInterno);    
        
        Futbolista oFutbolista02 = new Futbolista();
        oFutbolista02.setsNombre("Carlos Cerna");
        oFutbolista02.setoRegatear(oRegateoMarsellesa);
        oFutbolista02.setoDisparo(oDisparoBolea); 
        
        Partido oPartido = new Partido(oFutbolista01, oFutbolista02);
        
        oPartido.ejecutarJuego();       
        
        oFutbolista01.setoDisparo(oDisparoBordeExterno);
        
        oPartido.ejecutarJuego();
    }
}
