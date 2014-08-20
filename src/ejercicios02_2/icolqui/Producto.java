/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios02_2.icolqui;

/**
 *
 * @author lnarvaez
 */
public class Producto {
    private int nCodigo;
    private String nNombre;
    private double nPrecio;

    public Producto() {
    }

    public Producto(int nCodigo,String nNombre, double nPrecio) {
      this.nCodigo = nCodigo;
      this.nNombre  = nNombre;
      this.nPrecio = nPrecio;
    }
    /**
     * @return the nCodigo
     */
    public int getnCodigo() {
        return nCodigo;
    }

    /**
     * @param nCodigo the nCodigo to set
     */
    public void setnCodigo(int nCodigo) {
        this.nCodigo = nCodigo;
    }

    /**
     * @return the nNombre
     */
    public String getnNombre() {
        return nNombre;
    }

    /**
     * @param nNombre the nNombre to set
     */
    public void setnNombre(String nNombre) {
        this.nNombre = nNombre;
    }

    /**
     * @return the nPeso
     */
    public double getnPrecio() {
        return nPrecio;
    }

    /**
     * @param nPeso the nPeso to set
     */
    public void setnPeso(double nPrecio) {
        this.nPrecio = nPrecio;
    }
      
}
