/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package credichavin.capacitacion.dia02_02;

/**
 *
 * @author lnarvaez
 */
public class Insumo {
    private int nCodigo;
    private double nPeso;

    public Insumo() {
    }

    public Insumo(int nCodigo, double nPeso) {
        this.nCodigo = nCodigo;
        this.nPeso = nPeso;
    }

    public int getnCodigo() {
        return nCodigo;
    }

    public void setnCodigo(int nCodigo) {
        this.nCodigo = nCodigo;
    }

    public double getnPeso() {
        return nPeso;
    }

    public void setnPeso(double nPeso) {
        this.nPeso = nPeso;
    }        
}
