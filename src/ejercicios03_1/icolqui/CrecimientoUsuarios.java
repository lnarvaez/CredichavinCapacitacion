/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios03_1.icolqui;

/**
 *
 * @author ivasquez
 */
public class CrecimientoUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double monto=0;
        double principal = 500000000; 
        double tasa = 0.05 ;
        int mes;
        
       
        System.out.printf( "%s%20s\n" , "Mes" ,"          Numero de Usuarios" ) ;
 
       for( mes = 0; monto <= 1000000000; mes++ )
              {                
                  monto = principal * Math.pow( 1.0 + tasa , mes ) ;
                   
                  System.out.println( mes +"                " + monto);

               }
       
      System.out.println("-----------------------------------------------------------------" );
        System.out.printf( "%s%20s\n" , "Mes" ,"          Numero de Usuarios" ) ;
        for( mes = 0; monto <= 2000000000; mes++ )
               {                
                   monto = principal * Math.pow( 1.0 + tasa , mes ) ;
                  
                  System.out.println( mes +"                " + monto);

                }
        }
    }
      

