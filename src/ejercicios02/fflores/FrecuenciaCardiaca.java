package ejercicios02.fflores;

import java.util.Calendar;

/**
 *
 * @author ffloresj
 */
public class FrecuenciaCardiaca {
    
    private String sNombre;
    private String sApellido;
    private int nDia;
    private int nMes;
    private int nAnio;

    //calculo = 220-edad en años
    public FrecuenciaCardiaca(String sNombre, String sApellido, int nDia, int nMes, int nAnio) {
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.nDia = nDia;
        this.nMes = nMes;
        this.nAnio = nAnio;
    }

    public int getnDia() {
        return nDia;
    }

    public void setnDia(int nDia) {
        this.nDia = nDia;
    }

    public int getnMes() {
        return nMes;
    }

    public void setnMes(int nMes) {
        this.nMes = nMes;
    }

    public int getnAnio() {
        return nAnio;
    }

    public void setnAnio(int nAnio) {
        this.nAnio = nAnio;
    }
           
    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }
  
    private int calcularEdad(){
        int nAnioActual = Calendar.getInstance().get(Calendar.YEAR);
        int nEdad = nAnioActual - nAnio;
        return nEdad;
    }
    
    public double calcularFrecuenciaCardiacaMaxima(){
        return 220 - this.calcularEdad();
    }
    
    public String calcularFrecuenciaCarciacaEsperada(){
        double nRango1 = this.calcularFrecuenciaCardiacaMaxima()*0.5;
        double nRango2 = this.calcularFrecuenciaCardiacaMaxima()*0.85;
        String sFrecuenciaEsperada = nRango1 + " - " + nRango2;
        return  sFrecuenciaEsperada;
    }
    
    public static void main(String args[]){
       FrecuenciaCardiaca fc = new FrecuenciaCardiaca("Fátima","Flores", 19,04,1991);
       System.out.println("------------------DATOS PERSONA----------------------");
       System.out.println("Nombre:          " + fc.getsNombre());
       System.out.println("Apellido:        " + fc.getsApellido());
       System.out.println("Fecha Nacimiento:" + fc.getnDia()+ "/" + fc.getnMes() + "/" + fc.getnAnio());
       System.out.println(" ");
       System.out.println("----------------FRECUENCIA CARDIACA------------------");
       System.out.println("Edad:                         " + fc.calcularEdad());
       System.out.println("Frecuencia Cardiaca Máxima:   " + fc.calcularFrecuenciaCardiacaMaxima());
       System.out.println("Frecuencia Cardiaca Esperada: " + fc.calcularFrecuenciaCarciacaEsperada());
    }
}
    
    

