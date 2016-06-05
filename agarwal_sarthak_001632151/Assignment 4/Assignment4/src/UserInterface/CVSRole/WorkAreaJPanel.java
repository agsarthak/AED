/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CVSRole;

import Business.PharmacyDirectory;
import Business.StoreCatalog;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sarthak
 */
public class WorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    PharmacyDirectory pharmacyDirectory;
    StoreCatalog storeCatalog;
    
    

    public WorkAreaJPanel(JPanel userProcessContainer, PharmacyDirectory pharmacyDirectory, StoreCatalog storeCatalog ) {
       initComponents();
       this.userProcessContainer = userProcessContainer;
       this.pharmacyDirectory = pharmacyDirectory;
       this.storeCatalog = storeCatalog;
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
        manageStoreBtn = new javax.swing.JButton();
        manageDrugCatalogBtn = new javax.swing.JButton();
        managePharmaBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Work Area Panel - Admin job:");

        manageStoreBtn.setText("Manage Store");
        manageStoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStoreBtnActionPerformed(evt);
            }
        });

        manageDrugCatalogBtn.setText("Manage Drug Catalog");
        manageDrugCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDrugCatalogBtnActionPerformed(evt);
            }
        });

        managePharmaBtn.setText("Manage Pharma");
        managePharmaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePharmaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageStoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(managePharmaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageDrugCatalogBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))))
                .addContainerGap(576, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageStoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(managePharmaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageDrugCatalogBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePharmaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePharmaBtnActionPerformed
       ManagePharmaJPanel mphjp = new ManagePharmaJPanel(userProcessContainer, pharmacyDirectory);
       userProcessContainer.add("ManagePharmaJPanel",mphjp);
       CardLayout layout = (CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_managePharmaBtnActionPerformed

    private void manageStoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStoreBtnActionPerformed
       ManageStoreJPanel msjp = new ManageStoreJPanel(userProcessContainer, storeCatalog);
       userProcessContainer.add("ManageStoreJPanel",msjp);
       CardLayout layout = (CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_manageStoreBtnActionPerformed

    private void manageDrugCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDrugCatalogBtnActionPerformed
       SelectPharmaJPanel sphjp = new SelectPharmaJPanel(userProcessContainer, pharmacyDirectory);
       userProcessContainer.add("SelectPharmaJPanel",sphjp);
       CardLayout layout = (CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDrugCatalogBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageDrugCatalogBtn;
    private javax.swing.JButton managePharmaBtn;
    private javax.swing.JButton manageStoreBtn;
    // End of variables declaration//GEN-END:variables
}
