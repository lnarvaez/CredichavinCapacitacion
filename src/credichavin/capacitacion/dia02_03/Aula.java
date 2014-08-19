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
public class Aula {

    private Alumno[] arAlumnos;

    public Aula(String[] arNombres) {
        iniciarAula(arNombres);
    }

    private void iniciarAula(String[] arNombresAlumnos) {
        arAlumnos = new Alumno[arNombresAlumnos.length];
        for (String sNombre : arNombresAlumnos) {
            int nNotaAleatoria = new Double(Math.random() * 100.0 + 1).intValue();
            Alumno alumno = new Alumno();
            alumno.setnCodigo(arAlumnos.length + 1);
            alumno.setsNombre(sNombre);
            alumno.setnNota(nNotaAleatoria);
        }//end for
    }//end method iniciarAula

    public static void main(String args[]) {
        String[] arNombres = new String[]{"Alberto", "Carlos", "Fátima", "Germán", "Irvin", "Karla", "Liz", "Renato"};
        Aula oAula = new Aula(arNombres);
    }//end main method
}//end class Aula
