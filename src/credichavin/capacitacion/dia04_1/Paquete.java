/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package credichavin.capacitacion.dia04_1;

/**
 *
 * @author USER
 */
public class Paquete {
    private int nCodigo;
    private String sDescripcion;
    private int nPeso;
    private char sTipo;
    
    public static final char TIPO_A = 'A';
    public static final char TIPO_B = 'B';
    public static final char TIPO_C = 'C';        

    public Paquete() {
    }

    public Paquete(int nCodigo, String sDescripcion, int nPeso, char sTipo) {
        this.nCodigo = nCodigo;
        this.sDescripcion = sDescripcion;
        this.nPeso = nPeso;
        this.sTipo = sTipo;
    }    

    public int getnCodigo() {
        return nCodigo;
    }

    public void setnPaquete(int nPaquete) {
        this.nCodigo = nPaquete;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }

    public int getnPeso() {
        return nPeso;
    }

    public void setnPeso(int nPeso) {
        this.nPeso = nPeso;
    }

    public char getsTipo() {
        return sTipo;
    }

    public void setsTipo(char sTipo) {
        this.sTipo = sTipo;
    }   

    @Override
    public String toString() {
        return "\nPaquete"
                + "\nnPaquete: " + nCodigo
                + "\nsPaquete: " + sDescripcion
                + "\nPeso: " + nPeso;
    }
}