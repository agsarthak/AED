/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSignHistory;
import Business.VitalSigns;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sarthak
 */
public class ViewVitalSignsJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private VitalSigns vitalSigns;
    /**
     * Creates new form ViewVitalSignsJPanel
     */
    
    ViewVitalSignsJPanel(JPanel upc, VitalSigns vitalSigns) {
        initComponents();
        this.userProcessContainer = upc;
        this.vitalSigns = vitalSigns;
        populateForm();
        saveBtn.setEnabled(false);
        respiratoryRateTb.setEnabled(false);
        heartRateTb.setEnabled(false);
        bloodPressureTb.setEnabled(false);
        saveBtn.setEnabled(false);
        weightTb.setEnabled(false);
        
    }
    
      private void populateForm() {
          respiratoryRateTb.setText(String.valueOf(vitalSigns.getRespiratoryRate()));
            heartRateTb.setText(String.valueOf(vitalSigns.getHeartRate()));
            bloodPressureTb.setText(String.valueOf(vitalSigns.getBp()));
            weightTb.setText(String.valueOf(vitalSigns.getWeight()));
            dateTb.setText(String.valueOf(vitalSigns.getDate()));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bloodPressureTb = new javax.swing.JTextField();
        weightTb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateTb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        respiratoryRateTb = new javax.swing.JTextField();
        heartRateTb = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();

        bloodPressureTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodPressureTbActionPerformed(evt);
            }
        });

        jLabel2.setText("Respiratory Rate");

        dateTb.setEditable(false);

        jLabel3.setText("Heart Rate");

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Systolic Blood Pressure");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Weight in pounds");

        jLabel6.setText("Date and Time");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(backBtn)
                    .addComponent(saveBtn))
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(respiratoryRateTb)
                    .addComponent(heartRateTb)
                    .addComponent(bloodPressureTb)
                    .addComponent(weightTb)
                    .addComponent(dateTb, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(505, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(respiratoryRateTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(heartRateTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bloodPressureTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(weightTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dateTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(saveBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bloodPressureTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodPressureTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodPressureTbActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewProfileJPanel viewProfileJPanel = (ViewProfileJPanel) component;
        viewProfileJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        respiratoryRateTb.setEnabled(true);
        heartRateTb.setEnabled(true);
        bloodPressureTb.setEnabled(true);
        saveBtn.setEnabled(true);
        weightTb.setEnabled(true);
        updateBtn.setEnabled(false);
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
            float respiratoryRate = Float.parseFloat(respiratoryRateTb.getText());
            float heartRate = Float.parseFloat(heartRateTb.getText());
            float bp = Float.parseFloat(bloodPressureTb.getText());
            float weight = Float.parseFloat(weightTb.getText());
            vitalSigns.setRespiratoryRate(respiratoryRate);
            vitalSigns.setHeartRate(heartRate);
            vitalSigns.setBp(bp);
            vitalSigns.setWeight(weight);
            
            JOptionPane.showMessageDialog(null, "Account successfully updated.", "Information", JOptionPane.INFORMATION_MESSAGE);
            saveBtn.setEnabled(false);
            updateBtn.setEnabled(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Correct format required.", "Information", JOptionPane.ERROR_MESSAGE);
//            saveBtn.setEnabled(false);
//            updateBtn.setEnabled(true);
        }


    }//GEN-LAST:event_saveBtnActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bloodPressureTb;
    private javax.swing.JTextField dateTb;
    private javax.swing.JTextField heartRateTb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField respiratoryRateTb;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField weightTb;
    // End of variables declaration//GEN-END:variables
}
