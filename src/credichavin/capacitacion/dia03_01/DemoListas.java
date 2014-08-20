/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia03_01;

import java.util.ArrayList;

/**
 *
 * @author lnarvaez
 */
public class DemoListas {

    private static void probarLista() {

        int[] arregloEnteros01 = new int[5];
        int[] arregloEnteros02 = new int[]{1, 2, 3, 4, 5};

        System.out.println("Tamanio arreglo 01: " + arregloEnteros01.length);
        System.out.println("Tamanio arreglo 02: " + arregloEnteros02.length);

        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
        // La lista solo puede contener objetos
        // int      ->  Integer
        // double   ->  Double
        // float    ->  Float
        // char     ->  Character
        // long     ->  Long

        //Agregar elementos a una lista
        listaEnteros.add(10);   // -> 0
        listaEnteros.add(15);   // -> 1
        listaEnteros.add(20);   // -> 2

        System.out.println("Tamanio lista: " + listaEnteros.size());

        //Eliminar elementos de una lista
        listaEnteros.remove(0);

        /*
                
         listaEnteros.add(15);   // -> 0
         listaEnteros.add(20);   // -> 1
        
         */
        System.out.println("Tamanio lista: " + listaEnteros.size());

        //Verificar si una lista es vacio
        boolean lVacio = listaEnteros.isEmpty();

        System.out.println("Vacio: " + (lVacio ? "Si" : "No"));

        //Obtener un elemento de la lista
        int nNumeroPosicion2 = listaEnteros.get(1);
        System.out.println("nNumeroPosicion2: " + nNumeroPosicion2);

        //Verificar existencia de un elemento en la lista
        boolean lExisteNumero20 = listaEnteros.contains(20);
        System.out.println("lExisteNumero20: " + lExisteNumero20);

        //Limpiar una lista
        listaEnteros.clear();

    }//end method probarLista

    public static void main(String args[]) {
        probarLista();
    }//end main method
}//end class DemoListas
