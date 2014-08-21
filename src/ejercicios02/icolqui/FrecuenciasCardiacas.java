/*
 Este programa obtendra los datos de una persona: nombre, apellidos, fecha de nacimiento y devolvera su
 edad con la frecuenia cardiaca max y los valores max y minimos de esta.
 */
package ejercicios02.icolqui;

/**
 *
 * @author ivasquez
 * Observaciones FrecuenciasCardiacas
 * - Respetar los estándares en la declaración de las variables, en este caso los métodos públicos.
 * - El método obtenerEdad y frecuenciaMaxima deben ser métodos locales y NO métodos de clase (estáticos), ya que el resultado retornado
 *   por dichos métodos dependen de las propiedades del objeto. Los mismo aplica, para los métodos del rango mínimo y rango máximo
 * Recomendaciones:
 * - El nombre de la clase debe ser singular
 * - Evitar el uso del caracter 'ñ'. Cambiar nAño -> nAnio.
 * - El orden en los argumentos del constructor: String sNombre, String sApellido, int nAnio, int nMes, int nDia
 * - Declarar los métodos con nombres más concretos: getEdad, obtenerEdad, calcularEdad... empezando con "mínuscula"
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
