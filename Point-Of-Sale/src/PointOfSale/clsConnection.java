/*
 * The MIT License
 *
 * Copyright 2017 C0305 <c0305@cobos.xyz>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package PointOfSale;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author C0305 <c0305@cobos.xyz>
 */
public class clsConnection {

    // Variable de Conexion
    Connection oConnection;
    // Variable para los Query's
    Statement sqlStmt;
    // Variable Resultados
    ResultSet setResult;

    boolean FnBooleanConnectionOpen(String strConnector, String strHost, String strUser, String strPassword) throws ClassNotFoundException, SQLException {
        try {
            //Registra y prepara el connector
            Class.forName(strConnector);

            // Intenta la conexion
            oConnection = (Connection) DriverManager.getConnection(strHost, strUser, strPassword);

            // Retorno
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        // Retorno Falso
        return false;

    }
    
    void subQueryExecute(String strQuery)
    {
        try
        {
            sqlStmt = (Statement) oConnection.createStatement();
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        try
        {
            // Ejecuta el Query y Obtiene resultados
            setResult = sqlStmt.executeQuery(strQuery);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    boolean FnBoolQueryExecute(String strQuery) throws SQLException{
       try
       {
           sqlStmt = (Statement) oConnection.createStatement();
       }
       catch (SQLException e)
       {
           JOptionPane.showMessageDialog(null,"Error SubQueryExecute: createStatement: "+ e.toString());
           return false;
       }
       try
       {
           // Ejecutar el Query y Obtiene resultados
           setResult = sqlStmt.executeQuery (strQuery);
           return true;
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Error SubQueryExecute: executeQuery: "+e.toString());
           return false;
       }
    }
}
