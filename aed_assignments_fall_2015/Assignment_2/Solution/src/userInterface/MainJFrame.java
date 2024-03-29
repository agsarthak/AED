/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Patient;

/**
 *
 * @author kedarvdm
 */
public class MainJFrame extends javax.swing.JFrame {

    private Patient patient;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.patient = new Patient();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainJSplitPane = new javax.swing.JSplitPane();
        LeftJPanel = new javax.swing.JPanel();
        createJButton = new javax.swing.JButton();
        addVitalSignsJButton = new javax.swing.JButton();
        viewPersonHistoryJButton = new javax.swing.JButton();
        RightJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(800, 800));

        MainJSplitPane.setDividerLocation(200);
        MainJSplitPane.setMinimumSize(new java.awt.Dimension(700, 600));
        MainJSplitPane.setPreferredSize(new java.awt.Dimension(700, 600));

        LeftJPanel.setMinimumSize(new java.awt.Dimension(200, 650));
        LeftJPanel.setPreferredSize(new java.awt.Dimension(200, 650));

        createJButton.setText("Create Patient");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

        addVitalSignsJButton.setText("Vital Sign History");
        addVitalSignsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVitalSignsJButtonActionPerformed(evt);
            }
        });

        viewPersonHistoryJButton.setText("View Person History");
        viewPersonHistoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonHistoryJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftJPanelLayout = new javax.swing.GroupLayout(LeftJPanel);
        LeftJPanel.setLayout(LeftJPanelLayout);
        LeftJPanelLayout.setHorizontalGroup(
            LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewPersonHistoryJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addVitalSignsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftJPanelLayout.setVerticalGroup(
            LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addVitalSignsJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewPersonHistoryJButton)
                .addContainerGap(536, Short.MAX_VALUE))
        );

        MainJSplitPane.setLeftComponent(LeftJPanel);

        RightJPanel.setMinimumSize(new java.awt.Dimension(500, 650));
        RightJPanel.setPreferredSize(new java.awt.Dimension(500, 650));

        javax.swing.GroupLayout RightJPanelLayout = new javax.swing.GroupLayout(RightJPanel);
        RightJPanel.setLayout(RightJPanelLayout);
        RightJPanelLayout.setHorizontalGroup(
            RightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        RightJPanelLayout.setVerticalGroup(
            RightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        MainJSplitPane.setRightComponent(RightJPanel);

        getContentPane().add(MainJSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        CreatePatientJPanel cpJPanel = new CreatePatientJPanel(patient);
        MainJSplitPane.setRightComponent(cpJPanel);
    }//GEN-LAST:event_createJButtonActionPerformed

    private void addVitalSignsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVitalSignsJButtonActionPerformed
        // TODO add your handling code here:
        CreateVitalSignHistoryJPanel cvshJPanel = new CreateVitalSignHistoryJPanel(patient);
        MainJSplitPane.setRightComponent(cvshJPanel);
    }//GEN-LAST:event_addVitalSignsJButtonActionPerformed

    private void viewPersonHistoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonHistoryJButtonActionPerformed
        // TODO add your handling code here:
        ViewVitalSignHistoryJPanel vvshJPanel = new ViewVitalSignHistoryJPanel(patient);
        MainJSplitPane.setRightComponent(vvshJPanel);
    }//GEN-LAST:event_viewPersonHistoryJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftJPanel;
    private javax.swing.JSplitPane MainJSplitPane;
    private javax.swing.JPanel RightJPanel;
    private javax.swing.JButton addVitalSignsJButton;
    private javax.swing.JButton createJButton;
    private javax.swing.JButton viewPersonHistoryJButton;
    // End of variables declaration//GEN-END:variables
}
