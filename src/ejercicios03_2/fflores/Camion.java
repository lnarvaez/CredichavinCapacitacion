package ejercicios03_2.fflores;

import java.util.ArrayList;

/**
 *
 * @author ffloresj
 */
public class Camion {

    private int nCodigo;
    private String sPlaca;
    private ArrayList<Paquete> arPaquetes;
    private int nCargaMaxima;

    public static final int PESO_TIPO_A = 80;
    public static final int PESO_TIPO_B = 120;
    public static final int PESO_TIPO_C = 200;

    public Camion(int nCodigo, String sPlaca) {
        this.nCodigo = nCodigo;
        this.sPlaca = sPlaca;
        arPaquetes = new ArrayList<Paquete>();
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

    @Override
    public String toString() {
        String sCadenaPaquetes = "";
        for (Paquete oPaquete : arPaquetes) {
            sCadenaPaquetes += (oPaquete.toString() + "\n");
        }//end for

        return "\nCamion\n"
                + "\nnCodigo: " + nCodigo
                + "\nsPlaca: " + sPlaca
                + "\narPaquetes:\n " + sCadenaPaquetes
                + "\nnCarga Maxima: " + nCargaMaxima;
    }//end method toString

//************************************************//
    public boolean validarPaquetes() {

        return !(arPaquetes == null || nCargaMaxima <= 500);
    }//

    public void agregarPaquete(Paquete oPaquete) {

        if (arPaquetes.isEmpty()) {
            arPaquetes = new ArrayList<Paquete>();
        }

        if (nCargaMaxima == 500) {
            arPaquetes.add(oPaquete);
        }

    }

    public void revisarPaquete() throws Exception {

        int nCalculoPeso = 0;

        for (Paquete oPaquete : arPaquetes) {
            char sTipo = oPaquete.getTipoPaquete(oPaquete.getnPeso());
            nCalculoPeso += sTipo == 'A' ? PESO_TIPO_A : (sTipo == 'B' ? PESO_TIPO_B : PESO_TIPO_C);
            this.nCargaMaxima += nCalculoPeso;
        }
    }

}