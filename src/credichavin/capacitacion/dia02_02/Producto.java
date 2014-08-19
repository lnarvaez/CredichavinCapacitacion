/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia02_02;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author lnarvaez
 */
public class Producto {

    private int nCodigo;
    private String sNombre;
    private BigDecimal nPrecioBase;

    public Producto() {
    }

    public Producto(int nCodigo, String nombre, BigDecimal precioBase) {
        this.nCodigo = nCodigo;
        this.sNombre = nombre;
        this.nPrecioBase = precioBase;
    }

    public int getCodigo() {
        return nCodigo;
    }

    public void setCodigo(int nCodigo) {
        this.nCodigo = nCodigo;
    }

    public String getNombre() {
        return sNombre;
    }

    public void setNombre(String nombre) {
        this.sNombre = nombre;
    }

    public BigDecimal getPrecioBase() {
        return nPrecioBase;
    }

    public void setPrecioBase(BigDecimal precioBase) {
        this.nPrecioBase = precioBase;
    }

    public BigDecimal getPrecioVenta() {
        double nFactor = 1 + Impuesto.nImpuestoIGV;
        double nPrecioVenta = this.nPrecioBase.doubleValue() * nFactor;
        return new BigDecimal(nPrecioVenta).setScale(2, RoundingMode.HALF_UP);
    }
    
    @Override
    public String toString(){
        return "\nProducto" + 
                "\nnCódigo: " + nCodigo +
                "\nnNombre: " + sNombre +
                "\nnPrecioBase: " + nPrecioBase +
                "\nnPrecioVenta: " + getPrecioVenta();
    }
    
    public static void main(String args[]) {                
        Producto producto1 = new Producto(1, "manzana", new BigDecimal("1.50"));
        Producto producto2 = new Producto(2, "naranja", new BigDecimal("1.20"));
        
        System.out.println(producto1.toString());
        System.out.println(producto2.toString());
    }
}