/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingsManagements;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
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
        labelAlliance = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        masukbutton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        DataPtgs = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAlliance.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        labelAlliance.setForeground(new java.awt.Color(255, 204, 51));
        labelAlliance.setText("Alliance By-Space");
        jPanel1.add(labelAlliance, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 320, 70));

        Login.setBackground(new java.awt.Color(255, 204, 51));
        Login.setForeground(new java.awt.Color(255, 204, 102));

        masukbutton.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        masukbutton.setText("Kendaraan");
        masukbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(masukbutton)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(masukbutton)
                .addContainerGap())
        );

        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 190, 50));

        ExitButton.setBackground(new java.awt.Color(255, 204, 51));
        ExitButton.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 80, 30));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParkingsManagements/gambar/icons8_car_80px.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 90, 80));

        DataPtgs.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Data Petugas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DataPtgsLayout = new javax.swing.GroupLayout(DataPtgs);
        DataPtgs.setLayout(DataPtgsLayout);
        DataPtgsLayout.setHorizontalGroup(
            DataPtgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPtgsLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        DataPtgsLayout.setVerticalGroup(
            DataPtgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPtgsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(DataPtgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 190, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ParkingsManagements/gambar/WhatsApp Image 2020-12-21 at 2.20.41 PM.jpeg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        frame = new JFrame ("Exit");
        if (JOptionPane.YES_NO_OPTION!= JOptionPane.showConfirmDialog(frame,"Anda ingin keluar","parking area management",
            JOptionPane.YES_NO_OPTION)) {
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void masukbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukbuttonActionPerformed
        // TODO add your handling code here:
        Kendaraan km = new Kendaraan();
        km.setVisible(true);
    }//GEN-LAST:event_masukbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            new DataPetugas().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private JFrame frame;
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DataPtgs;
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAlliance;
    private javax.swing.JLabel logo;
    private javax.swing.JButton masukbutton;
    // End of variables declaration//GEN-END:variables
}
