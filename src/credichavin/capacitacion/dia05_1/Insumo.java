/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia05_1;

import java.util.Calendar;

/**
 *
 * @author lnarvaez
 */
public class Insumo implements Comparable<Insumo> {

    private int nCodigo;
    private String sNombre;
    private Calendar dFechaVencimiento;

    public Insumo() {
    }

    public Insumo(int nCodigo, String sNombre, Calendar dFechaVencimiento) {
        this.nCodigo = nCodigo;
        this.sNombre = sNombre;
        this.dFechaVencimiento = dFechaVencimiento;
    }

    @Override
    public boolean equals(Object obj) {
        return this.nCodigo == ((Insumo) obj).nCodigo;
    }

    @Override
    public int compareTo(Insumo oInsumo) {
        if (this.nCodigo == oInsumo.nCodigo) {

            Calendar oCal01 = this.dFechaVencimiento;
            Calendar oCal02 = oInsumo.dFechaVencimiento;

            int nAnio01 = oCal01.get(Calendar.YEAR);
            int nMes01 = oCal01.get(Calendar.MONTH);
            int nDia01 = oCal01.get(Calendar.DAY_OF_MONTH);

            int nAnio02 = oCal02.get(Calendar.YEAR);
            int nMes02 = oCal02.get(Calendar.MONTH);
            int nDia02 = oCal02.get(Calendar.DAY_OF_MONTH);

            //1° Validación: Comparar año de vencimiento
            if (nAnio01 == nAnio02) {
                //2° Validación: Comparar mes de vencimiento
                if (nMes01 == nMes02) {
                    //3° Validación: Comparar día de vencimiento
                    return nDia01 - nDia02;
                } else {
                    return nMes01 - nMes02;
                }
            } else {
                return nAnio01 - nAnio02;
            }
        } else {
            return this.nCodigo - oInsumo.nCodigo;
        }
    }

    public int getnCodigo() {
        return nCodigo;
    }

    public void setnCodigo(int nCodigo) {
        this.nCodigo = nCodigo;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public Calendar getdFechaVencimiento() {
        return dFechaVencimiento;
    }

    public void setdFechaVencimiento(Calendar dFechaVencimiento) {
        this.dFechaVencimiento = dFechaVencimiento;
    }

}
