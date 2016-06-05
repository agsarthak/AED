/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesPersonRole;

import Business.CustomerDirectory;
import Business.MasterOrderCatalog;
import Business.Salesperson;
import Business.SalespersonDirectory;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sarthak
 */
public class LoginSalesperson extends javax.swing.JPanel {

    JPanel userProcessContainer;
    SalespersonDirectory salespersonDirectory;
    CustomerDirectory customerDirectory;
    MasterOrderCatalog moc;
    SupplierDirectory supplierDirectory;
            
    public LoginSalesperson(JPanel upc, SalespersonDirectory salespersonDirectory, CustomerDirectory customerDirectory, 
            MasterOrderCatalog moc, SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessContainer = upc;
        this.salespersonDirectory = salespersonDirectory;
        this.customerDirectory = customerDirectory;
        this.moc = moc;
        this.supplierDirectory = supplierDirectory;
        
        salespersonCb.removeAllItems();
        for(Salesperson salesperson : salespersonDirectory.getSalesPersonList() ) {
           salespersonCb.addItem(salesperson);
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

        jLabel1 = new javax.swing.JLabel();
        salespersonCb = new javax.swing.JComboBox();
        loginBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Login Salesperson");

        salespersonCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        loginBtn.setText("Login>>");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salespersonCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salespersonCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn))
                .addContainerGap(265, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        Salesperson salesperson = (Salesperson) salespersonCb.getSelectedItem();
        ManageCustomer mc = new ManageCustomer(userProcessContainer, salesperson, customerDirectory, moc, supplierDirectory);
        userProcessContainer.add("ManageCustomer", mc);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JComboBox salespersonCb;
    // End of variables declaration//GEN-END:variables
}