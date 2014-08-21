package ejercicios03_2.fflores;

/**
 *
 * @author ffloresj
 */
public class Paquete {

    private int nCodigo;
    private String sDescripcion;
    private int nPeso;

    public Paquete() {
    }

    public Paquete(int nCodigo, String sDescripcion, int nPeso) {
        this.nCodigo = nCodigo;
        this.sDescripcion = sDescripcion;
        this.nPeso = nPeso;
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

    public char getTipoPaquete(int nPeso) throws Exception {

        if (nPeso < 0 || nPeso > 200) {
            throw new Exception("Exceso y/o falta de Peso en los paquetes");
        } else {
            char sTipo;
            sTipo = nPeso <= 80 ? 'A' : (nPeso <= 120 ? 'B' : 'C');
            return sTipo;
        }
    }

    @Override
    public String toString() {
        return "\nPaquete"
                + "\nnPaquete: " + nCodigo
                + "\nsPaquete: " + sDescripcion
                + "\nPeso: " + nPeso;
    }
}