/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Patient;
import util.DatabaseConnector;

/**
 *
 * @author varun
 */
public class formPanel extends javax.swing.JPanel {

    /**
     * Creates new form formPanel
     */
    public formPanel() {
        initComponents();
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        nameLabel = new javax.swing.JLabel();
        ageLabelName = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 102));

        nameLabel.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        nameLabel.setText("Name:");

        ageLabelName.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        ageLabelName.setText("Age:");

        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });
        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyPressed(evt);
            }
        });

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTextFieldKeyReleased(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        titleLabel.setBackground(new java.awt.Color(255, 102, 102));
        titleLabel.setFont(new java.awt.Font("Kailasa", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("PATIENT REGISTRATION FORM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(ageLabelName))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(ageTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(410, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 196, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabelName)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        // Setting functionalities for First Name

        Patient newPatient = new Patient();
        
        try{
            newPatient.setAge(Integer.parseInt(ageTextField.getText()));
            newPatient.setName(nameTextField.getText());
            //insert into DB
            DatabaseConnector.addPatient(newPatient);
            JOptionPane.showMessageDialog(null, "User Registered Successfully", "Successful Registration", JOptionPane.INFORMATION_MESSAGE);
            
            cleanup();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void nameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextFieldKeyReleased
        // TODO add your handling code here:
//        String firstName = firstNameTextField.getText();
//        if (firstName.isEmpty() || !firstName.matches("^[a-zA-Z]+$")) {
//            JOptionPane.showMessageDialog(null, "Enter a first valid name");
//        }
    }//GEN-LAST:event_nameTextFieldKeyReleased

    private void ageTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyPressed
        // TODO add your handling code here:
//        String age = ageTextField.getText();
//        if (!age.matches("\\d*")|| age.isEmpty()) { // Check if the input is a digit
//            JOptionPane.showMessageDialog(null, "Please enter a valid age.");
//            ageTextField.setText("");
//        }
    }//GEN-LAST:event_ageTextFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabelName;
    private javax.swing.JTextField ageTextField;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    public void cleanup() {
        nameTextField.setText("");
        ageTextField.setText("");
    }

}
