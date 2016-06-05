/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */

package UserInterface.SalesPersonRole;

import Business.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kedarvdm
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Product product;
            
    /** Creates new form CreateProductJPanel */
    public ViewProductDetailJPanel(JPanel upc, Product p) {
        initComponents();
        userProcessContainer = upc;
        product = p;
        nameField.setText(product.getProdName());
        txtFloorPrice.setText(Double.toString(product.getFloorPrice()));
        txtPrice.setText(Double.toString(product.getPrice()));
        txtCeilingPrice.setText(Double.toString(product.getCeiligPrice()));
        txtAvail.setText(Integer.toString(product.getAvailability()));
        idField.setText(Integer.toString(product.getModelNumber()));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAvail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFloorPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCeilingPrice = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Product Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 25, -1, -1));

        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 159, -1));

        jLabel3.setText("Target Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 30));

        txtPrice.setEditable(false);
        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 159, -1));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< BACK");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 159, -1));

        jLabel5.setText("Product ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        jLabel6.setText("Availability");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txtAvail.setEditable(false);
        add(txtAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 160, -1));

        jLabel4.setText("Floor Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        txtFloorPrice.setEditable(false);
        txtFloorPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFloorPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtFloorPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 159, -1));

        jLabel7.setText("Ceiling Price:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

        txtCeilingPrice.setEditable(false);
        txtCeilingPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCeilingPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtCeilingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 159, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtCeilingPrice;
    private javax.swing.JTextField txtFloorPrice;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
    
}
