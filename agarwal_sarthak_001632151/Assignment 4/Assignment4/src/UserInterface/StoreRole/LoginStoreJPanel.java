/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.StoreRole;

import Business.Pharmacy;
import Business.PharmacyDirectory;
import Business.Store;
import Business.StoreCatalog;
import UserInterface.CVSRole.ManageDrugCatalogJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sarthak
 */
public class LoginStoreJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    PharmacyDirectory pharmacyDirectory;
    StoreCatalog storeCatalog;
   

    public LoginStoreJPanel(JPanel upc, PharmacyDirectory pd, StoreCatalog sc) {
        initComponents();
        userProcessContainer = upc;
        pharmacyDirectory = pd;
        storeCatalog =sc;
        selectStoreCb.removeAllItems();
        for(Store store : storeCatalog.getStoreList() ) {
           selectStoreCb.addItem(store);
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

        selectStoreCb = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        goBtn = new javax.swing.JButton();

        selectStoreCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Select Store");

        goBtn.setText("Go>>");
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(selectStoreCb, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(goBtn)
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectStoreCb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(273, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        if(selectStoreCb.getItemCount() ==0 ){
            JOptionPane.showMessageDialog(null, "Please enter a Store first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else {
        Store store = (Store)selectStoreCb.getSelectedItem();
        ManageStoreInventoryJPanel msijp = new ManageStoreInventoryJPanel(userProcessContainer, store, pharmacyDirectory);
        userProcessContainer.add("ManageStoreInventoryJPanel",msijp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_goBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox selectStoreCb;
    // End of variables declaration//GEN-END:variables
}
