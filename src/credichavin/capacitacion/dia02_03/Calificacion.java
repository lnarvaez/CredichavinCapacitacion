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
public class Calificacion {

    //Calificación crediticia
    /*
     Nota >= 90              -> "A"
     Nota >= 70 && Nota < 90 -> "B"
     Nota >= 50 && Nota < 70 -> "C"
     Nota >= 30 && Nota < 50 -> "D"
     Nota >= 10 && Nota < 30 -> "E"    
     Nota < 10 -> "F"
     */
    public static char calcularCalificacion01(int nNota) {
        if (nNota >= 90) {
            return 'A';
        }//end if 
        else {
            if (nNota >= 70) {
                return 'B';
            }//end if
            else {
                if (nNota >= 50) {
                    return 'C';
                }//end if
                else {
                    if (nNota >= 30) {
                        return 'D';
                    }//end if
                    else {
                        if (nNota >= 10) {
                            return 'E';
                        }//end if
                        else {
                            return 'F';
                        }//end else
                    }//end else
                }//end else
            }//end else
        }//end else
    }//end method calcularCalificacion01

    public static char calcularCalificacion02(int nNota) {
        if (nNota >= 90) {
            return 'A';
        }//end if
        else if (nNota >= 70) {
            return 'B';
        }//end if
        else if (nNota >= 50) {
            return 'C';
        }//end if
        else if (nNota >= 30) {
            return 'D';
        }//end if
        else if (nNota >= 10) {
            return 'E';
        }//end if
        else {
            return 'F';
        }//end else
    }//end method calcularCalificacion02

    public static char calcularCalificacion03(int nNota) throws Exception {
        //1º Valida la nota
        if (nNota < 0) {
            throw new Exception("Nota ingresada inválida");
        }//end if
        char sCalificacion;
        sCalificacion = (nNota >= 90 ? 'A' : (nNota >= 70 ? 'B' : (nNota >= 50 ? 'C' : (nNota >= 30 ? 'D' : (nNota >= 10 ? 'E' : 'F')))));
        return sCalificacion;
    }//end method calcularCalificacion03

    public static void main(String args[]) {
        try {
            char sCalificacion01 = Calificacion.calcularCalificacion01(50);
            char sCalificacion02 = Calificacion.calcularCalificacion02(50);
            char sCalificacion03 = Calificacion.calcularCalificacion03(50);
            
            System.out.println(sCalificacion01);
            System.out.println(sCalificacion02);
            System.out.println(sCalificacion03);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//end main method
}//end class InstruccionesControl01