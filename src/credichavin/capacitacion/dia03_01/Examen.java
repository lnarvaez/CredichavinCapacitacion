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
public class Examen {

    private int nCodigo;
    private String sAlumno;
    private ArrayList<Pregunta> arPreguntas;
    private int nNota;

    public static final int PUNTAJE_RESPUESTA_CORRECTA = 10;
    public static final int PUNTAJE_RESPUESTA_INCORRECTA = 0;

    public Examen(int nCodigo, String sAlumno) {
        this.nCodigo = nCodigo;
        this.sAlumno = sAlumno;
        arPreguntas = new ArrayList<Pregunta>();
    }

    //Validar un número de diez preguntas
    public boolean validarPreguntas() {
        //Valida existencia de preguntas
        return !(arPreguntas == null || arPreguntas.isEmpty() || arPreguntas.size() != 10);
    }//end method verificarExamen

    public void agregarPregunta(Pregunta oPregunta) {
        //1° Inicializo lista de preguntas
        if (arPreguntas == null) {
            arPreguntas = new ArrayList<Pregunta>();
        }//end if

        //2° Verifico número de preguntas
        if (arPreguntas.size() < 10) {
            arPreguntas.add(oPregunta);
        }//end if
    }//end method agregarPregunta

    public void eliminarPregunta(int nPreguntaIndice) {
        arPreguntas.remove(nPreguntaIndice - 1);
    }//end method eliminarPregunta

    public void revisarExamen() {
        int nNotaCalculo = 0;
        for (Pregunta oPregunta : arPreguntas) {
            nNotaCalculo += (oPregunta.getnRespuesta() == oPregunta.getnRespuestaCorrecta() ? PUNTAJE_RESPUESTA_CORRECTA : PUNTAJE_RESPUESTA_INCORRECTA);
        }//end for
        this.nNota = nNotaCalculo;
    }//end method revisarExamen

    public int getnCodigo() {
        return nCodigo;
    }

    public void setnCodigo(int nCodigo) {
        this.nCodigo = nCodigo;
    }

    public String getsAlumno() {
        return sAlumno;
    }

    public void setsAlumno(String sAlumno) {
        this.sAlumno = sAlumno;
    }

    public ArrayList<Pregunta> getArPreguntas() {
        return arPreguntas;
    }

    public void setArPreguntas(ArrayList<Pregunta> arPreguntas) {
        this.arPreguntas = arPreguntas;
    }

    public int getnNota() {
        return nNota;
    }//int getnNota

    @Override
    public String toString() {
        String sCadenaPreguntas = "";
        for (Pregunta oPregunta : arPreguntas) {
            sCadenaPreguntas += (oPregunta.toString() + "\n");
        }//end for

        return "\nExamen\n"
                + "\nnCodigo: " + nCodigo
                + "\nsAlumno: " + sAlumno
                + "\narPreguntas:\n " + sCadenaPreguntas
                + "\nnNota: " + nNota;
    }//end method toString
}//end class Examen
