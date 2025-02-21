/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layouts;

import Forms.DataPegawai;
import java.awt.Color;

/**
 *
 * @author hikma
 */
public class panel extends javax.swing.JFrame {

    /**
     * Creates new form panel
     */
    public panel() {
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

        panel_kiri = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_item = new javax.swing.JPanel();
        panel_aktif = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_pegawai = new javax.swing.JLabel();
        panel_kanan = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panel_dasar = new javax.swing.JPanel();
        panel_konten = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(1270, 960));
        setPreferredSize(new java.awt.Dimension(1720, 1000));
        setResizable(false);
        setSize(new java.awt.Dimension(1270, 760));

        panel_kiri.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Kepegawaian Tapin");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_kepegawaian.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Master Data");

        panel_item.setBackground(new java.awt.Color(255, 255, 255));
        panel_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_itemMouseClicked(evt);
            }
        });

        panel_aktif.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_aktifLayout = new javax.swing.GroupLayout(panel_aktif);
        panel_aktif.setLayout(panel_aktifLayout);
        panel_aktifLayout.setHorizontalGroup(
            panel_aktifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        panel_aktifLayout.setVerticalGroup(
            panel_aktifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_data_pegawai.png"))); // NOI18N

        btn_pegawai.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_pegawai.setForeground(new java.awt.Color(102, 102, 102));
        btn_pegawai.setText("Pegawai");
        btn_pegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pegawaiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pegawaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pegawaiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_itemLayout = new javax.swing.GroupLayout(panel_item);
        panel_item.setLayout(panel_itemLayout);
        panel_itemLayout.setHorizontalGroup(
            panel_itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_itemLayout.createSequentialGroup()
                .addComponent(panel_aktif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addComponent(btn_pegawai)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_itemLayout.setVerticalGroup(
            panel_itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_aktif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_itemLayout.createSequentialGroup()
                .addGroup(panel_itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_itemLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addGroup(panel_itemLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btn_pegawai)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_kiriLayout = new javax.swing.GroupLayout(panel_kiri);
        panel_kiri.setLayout(panel_kiriLayout);
        panel_kiriLayout.setHorizontalGroup(
            panel_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_kiriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(panel_kiriLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(panel_item, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_kiriLayout.setVerticalGroup(
            panel_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_kiriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(panel_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1216, Short.MAX_VALUE))
        );

        getContentPane().add(panel_kiri, java.awt.BorderLayout.LINE_START);

        panel_kanan.setBackground(new java.awt.Color(204, 204, 204));
        panel_kanan.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1052, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        panel_kanan.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        panel_dasar.setBackground(new java.awt.Color(237, 240, 245));

        panel_konten.setBackground(new java.awt.Color(255, 255, 255));
        panel_konten.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panel_dasarLayout = new javax.swing.GroupLayout(panel_dasar);
        panel_dasar.setLayout(panel_dasarLayout);
        panel_dasarLayout.setHorizontalGroup(
            panel_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_konten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        panel_dasarLayout.setVerticalGroup(
            panel_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_konten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        panel_kanan.add(panel_dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel_kanan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pegawaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pegawaiMouseEntered
      panel_item.setBackground(new Color(250,250,250));
      panel_aktif.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_btn_pegawaiMouseEntered

    private void btn_pegawaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pegawaiMouseExited
      panel_item.setBackground(new Color(255,255,255));
      panel_aktif.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_pegawaiMouseExited

    private void btn_pegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pegawaiMouseClicked
      panel_item.setBackground(new Color(250,250,250));
      panel_aktif.setBackground(new Color(0,204,204));
      
      panel_konten.removeAll();
      panel_konten.add(new DataPegawai());
      panel_konten.repaint();
      panel_konten.revalidate();
    }//GEN-LAST:event_btn_pegawaiMouseClicked

    private void panel_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_itemMouseClicked
        panel_item.setBackground(new Color(250,250,250));
      panel_aktif.setBackground(new Color(0,204,204));
      
      panel_konten.removeAll();
      panel_konten.add(new DataPegawai());
      panel_konten.repaint();
      panel_konten.revalidate();
    }//GEN-LAST:event_panel_itemMouseClicked

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
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_pegawai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_aktif;
    private javax.swing.JPanel panel_dasar;
    private javax.swing.JPanel panel_item;
    private javax.swing.JPanel panel_kanan;
    private javax.swing.JPanel panel_kiri;
    private javax.swing.JPanel panel_konten;
    // End of variables declaration//GEN-END:variables
}
