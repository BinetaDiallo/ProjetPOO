/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.project1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;


/**
 *
 * @author binetAida
 */
public class MenuEleve extends javax.swing.JPanel {
    /**
     * Creates new form MenuEleve
     */
    public void close(){
    SwingUtilities.getWindowAncestor(MenuEleve.this).dispose();
    }
    
    public MenuEleve() {
        initComponents();
        JButton bouton= sortiButton;
        bouton.addActionListener(e-> close());
        
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
        AjoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TouElButton = new javax.swing.JButton();
        ElNButton = new javax.swing.JButton();
        sortiButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camara\\Pictures\\ajoute.PNG")); // NOI18N

        AjoutButton.setBackground(new java.awt.Color(255, 255, 255));
        AjoutButton.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        AjoutButton.setText("Ajout d'un élève");
        AjoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Camara\\Pictures\\Liste.PNG")); // NOI18N

        TouElButton.setBackground(new java.awt.Color(255, 255, 255));
        TouElButton.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        TouElButton.setText("Liste Tous les élèves");
        TouElButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TouElButtonActionPerformed(evt);
            }
        });

        ElNButton.setBackground(new java.awt.Color(255, 255, 255));
        ElNButton.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        ElNButton.setText("Listes élève d'une filiere");
        ElNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElNButtonActionPerformed(evt);
            }
        });

        sortiButton.setText("EXIT");
        sortiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(AjoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77)
                        .addComponent(TouElButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(ElNButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sortiButton)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AjoutButton)
                    .addComponent(TouElButton)
                    .addComponent(ElNButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(sortiButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AjoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutButtonActionPerformed

        FormationApp app=FormationApp.getInstance();
        JPanel contenu=new AjoutEleve();
        JScrollPane scrollPane=new JScrollPane(contenu);
        app.setContentPane(scrollPane);
        app.revalidate();
        app.repaint();
    }//GEN-LAST:event_AjoutButtonActionPerformed

    private void TouElButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TouElButtonActionPerformed
       
        FormationApp app=FormationApp.getInstance();
        JPanel contenu=new ListEleve();
        JScrollPane scrollPane=new JScrollPane(contenu);
        app.setContentPane(scrollPane);
        app.revalidate();
        app.repaint();
    }//GEN-LAST:event_TouElButtonActionPerformed

    private void ElNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElNButtonActionPerformed

        FormationApp app=FormationApp.getInstance();
        JPanel contenu=new ListFilEl();
        JScrollPane scrollPane=new JScrollPane(contenu);
        app.setContentPane(scrollPane);
        app.revalidate();
        app.repaint();
    }//GEN-LAST:event_ElNButtonActionPerformed

    private void sortiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortiButtonActionPerformed
        close();
    }//GEN-LAST:event_sortiButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjoutButton;
    private javax.swing.JButton ElNButton;
    private javax.swing.JButton TouElButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sortiButton;
    // End of variables declaration//GEN-END:variables
}