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
public class Rectangulo extends Figura {

    private int nAltura;
    private int nBase;

    public Rectangulo() {
        super();    //invocando al constructor por defecto de la clase padre
    }

    public Rectangulo(int nAltura, int nBase) {
        this.nAltura = nAltura;
        this.nBase = nBase;
        calcularArea();
    }

    public Rectangulo(int nAltura, int nBase, int nPerimetro, int nArea) {
        super(nPerimetro, nArea);   //invocando al constructor con parámetros de la clase padre
        this.nAltura = nAltura;
        this.nBase = nBase;
    }

    @Override
    public int compareTo(Figura oFigura) {
        //Si retorna > 0, la figura local precede en orden a la figura del parámetro
        //Si retorna = 0, ambas figuras comparten el mismo orden
        //Si retorna < 0, la figura local no precede en orden a la figura del parámetro
        return  oFigura.nArea - this.nArea;
    }        

    //Si dos rectangulos tienen la misma área, entonces son iguales
    @Override
    public boolean equals(Object obj) {        
        return this.nArea == ((Rectangulo) obj).nArea;
    }

    public int getnAltura() {
        return nAltura;
    }

    public int getnBase() {
        return nBase;
    }

    public void setnAltura(int nAltura) {
        this.nAltura = nAltura;
    }

    public void setnBase(int nBase) {
        this.nBase = nBase;
    }

    @Override
    public void calcularArea() {
        nArea = (this.nBase * this.nAltura) / 2;
    }

    @Override
    public void calcularPerimetro(int nFactor) {
        this.setnPerimetro(2 * nBase + 2 * nAltura);
    }

}
