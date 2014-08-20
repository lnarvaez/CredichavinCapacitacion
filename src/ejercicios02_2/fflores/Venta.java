package ejercicios02_2.fflores;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ffloresj
 */
public class Venta {
    
    private double nCodigo;
    private Producto[] arProductos;

    public Venta(Producto[] arProductos) {
        this.arProductos = arProductos;
    }

    public double getnCodigo() {
        nCodigo = Math.random();
        return nCodigo;
    }
    
   public BigDecimal getSubTotal(){
        BigDecimal nSubTotal = new BigDecimal(0.0);
        for(Producto producto : arProductos){
            nSubTotal = nSubTotal.add(producto.getnPrecioBase());
        } //end for
        return nSubTotal;
    }
   
    public BigDecimal getTotal(){
        BigDecimal nTotal = new BigDecimal(0.0);
        for(Producto producto : arProductos){
            nTotal = nTotal.add(producto.getPrecioVenta());
        } //end for
        return nTotal;
    }
     
    /*public double getTotal(){
        double nTotal = 0.0;
        for(Producto producto : arProductos){
            nTotal += (producto.getPrecioVenta()).doubleValue();
        } //end for
        return nTotal;        
    }*/
    
    public String getFechaActual(){
       Date dFechaActual = new Date();
       SimpleDateFormat sFormatoFecha = new SimpleDateFormat("dd-MM-yyyy");
       return sFormatoFecha.format(dFechaActual);
    }
       
   
    public static void main(String args[]){
        
       
        System.out.println("----------Datos de Venta-------------");
        
        
        Producto oProducto1 = new Producto(1, "manzana", new BigDecimal("5.50"));
        Producto oProducto2 = new Producto(2, "naranja", new BigDecimal("8.20"));
        Producto oProducto3 = new Producto(3, "platano", new BigDecimal("10.50"));
        
        Producto[] arProductosVenta = new Producto[]{oProducto1, oProducto2, oProducto3};
        Venta oVenta = new Venta(arProductosVenta);
        BigDecimal nSubTotalD = oVenta.getSubTotal().divide(TipoCambio.nDolares, 2, RoundingMode.HALF_UP);
        BigDecimal nTotalD = oVenta.getTotal().divide(TipoCambio.nDolares, 2, RoundingMode.HALF_UP);
               
        System.out.println("Fecha de Venta:  " + oVenta.getFechaActual());
        System.out.println("Código de Venta: " + oVenta.getnCodigo());
             
        System.out.println(oProducto1.toString());
        System.out.println(oProducto2.toString());
        System.out.println(oProducto3.toString());
        System.out.println("______________________________");
        System.out.println("\nSub Total:    S/." + oVenta.getSubTotal());
        System.out.println("\nTotal:        S/." + oVenta.getTotal());
        System.out.println("_____________________________");
        System.out.println("\nSub Total:    $" + nSubTotalD);
        System.out.println("\nTotal         $" + nTotalD);
        System.out.println("_____________________________");
        
      
    }
    
}
