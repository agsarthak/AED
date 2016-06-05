/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface;
import business.Person;
import javax.swing.JOptionPane;
/**
 *
 * @author kedarvdm
 */
public class CreatePersonJPanel extends javax.swing.JPanel {
private Person person;
    /**
     * Creates new form CreateProductJPanel
     */
     public CreatePersonJPanel(Person person) {
        initComponents();
        this.person= person;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productNameJLabel = new javax.swing.JLabel();
        productDescriptionJLabel = new javax.swing.JLabel();
        productAvailabiltyJLabel = new javax.swing.JLabel();
        productPriceJLabel = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        middleNameJTextField = new javax.swing.JTextField();
        lastNameJTextField = new javax.swing.JTextField();
        yearJTextField = new javax.swing.JTextField();
        createPersonJButton = new javax.swing.JButton();
        createProductJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        streetAddressJTextField = new javax.swing.JTextField();
        cityJTextField = new javax.swing.JTextField();
        occupationJTextField = new javax.swing.JTextField();
        zipCodeJTextField = new javax.swing.JTextField();
        emailJTextField = new javax.swing.JTextField();
        numberJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        monthJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dayJTextField = new javax.swing.JTextField();
        areaCodeJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(500, 400));
        setNextFocusableComponent(firstNameJTextField);
        setPreferredSize(new java.awt.Dimension(500, 400));

        productNameJLabel.setText("First Name");
        productNameJLabel.setRequestFocusEnabled(false);

        productDescriptionJLabel.setText("Middle Name");
        productDescriptionJLabel.setRequestFocusEnabled(false);

        productAvailabiltyJLabel.setText("Last Name");
        productAvailabiltyJLabel.setRequestFocusEnabled(false);

        productPriceJLabel.setText("Date Of Birth (YYYY/MM/DD)");
        productPriceJLabel.setRequestFocusEnabled(false);

        firstNameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameJTextFieldFocusLost(evt);
            }
        });

        middleNameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                middleNameJTextFieldFocusLost(evt);
            }
        });

        lastNameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameJTextFieldFocusLost(evt);
            }
        });

        yearJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearJTextFieldFocusLost(evt);
            }
        });

        createPersonJButton.setText("Create Person");
        createPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonJButtonActionPerformed(evt);
            }
        });

        createProductJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createProductJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createProductJLabel.setText("Create Person");

        jLabel1.setText("Street Address");

        jLabel2.setText("City/Town");

        jLabel3.setText("Zip Code");

        jLabel4.setText("Occupation");

        jLabel5.setText("Email Address");

        jLabel6.setText("Phone Number");

        streetAddressJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                streetAddressJTextFieldFocusLost(evt);
            }
        });

        cityJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cityJTextFieldFocusLost(evt);
            }
        });

        occupationJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                occupationJTextFieldFocusLost(evt);
            }
        });

        zipCodeJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                zipCodeJTextFieldFocusLost(evt);
            }
        });

        emailJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailJTextFieldFocusLost(evt);
            }
        });

        numberJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numberJTextFieldFocusLost(evt);
            }
        });

        jLabel7.setText("/");

        monthJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                monthJTextFieldFocusLost(evt);
            }
        });

        jLabel8.setText("/");

        dayJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dayJTextFieldFocusLost(evt);
            }
        });

        areaCodeJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                areaCodeJTextFieldFocusLost(evt);
            }
        });

        jLabel9.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(productPriceJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(productAvailabiltyJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(productNameJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(productDescriptionJLabel)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(areaCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(numberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(emailJTextField))
                            .addComponent(createPersonJButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(yearJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(monthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(dayJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(middleNameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lastNameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(streetAddressJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cityJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(zipCodeJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(occupationJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstNameJTextField, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(createProductJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createProductJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameJLabel)
                    .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productDescriptionJLabel)
                    .addComponent(middleNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productAvailabiltyJLabel)
                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productPriceJLabel)
                    .addComponent(yearJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(monthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(dayJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(streetAddressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(zipCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(occupationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areaCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createPersonJButton)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonJButtonActionPerformed
        // TODO add your handling code here:
        
        /* Method 1
        if(firstNameJTextField.getText().equals("") ||
            middleNameJTextField.getText().equals("") ||
            lastNameJTextField.getText().equals("") ||
            yearJTextField.getText().equals("") ||
            monthJTextField.getText().equals("") ||
            dayJTextField.getText().equals("") ||
            streetAddressJTextField.getText().equals("") ||
            cityJTextField.getText().equals("") ||
            zipCodeJTextField.getText().equals("") ||
            occupationJTextField.getText().equals("") ||
            emailJTextField.getText().equals("") ||
            areaCodeJTextField.getText().equals("") ||
            numberJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Make sure you fill out each field", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }*/
        
        /*Method 2*/
        if(firstNameJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter First Name", "Error", JOptionPane.ERROR_MESSAGE);
            firstNameJTextField.requestFocus();
            return;
        }
        if(middleNameJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter Middle Name", "Error", JOptionPane.ERROR_MESSAGE);
            middleNameJTextField.requestFocus();
            return;
        }
        if(lastNameJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter Last Name", "Error", JOptionPane.ERROR_MESSAGE);
            lastNameJTextField.requestFocus();
            return;
        }
        if(yearJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter YYYY", "Error", JOptionPane.ERROR_MESSAGE);
            yearJTextField.requestFocus();
            return;
        }
        if(monthJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter MM", "Error", JOptionPane.ERROR_MESSAGE);
            monthJTextField.requestFocus();
            return;
        }
        if(dayJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter DD", "Error", JOptionPane.ERROR_MESSAGE);
            dayJTextField.requestFocus();
            return;
        }
        if(streetAddressJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter Street Address", "Error", JOptionPane.ERROR_MESSAGE);
            streetAddressJTextField.requestFocus();
            return;
        }
        if(zipCodeJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter Zip Code", "Error", JOptionPane.ERROR_MESSAGE);
            zipCodeJTextField.requestFocus();
            return;
        }
        if(cityJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter Town/City", "Error", JOptionPane.ERROR_MESSAGE);
            cityJTextField.requestFocus();
            return;
        }
        if(occupationJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter Occupation", "Error", JOptionPane.ERROR_MESSAGE);
            occupationJTextField.requestFocus();
            return;
        }
        if(emailJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter Email Address", "Error", JOptionPane.ERROR_MESSAGE);
            emailJTextField.requestFocus();
            return;
        }
        if(areaCodeJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter Area Code", "Error", JOptionPane.ERROR_MESSAGE);
            areaCodeJTextField.requestFocus();
            return;
        }
        if(numberJTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Complete Phone Number ", "Error", JOptionPane.ERROR_MESSAGE);
            numberJTextField.requestFocus();
            return;
        }
        person.setFirstName(firstNameJTextField.getText());
        person.setMiddleName(middleNameJTextField.getText());
        person.setLastName(lastNameJTextField.getText());
        person.setYear(yearJTextField.getText());
        person.setMonth(monthJTextField.getText());
        person.setDay(dayJTextField.getText());
        person.setStreetAddress(streetAddressJTextField.getText());
        person.setTown(cityJTextField.getText());
        person.setZipCode(zipCodeJTextField.getText());
        person.setOccupation(occupationJTextField.getText());
        person.setEmailAddress(emailJTextField.getText());
        person.setAreaCode(areaCodeJTextField.getText());
        person.setPhoneNumber(numberJTextField.getText());
        
        JOptionPane.showMessageDialog(this, "Person Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_createPersonJButtonActionPerformed

    private void firstNameJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_firstNameJTextFieldFocusLost

    private void middleNameJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middleNameJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_middleNameJTextFieldFocusLost

    private void lastNameJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lastNameJTextFieldFocusLost

    private void yearJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_yearJTextFieldFocusLost

    private void monthJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_monthJTextFieldFocusLost

    private void dayJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dayJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dayJTextFieldFocusLost

    private void streetAddressJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_streetAddressJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_streetAddressJTextFieldFocusLost

    private void cityJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cityJTextFieldFocusLost

    private void zipCodeJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipCodeJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_zipCodeJTextFieldFocusLost

    private void occupationJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_occupationJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_occupationJTextFieldFocusLost

    private void emailJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_emailJTextFieldFocusLost

    private void areaCodeJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_areaCodeJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_areaCodeJTextFieldFocusLost

    private void numberJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberJTextFieldFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_numberJTextFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaCodeJTextField;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JButton createPersonJButton;
    private javax.swing.JLabel createProductJLabel;
    private javax.swing.JTextField dayJTextField;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JTextField middleNameJTextField;
    private javax.swing.JTextField monthJTextField;
    private javax.swing.JTextField numberJTextField;
    private javax.swing.JTextField occupationJTextField;
    private javax.swing.JLabel productAvailabiltyJLabel;
    private javax.swing.JLabel productDescriptionJLabel;
    private javax.swing.JLabel productNameJLabel;
    private javax.swing.JLabel productPriceJLabel;
    private javax.swing.JTextField streetAddressJTextField;
    private javax.swing.JTextField yearJTextField;
    private javax.swing.JTextField zipCodeJTextField;
    // End of variables declaration//GEN-END:variables
}