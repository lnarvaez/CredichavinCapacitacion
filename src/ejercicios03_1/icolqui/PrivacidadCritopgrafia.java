package ejercicios03_1.icolqui;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivasquez
 */
public class PrivacidadCritopgrafia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner teclear = new Scanner(System.in);
     int numero;
     
     int cuarto;
     int tercero;
     int segundo;
     int primero;
             
       System.out.print("Escribe un numero de 4 digitos: \n" );
       numero = teclear.nextInt();
  
        cuarto = numero%10;
        cuarto+=7;
        cuarto %= 10;
        
        numero = numero/10;
        tercero = numero%10;
        tercero += 7;
        tercero %= 10;
 
        numero = numero/10;
        segundo = numero%10;
        segundo += 7;
        segundo %= 10;
 
        numero= numero/10;
        primero = numero%10;
        primero += 7;
        primero %= 10;

      
        
        System.out.printf("Los numeros separados son: ");
        System.out.printf("%d  %d  %d  %d  \n", primero, segundo, tercero, cuarto);
        
        System.out.printf("Los numeros intercamiados son: ");
        System.out.printf("%d  %d  %d  %d  \n", tercero, cuarto, primero, segundo);
        
        
        
        
        System.out.println("-----------------------------------------------------------");
        
        if (cuarto == 0) 
            {
                cuarto += 10;                
                cuarto = (cuarto * 10) +(cuarto%10);
                Math.abs(cuarto-=7);
                cuarto = (cuarto%10) ;
            }
        else
            {
                 
                cuarto = (cuarto * 10) +(cuarto%10);
                Math.abs(cuarto-=7);
                cuarto = (cuarto%10) ;
             }
       
        if (tercero == 0) 
            {
                tercero +=10;
                tercero = (tercero * 10) +(tercero%10);
                Math.abs(tercero-= 7);
                tercero = (tercero%10) ;
            }
        else{  
                tercero = (tercero * 10) +(tercero%10);
                Math.abs(tercero-= 7);
                tercero = (tercero%10) ;}
        
        if (segundo ==0)
            {
                segundo +=10;
                segundo = (segundo * 10) +(segundo%10);
                Math.abs(segundo-= 7);
                segundo = (segundo%10);
            }
        else{
          
                segundo = (segundo * 10) +(segundo%10);
                Math.abs(segundo-= 7);
                segundo = (segundo%10);}
      
        
        
         if (primero ==0)
            {
                primero +=10;
                primero = (primero * 10) +(primero%10);
                Math.abs(primero-= 7);
                primero = (primero%10);
            }
         else{
           
              primero +=10;
                primero = (primero * 10) +(primero%10);
                Math.abs(primero-= 7);
                primero = (primero%10);}
        
                     
        System.out.printf("El numero original es: ");
        System.out.printf("%d  %d  %d  %d  \n", primero, segundo, tercero, cuarto);
    
  }
    
}
