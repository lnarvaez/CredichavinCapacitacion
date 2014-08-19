/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia02_03;

/**
 *
 * @author lnarvaez
 */
public class Aula {

    private Alumno[] arAlumnos;

    public Aula(String[] arNombres) {
        iniciarAula(arNombres);
    }

    private void iniciarAula(String[] arNombresAlumnos) {

        arAlumnos = new Alumno[arNombresAlumnos.length];

        int nIndice = 0;

        for (String sNombre : arNombresAlumnos) {

            //1° Generar una nota
            int nNotaAleatoria = new Double(Math.random() * 100.0 + 1).intValue();

            //2° Crear objeto alumno
            Alumno alumno = new Alumno();
            alumno.setnCodigo(nIndice);
            alumno.setsNombre(sNombre);
            alumno.setnNota(nNotaAleatoria);

            //3° Asigna alumno al arreglo en la ubicación señalada por el índice
            arAlumnos[nIndice] = alumno;

            //4° Aumenta el índice
            nIndice++;
        }//end for
    }//end method iniciarAula

    public Alumno[] getArAlumnos() {
        return arAlumnos;
    }

    public void setArAlumnos(Alumno[] arAlumnos) {
        this.arAlumnos = arAlumnos;
    }

    public boolean verificarDesaprobados() {
        boolean lVerificar = false;

        try {
            for (Alumno oAlumno : this.arAlumnos) {
                char sCalificacion = Calificacion.calcularCalificacion01(oAlumno.getnNota());
                lVerificar = !(sCalificacion == 'A' || sCalificacion == 'B' || sCalificacion == 'C');
                if (lVerificar) {
                    break;
                }//end if
            }//end for    
        }//end try
        catch (Exception e) {
            e.printStackTrace();
        }//end catch
        return lVerificar;
    }//end method verificarDesaprobados

    public void aprobarAlumnos() {
        
        while (verificarDesaprobados()) {
            int nIndiceAlumno = 0;
            for (Alumno oAlumno : this.arAlumnos) {
                int nNuevaNota = oAlumno.getnNota() > 50 ? oAlumno.getnNota() : oAlumno.getnNota() + 10;
                oAlumno.setnNota(nNuevaNota);
                arAlumnos[nIndiceAlumno] = oAlumno;
                nIndiceAlumno++;
            }//end for
        }//end while

    }//end method aprobarAlumnos

    private static void verificarIndices() {

        /*
         boolean lVerificar = 10 > 5;
         if(lVerificar == true){
         System.out.println("Es TRUE");
         }
         */
        int nIndiceAux1 = 0;
        int nIndiceAux2 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("nIndice: " + nIndiceAux1);

            int nSuma1 = 10 + (nIndiceAux1++);
            int nSuma2 = 10 + (++nIndiceAux2);

            System.out.println("nSuma1: " + nSuma1);
            System.out.println("nSuma2: " + nSuma2);
            System.out.println();
        }//end for
    }

    public static void main(String args[]) {
        String[] arNombres = new String[]{"Alberto", "Carlos", "Fátima", "Germán", "Irvin", "Karla", "Liz", "Renato"};
        Aula oAula = new Aula(arNombres);

        //Reporte de alumnos original
        for (Alumno oAlumno : oAula.getArAlumnos()) {
            System.out.println(oAlumno);
        }//end for

        System.out.println("----------------------------------------------");

        //Reporte de alumnos aprobados
        oAula.aprobarAlumnos();
        for (Alumno oAlumno : oAula.getArAlumnos()) {
            System.out.println(oAlumno);
        }//end for
    }//end main method
}//end class Aula