/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credichavin.capacitacion.dia06_1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lnarvaez
 */
public class ConexionCoreNevado {

    private Connection oConnection = null;
    private static final String DATABASE_URL = "jdbc:sqlserver://192.168.1.51:1433;databaseName=CoreNevadoBD";
    private static final String USER_NAME = "lnarvaez";
    private static final String PASSWORD = "d3s4rr0ll0c0r3n3v4d0";

    //Queries de consulta
    private static final String QUERY_CONSULTA_PERSONAS = "SELECT TOP 10 * FROM Persona ORDER BY dSysDate desc";

    private void iniciarConexion() {
        try {
            oConnection = DriverManager.getConnection(DATABASE_URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//end method iniciarConexion

    private void cerrarConexion() {
        try {
            if (oConnection != null && !oConnection.isClosed()) {
                oConnection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//end method cerrarConexion

    private void consultarClientes() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            iniciarConexion();
            ps = oConnection.prepareStatement(QUERY_CONSULTA_PERSONAS);
            rs = ps.executeQuery();
            while (rs.next()) {
                int nPersCodigo = rs.getInt("nPersCodigo");
                System.out.println(nPersCodigo);
            }//end while
        } catch (Exception e) {
        } finally {
            cerrarConexion();
        }
    }

    private void consultarEvaluacionFinanciera() {
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            iniciarConexion();
            cs = oConnection.prepareCall("{call pa_EvaluacFinanc_QueEvaluacFinanc_Detalle(?, ?, ?)}");
            cs.setString("sSysDate", "2014-08-07 19:51:34.283");
            cs.setInt("nPersCodigo", 153033);
            cs.setString("sCuenta", "PER83601614041000239760");
            rs = cs.executeQuery();
            while (rs.next()) {
                int nPersCodigo = rs.getInt("nPersCodigo");
                String sActividad = rs.getString("sActividad");
                System.out.println(nPersCodigo);
                System.out.println(sActividad);
            }//end while
        } catch (Exception e) {
        } finally {
            cerrarConexion();
        }
    }

    public static void main(String args[]) {
        try {
            ConexionCoreNevado oConexion = new ConexionCoreNevado();
            oConexion.consultarEvaluacionFinanciera();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//end main method
}//end class ConexionCoreNevado
