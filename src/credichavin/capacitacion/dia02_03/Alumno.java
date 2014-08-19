/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia02_03;

/**
 *
 * @author lnarvaez
 */
public class Alumno {

    private int nCodigo;
    private String sNombre;
    private int nNota;

    public Alumno() {
    }

    public Alumno(int nCodigo, String sNombre, int nNota) {
        this.nCodigo = nCodigo;
        this.sNombre = sNombre;
        this.nNota = nNota;
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

    public int getnNota() {
        return nNota;
    }

    public void setnNota(int nNota) {
        this.nNota = nNota;
    }

    @Override
    public String toString() {
        return "\nAlumno"
                + "\nnCodigo: " + this.nCodigo
                + "\nsNombre: " + this.sNombre
                + "\nnNota: " + this.nNota;
    }
}//end class Alumno
