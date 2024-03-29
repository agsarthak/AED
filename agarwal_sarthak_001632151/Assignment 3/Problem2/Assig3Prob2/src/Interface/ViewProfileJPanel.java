/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Patient;
import Business.Person;
import Business.VitalSignHistory;
import Business.VitalSigns;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sarthak
 */
public class ViewProfileJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Person person;
    private Patient patient;
    private VitalSignHistory vitalSignHistory;
    private VitalSigns vitalSigns;
    /**
     * Creates new form ViewProfileJPanel
     */
    

    ViewProfileJPanel(JPanel upc, VitalSignHistory vitalSignHistory, Person person, Patient patient) {
        initComponents();
        this.userProcessContainer = upc;
        this.person = person;
        this.patient = patient;
        this.vitalSignHistory = vitalSignHistory;
        
        populateTable();
    
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)patientTable.getModel();
        int rowCount = patientTable.getRowCount();
        for(int i = rowCount - 1; i>=0; i--) {
            dtm.removeRow(i);
        }
        
        for(VitalSigns vs : vitalSignHistory.getVitalSignList()) {
            Object row[] = new Object[4];
            row[0] = vs;
            row[1] = person.getFirstName();
            row[2] = person.getId();
            row[3] = calculateStatus(vs);
            dtm.addRow(row);
        }
        
    }
    
    public void refreshTable() {
        DefaultTableModel dtm = (DefaultTableModel) patientTable.getModel();
        dtm.setRowCount(0);
        for (VitalSigns vs : vitalSignHistory.getVitalSignList()) {
            Object[] row = new Object[4];
            row[0] = vs;
            row[1] = person.getFirstName();
            row[2] = person.getId();
            row[3] = calculateStatus(vs);
            dtm.addRow(row);
        }
    }
    
    public String calculateStatus (VitalSigns vitalSign){
    String status = "Please enter valid patient details";
        if (patient.getAge() >= 1 && patient.getAge() <= 3 )
        { 
            if (
             vitalSign.getRespiratoryRate() >=20 && vitalSign.getRespiratoryRate() <=30
            &&  vitalSign.getHeartRate() >=80 && vitalSign.getHeartRate() <= 130       
            &&  vitalSign.getBp()>=80 && vitalSign.getBp() <=110
            &&  vitalSign.getWeight() >= 22 && vitalSign.getWeight() <= 31    
                     )
                    {
                    status ="Normal";
                    }
            else {
                status ="Abnormal";
                 }
        }
        
        if (patient.getAge() >= 4 && patient.getAge() <= 5 )
        { 
            if (
             vitalSign.getRespiratoryRate() >=20 && vitalSign.getRespiratoryRate() <=30
            &&  vitalSign.getHeartRate() >=80 && vitalSign.getHeartRate() <= 120       
            &&  vitalSign.getBp()>=80 && vitalSign.getBp() <=110
            &&  vitalSign.getWeight() >= 31 && vitalSign.getWeight() <= 40
                     )
                    {
                    status ="Normal";
                    }
            else {
                status ="Abnormal";
                 }
        }
        if (patient.getAge() >= 6 && patient.getAge() <= 12 )
        { 
            if (
             vitalSign.getRespiratoryRate() >=20 && vitalSign.getRespiratoryRate() <=30
            &&  vitalSign.getHeartRate() >=70 && vitalSign.getHeartRate() <= 110
            &&  vitalSign.getBp()>=80 && vitalSign.getBp() <=120
            &&  vitalSign.getWeight() >= 41 && vitalSign.getWeight() <= 92   
                     )
                    {
                    status ="Normal";
                    }
            else {
                status ="Abnormal";
                 }
        }
        if (patient.getAge() >= 13 )
        { 
            if (
             vitalSign.getRespiratoryRate() >=12 && vitalSign.getRespiratoryRate() <=20
            &&  vitalSign.getHeartRate() >=55 && vitalSign.getHeartRate() <= 105
            &&  vitalSign.getBp()>=110 && vitalSign.getBp() <=120
            &&  vitalSign.getWeight() >= 110  
                     )
                    {
                    status ="Normal";
                    }
            else {
                status ="Abnormal";
                 }
        }
            return status;
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        viewVitalSignBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        searchPatientTb = new javax.swing.JTextField();
        searchPatientBtn = new javax.swing.JButton();

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "First Name", "Patient ID", "Health Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientTable);

        viewVitalSignBtn.setText("View Vital Signs");
        viewVitalSignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalSignBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        searchPatientBtn.setText("Search Patient");
        searchPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(searchPatientTb, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(101, 101, 101)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(viewVitalSignBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchPatientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(578, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPatientTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPatientBtn))
                .addGap(45, 45, 45)
                .addComponent(viewVitalSignBtn)
                .addGap(41, 41, 41)
                .addComponent(backBtn)
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CreatepatientJPanel createpatientJPanel = (CreatepatientJPanel) component;
//        CreatepatientJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewVitalSignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalSignBtnActionPerformed
         int selectedRow = patientTable.getSelectedRow(); 
        if(selectedRow >=0) {                              
            VitalSigns vs = (VitalSigns)patientTable.getValueAt(selectedRow, 0);
            ViewVitalSignsJPanel vvsjp = new ViewVitalSignsJPanel(userProcessContainer, vs);
        userProcessContainer.add("ViewVitalSignsJPanel", vvsjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_viewVitalSignBtnActionPerformed

    private void searchPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientBtnActionPerformed
          String key = searchPatientTb.getText();
        if (key == null || key.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please provide Patient ID to search", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String pa  = patient.getPatientId();

            if (pa != null) {
                SearchPatientJPanel panel = new SearchPatientJPanel(userProcessContainer, patient);
                userProcessContainer.add("SearchPatientJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "This Patient ID dosen't exist in the records.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_searchPatientBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton searchPatientBtn;
    private javax.swing.JTextField searchPatientTb;
    private javax.swing.JButton viewVitalSignBtn;
    // End of variables declaration//GEN-END:variables
}
