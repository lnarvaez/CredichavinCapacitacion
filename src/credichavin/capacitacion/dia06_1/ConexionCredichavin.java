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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lnarvaez
 */
public class ConexionCredichavin {

    private Connection oConnection = null;
    private static final String DATABASE_URL
            = "jdbc:sqlserver://192.168.1.51:1433;databaseName=CoreNevadoBD";
    private static final String USUARIO = "lnarvaez";
    private static final String PASSWORD = "d3s4rr0ll0c0r3n3v4d0";

    //Queries
    private static final String QUERY_CONSULTA_EVALUACION
            = "SELECT TOP 10 nPersCodigo, sCuenta, sPeriodo, nSector, sActividad FROM EvaluacionFinanciera "
            + " WHERE sPeriodo = ? AND nSector = ?"
            + " ORDER BY dSysDate DESC";

    private static final String QUERY_ACTUALIZAR_FECHA_DESEMBOLSO
            = "UPDATE EvaluacionFinanciera SET dRecomendacionFechaDesembolso = ? WHERE nPersCodigo = ?";

    private static final String QUERY_ACTUALIZAR_SECTOR
            = "UPDATE EvaluacionFinanciera SET nSector = ? WHERE nPersCodigo = ?";

    public void consultarEvaluaciones() throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            iniciarConexion();
            ps = oConnection.prepareStatement(QUERY_CONSULTA_EVALUACION);
            rs = ps.executeQuery();
            while (rs.next()) {
                int nPersCodigo = rs.getInt("nPersCodigo");
                System.out.println(nPersCodigo);
                System.out.println(rs.getString("sActividad"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            cerrarConexion();
        }
    }//end method consultarEvaluaciones

    public void consultarEvaluacionesOptimizado(String sPeriodo, int nSector) throws Exception {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            iniciarConexion();
            ps = oConnection.prepareStatement(QUERY_CONSULTA_EVALUACION);
            ps.setString(1, sPeriodo);
            ps.setInt(2, nSector);
            rs = ps.executeQuery();

            //Almacena nombres de las columnas
            List<String> arColumnas = new ArrayList<>();

            //1° Obtener información de las columnas
            ResultSetMetaData rsMedataData = rs.getMetaData();
            int nColumnas = rsMedataData.getColumnCount();
            for (int i = 1; i <= nColumnas; i++) {
                String sNombreColumna = rsMedataData.getColumnName(i);
                String sTipoColumna = rsMedataData.getColumnTypeName(i);
                //System.out.println("Columna : " + (i) + " - " + sNombreColumna + " - " + sTipoColumna);
                arColumnas.add(sNombreColumna);
            }//end for

            //2° Recorrer el resultset
            String sCadena = "";
            while (rs.next()) {
                for (String sColumna : arColumnas) {
                    sCadena += String.format("%s : %s - ",
                            sColumna, rs.getObject(sColumna) != null
                            ? rs.getObject(sColumna).toString() : "nulo");
                }//end for
                sCadena += "\n";
            }//end while

            //3° Mostrar la información del ResultSet
            System.out.println(sCadena);
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            cerrarConexion();
        }
    }//end method consultarEvaluacionesOptimizado

    public void consultarEvaluacionesOptimizadoSP(String sSysDate, int nPersCodigo, String sCuenta) throws Exception {
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            iniciarConexion();
            cs = oConnection.prepareCall("{ call pa_EvaluacFinanc_QueEvaluacFinanc_Detalle(?, ?, ?) }");
            cs.setString(1, sSysDate);
            cs.setInt(2, nPersCodigo);
            cs.setString(3, sCuenta);

            rs = cs.executeQuery();

            //Almacena nombres de las columnas
            List<String> arColumnas = new ArrayList<>();

            //1° Obtener información de las columnas
            ResultSetMetaData rsMedataData = rs.getMetaData();
            int nColumnas = rsMedataData.getColumnCount();
            for (int i = 1; i <= nColumnas; i++) {
                String sNombreColumna = rsMedataData.getColumnName(i);
                String sTipoColumna = rsMedataData.getColumnTypeName(i);
                //System.out.println("Columna : " + (i) + " - " + sNombreColumna + " - " + sTipoColumna);
                arColumnas.add(sNombreColumna);
            }//end for

            //2° Recorrer el resultset
            String sCadena = "";
            while (rs.next()) {
                for (String sColumna : arColumnas) {
                    sCadena += String.format("%s : %s - ",
                            sColumna, rs.getObject(sColumna) != null
                            ? rs.getObject(sColumna).toString() : "nulo");
                }//end for
                sCadena += "\n";
            }//end while

            //3° Mostrar la información del ResultSet
            System.out.println(sCadena);
        } catch (Exception e) {
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (cs != null) {
                cs.close();
            }
            cerrarConexion();
        }
    }//end method consultarEvaluacionesOptimizado

    public void ejecutarActualizacion() throws Exception {

        PreparedStatement ps = null;

        try {
            iniciarConexion();
            
            //Configurar conexion para el uso de las transacciones
            oConnection.setAutoCommit(false);
            
            //I.- ACTUALIZAR FECHA DE DESEMBOLSO
            ps = oConnection.prepareStatement(QUERY_ACTUALIZAR_FECHA_DESEMBOLSO);
            
            //1° Objeto Date de Paquete Util
            Date dFechaActual = new Date();

            //2° Objeto Date de Paquete SQL
            java.sql.Date dFechaActualSQL = new java.sql.Date(dFechaActual.getTime());

            //3° Asignación de parámetros
            ps.setDate(1, dFechaActualSQL);
            ps.setInt(2, 1067);

            //4° Ejecuto
            int nNumeroFilasActualizadas = ps.executeUpdate();
            
            System.out.println("nNumeroFilasActualizadasDesembolso: " + nNumeroFilasActualizadas);
            
            int n = 10 / 2;
            
            //II.- ACTUALIZAR EL SECTOR ¿            
            ps = oConnection.prepareStatement(QUERY_ACTUALIZAR_SECTOR);

            //1° Asignación de parámetros
            ps.setInt(1, 2);
            ps.setInt(2, 1067);

            //2° Ejecuto
            int nNumeroFilasActualizadasSector = ps.executeUpdate();
            System.out.println("nNumeroFilasActualizadasSector: " + nNumeroFilasActualizadasSector);
            
            //III.- Ejecuto la transacción
            oConnection.commit();
            
        } catch (Exception e) {
            //Revertir los cambios realizados
            if (oConnection != null) {
                oConnection.rollback();
                System.out.println("RollBack");
            }//end if
            throw e;
        } finally {
            cerrarConexion();
        }
    }

    private void iniciarConexion() throws Exception {
        try {
            oConnection = DriverManager.getConnection(DATABASE_URL, USUARIO, PASSWORD);
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }//end method iniciarConexion

    private void cerrarConexion() throws Exception {
        try {
            if (oConnection != null && !oConnection.isClosed()) {
                oConnection.close();
            }
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }//end method cerrarConexion

    public static void main(String args[]) {
        try {
            ConexionCredichavin oConexionCredichavin = new ConexionCredichavin();
            oConexionCredichavin.ejecutarActualizacion();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}//end class ConexionCredichavin
