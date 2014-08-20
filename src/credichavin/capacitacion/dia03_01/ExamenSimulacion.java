/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia03_01;

/**
 *
 * @author lnarvaez
 */
public class ExamenSimulacion {

    public static void main(String args[]) {
        Examen oExamen = crearExamen();
        
        oExamen.revisarExamen();
        
        System.out.println(oExamen);
    }//end main method

    private static Examen crearExamen() {
        
        Examen oExamen = new Examen(1, "Luis Narvaez");
        
        while (!oExamen.validarPreguntas()) {
            
            int nPregunta = oExamen.getArPreguntas().size() + 1;
            
            oExamen.agregarPregunta(crearPregunta(nPregunta));
        }//end while

        return oExamen;
    }//end method crearExamen

    private static Pregunta crearPregunta(int nPregunta) {
        
        //Parámetros de pregunta
        int nSumando01 = new Double(Math.random() * 4.0 + 1).intValue();
        int nSumando02 = new Double(Math.random() * 4.0 + 1).intValue();
        
        int nRespuesta = new Double(Math.random() * 9.0 + 1).intValue();
        
        int nRespuestaCorrecta = nSumando01 + nSumando02;

        String sPregunta = String.format("¿Cúal es el resultado de la suma de %s y %s?", nSumando01, nSumando02);                

        //Crear pregunta
        Pregunta oPregunta = new Pregunta(nPregunta, sPregunta, nRespuesta, nRespuestaCorrecta);

        //Retornar pregunta
        return oPregunta;
    }//end method crearPregunta
}//end class ExamenSimulacion