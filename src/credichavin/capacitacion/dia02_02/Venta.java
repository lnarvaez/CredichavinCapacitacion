/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia02_02;

import java.math.BigDecimal;

/**
 *
 * @author lnarvaez
 */
public class Venta {
       
    //Venta -> atributos: codigo, dia, mes, año
    //Venta -> array de productos
    //Venta -> metodos: obtener subtotal y total (en base al precio de cada producto)
    // y el tipo de cambio

    //Clase TipoCambio -> Dolares
    
    //Actualizar el tipo de cambio con metodos estaticos
    
    public static void main(String args[]) {
        
        Math m;
        
        System.out.println("IGV: " + Impuesto.nImpuestoIGV);
        Producto producto1 = new Producto(1, "manzana", new BigDecimal("1.50"));
        Producto producto2 = new Producto(2, "naranja", new BigDecimal("1.20"));
        
        System.out.println(producto1.toString());
        System.out.println(producto2.toString());
                       
        System.out.println("\nActualizando el IGV...\n");        
        System.out.println("Nuevo IGV: " + Impuesto.nImpuestoIGV);
        
        System.out.println(producto1.toString());
        System.out.println(producto2.toString());
        
    }
}
