/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia05_1;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author lnarvaez
 */
public class DemoMapa02 {

    public static void main(String args[]) {
        Map<Integer, String> mapa = new TreeMap<Integer, String>();
        mapa.put(5, "Rojo");
        mapa.put(2, "Negro");
        mapa.put(4, "Azul");
        mapa.put(3, "Amarillo");        
        mapa.put(6, "Blanco");
        mapa.put(1, "Verde");
        
        //8° Iterar un mapa
        System.out.println("Iterar un mapa:");
       
        System.out.println(mapa.toString());
        for (Entry e : mapa.entrySet()) {
            int nClave = Integer.parseInt(e.getKey().toString());
            String sValor = (String) e.getValue();
            System.out.println(nClave + " " + sValor);
        }
        
    }
}
