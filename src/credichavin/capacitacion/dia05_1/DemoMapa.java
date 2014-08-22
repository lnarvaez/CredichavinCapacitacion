/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia05_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author lnarvaez
 */
public class DemoMapa {

    public static void main(String args[]) {
        
        Map<Integer, String> mapa = new HashMap<Integer, String>();
        
        mapa.put(1, "Azul");
        mapa.put(2, "Rojo");
        mapa.put(3, "Blanco");

        //1° Obtener color "Rojo"
        String sColor = mapa.get(2);
        System.out.println(sColor);

        //2° Eliminar color "Rojo"
        mapa.remove(2);

        //3° Obtener color "Rojo"
        sColor = mapa.get(2);
        System.out.println(sColor);

        //4° Imprimir las claves
        System.out.println("Lista de claves:");
        System.out.println(mapa.keySet().toString());

        //5° Imprimir los valores
        System.out.println("Lista de valores:");
        System.out.println(mapa.values().toString());

        //6° Verificar clave 3
        boolean lExisteClave3 = mapa.containsKey(3);
        System.out.println("Verificar clave 3: " + lExisteClave3);

        //7° Verificar valor "Rojo"
        boolean lExisteValorRojo = mapa.containsValue("Rojo");
        System.out.println("Verificar valor \"Rojo\": " + lExisteValorRojo);

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