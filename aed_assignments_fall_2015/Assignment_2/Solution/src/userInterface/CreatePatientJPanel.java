/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.MyNumericVerifier;
import business.Patient;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;

/**
 *
 * @author kedarvdm
 */
public class CreatePatientJPanel extends javax.swing.JPanel {

    private Patient patient;

    /**
     * Creates new form PersonJPanel
     */
    public CreatePatientJPanel(Patient patient) {
        initComponents();
        this.patient = patient;
        /*Set Input Verifier*/
        InputVerifier verifier = new MyNumericVerifier();
        patientAgeTextField.setInputVerifier(verifier);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientNameJLabel = new javax.swing.JLabel();
        patientIDJLabel = new javax.swing.JLabel();
        AgeJLabel = new javax.swing.JLabel();
        primaryDocNameJLabel = new javax.swing.JLabel();
        prefferedPharmacyJLabel = new javax.swing.JLabel();
        patientNameTextField = new javax.swing.JTextField();
        patientIDJTextField = new javax.swing.JTextField();
        patientAgeTextField = new javax.swing.JTextField();
        primaryDocNameJTextField = new javax.swing.JTextField();
        prefferedPharmacyJTextField = new javax.swing.JTextField();
        saveJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(500, 650));
        setPreferredSize(new java.awt.Dimension(500, 650));

        patientNameJLabel.setText("Patient Name");

        patientIDJLabel.setText("Patient ID");

        AgeJLabel.setText("Age");

        primaryDocNameJLabel.setText("Primary Doctor Name");

        prefferedPharmacyJLabel.setText("Preffered Pharmacy");

        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientNameJLabel)
                            .addComponent(patientIDJLabel)
                            .addComponent(AgeJLabel)
                            .addComponent(primaryDocNameJLabel)
                            .addComponent(prefferedPharmacyJLabel))
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prefferedPharmacyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primaryDocNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(saveJButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientNameJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIDJLabel)
                    .addComponent(patientIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeJLabel)
                    .addComponent(patientAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primaryDocNameJLabel)
                    .addComponent(primaryDocNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prefferedPharmacyJLabel)
                    .addComponent(prefferedPharmacyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveJButton)
                .addContainerGap(402, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
        if(patientNameTextField.getText().trim().isEmpty()
                || patientIDJTextField.getText().trim().isEmpty()
                    || patientAgeTextField.getText().trim().isEmpty()
                        || primaryDocNameJTextField.getText().trim().isEmpty()
                            ||prefferedPharmacyJTextField.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please fill all the fields.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        patient.setPatientName(patientNameTextField.getText());
        patient.setPatientID(patientIDJTextField.getText());
        patient.setAge(Integer.parseInt(patientAgeTextField.getText()));
        patient.setPrimaryDoctorName(primaryDocNameJTextField.getText());
        patient.setPrefferedPharmacy(prefferedPharmacyJTextField.getText());
        /*Creating new blank VitalSignHistory array for patient*/
        //patient.setVitalSignHistory(new VitalSignHistory());
        JOptionPane.showMessageDialog(this,"Patient Information Stored","Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField patientAgeTextField;
    private javax.swing.JLabel patientIDJLabel;
    private javax.swing.JTextField patientIDJTextField;
    private javax.swing.JLabel patientNameJLabel;
    private javax.swing.JTextField patientNameTextField;
    private javax.swing.JLabel prefferedPharmacyJLabel;
    private javax.swing.JTextField prefferedPharmacyJTextField;
    private javax.swing.JLabel primaryDocNameJLabel;
    private javax.swing.JTextField primaryDocNameJTextField;
    private javax.swing.JButton saveJButton;
    // End of variables declaration//GEN-END:variables
}
