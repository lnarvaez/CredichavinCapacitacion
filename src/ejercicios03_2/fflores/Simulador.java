package ejercicios03_2.fflores;

/**
 *
 * @author ffloresj
 */
public class Simulador {

    public static void main(String[] args) throws Exception {
        Camion oCamion = crearSimulador();

        oCamion.revisarPaquete();

        System.out.println(oCamion);
        //end main method
    }

    private static Camion crearSimulador() {

        Camion oCamion = new Camion(1, "ABC123");

        while (!oCamion.validarPaquetes()) {

            int nCodigo = oCamion.getArPaquetes().size() + 1;

            oCamion.agregarPaquete(crearPaquete(nCodigo));
        }

        return oCamion;
    }

    private static String getLetraAleatoria(int x, int w) {
        String rpta = (char) ((w - x + 1) * Math.random() + x) + "";
        return rpta;
    }

    private static Paquete crearPaquete(int nCodigo) {

        int nPeso = new Double(Math.random() * 100 + 1).intValue();

        String sDescripcion = getLetraAleatoria(65, 90);

        Paquete oPaquete = new Paquete(nCodigo, sDescripcion, nPeso);

        return oPaquete;
    }
}
