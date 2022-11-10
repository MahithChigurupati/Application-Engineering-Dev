/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.CityDirectory;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author mahith
 */
public class UpdatePanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePanel
     */
    
    Person person;
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    DoctorDirectory doctorDirectory;
    EncounterHistory encounterHistory;
    HospitalDirectory hospitalDirectory;
    HouseDirectory houseDirectory;
    CommunityDirectory communityDirectory;
    CityDirectory cityDirectory;
    JSplitPane splitPane;
    
    public UpdatePanel(Person person,PersonDirectory personDirectory,PatientDirectory patientDirectory,DoctorDirectory doctorDirectory,EncounterHistory encounterHistory, HospitalDirectory hospitalDirectory,HouseDirectory houseDirectory,CommunityDirectory communityDirectory,CityDirectory cityDirectory,JSplitPane splitPane) {
        
        initComponents();
        
        this.person = person;
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.encounterHistory = encounterHistory;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.communityDirectory = communityDirectory;
        this.cityDirectory = cityDirectory;
        this.houseDirectory = houseDirectory;
        this.splitPane = splitPane;
        
        txtFirstName.setText(person.getFirstName());
        txtLastName.setText(person.getLastName());
        txtEmail.setText(person.getEmailAddress());
        txtMobile.setText(person.getMobileNum());
        txtCommunity.setText(person.getCommunity());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        fldPassword = new javax.swing.JPasswordField();
        fldNewPassword = new javax.swing.JPasswordField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblMobile = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblGender = new javax.swing.JLabel();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        txtCommunity = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblReType = new javax.swing.JLabel();
        fldReType = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFirstName.setText("First Name*");
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 116, -1, -1));

        txtFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstNameFocusLost(evt);
            }
        });
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 121, 130, -1));

        lblLastName.setText("Last Name*");
        add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 124, -1, -1));
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 121, 160, -1));

        lblPassword.setText("Current Password*");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 165, -1, -1));

        fldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldPasswordFocusLost(evt);
            }
        });
        add(fldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 162, 130, -1));

        fldNewPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fldNewPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldNewPasswordFocusLost(evt);
            }
        });
        add(fldNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 211, 130, -1));

        lblEmail.setText("Email*");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 332, -1, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 329, 130, -1));

        lblMobile.setText("Mobile");
        add(lblMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 332, 106, -1));
        add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 329, 160, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 459, -1, -1));

        lblGender.setText("Gender*");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 373, 106, -1));

        rdMale.setText("Male");
        add(rdMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 371, -1, -1));

        rdFemale.setText("Female");
        add(rdFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 371, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 60, 83, -1));
        add(txtCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 370, 130, -1));

        lblCommunity.setText("Community*");
        add(lblCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 373, -1, -1));

        lblNewPassword.setText("New Password*");
        add(lblNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 214, -1, -1));

        lblReType.setText("Re-type Password*");
        add(lblReType, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 267, -1, -1));

        fldReType.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fldReTypeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldReTypeFocusLost(evt);
            }
        });
        add(fldReType, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 264, 130, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Personal Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 800, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNameFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtFirstNameFocusLost

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void fldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldPasswordFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_fldPasswordFocusGained

    private void fldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldPasswordFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_fldPasswordFocusLost

    private void fldNewPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldNewPasswordFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_fldNewPasswordFocusGained

    private void fldNewPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldNewPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNewPasswordFocusLost

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        String fName = txtFirstName.getText();
        String lName = txtLastName.getText();
        String mobiNum = txtMobile.getText();
        String emailId = txtEmail.getText();
        
        String password = new String(fldPassword.getPassword());
        String newPassword = new String(fldNewPassword.getPassword());
        String reType = new String(fldReType.getPassword());
        String community = txtCommunity.getText();

        if(fName.isBlank() || lName.isBlank() || mobiNum.isBlank() || emailId.isBlank() || password.isBlank() || community.isBlank()){
            JOptionPane.showMessageDialog(this, "Please enter Mandatory Fields");
        }else if(!emailId.contains("@") || !emailId.contains(".com")){
            JOptionPane.showMessageDialog(this, "Please enter valid Email address");
        }else if(mobiNum.length()!=10){
            JOptionPane.showMessageDialog(this, "Please enter valid Mobile number");
        }else{
            if(password.equals(person.getPassword())){
                if(newPassword.equals(reType)){

                    Person newPerson = personDirectory.authenticatePerson(person.getUserID(), password);
                    newPerson.setFirstName(fName);
                    newPerson.setLastName(lName);
                    newPerson.setPassword(newPassword);
                    newPerson.setMobileNum(mobiNum);
                    newPerson.setEmailAddress(emailId);
                    newPerson.setCommunity(community);

                    Patient newPatient = patientDirectory.getPatient(person.getFirstName());
                    newPatient.setFirstName(fName);
                    newPatient.setLastName(lName);   
                    newPatient.setPassword(password);
                    newPatient.setMobileNum(mobiNum);
                    newPatient.setEmailAddress(emailId);  
                    newPatient.setCommunity(community);

                    
                    JOptionPane.showMessageDialog(this, "Details Updated");

                    txtFirstName.setText("");
                    txtLastName.setText("");
                    txtEmail.setText("");
                    txtMobile.setText("");
                    txtCommunity.setText("");
                    fldPassword.setText("");
                    fldNewPassword.setText("");
                    fldReType.setText("");

                    
                }else{
                    JOptionPane.showMessageDialog(this, "Passwords didn't match");
                }
                
            }else{
               JOptionPane.showMessageDialog(this, "Please enter correct current password");
                 }
        }
    

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        //String patientName = txtFirstName.getText();
        
            PatientJPanel patientPane = new PatientJPanel(person, personDirectory, patientDirectory, doctorDirectory,encounterHistory, hospitalDirectory,houseDirectory,communityDirectory,cityDirectory, splitPane);
            splitPane.setRightComponent(patientPane);
        

    }//GEN-LAST:event_btnBackActionPerformed

    private void fldReTypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldReTypeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fldReTypeFocusGained

    private void fldReTypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldReTypeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fldReTypeFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPasswordField fldNewPassword;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JPasswordField fldReType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblReType;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobile;
    // End of variables declaration//GEN-END:variables
}