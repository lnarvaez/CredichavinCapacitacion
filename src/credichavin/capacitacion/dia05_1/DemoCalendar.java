/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia05_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author lnarvaez
 */
public class DemoCalendar {

    public static void main(String args[]) {
        
        Calendar oCalendar = GregorianCalendar.getInstance();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        
        Date oDate = oCalendar.getTime();        
        System.out.println(sdf.format(oDate));
        
        //1° Agregar 5 días a la fecha actual
        oCalendar.add(Calendar.DAY_OF_YEAR, 5);
        System.out.println(sdf.format(oCalendar.getTime()));
        
        //2° Agregar 1 año a la fecha actual
        oCalendar.add(Calendar.YEAR, 1);
        System.out.println(sdf.format(oCalendar.getTime()));
        
        //3° Quitar 3 meses a la fecha actual
        oCalendar.add(Calendar.MONTH, -3);
        System.out.println(sdf.format(oCalendar.getTime()));
        
        //4° Agregar 100 minutos a la fecha actual
        oCalendar.add(Calendar.MINUTE, 100);
        System.out.println(sdf.format(oCalendar.getTime()));
        
        //5° Comparar dos fechas
        Calendar oCalendarAux = GregorianCalendar.getInstance();
        oCalendarAux.set(2020, Calendar.FEBRUARY, 13, 6, 50, 10);
        System.out.println(sdf.format(oCalendarAux.getTime()));        
        
        int nComparacion01 = oCalendar.compareTo(oCalendarAux);
        System.out.println("nComparacion01: " + nComparacion01);
        String sMensaje01 = nComparacion01 > 0 ? 
                "oCalendar es mayor que oCalendarAux" : "oCalendarAux es mayor que oCalendar";
        System.out.println(sMensaje01);
        
        int nComparacion02 = oCalendarAux.compareTo(oCalendar);
        System.out.println("nComparacion02: " + nComparacion02);
        String sMensaje02 = nComparacion02 > 0 ? 
                "oCalendar es menor que oCalendarAux" : "oCalendarAux es menor que oCalendar";
        System.out.println(sMensaje02);
        
        //6° Inicializar un Calendar a partir de un Date
        Date oFecha = new Date();
        oCalendarAux.setTime(oFecha);
        System.out.println(sdf.format(oCalendarAux.getTime()));
    }
}
