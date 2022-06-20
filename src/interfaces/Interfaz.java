/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import Classes.IA;
import Classes.administrador;

import Classes.main;
import static Classes.main.IA;
import static Classes.main.Interfaz;

import static Classes.main.adm;
import static Classes.main.funcionesMassimo;
import static Classes.main.tiempodia;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import static Classes.main.Threadadm;
/**
 *
 * @author massimo
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        Refuerzo1.setEditable(false);
        Refuerzo2.setEditable(false);
        Planta1Cola3.setEditable(false);
        Planta1Cola2.setEditable(false);
        Planta1Cola1.setEditable(false);
        Planta2Cola1.setEditable(false);
        Planta2Cola2.setEditable(false);
        Planta2Cola3.setEditable(false);
        EstadoAdmin.setEditable(false);
        EstadoIA.setEditable(false);
        Telefono1.setEditable(false);
        Telefono2.setEditable(false);
        Ganador1.setEditable(false);
        Ganador2.setEditable(false);
        T1Carta1.setEditable(false);
        T1Carta2.setEditable(false);
        T1Carta3.setEditable(false);
        T1Carta4.setEditable(false);
        T2Carta1.setEditable(false);
        T2Carta2.setEditable(false);
        T2Carta3.setEditable(false);
        T2Carta4.setEditable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Empezar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tiempodia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Planta1Cola3 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Planta1Cola2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        Planta1Cola1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        Planta2Cola1 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        Planta2Cola2 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        Planta2Cola3 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        Refuerzo2 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        Refuerzo1 = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Telefono1 = new javax.swing.JTextField();
        Telefono2 = new javax.swing.JTextField();
        vs = new javax.swing.JLabel();
        catta1 = new javax.swing.JLabel();
        carta2 = new javax.swing.JLabel();
        carta3 = new javax.swing.JLabel();
        carta4 = new javax.swing.JLabel();
        carta5 = new javax.swing.JLabel();
        carta6 = new javax.swing.JLabel();
        carta7 = new javax.swing.JLabel();
        carta8 = new javax.swing.JLabel();
        T1Carta1 = new javax.swing.JTextField();
        T1Carta2 = new javax.swing.JTextField();
        T1Carta3 = new javax.swing.JTextField();
        T1Carta4 = new javax.swing.JTextField();
        T2Carta1 = new javax.swing.JTextField();
        T2Carta2 = new javax.swing.JTextField();
        T2Carta3 = new javax.swing.JTextField();
        T2Carta4 = new javax.swing.JTextField();
        Ganador1 = new javax.swing.JTextField();
        Ganador2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        EstadoAdmin = new javax.swing.JTextField();
        EstadoIA = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setText("Planta 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel2.setText("Planta 2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        Empezar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Empezar.setText("Empezar");
        Empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpezarActionPerformed(evt);
            }
        });
        jPanel1.add(Empezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 720, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setText("Cola 3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setText("Cola 2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setText("Cola 1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel6.setText("Cola 1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel7.setText("Cola 2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel8.setText("Cola 3");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel9.setText("Arena");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        tiempodia.setText("1");
        tiempodia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempodiaActionPerformed(evt);
            }
        });
        jPanel1.add(tiempodia, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 720, 120, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel10.setText("Tiempo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 720, 100, 30));

        jScrollPane2.setViewportView(Planta1Cola3);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 50, 200));

        jScrollPane1.setViewportView(Planta1Cola2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 50, 200));

        jScrollPane3.setViewportView(Planta1Cola1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 50, 200));

        jScrollPane4.setViewportView(Planta2Cola1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 50, 200));

        jScrollPane5.setViewportView(Planta2Cola2);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 50, 200));

        jScrollPane6.setViewportView(Planta2Cola3);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, 50, 200));

        jScrollPane7.setViewportView(Refuerzo2);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 170, 50, 200));

        jScrollPane8.setViewportView(Refuerzo1);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 50, 200));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel11.setText("Refuerzo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel12.setText("Refuerzo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, -1, -1));

        Telefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Telefono1ActionPerformed(evt);
            }
        });
        jPanel1.add(Telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 90, -1));

        Telefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Telefono2ActionPerformed(evt);
            }
        });
        jPanel1.add(Telefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 90, -1));

        vs.setFont(new java.awt.Font("Luminari", 0, 60)); // NOI18N
        vs.setText("VS");
        jPanel1.add(vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 90, 80));

        catta1.setText("Carta 1");
        jPanel1.add(catta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        carta2.setText("Carta 2");
        jPanel1.add(carta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, -1, -1));

        carta3.setText("Carta 3");
        jPanel1.add(carta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, -1, -1));

        carta4.setText("Carta 4");
        jPanel1.add(carta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, -1));

        carta5.setText("Carta 1");
        jPanel1.add(carta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, -1, -1));

        carta6.setText("Carta 2");
        jPanel1.add(carta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 540, -1, -1));

        carta7.setText("Carta 3");
        jPanel1.add(carta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 540, -1, -1));

        carta8.setText("Carta 4");
        jPanel1.add(carta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 540, -1, -1));
        jPanel1.add(T1Carta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 70, -1));
        jPanel1.add(T1Carta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 70, -1));
        jPanel1.add(T1Carta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 70, -1));
        jPanel1.add(T1Carta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 70, -1));
        jPanel1.add(T2Carta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 70, -1));
        jPanel1.add(T2Carta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 70, -1));
        jPanel1.add(T2Carta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 580, 70, -1));

        T2Carta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2Carta4ActionPerformed(evt);
            }
        });
        jPanel1.add(T2Carta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 580, 80, -1));
        jPanel1.add(Ganador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 80, -1));
        jPanel1.add(Ganador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 80, -1));

        jLabel13.setText("Estado Admin");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        jLabel14.setText("Estado IA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        EstadoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoAdminActionPerformed(evt);
            }
        });
        jPanel1.add(EstadoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 90, -1));

        EstadoIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoIAActionPerformed(evt);
            }
        });
        jPanel1.add(EstadoIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 90, -1));

        jLabel15.setText("Telefono Tipo 1");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, -1, -1));

        jLabel16.setText("Telefono Tipo 1");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel17.setText("ID");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, -1, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel18.setText("ID");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpezarActionPerformed
        
        
       
        Threadadm = new administrador();
                
        Threadadm.start();
        
        
        
            
        
        
    }//GEN-LAST:event_EmpezarActionPerformed

    private void tiempodiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempodiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempodiaActionPerformed

    private void Telefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Telefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Telefono1ActionPerformed

    private void Telefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Telefono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Telefono2ActionPerformed

    private void T2Carta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2Carta4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2Carta4ActionPerformed

    private void EstadoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoAdminActionPerformed

    private void EstadoIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoIAActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Empezar;
    public static javax.swing.JTextField EstadoAdmin;
    public static javax.swing.JTextField EstadoIA;
    public static javax.swing.JTextField Ganador1;
    public static javax.swing.JTextField Ganador2;
    public static javax.swing.JTextPane Planta1Cola1;
    public static javax.swing.JTextPane Planta1Cola2;
    public static javax.swing.JTextPane Planta1Cola3;
    public static javax.swing.JTextPane Planta2Cola1;
    public static javax.swing.JTextPane Planta2Cola2;
    public static javax.swing.JTextPane Planta2Cola3;
    public static javax.swing.JTextPane Refuerzo1;
    public static javax.swing.JTextPane Refuerzo2;
    public static javax.swing.JTextField T1Carta1;
    public static javax.swing.JTextField T1Carta2;
    public static javax.swing.JTextField T1Carta3;
    public static javax.swing.JTextField T1Carta4;
    public static javax.swing.JTextField T2Carta1;
    public static javax.swing.JTextField T2Carta2;
    public static javax.swing.JTextField T2Carta3;
    public static javax.swing.JTextField T2Carta4;
    public static javax.swing.JTextField Telefono1;
    public static javax.swing.JTextField Telefono2;
    private javax.swing.JLabel carta2;
    private javax.swing.JLabel carta3;
    private javax.swing.JLabel carta4;
    private javax.swing.JLabel carta5;
    private javax.swing.JLabel carta6;
    private javax.swing.JLabel carta7;
    private javax.swing.JLabel carta8;
    private javax.swing.JLabel catta1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    public static javax.swing.JTextField tiempodia;
    private javax.swing.JLabel vs;
    // End of variables declaration//GEN-END:variables
}
