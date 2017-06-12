/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PointOfSale;

import PointOfSale.dsConnection;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author owl
 */
public class Clase03 extends javax.swing.JFrame {

    // Se declara variable de conexion
    dsConnection oConn = new dsConnection();

    /**
     * Creates new form Clase03
     */
    public Clase03() throws SQLException, ClassNotFoundException  {

        // Intento de Conexcion
        if (!oConn.FnBoolConnectionOpen("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/PointOfSale","root",""))
        {
            // Mensaje
            JOptionPane.showMessageDialog(null, "No se logro la conexion al Host");
            
            // Finalizar App
            System.exit(0);
        }
        else
        {
        
        initComponents();

        // Centrar la Froma
        this.setLocationRelativeTo(null);
        this.setTitle("Begin Session");
        this.setResizable(false);

        // Inicializa Controles
        lblUser.setText("User: ");
        lblPassword.setText("Password: ");
        txtUser.setText("");
        txpPassword.setText("");
        txtName.setText("");
        txtRole.setText("");
        butCancel.setText("Cancel");
        butAccept.setText("Accept");
        
        // Deshabilitar los despliegues
        lblName.setText("Name: ");
        lblRole.setText("Role: ");
        txtName.setEnabled(false);
        txtName.setBackground(Color.DARK_GRAY);
        txtRole.setEnabled(false);
        txtRole.setBackground(Color.DARK_GRAY);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtRole = new javax.swing.JTextField();
        txpPassword = new javax.swing.JPasswordField();
        butAccept = new javax.swing.JButton();
        butCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUser.setText("jLabel1");

        lblPassword.setText("jLabel1");

        lblName.setText("jLabel1");

        lblRole.setText("jLabel1");

        txtUser.setText("jTextField1");

        txtName.setText("jTextField2");

        txtRole.setText("jTextField3");

        txpPassword.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRole)
                    .addComponent(lblName)
                    .addComponent(lblPassword)
                    .addComponent(lblUser))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txpPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRole, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        butAccept.setText("Aceptar");
        butAccept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butAcceptMouseClicked(evt);
            }
        });

        butCancel.setText("Cancelar");
        butCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butAccept)
                .addGap(92, 92, 92))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(butCancel)
                    .addContainerGap(212, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(butAccept)
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(259, Short.MAX_VALUE)
                    .addComponent(butCancel)
                    .addGap(12, 12, 12)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butCancelMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_butCancelMouseClicked

    private void butAcceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butAcceptMouseClicked
        // TODO add your handling code here:
        String sqlStmt;
        
        //Verificar si no ha logrado conexion
        if (butAccept.getText()=="Accept"){
            
            // Preparar Query
            sqlStmt = "Select * from tblusers";
            // Agrego la condicion del User
            sqlStmt += " Where strUserIde='"+txtUser.getText()+"'";
            sqlStmt += " And strUserPass='"+String.valueOf(txpPassword.getPassword()) + "'";
            
            oConn.SubQueryExecute(sqlStmt);
            try{
                // Verificar que haya encontrado un registro
                if (oConn.setResult.next())
                {
                    // Pasar datos a textBox
                    txtName.setText(oConn.setResult.getString("strUserName"));
                    txtRole.setText(oConn.setResult.getString("strRoleName"));
                    
                    //Cambiar texto del boton
                    butAccept.setText("Sign In");
                    // Deshabilitar Cancelar
                    butCancel.setEnabled(false);
                }
                else{
                    // Mostrar mensaje de error
                    txtName.setText("User & password Incorrect");
                    txtRole.setText("Try again doge...");
                }
                oConn.setResult.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
            
        }
        else
        {
            // Mostrar OptionPane
            JOptionPane.showMessageDialog(null, "Ingresando al sistema");
            
            // Cerrar la ventana
            this.dispose();
        }
    }//GEN-LAST:event_butAcceptMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clase03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clase03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clase03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clase03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Clase03().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Clase03.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Clase03.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAccept;
    private javax.swing.JButton butCancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txpPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
