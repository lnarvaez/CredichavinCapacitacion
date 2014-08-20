/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios03_1.fflores;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author ffloresj
 */
public class CrecimientoCompuesto {

    public static void main(String[] args) {
        BigDecimal nCantUsuarios = new BigDecimal(0.0);
        BigDecimal nCantidadUsuariosAct = new BigDecimal(500000000);
        BigDecimal nTasaCrecimiento = new BigDecimal(0.05);
        int nMes;

        for (nMes = 0; nCantUsuarios.doubleValue() <= 1000000000; nMes++) {
            nCantUsuarios = nCantidadUsuariosAct.multiply((nTasaCrecimiento.add(new BigDecimal(1.0))).pow(nMes), MathContext.DECIMAL64);
            System.out.println(nMes + "-->" + nCantUsuarios);
        }

        System.out.println("-----------------------------------------------------");
        for (nMes = 0; nCantUsuarios.doubleValue() <= 2000000000; nMes++) {

            nCantUsuarios = nCantidadUsuariosAct.multiply((nTasaCrecimiento.add(new BigDecimal(1.0))).pow(nMes), MathContext.DECIMAL64);
            System.out.println(nMes + "-->" + nCantUsuarios);
        }
    }
}
