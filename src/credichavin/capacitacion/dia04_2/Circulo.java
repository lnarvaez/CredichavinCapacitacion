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
public class Circulo extends Figura {

    private int nRadio;

    public Circulo() {
        super();    //invocando al constructor por defecto de la clase padre
    }

    public Circulo(int nRadio) {
        this.nRadio = nRadio;
    }        

    public Circulo(int nRadio, int nPerimetro, int nArea) {
        super(nPerimetro, nArea);
        this.nRadio = nRadio;
    }
    
    @Override
    public int compareTo(Figura oFigura) {
        //Si retorna > 0, la figura local precede en orden a la figura del parámetro
        //Si retorna = 0, ambas figuras comparten el mismo orden
        //Si retorna < 0, la figura local no precede en orden a la figura del parámetro
        return this.nArea - oFigura.nArea;
    }

    public int getnRadio() {
        return nRadio;
    }

    public void setnRadio(int nRadio) {
        this.nRadio = nRadio;
    }

    @Override
    public void calcularArea() {
        nArea = new Double(2 * Math.PI * this.nRadio).intValue();
    }

    @Override
    public void calcularPerimetro(int nFactor) {
        this.setnPerimetro(this.nRadio * 2);
    }
}