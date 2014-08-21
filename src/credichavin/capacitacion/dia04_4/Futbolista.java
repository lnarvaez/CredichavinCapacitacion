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
public class Futbolista {

    private String sNombre;

    private Regatear oRegatear;
    private Disparar oDisparo;

    public void ejecutarJugada(Regatear oR, Disparar oD) {
        System.out.println("Nulo: " + oRegatear == null);
        //oRegatear = new RegateoMarsellesa();
        //oDisparo = new DisparoBolea();
        oR.regatearAdversario();
        oD.dispararAlArco();
    }
        
    public void ejecutarJugada() {
        oRegatear.regatearAdversario();
        oDisparo.dispararAlArco();
    }

    /**
     * @return the sNombre
     */
    public String getsNombre() {
        return sNombre;
    }

    /**
     * @param sNombre the sNombre to set
     */
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    /**
     * @return the oRegatear
     */
    public Regatear getoRegatear() {
        return oRegatear;
    }

    /**
     * @param oRegatear the oRegatear to set
     */
    public void setoRegatear(Regatear oRegatear) {
        this.oRegatear = oRegatear;
    }

    /**
     * @return the oDisparo
     */
    public Disparar getoDisparo() {
        return oDisparo;
    }

    /**
     * @param oDisparo the oDisparo to set
     */
    public void setoDisparo(Disparar oDisparo) {
        this.oDisparo = oDisparo;
    }
        
}
