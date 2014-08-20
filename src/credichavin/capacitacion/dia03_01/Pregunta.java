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
public class Pregunta {

    private int nPregunta;
    private String sPregunta;
    private int nRespuesta;
    private int nRespuestaCorrecta;

    public Pregunta() {
    }

    public Pregunta(int nPregunta, String sPregunta, int nRespuesta, int nRespuestaCorrecta) {
        this.nPregunta = nPregunta;
        this.sPregunta = sPregunta;
        this.nRespuesta = nRespuesta;
        this.nRespuestaCorrecta = nRespuestaCorrecta;
    }

    public int getnPregunta() {
        return nPregunta;
    }

    public void setnPregunta(int nPregunta) {
        this.nPregunta = nPregunta;
    }

    public String getsPregunta() {
        return sPregunta;
    }

    public void setsPregunta(String sPregunta) {
        this.sPregunta = sPregunta;
    }

    public int getnRespuesta() {
        return nRespuesta;
    }

    public void setnRespuesta(int nRespuesta) {
        this.nRespuesta = nRespuesta;
    }

    public int getnRespuestaCorrecta() {
        return nRespuestaCorrecta;
    }

    public void setnRespuestaCorrecta(int nRespuestaCorrecta) {
        this.nRespuestaCorrecta = nRespuestaCorrecta;
    }

    @Override
    public String toString() {
        return "\nPregunta"
                + "\nnPregunta: " + nPregunta
                + "\nsPregunta: " + sPregunta
                + "\nnRespuesta: " + nRespuesta
                + "\nnRespuestaCorrecta: " + nRespuestaCorrecta;
    }//end method toString
}//end class Pregunta