/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import model.CityDirectory;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.Hospital;
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
public class SystemAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminPanel
     */
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    DoctorDirectory doctorDirectory;
    EncounterHistory encounterHistory;
    HospitalDirectory hospitalDirectory;
    HouseDirectory houseDirectory;
    CommunityDirectory communityDirectory;
    CityDirectory cityDirectory;
    
    Hospital selectedHospital;
    Person person;
    JSplitPane splitPane;
    Person selectedPerson;
    Doctor selectedDoctor = null;
    Patient selectedPatient = null;
    String hospitalName = "";
    Date encounterDate;
    
    public SystemAdminPanel(Person person,PersonDirectory personDirectory, PatientDirectory patientDirectory, DoctorDirectory doctorDirectory,EncounterHistory encounterHistory,HospitalDirectory hospitalDirectory,HouseDirectory houseDirectory,CommunityDirectory communityDirectory, CityDirectory cityDirectory,JSplitPane splitPane) {
        initComponents();
        this.person = person;
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
        this.encounterHistory = encounterHistory;
        this.hospitalDirectory = hospitalDirectory;
        this.communityDirectory = communityDirectory;
        this.cityDirectory = cityDirectory;
        this.houseDirectory = houseDirectory;
        this.splitPane = splitPane;
        
        createEncounterPanel.setVisible(false);
        updatePanel.setVisible(false);
        btnViewUpdate.setVisible(false);
        hospitalPanel.setVisible(false);
        chEncounterDate.setMinSelectableDate(new Date());
        
        populatePatients();
        populateDoctors();
        populateHospitals();
        
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
        tblDoctors = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHospitals = new javax.swing.JTable();
        btnViewUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCreateUser = new javax.swing.JButton();
        btnHospital = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblEncounters = new javax.swing.JTable();
        btnCreateEncounter = new javax.swing.JButton();
        createEncounterPanel = new javax.swing.JPanel();
        chEncounterDate = new com.toedter.calendar.JDateChooser();
        lblDate = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        btnCreate = new javax.swing.JButton();
        updatePanel = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblMobile = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        txtHospital = new javax.swing.JTextField();
        lblHospital = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        hospitalPanel = new javax.swing.JPanel();
        lblHospitalName = new javax.swing.JLabel();
        lblHospitalCommunity = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        txtHospitalCommunity = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        btnCreateNewHospital = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDoctors.setBackground(new java.awt.Color(255, 255, 204));
        tblDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor", "Hospital"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoctorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoctors);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 55, 251, 176));

        tblPatients.setBackground(new java.awt.Color(255, 255, 204));
        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPatients);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 55, 251, 176));

        tblHospitals.setBackground(new java.awt.Color(255, 255, 204));
        tblHospitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHospitals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHospitalsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblHospitals);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 55, 251, 176));

        btnViewUpdate.setText("View/Update Details");
        btnViewUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUpdateActionPerformed(evt);
            }
        });
        add(btnViewUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 241, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 241, -1, -1));

        btnCreateUser.setText("Create New User");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });
        add(btnCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 26, 135, -1));

        btnHospital.setText("Create Hospital");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });
        add(btnHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 26, 125, -1));

        tblEncounters.setBackground(new java.awt.Color(255, 255, 204));
        tblEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient", "Encounter", "Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEncounters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEncountersMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblEncounters);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 237, 251, 200));

        btnCreateEncounter.setText("Create Encounter");
        btnCreateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEncounterActionPerformed(evt);
            }
        });
        add(btnCreateEncounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 241, -1, -1));

        createEncounterPanel.setBackground(new java.awt.Color(204, 255, 204));
        createEncounterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        createEncounterPanel.add(chEncounterDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 72, 134, -1));

        lblDate.setText("Date");
        createEncounterPanel.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 78, -1, -1));

        lblInfo.setText("Info");
        createEncounterPanel.add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 113, -1, -1));

        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane5.setViewportView(txtInfo);

        createEncounterPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 113, 134, 50));

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        createEncounterPanel.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 193, -1, -1));

        add(createEncounterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 270, 251, 330));

        updatePanel.setBackground(new java.awt.Color(204, 255, 204));
        updatePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFirstName.setText("First Name");
        updatePanel.add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, -1, -1));
        updatePanel.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 17, 140, -1));

        lblLastName.setText("Last Name");
        updatePanel.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, -1, -1));
        updatePanel.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 57, 140, -1));

        lblEmail.setText("Email");
        updatePanel.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, -1, -1));
        updatePanel.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 97, 140, -1));

        lblMobile.setText("Mobile");
        updatePanel.add(lblMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, -1, -1));
        updatePanel.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 137, 140, -1));
        updatePanel.add(txtCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 174, 140, -1));

        lblCommunity.setText("Community");
        updatePanel.add(lblCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 177, -1, -1));
        updatePanel.add(txtHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 208, 140, -1));

        lblHospital.setText("Hospital");
        updatePanel.add(lblHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 211, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        updatePanel.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 249, -1, -1));

        add(updatePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 270, 251, 330));

        hospitalPanel.setBackground(new java.awt.Color(204, 255, 204));
        hospitalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHospitalName.setText("Hospital Name");
        hospitalPanel.add(lblHospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 9, -1, -1));

        lblHospitalCommunity.setText("Community");
        hospitalPanel.add(lblHospitalCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 38, -1, -1));

        lblCity.setText("City");
        hospitalPanel.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 70, -1, -1));
        hospitalPanel.add(txtHospitalName, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 6, 130, -1));
        hospitalPanel.add(txtHospitalCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 35, 130, -1));
        hospitalPanel.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 64, 130, -1));

        btnCreateNewHospital.setText("Create");
        btnCreateNewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewHospitalActionPerformed(evt);
            }
        });
        hospitalPanel.add(btnCreateNewHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 105, -1, -1));

        add(hospitalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 250, 160));

        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("                                            Welcome System Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 520, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        // TODO add your handling code here:
        SignUpJFrame signUp = new SignUpJFrame(person,personDirectory,patientDirectory,doctorDirectory,encounterHistory,hospitalDirectory,houseDirectory, communityDirectory, cityDirectory, splitPane);
        splitPane.setRightComponent(signUp);
        
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnViewUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUpdateActionPerformed
        // TODO add your handling code here:
        updatePanel.setVisible(true);
        
        txtFirstName.setText(selectedPerson.getFirstName());
        txtLastName.setText(selectedPerson.getLastName());
        txtEmail.setText(selectedPerson.getEmailAddress());
        txtMobile.setText(selectedPerson.getMobileNum());
        txtCommunity.setText(selectedPerson.getCommunity());
        if(selectedPerson.getRole().equals("Doctor")){
            txtHospital.setVisible(true);
            lblHospital.setVisible(true);
            txtHospital.setText(selectedDoctor.getHospital());
            
        }
        
    }//GEN-LAST:event_btnViewUpdateActionPerformed

    private void tblDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoctorsMouseClicked
        // TODO add your handling code here:
        
        //btnBookAppointment.setVisible(true);
        int index = tblDoctors.getSelectedRow();
        TableModel model = tblDoctors.getModel();
        
        String doctorFname = model.getValueAt(index, 0).toString();
        selectedPerson = personDirectory.getUser(doctorFname);
        selectedDoctor = doctorDirectory.getDoctor(doctorFname);
        
        btnViewUpdate.setVisible(true);
        tblPatients.clearSelection();
        
        
        try{
           if(!selectedDoctor.equals(null) && !selectedPatient.equals(null)){
            ArrayList<Encounter> encounterList = encounterHistory.searchEncounter(selectedDoctor.getFirstName(), selectedPatient.getUserID());
            populateEncounters(encounterList);
           
        }
        }catch(Exception e){
                
         }

        
       
    }//GEN-LAST:event_tblDoctorsMouseClicked

    private void tblPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientsMouseClicked
        // TODO add your handling code here:
        int index = tblPatients.getSelectedRow();
        TableModel model = tblPatients.getModel();
        
        String patientFname = model.getValueAt(index, 0).toString();
        selectedPerson = personDirectory.getUser(patientFname);
        selectedPatient = patientDirectory.getPatient(patientFname);
        
        btnViewUpdate.setVisible(true);
        txtHospital.setVisible(false);
        lblHospital.setVisible(false);
        tblDoctors.clearSelection();
        
        
        try{
           if(!selectedDoctor.equals(null) && !selectedPatient.equals(null)){
            ArrayList<Encounter> encounterList = encounterHistory.searchEncounter(selectedDoctor.getFirstName(), selectedPatient.getUserID());
            populateEncounters(encounterList);
           
        }
        }catch(Exception e){
                
         }
    }//GEN-LAST:event_tblPatientsMouseClicked

    private void btnCreateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEncounterActionPerformed
        // TODO add your handling code here:
        
        txtInfo.setText("");
        chEncounterDate.setDate(new Date());
        btnCreate.setText("Create");
        
        try{
            if(!selectedDoctor.equals(null) && !selectedPatient.equals(null)){
            createEncounterPanel.setVisible(true);
        }}catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please select Patient and his Doctor to Book Appointment");
        }
        
        
    }//GEN-LAST:event_btnCreateEncounterActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        if(btnCreate.getText().equals("Update")){
            Encounter enc = encounterHistory.getEncounter(chEncounterDate.getDate());
            enc.setEncounterDate(chEncounterDate.getDate());
            enc.setInfo(txtInfo.getText());
            JOptionPane.showMessageDialog(this,"Encounter Updated");
            
        }else{
            Date appointmentdate = chEncounterDate.getDate();
            String info = txtInfo.getText();

            Encounter newEncounter = encounterHistory.addEncounter();
            newEncounter.setEncounterDate(appointmentdate);
            newEncounter.setInfo(info);
            newEncounter.setUserID(selectedPatient.getUserID());
            newEncounter.setDoctorName(selectedDoctor.getFirstName());
            newEncounter.setComments(" ");

            JOptionPane.showMessageDialog(this, "New Appointment created with "+selectedDoctor.getFirstName()+" on "+appointmentdate);
        }
 
        createEncounterPanel.setVisible(false);
        ArrayList<Encounter> encounterList = encounterHistory.searchEncounter(selectedDoctor.getFirstName(), selectedPatient.getUserID());
        populateEncounters(encounterList);
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        if(txtMobile.getText().contains("@") || txtMobile.getText().contains(".com") || txtMobile.getText().length()==10){
            selectedPerson.setFirstName(txtFirstName.getText());
            selectedPerson.setLastName(txtLastName.getText());
            selectedPerson.setEmailAddress(txtEmail.getText());
            selectedPerson.setMobileNum(txtMobile.getText());
            selectedPerson.setCommunity(txtCommunity.getText());

            if(selectedPerson.getRole().equals("Doctor")){
                selectedDoctor.setHospital(txtHospital.getText());
                selectedDoctor.setFirstName(txtFirstName.getText());
                selectedDoctor.setLastName(txtLastName.getText());
                selectedDoctor.setEmailAddress(txtEmail.getText());
                selectedDoctor.setMobileNum(txtMobile.getText());
                selectedDoctor.setCommunity(txtCommunity.getText());

            }else if(selectedPerson.getRole().equals("Patient")){

                selectedPatient.setFirstName(txtFirstName.getText());
                selectedPatient.setLastName(txtLastName.getText());
                selectedPatient.setEmailAddress(txtEmail.getText());
                selectedPatient.setMobileNum(txtMobile.getText());
                selectedPatient.setCommunity(txtCommunity.getText());
            }

            JOptionPane.showMessageDialog(this, "User Updated");
            populatePatients();
            populateDoctors();
            updatePanel.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this, "Please enter valid Email and Mobile");
        }
        

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        // TODO add your handling code here:
        hospitalPanel.setVisible(true);
    }//GEN-LAST:event_btnHospitalActionPerformed

    private void btnCreateNewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewHospitalActionPerformed
        // TODO add your handling code here:
        
        if(btnCreateNewHospital.getText().equals("Update")){
            Hospital hp = hospitalDirectory.getHospital(txtHospitalName.getText());
            
            hp.setHospitalName(txtHospitalName.getText());
            hp.setCity(txtCity.getText());
            hp.setCommunity(txtHospitalCommunity.getText());
            
            JOptionPane.showMessageDialog(this, "Hospital Updated");
            
            populateHospitals();
            btnCreateNewHospital.setText("Create");
        }else if(!hospitalDirectory.isExist(txtHospitalName.getText(),txtHospitalCommunity.getText())){
            
            Hospital hospital = hospitalDirectory.addHospital();
            
            hospital.setHospitalName(txtHospitalName.getText());
            hospital.setCity(txtCity.getText());
            hospital.setCommunity(txtHospitalCommunity.getText());

            JOptionPane.showMessageDialog(this, "Hospital Added");
            populateHospitals();
            btnCreateNewHospital.setText("Create");
            
        }else{
            
            JOptionPane.showMessageDialog(this, "Hospital "+txtHospitalName.getText()+" Alreadt Exist in "+txtHospitalCommunity.getText());
        }
        hospitalPanel.setVisible(false);
        txtHospitalName.setEditable(true);

    }//GEN-LAST:event_btnCreateNewHospitalActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        if(selectedPerson!=null){
            personDirectory.deletePerson(selectedPerson);
            if(selectedPerson.getRole().equals("Patient")){
                patientDirectory.deletePatient(selectedPatient);
                populatePatients();
                
            }else{
                doctorDirectory.deleteDoctor(selectedDoctor);
                populateDoctors();
            }
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Please select Patient/Doctor to delete");
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        model.setRowCount(0);
        
        if(selectedHospital!=null){
            hospitalDirectory.deleteHospital(selectedHospital);
            hospitalName ="";
        }
        
        if(encounterDate!=null){
            encounterHistory.deleteEncounter(encounterHistory.getEncounter(encounterDate));
            encounterDate = null;
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblHospitalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHospitalsMouseClicked
        // TODO add your handling code here:
        int index = tblHospitals.getSelectedRow();
        TableModel model = tblHospitals.getModel();
        
        hospitalName = model.getValueAt(index, 0).toString();
        try{
            selectedHospital = hospitalDirectory.getHospital(hospitalName);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please select Hospital");

        }
        
        
        btnHospital.setVisible(false);
        
        
        hospitalPanel.setVisible(true);
        txtHospitalName.setText(selectedHospital.getHospitalName());
        txtHospitalName.setEditable(false);
        txtHospitalCommunity.setText(selectedHospital.getCommunity());
        txtCity.setText(selectedHospital.getCity());
        
        btnCreateNewHospital.setText("Update");
    }//GEN-LAST:event_tblHospitalsMouseClicked

    private void tblEncountersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEncountersMouseClicked
        // TODO add your handling code here:
        int index = tblEncounters.getSelectedRow();
        TableModel model = tblEncounters.getModel();
        
        encounterDate =(Date) model.getValueAt(index, 1);
        Encounter encounter = encounterHistory.getEncounter(encounterDate);
        
        createEncounterPanel.setVisible(true);
        chEncounterDate.setDate(encounter.getEncounterDate());
        txtInfo.setText(encounter.getInfo());
        
        btnCreate.setText("Update");
        
        
    }//GEN-LAST:event_tblEncountersMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
                SystemAdminPanel admin = new SystemAdminPanel(person,personDirectory,patientDirectory,doctorDirectory,encounterHistory,hospitalDirectory, houseDirectory,communityDirectory,cityDirectory,splitPane);
                splitPane.setRightComponent(admin);

    }//GEN-LAST:event_formMouseClicked

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        LoginJPanel login = new LoginJPanel(personDirectory,patientDirectory,doctorDirectory,encounterHistory,hospitalDirectory,houseDirectory, communityDirectory,cityDirectory,splitPane);
        splitPane.setRightComponent(login);
    }//GEN-LAST:event_btnLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCreateEncounter;
    private javax.swing.JButton btnCreateNewHospital;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewUpdate;
    private com.toedter.calendar.JDateChooser chEncounterDate;
    private javax.swing.JPanel createEncounterPanel;
    private javax.swing.JPanel hospitalPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblHospitalCommunity;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JTable tblDoctors;
    private javax.swing.JTable tblEncounters;
    private javax.swing.JTable tblHospitals;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtHospitalCommunity;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables

    
       private void populateHospitals(){
        //this function is used to populate the items matching the search content
        
        DefaultTableModel model = (DefaultTableModel) tblHospitals.getModel();
        model.setRowCount(0);
        
        for(Hospital hospital: hospitalDirectory.getHospitalDirectory()){
            
            Object[] Row =new Object[2];
            Row[0] = hospital.getHospitalName();
            Row[1] = hospital.getCommunity();
            
            model.addRow(Row);
        }
    }
    
    
       private void populateDoctors(){
        //this function is used to populate the items matching the search content
        
        DefaultTableModel model = (DefaultTableModel) tblDoctors.getModel();
        model.setRowCount(0);
        
        for(Doctor doctor: doctorDirectory.getDoctorDirectory()){
            
            Object[] Row =new Object[2];
            Row[0] = doctor.getFirstName();
            Row[1] = doctor.getHospital();
            
            model.addRow(Row);
        }
    }
    
       private void populatePatients(){
        //this function is used to populate the items matching the search content
        
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);
        
        for(Patient patient: patientDirectory.getPatientDirectory()){
            
            Object[] Row =new Object[2];
            Row[0] = patient.getFirstName();
            Row[1] = patient.getCommunity();
            
            model.addRow(Row);
        }
    }
       
       
       

    
       private void populateEncounters(ArrayList<Encounter> encounterList){
        //this function is used to populate the items matching the search content
        
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        model.setRowCount(0);
        
        for(Encounter encounter: encounterList){
            
            Object[] Row =new Object[3];
            Row[0] = personDirectory.getName(selectedPatient.getUserID());
            Row[1] = encounter.getEncounterDate();
            Row[2] = encounter.getDoctorName();
            
            model.addRow(Row);
        }
    }

}
