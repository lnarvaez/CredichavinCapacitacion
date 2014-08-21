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
public abstract class Figura implements Comparable<Figura> {

    private int nPerimetro;
    protected int nArea;

    public Figura() {
    }

    public Figura(int nPerimetro, int nArea) {
        this.nPerimetro = nPerimetro;
        this.nArea = nArea;
    }

    public int getnPerimetro() {
        return nPerimetro;
    }

    public void setnPerimetro(int nPerimetro) {
        this.nPerimetro = nPerimetro;
    }

    public int getnArea() {
        return nArea;
    }

    public void setnArea(int nArea) {
        this.nArea = nArea;
    }

    public abstract void calcularArea();

    public abstract void calcularPerimetro(int nFactor);
}
