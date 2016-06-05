package UserInterface.AdminstrativeRole;

import Business.Business;
import UserInterface.SupplierRole.ManageProductCatalogJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kedarvdm
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private Business business;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,Business business) {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageCustomersJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ManageSalesPersonsJButton = new javax.swing.JButton();
        managePButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageCustomersJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ManageCustomersJButton.setText("Manage Customers>>");
        ManageCustomersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCustomersJButtonActionPerformed(evt);
            }
        });
        add(ManageCustomersJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 260, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Aminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        ManageSalesPersonsJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ManageSalesPersonsJButton.setText("Manage Sales Persons>>");
        ManageSalesPersonsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageSalesPersonsJButtonActionPerformed(evt);
            }
        });
        add(ManageSalesPersonsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 260, -1));

        managePButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePButton.setText("Manage Product Catalog >>");
        managePButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePButtonActionPerformed(evt);
            }
        });
        add(managePButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ManageCustomersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCustomersJButtonActionPerformed
        ManageCustomersJPanel mcjp = new ManageCustomersJPanel(userProcessContainer, business.getCustomerDirectory());
        userProcessContainer.add("ManageCustomersJPanel", mcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageCustomersJButtonActionPerformed

    private void ManageSalesPersonsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageSalesPersonsJButtonActionPerformed
        // TODO add your handling code here:
        ManageSalesPersonsJPanel mspjp = new ManageSalesPersonsJPanel(userProcessContainer,business.getSalesPersonDirectory());
        userProcessContainer.add("ManageSalesPersonsJPanel", mspjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageSalesPersonsJButtonActionPerformed

    private void managePButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePButtonActionPerformed

        ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(userProcessContainer, business.getXerox());
        userProcessContainer.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageCustomersJButton;
    private javax.swing.JButton ManageSalesPersonsJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managePButton;
    // End of variables declaration//GEN-END:variables
    
}
