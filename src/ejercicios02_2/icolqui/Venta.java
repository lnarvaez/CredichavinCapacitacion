/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios02_2.icolqui;

import java.math.BigDecimal;

/**
 *
 * @author lnarvaez
 */
public class Venta {

    private Producto[] arProductos;
        
    
        int codigo;
        int dia;
        int año;
    

    public Venta() {
        //Ejemplos de inicialización
        arProductos = new Producto[10];
        arProductos = new Producto[]{new Producto(1,"Coca-Cola",10.5), new Producto(2, "Pepsi",20.5)};
    }

    public Venta(Producto[] arProductos) {
        this.arProductos = arProductos;
    }        

    public double getPrecioTotal() {
        double nPrecioTotal = 0.0;
        for(Producto insumo : arProductos){
            nPrecioTotal += insumo.getnPrecio();
        }//end for
        return nPrecioTotal;
    }
    
    public Producto buscarProducto(int nIndice){
        return arProductos[nIndice + 1];        
    }
    
    public static void main(String args[]){
        Producto oProducto01 = new Producto(1,"Coca-Cola", 100.5);
        Producto oProducto02 = new Producto(2,"Pepsi", 2000);
        
        
        Producto[] arProductosAlmacen = new Producto[]{oProducto01, oProducto02};
        Venta oVenta = new Venta(arProductosAlmacen); 
         
        CambioMoneda cm = new CambioMoneda();
        cm.getTipoCambio();
        
        double SubTotalSoles= oVenta.getPrecioTotal() * cm.getIGV();
        double TotalSoles = oVenta.getPrecioTotal()-SubTotalSoles;
        
        double SubTotalDolares = oVenta.getPrecioTotal() * cm.getIGV()/cm.getTipoCambio();
        double TotalDolares = (SubTotalDolares-SubTotalDolares)/cm.getTipoCambio();
        
        System.out.println("El SubTotal en soles es: " + SubTotalSoles );
         
        System.out.println("Precio Total en soles es: " + TotalSoles);
        
       
        
        System.out.println("El SubTotal en Dolares es: " + SubTotalDolares);
        System.out.println("Precio Total en Dolares es: " + TotalDolares );
   
    }
}