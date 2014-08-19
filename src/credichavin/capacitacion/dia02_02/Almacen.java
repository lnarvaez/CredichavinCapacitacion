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
public class Almacen {

    private Insumo[] arInsumos;

    public Almacen() {
        //Ejemplos de inicialización
        this.arInsumos = new Insumo[10];
        this.arInsumos = new Insumo[]{new Insumo(1, 10.5), new Insumo(2, 20.5)};
    }

    public Almacen(Insumo[] arInsumos) {
        this.arInsumos = arInsumos;
    }        

    public double getPesoTotal() {
        double nPesoTotal = 0.0;
        for(Insumo insumo : arInsumos){
            nPesoTotal += insumo.getnPeso();
        }//end for
        return nPesoTotal;
    }
    
    public Insumo buscarInsumo(int nIndice){
        return arInsumos[nIndice + 1];        
    }
    
    public static void main(String args[]){
        Insumo oInsumo01 = new Insumo(1, 10);
        Insumo oInsumo02 = new Insumo(2, 20);
        Insumo oInsumo03 = new Insumo(3, 30);
        
        Insumo[] arInsumosAlmacen = new Insumo[]{oInsumo01, oInsumo02, oInsumo03};
        Almacen oAlmacen = new Almacen(arInsumosAlmacen);
        System.out.println("Peso total del almacén: " + oAlmacen.getPesoTotal());
    }
}