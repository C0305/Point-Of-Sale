/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PointOfSale;

/**
 *
 * @author owl
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
        
public class dsConnection {
    // Variable de Conexion
    Connection oConnection;
    
    // Variable para los Querys
    Statement sqlStmt;
    
    // Variable para los resultados
    
    ResultSet setResult;
    
    // Funcion para realizar conexión
    
    boolean FnBoolConnectionOpen(String strConnector, String strHost, String strUser, String strPassword) throws ClassNotFoundException, SQLException{
        try
        {
            //Registrar y preparar el conector
            Class.forName(strConnector);
            
            // Intenta la Conexion
            oConnection = DriverManager.getConnection(strHost, strUser, strPassword);
            
            
            // Retorno
            return true;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
            
            return false;
        }
        
        
    }
    
    void SubConnectionClose()
    {
        try
        {
            // Cerrar conexión
            oConnection.close();
            
        }
        catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    void SubQueryExecute(String strQuery){
        try {
            sqlStmt = oConnection.createStatement();
        }
        catch (Exception e){
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.toString());
        }
        try{
             // Ejecuta el Query y Obtiene resultado
             setResult = sqlStmt.executeQuery(strQuery);
             
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    }
}
