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
public class DemoExcepciones {

    private static void excepcion01() {
        try {
            //int n = 5 / 0;
            int[] arNumeros = new int[]{1, 2, 3, 4, 5};
            int nNumeroExcepcion = arNumeros[8];
        }//end try
        catch (ArithmeticException e) {
            System.out.println("Excepcion aritmética");
            e.printStackTrace();
        }//end catch
        catch (IndexOutOfBoundsException e) {
            System.out.println("Excepcion de índice");
            e.printStackTrace();
        }//end catch
        catch (Exception e) {
            System.out.println("Excepcion genérica");
            e.printStackTrace();
        }//end catch
        finally {
            System.out.println("Finally");
        }//end finally
    }//end method excepcion01

    private static void excepcion02(int n1, int n2) throws Exception {
        if (n1 > n2) {
            throw new Exception("n1 es mayor que n2");
        } else {
            System.out.println("n1 y n2 son correctos");
        }
    }

    public static void main(String args[]) {
        try {
            excepcion02(100, 20);
        } catch (Exception e) {
            String sMensajeExcepcion = e.getMessage();
            System.out.println("Mensaje de la excepción: " + sMensajeExcepcion);
        }
    }//end main method
}//end class DemoExcepciones
