/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CarRenterRole;

import Business.Enterprise.Enterprise;
import Business.Organization.CarRenterOrganization;
import Business.RideSharing.CarListing;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RideShareWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sarthak
 */
public class CarRenterWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private CarRenterOrganization carRenterOrganization;
    private Enterprise enterprise;

    public CarRenterWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CarRenterOrganization carRenterOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.carRenterOrganization = carRenterOrganization;
        this.enterprise = enterprise;
        populateTable();
        lblUser.setText("Hello "+ account.getEmployee().getName());
    }

    public void populateTable(){
        int rowCount = tableRenterDashboard.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tableRenterDashboard.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }

        for (WorkRequest request : carRenterOrganization.getWorkQueue().getWorkRequestList()){
            if (account == request.getReceiver() || request.getReceiver() == null ){
                Object[] row = new Object[6];
                row[0] = ((RideShareWorkRequest) request).getCarListing();
                row[1] = request.getSender();
                row[2] = request;
                
                String expectedPattern = "MM/dd/yyyy HH:mm:ss";
                SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
                Date userInput = ((RideShareWorkRequest) request).getCarHiredDate();    // MM/DD/YYYY
                if(userInput != null){
                    String date = formatter.format(userInput);
                    row[3] = date;
                } else {
                    row[3] = null;
                }
                
//                SimpleDateFormat formatter2 = new SimpleDateFormat(expectedPattern);
                Date userInput2 = ((RideShareWorkRequest) request).getCarReturnedDate();    // MM/DD/YYYY
                if(userInput2 != null){
                    String date2 = formatter.format(userInput2);
                    row[4] = date2;
                 } else{
                     row[4] = null;
                 }
                
                row[5] = ((RideShareWorkRequest)request).getMoneyEarned();
                model.addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableRenterDashboard = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnHire = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 205, 210));

        tableRenterDashboard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Model", "Owner", "Status", "Hired On", "Hired till", "Money Spent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableRenterDashboard);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Your Dashboard:");

        btnHire.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnHire.setText("Hire Car");
        btnHire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHireActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnReturn.setText("Return Car");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnViewDetails.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnViewDetails.setText("View car details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUser.setText("Hi:");
        lblUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHire, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                        .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHire, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(317, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHireActionPerformed
        int selectedRow = tableRenterDashboard.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        WorkRequest request = (WorkRequest)tableRenterDashboard.getValueAt(selectedRow, 2);
        
        if (((RideShareWorkRequest)request).getCarListing().getOnOffmarket() == "OnMarket" && ((RideShareWorkRequest)request).getCarReturnedDate() == null){
            request.setReceiver(account);
            request.setStatus("Hired");
//          DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            ((RideShareWorkRequest)request).setCarHiredDate(date);
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "This car is Off Market", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnHireActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        int selectedRow = tableRenterDashboard.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        RideShareWorkRequest request = (RideShareWorkRequest)tableRenterDashboard.getValueAt(selectedRow, 2);
        Date date = new Date();
        request.setCarReturnedDate(date);
        request.setStatus("NotHired");
        request.getCarListing().setOnOffmarket("OffMarket");
        
        
        long greenPts = ((RideShareWorkRequest)request).calculateGreenPoints();
        ((RideShareWorkRequest)request).setGreenPoints((int) greenPts);
        
        int moneyEarned = (int) ((((RideShareWorkRequest) request).getCarListing().getCarRent()) * (((RideShareWorkRequest) request).calculateTimeDifference()));
        ((RideShareWorkRequest)request).setMoneyEarned(moneyEarned);
        
        populateTable();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
       int selectedRow = tableRenterDashboard.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        RideShareWorkRequest request = (RideShareWorkRequest)tableRenterDashboard.getValueAt(selectedRow, 2);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CarListingDetailsJPanel", new CarListingDetailsJPanel(userProcessContainer, account, enterprise, carRenterOrganization, request));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHire;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tableRenterDashboard;
    // End of variables declaration//GEN-END:variables
}