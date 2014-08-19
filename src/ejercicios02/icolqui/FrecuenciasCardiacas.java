/*
 Este programa obtendra los datos de una persona: nombre, apellidos, fecha de nacimiento y devolvera su
 edad con la frecuenia cardiaca max y los valores max y minimos de esta.
 */
package ejercicios02.icolqui;

/**
 *
 * @author ivasquez
 */
public class FrecuenciasCardiacas {

    private String sNombre;
    private String sApellido;
    private int nDia;
    private int nMes;
    private int nAño;

    public FrecuenciasCardiacas() {
        this.sNombre = "Juan";
        this.sApellido = "Vasquez Colqui";
        this.nDia = 14;
        this.nMes = 04;
        this.nAño = 1956;
    }

    public FrecuenciasCardiacas(String sNombre, String sApellido, int nDia, int nMes, int nAño) {
        this.sNombre = "Juan";
        this.sApellido = "Vasquez Colqui";
        this.nDia = 14;
        this.nMes = 04;
        this.nAño = 1956;
    }

    // Metodo GET
    public String getsNombre() {
        return sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public int getsnDia() {
        return nDia;
    }

    public int getnMes() {
        return nMes;
    }

    public int getnAño() {
        return nAño;
    }
   // Metodoso SET  

    public String setsNombre() {
        return sNombre;
    }

    public String setsApellido() {
        return sApellido;
    }

    public int setnDia() {
        return nDia;
    }

    public int setnMes() {
        return nMes;
    }

    public int setnAño() {
        return nAño;
    }
    // Metodos

    private static int ObtenerEdad(int nAño) {
        return 2014 - nAño;
    }

    private static int FrecuenciaMaxima(int Edad) {
        return 220 - Edad;
    }

    private static double RangoMinimo(int FrecuenciaMaxima) {
        return 0.5 * FrecuenciaMaxima;
    }

    private static double RangoMaximo(int FrecuenciaMaxima) {
        return 0.85 * FrecuenciaMaxima;
    }

    // Metodo Main
    public static void main(String[] args) {

        FrecuenciasCardiacas fc = new FrecuenciasCardiacas();

        System.out.println("Nombre: " + fc.getsNombre() + '\n'
                + "Apellidos: " + fc.getsApellido() + '\n'
                + "Fecha de Nacimiento:" + fc.getsnDia() + '/' + fc.getnMes() + '/' + fc.getnAño());

        System.out.println("------------------------------ RESULTADOS--------------------------");

        int Edad = ObtenerEdad(fc.getnAño());
        System.out.println("Edad: " + Edad);

        int FrecuenciaMaxima = FrecuenciaMaxima(Edad);
        System.out.println("Frec Max: " + FrecuenciaMaxima);

        double RangoMinimo = RangoMinimo(FrecuenciaMaxima);
        System.out.println("Rango Min: " + RangoMinimo);

        double RangoMaximo = RangoMaximo(FrecuenciaMaxima);
        System.out.println("Rango Max: " + RangoMaximo);
    }

}
