/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia05_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author lnarvaez
 */
public class DemoColecciones {

    public static void main(String args[]) {

        List<Insumo> arLista02 = new ArrayList<Insumo>();
        arLista02.add(new Insumo(5, "Insumo 05", GregorianCalendar.getInstance()));
        arLista02.add(new Insumo(2, "Insumo 02", GregorianCalendar.getInstance()));
        arLista02.add(new Insumo(1, "Insumo 01", GregorianCalendar.getInstance()));
        arLista02.add(new Insumo(4, "Insumo 04", GregorianCalendar.getInstance()));
        arLista02.add(new Insumo(3, "Insumo 03", GregorianCalendar.getInstance()));

        System.out.println("Lista desordenada:");
        for (Insumo oInsumo : arLista02) {
            System.out.println("Insumo: " + oInsumo.getnCodigo() + " - " + oInsumo.getsNombre());
        }//end for

        Collections.sort(arLista02);

        System.out.println("Lista ordenada:");
        for (Insumo oInsumo : arLista02) {
            System.out.println("Insumo: " + oInsumo.getnCodigo() + " - " + oInsumo.getsNombre());
        }//end for

        //Insumo de búsqueda
        Insumo oInsumoBusqueda = new Insumo(4, "Insumo 04", GregorianCalendar.getInstance());
        int nIndiceBusqueda = Collections.binarySearch(arLista02, oInsumoBusqueda);
        System.out.println("\nnIndiceBusqueda: " + nIndiceBusqueda);

        //Orden a la inversa
        Collections.reverse(arLista02);
        System.out.println("Lista ordenada al revés:");
        for (Insumo oInsumo : arLista02) {
            System.out.println("Insumo: " + oInsumo.getnCodigo() + " - " + oInsumo.getsNombre());
        }//end for

        Collections.shuffle(arLista02);
        System.out.println("Lista desordenada con el método shuffle:");
        for (Insumo oInsumo : arLista02) {
            System.out.println("Insumo: " + oInsumo.getnCodigo() + " - " + oInsumo.getsNombre());
        }//end for
        
        //Buscar el número de apariciones de un insumo en la lista
        arLista02.add(new Insumo(2, "Insumo 02", GregorianCalendar.getInstance()));
        arLista02.add(new Insumo(4, "Insumo 04", GregorianCalendar.getInstance()));
        arLista02.add(new Insumo(4, "Insumo 04", GregorianCalendar.getInstance()));
        
        int nFrecuenciaInsumo04 = Collections.frequency(arLista02, oInsumoBusqueda);
        System.out.println("\nnFrecuenciaInsumo04: " + nFrecuenciaInsumo04);
        
        
        //Conjunto
        
        System.out.println("Elementos de la lista:");
        for (Insumo oInsumo : arLista02) {
            System.out.println("Insumo: " + oInsumo.getnCodigo() + " - " + oInsumo.getsNombre());
        }//end for
        
        Set<Insumo> arConjunto = new TreeSet<Insumo>();
        arConjunto.addAll(arLista02);
        System.out.println("Elementos del conjunto:");
        for (Insumo oInsumo : arConjunto) {
            System.out.println("Insumo: " + oInsumo.getnCodigo() + " - " + oInsumo.getsNombre());
        }//end for
                
        //Lista que garantiza el orden de inserción
        List<Insumo> arLinkedList = new LinkedList<Insumo>();
        arLinkedList.addAll(arLista02);
        System.out.println("Elementos de la lista que utiliza nodos:");
        for (Insumo oInsumo : arLinkedList) {
            System.out.println("Insumo: " + oInsumo.getnCodigo() + " - " + oInsumo.getsNombre());
        }//end for

        //HashSet
        //TreeSet

    }
}
