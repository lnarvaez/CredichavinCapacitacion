package ejercicios02_2.fflores;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author ffloresj
 */
public class Producto {
    private int nCodigo;
    private String sNombre;
    private BigDecimal nPrecioBase;

    public Producto(int nCodigo, String sNombre, BigDecimal nPrecioBase) {
        this.nCodigo = nCodigo;
        this.sNombre = sNombre;
        this.nPrecioBase = nPrecioBase;
    }

    public int getnCodigo() {
        return nCodigo;
    }

    public void setnCodigo(int nCodigo) {
        this.nCodigo = nCodigo;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public BigDecimal getnPrecioBase() {
        return nPrecioBase;
    }

    public void setnPrecioBase(BigDecimal nPrecioBase) {
        this.nPrecioBase = nPrecioBase;
    }
    
    public BigDecimal getPrecioVenta(){
        double nFactor = 1 + Impuesto.nImpuestoIGV;
        double nPrecioVenta = this.nPrecioBase.doubleValue() * nFactor;
        return new BigDecimal(nPrecioVenta).setScale(2, RoundingMode.HALF_UP);
    }
    
    @Override
    public String toString(){
        return "\nProducto" +  
                "\nnCódigo:      " + nCodigo +
                "\nnNombre:      " + sNombre +
                "\nnPrecioBase:  " + nPrecioBase +
                "\nnPrecioVenta: " + getPrecioVenta();
    }
    
    public static void main(String args[]) {                
        Producto producto1 = new Producto(1, "manzana", new BigDecimal("1.50"));
        Producto producto2 = new Producto(2, "naranja", new BigDecimal("1.20"));
        
        System.out.println(producto1.toString());
        System.out.println(producto2.toString());
    }
        
}
