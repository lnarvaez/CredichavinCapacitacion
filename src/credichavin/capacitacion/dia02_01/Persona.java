/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package credichavin.capacitacion.dia02_01;

import java.util.Calendar;

/**
 *
 * @author lnarvaez
 */
public class Persona {
    private String sNombre;
    private String sApellido;
    public int nEdad;
    private int nAltura;
    private int nIndiceMasaCorporal;

    public Persona() {
    }

    public Persona(String sNombre, String sApellido, int nEdad) {
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.nEdad = nEdad;
    }
    
    public Persona(String sNombre) {
        this.sNombre = sNombre;
        this.sApellido = "a";
        this.nEdad = 10;
    }

    /**
     * @return the sNombre
     */
    public String getsNombre() {
        return sNombre;
    }

    /**
     * @param sNombre the sNombre to set
     */
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    /**
     * @return the sApellido
     */
    public String getsApellido() {
        return sApellido;
    }

    /**
     * @param sApellido the sApellido to set
     */
    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    /**
     * @return the nEdad
     */
    public int getnEdad() {
        return nEdad;
    }

    /**
     * @param nEdad the nEdad to set
     */
    public void setnEdad(int nEdad) {
        this.nEdad = nEdad;
    }

    public int getnAltura() {
        return nAltura;
    }

    public void setnAltura(int nAltura) {
        this.nAltura = nAltura;
    }

    /**
     * @return the nIndiceMasaCorporal
     */
    public int getnIndiceMasaCorporal() {
        nIndiceMasaCorporal = nAltura * nEdad;
        return nIndiceMasaCorporal;
    }
    
    private int calcularAnioActual(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }            
    
    public int calcularAnioNacimiento(){
        int nAnioActual = this.calcularAnioActual();
        return nAnioActual - this.nEdad;
    }
     
    public static void main(String args[]){
        Persona p = new Persona("luis", "narvaez", 24);
        int nAnioNacimiento = p.calcularAnioNacimiento();
        
        System.out.println(nAnioNacimiento);
    }
}