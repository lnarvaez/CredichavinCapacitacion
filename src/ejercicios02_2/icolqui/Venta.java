/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios02_2.icolqui;

import java.math.BigDecimal;

/**
 *
 * @author icolqui
 * Observaciones:
- En la clase Venta existen variables declaradas con nombres que NO siguen los estándares: codigo, TotalSoles, cm, etc.
- En la clase CambioMoneda el tipo de cambio y el IGV debieron ser variables estáticas, con el fin de que puedan ser actualizadas dinámicamente, 
* y ese cambio pueda ser percibido entre los objetos que la usan. Además tanto el tipo de cambio como el igv no necesitan de las propiedades de algún objeto de tipo CambioMoneda, por lo tanto debieron ser estáticas.
- La lógica para hallar el total y el subtotal es incorrecta:
  * Total = SubTotal + IGV% SubTotal

Recomendaciones
- En la clase Venta, el método getPrecioTotal debería retornar un BigDecimal. Lo mismo aplica para la propiedad nPrecio de la clase Producto.
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