/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.VitalSign;
import Business.VitalSignHistory;
import javax.swing.JOptionPane;
import Business.Patient;
import java.util.Date;

/**
 *
 * @author Sarthak
 */
public class CreateVitalSign extends javax.swing.JPanel {
        private VitalSignHistory vitalSignHistory;
       
    /**
     * Creates new form CreateVitalSign
     */
    public CreateVitalSign(VitalSignHistory vitalSignHistory) {
        initComponents();
        this.vitalSignHistory = vitalSignHistory;
        String date = new Date().toString();
        DatenTimeTb.setText(date);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banner = new javax.swing.JLabel();
        RespiratoryRateLbl = new javax.swing.JLabel();
        HeartRateLbl = new javax.swing.JLabel();
        BpLbl = new javax.swing.JLabel();
        WeightLbl = new javax.swing.JLabel();
        DatenTimeLbl = new javax.swing.JLabel();
        RespiratoryTb = new javax.swing.JTextField();
        HeartRateTb = new javax.swing.JTextField();
        WeightTb = new javax.swing.JTextField();
        BpTb = new javax.swing.JTextField();
        DatenTimeTb = new javax.swing.JTextField();
        SaveLbl = new javax.swing.JButton();

        banner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        banner.setText("Create Vital Sign");

        RespiratoryRateLbl.setText("Respiratory Rate");

        HeartRateLbl.setText("Heart Rate");

        BpLbl.setText("Systolic Blood Pressure");

        WeightLbl.setText("Weight in Pounds");

        DatenTimeLbl.setText("Date and Time");

        DatenTimeTb.setEditable(false);
        DatenTimeTb.setEnabled(false);

        SaveLbl.setText("Save");
        SaveLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveLblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(banner))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DatenTimeLbl)
                            .addComponent(WeightLbl)
                            .addComponent(BpLbl)
                            .addComponent(HeartRateLbl)
                            .addComponent(RespiratoryRateLbl))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RespiratoryTb)
                            .addComponent(HeartRateTb)
                            .addComponent(BpTb)
                            .addComponent(WeightTb)
                            .addComponent(DatenTimeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(SaveLbl)))
                .addContainerGap(403, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(banner)
                        .addGap(30, 30, 30)
                        .addComponent(RespiratoryRateLbl)
                        .addGap(18, 18, 18)
                        .addComponent(HeartRateLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RespiratoryTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HeartRateTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BpLbl)
                    .addComponent(BpTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WeightLbl)
                    .addComponent(WeightTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatenTimeLbl)
                    .addComponent(DatenTimeTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(SaveLbl)
                .addContainerGap(141, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveLblActionPerformed
        
       try{
           float respiratoryRate = Float.parseFloat(RespiratoryTb.getText());
        float heartRate = Float.parseFloat(HeartRateTb.getText());
        float bp = Float.parseFloat(BpTb.getText());
        float weight = Float.parseFloat(WeightTb.getText());
//        String date = new Date().toString();
        
        VitalSign vs = vitalSignHistory.addVitalSign();
        vs.setRespiratoryRate(respiratoryRate);
        vs.setHeartRate(heartRate);
        vs.setBp(bp);
        vs.setWeight(weight);
        vs.setDate(DatenTimeTb.getText());
        
        JOptionPane.showMessageDialog(null, "Vital Sign has been successfully recorded.", "Information", JOptionPane.INFORMATION_MESSAGE);               
        
        resetFields();
           
        //calculateStatus(patient);
       }
       catch (Exception e1) {
           System.out.println("Error!");
        JOptionPane.showMessageDialog(null, 
                                      "Please enter valid values", 
                                      "Warning", 
                                      JOptionPane.WARNING_MESSAGE );
       }
    }//GEN-LAST:event_SaveLblActionPerformed

        public void resetFields(){
        RespiratoryTb.setText("");
        HeartRateTb.setText("");
        BpTb.setText("");
        WeightTb.setText("");
        DatenTimeTb.setText(new Date().toString());
    }
        
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BpLbl;
    private javax.swing.JTextField BpTb;
    private javax.swing.JLabel DatenTimeLbl;
    private javax.swing.JTextField DatenTimeTb;
    private javax.swing.JLabel HeartRateLbl;
    private javax.swing.JTextField HeartRateTb;
    private javax.swing.JLabel RespiratoryRateLbl;
    private javax.swing.JTextField RespiratoryTb;
    private javax.swing.JButton SaveLbl;
    private javax.swing.JLabel WeightLbl;
    private javax.swing.JTextField WeightTb;
    private javax.swing.JLabel banner;
    // End of variables declaration//GEN-END:variables
}
