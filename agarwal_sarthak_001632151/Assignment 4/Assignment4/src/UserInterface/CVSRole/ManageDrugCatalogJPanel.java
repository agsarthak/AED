/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CVSRole;

import Business.Drug;
import Business.DrugCatalog;
import Business.Pharmacy;
import Business.Store;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sarthak
 */
public class ManageDrugCatalogJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Pharmacy pharmacy;
   
    

    ManageDrugCatalogJPanel(JPanel upc, Pharmacy ph) {
         initComponents();
         this.userProcessContainer = upc;
         this.pharmacy = ph;
         pharmacyNameTb.setText(pharmacy.getPharmaName());
         refreshTable();
    }

    public void refreshTable() {
        int rowCount = drugTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)drugTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Drug d : pharmacy.getDrugCatalog().getDrugList()) {
            Object row[] = new Object[3];
            row[0] = d;
            row[1] = d.getListPrice();
            row[2] = d.getDescription();
            model.addRow(row);
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
        drugTable = new javax.swing.JTable();
        viewDrugBtn = new javax.swing.JButton();
        addDrugBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pharmacyNameTb = new javax.swing.JTextField();

        drugTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "List Price", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugTable);

        viewDrugBtn.setText("View Drug");
        viewDrugBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrugBtnActionPerformed(evt);
            }
        });

        addDrugBtn.setText("Add Drug");
        addDrugBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrugBtnActionPerformed(evt);
            }
        });

        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Pharmacy Name:");

        pharmacyNameTb.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pharmacyNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(18, 18, 18)
                        .addComponent(removeBtn)
                        .addGap(18, 18, 18)
                        .addComponent(viewDrugBtn)
                        .addGap(18, 18, 18)
                        .addComponent(addDrugBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(377, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pharmacyNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(removeBtn)
                    .addComponent(viewDrugBtn)
                    .addComponent(addDrugBtn))
                .addContainerGap(178, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addDrugBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrugBtnActionPerformed
        AddDrugJPanel adjp = new AddDrugJPanel(userProcessContainer, pharmacy);
        userProcessContainer.add("AddDrugJPanel",adjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addDrugBtnActionPerformed

    private void viewDrugBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrugBtnActionPerformed
        int row = drugTable.getSelectedRow();
        if(row<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Drug d = (Drug)drugTable.getValueAt(row, 0);
        ViewDrugJPanel vdjp = new ViewDrugJPanel(userProcessContainer, d);
        userProcessContainer.add("AddDrugJPanel",vdjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDrugBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
//        ManageDrugCatalogJPanel manageDrugCatalogJPanel = (ManageDrugCatalogJPanel) component;
//        manageDrugCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        int row = drugTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Drug d = (Drug) drugTable.getValueAt(row, 0);
        pharmacy.getDrugCatalog().removeDrug(d);
        refreshTable();
    }//GEN-LAST:event_removeBtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDrugBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable drugTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pharmacyNameTb;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton viewDrugBtn;
    // End of variables declaration//GEN-END:variables
}