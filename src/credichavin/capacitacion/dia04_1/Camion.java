/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia04_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author USER
 */
public class Camion {

    private int nCodigo;
    private String sPlaca;
    private ArrayList<Paquete> arPaquetes;
    private int nCargaMaxima;
    private int nCargaActual;

    public static final int PESO_PAQUETE_MAX_A = 80;
    public static final int PESO_PAQUETE_MAX_B = 120;
    public static final int PESO_PAQUETE_MAX_C = 200;

    public Camion() {
    }

    public Camion(int nCodigo, String sPlaca, ArrayList<Paquete> arPaquetes, int nCargaMaxima) {
        this.nCodigo = nCodigo;
        this.sPlaca = sPlaca;
        this.arPaquetes = arPaquetes;
        this.nCargaMaxima = nCargaMaxima;
    }

    public int getnCodigo() {
        return nCodigo;
    }

    public void setnCodigo(int nCodigo) {
        this.nCodigo = nCodigo;
    }

    public String getsPlaca() {
        return sPlaca;
    }

    public void setsPlaca(String sPlaca) {
        this.sPlaca = sPlaca;
    }

    public ArrayList<Paquete> getArPaquetes() {
        return arPaquetes;
    }

    public void setArPaquetes(ArrayList<Paquete> arPaquetes) {
        this.arPaquetes = arPaquetes;
    }

    public int getnCargaMaxima() {
        return nCargaMaxima;
    }

    public void setnCargaMaxima(int nCargaMaxima) {
        this.nCargaMaxima = nCargaMaxima;
    }

    public void agregarPaquete(Paquete oPaquete) throws Exception {        
        
        //1° Valido inicialización de la lista
        if (arPaquetes == null) {
            arPaquetes = new ArrayList<Paquete>();
        }

        //2° Valido que el tipo de los paquetes este dentro de los tipos: 'A', 'B', 'C'
        boolean lTipoValidoAux
                = (oPaquete.getsTipo() == Paquete.TIPO_A || oPaquete.getsTipo() == Paquete.TIPO_B
                || oPaquete.getsTipo() == Paquete.TIPO_C);

        if (lTipoValidoAux) {

            //3° Valido peso máximo permitido por cada tipo de paquete
            boolean lPesoValido
                    = (oPaquete.getsTipo() == Paquete.TIPO_A && oPaquete.getnPeso() <= Camion.PESO_PAQUETE_MAX_A)
                    || (oPaquete.getsTipo() == Paquete.TIPO_B && oPaquete.getnPeso() <= Camion.PESO_PAQUETE_MAX_B)
                    || (oPaquete.getsTipo() == Paquete.TIPO_C && oPaquete.getnPeso() <= Camion.PESO_PAQUETE_MAX_C);
            
            if (lPesoValido) {               
                
                boolean lCargaMaximaValida = (this.getnCargaActual() + oPaquete.getnPeso()) <= this.nCargaMaxima;
                
                if (lCargaMaximaValida) {
                    arPaquetes.add(oPaquete);                    
                }//end if
                else {
                    throw new Exception("Carga máxima no válida");
                }//end else
                
            }//end if
            else {
                throw new Exception("Peso no válido");
            }//end else
        }//end if
        else {
            throw new Exception("Tipo no válido");            
        }//end else                
        
        /*
         Character[] arTipos = new Character[]{Paquete.TIPO_A, Paquete.TIPO_B, Paquete.TIPO_C};                              
         List<Character> listaTipos = Arrays.asList(arTipos);                       
         boolean lTipoValido = listaTipos.contains(oPaquete.getsTipo())
         */
    }

    public void quitarPaquete(int nIndice) {
        arPaquetes.remove(nIndice - 1);
    }

    public int getnCargaActual() {
        if (arPaquetes == null) {
            return 0;
        }//end if
        else {
            nCargaActual = 0;

            for (Paquete oPaquete : arPaquetes) {
                nCargaActual += oPaquete.getnPeso();
            }

            /*
             int nNumeroPaquetes = arPaquetes.size();
             for(int i=0; i<nNumeroPaquetes; i++){
             nCargaActual += arPaquetes.get(i).getnPeso();
             }
             */
            return nCargaActual;
        }//end else
    }
}
