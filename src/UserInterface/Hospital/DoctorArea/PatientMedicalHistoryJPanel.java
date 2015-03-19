/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.DoctorArea;

import Business.Disease.Disease;
import Business.Drug.Drug;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.MedicalHistory.VitalSignCheck;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.SalesWorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshitij
 */
public class PatientMedicalHistoryJPanel extends javax.swing.JPanel {
    
    private JPanel upc;
    private Patient patient;
    private Organization org;
    private UserAccount ua;
    private Enterprise enterprise;
    private Date tDate;
    private Ecosystem ecosystem;

    /**
     * Creates new form PatientMedicalHistoryJPanel
     */
    public PatientMedicalHistoryJPanel(JPanel upc, Patient patient, Organization org, UserAccount ua, Enterprise enterprise, Ecosystem ecosystem) {
        initComponents();
        this.upc = upc;
        this.patient = patient;
        this.org = org;
        this.ua = ua;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        populatePatientMedHistory();
        populateDiseaseComboBx();
        primaryDoctorjTextField.setText(patient.getPrimaryDoc());
        primaryDoctorjTextField.setEnabled(false);
        populatePharmacyCombo();
    }
    
    public PatientMedicalHistoryJPanel(JPanel upc, Patient patient, UserAccount ua, Enterprise enterprise, Ecosystem ecosystem) {
        initComponents();
        this.upc = upc;
        this.patient = patient;
        this.ua = ua;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        populatePatientMedHistory();
        populateDiseaseComboBx();
        primaryDoctorjTextField.setText(patient.getPrimaryDoc());
        primaryDoctorjTextField.setEnabled(false);
        populatePharmacyCombo();
    }
    
    private void populatePatientMedHistory() {
        DefaultTableModel model = (DefaultTableModel) medicalHistoryTablejTable.getModel();
        model.setRowCount(0);
        for (VitalSignCheck vsc : patient.getVitalCheckHistory().getVitalCheckList()) {
            Object[] row = new Object[11];
            row[0] = vsc.getVitalHistId();
            row[1] = vsc.getDisease().getDiseaseName();
            row[2] = vsc.getDisease().getSymptoms();
            row[3] = vsc.getDrug();
            row[4] = vsc.getDateAttended();
            row[5] = vsc;
            row[6] = vsc.getAttendantName();
            row[7] = vsc.getAttendantId();
            row[8] = vsc.getHealthCareName();
            row[9] = patient.getPrimaryDoc();
            row[10] = patient.getPrimaryDocId();
            model.addRow(row);
        }
    }

    public void populateDrugComboBox(String disease) {
        drugjComboBox.removeAllItems();
        for (Drug drug : ecosystem.getDrugDirectory().getDrugList()) {       
            if(drug.getStatus() == null) {
            } else if (drug.getDisease().getDiseaseName().equals(disease)) {
                if (drug.getStatus().equals("Approved")) {
                    drugjComboBox.addItem(drug);
                }
            }
        }
    }
//    public void populateDrugComboBox(String disease) {
//        drugjComboBox.removeAllItems();
//        for (Network network : ecosystem.getNetworkLst()) {
//            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
//                for (Drug drug : enterprise.getDrugDirectory().getDrugList()) {
//                    if (drug.getStatus().equals("Approved")) {
//                        drugjComboBox.addItem(drug);
//                    }
//                }
//            }
//        }   
//    }
    
    private void populatePharmacyCombo() {
        pharmacyjComboBox.removeAllItems();
        for (Network network : ecosystem.getNetworkLst()) {
            for (Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise1.getEnterpriseType().getValue().equals("Pharmacy")) {
                    if (enterprise1.getLocation().getCity().equals(enterprise.getLocation().getCity())) {
                        pharmacyjComboBox.addItem(enterprise1);
                    }
                }
            }
        }
        
    }
    
    public void populateDiseaseComboBx() {
        diseasejComboBox.removeAllItems();
        diseasejComboBox.addItem(Disease.Asthma);
        diseasejComboBox.addItem(Disease.Hepatitis);
        diseasejComboBox.addItem(Disease.Cholera);
        diseasejComboBox.addItem(Disease.Ebola);
        diseasejComboBox.addItem(Disease.Leprosy);
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
        medicalHistoryTablejTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        diseasejComboBox = new javax.swing.JComboBox();
        symptomsjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addCheckupjButton = new javax.swing.JButton();
        removejButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        statusjTextField = new javax.swing.JTextField();
        drugjComboBox = new javax.swing.JComboBox();
        labReportjButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        primaryDoctorjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        medQuantityjTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pharmacyjComboBox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        pickDrugsjButton = new javax.swing.JButton();
        referjButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        medicalHistoryTablejTable.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        medicalHistoryTablejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vital Id", "Disease", "Symptoms", "Medication", "Date Attended", "Status", "Attendant Name", "Attendant ID", "Hopital/Clinic name", "Primary Doctor", "Primary Doc  Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicalHistoryTablejTable.setRowHeight(26);
        jScrollPane1.setViewportView(medicalHistoryTablejTable);
        if (medicalHistoryTablejTable.getColumnModel().getColumnCount() > 0) {
            medicalHistoryTablejTable.getColumnModel().getColumn(0).setResizable(false);
            medicalHistoryTablejTable.getColumnModel().getColumn(1).setResizable(false);
            medicalHistoryTablejTable.getColumnModel().getColumn(2).setResizable(false);
            medicalHistoryTablejTable.getColumnModel().getColumn(3).setResizable(false);
            medicalHistoryTablejTable.getColumnModel().getColumn(4).setResizable(false);
            medicalHistoryTablejTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel1.setText("PATIENT MEDICAL HISTORY");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel2.setText("Disease");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel3.setText("Symptoms");

        diseasejComboBox.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        diseasejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseasejComboBoxActionPerformed(evt);
            }
        });

        symptomsjTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel4.setText("Drug");

        addCheckupjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        addCheckupjButton.setText("Add checkup(+)");
        addCheckupjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCheckupjButtonActionPerformed(evt);
            }
        });

        removejButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        removejButton.setText("Remove");
        removejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removejButtonActionPerformed(evt);
            }
        });

        backjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel5.setText("Status");

        statusjTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        drugjComboBox.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        labReportjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        labReportjButton.setText("Lab Report");
        labReportjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labReportjButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel8.setText("PATIENT CHECKUP");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel6.setText("Primary Doctor");

        primaryDoctorjTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel7.setText("No of pills");

        medQuantityjTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel9.setText("Pharmacy");

        pharmacyjComboBox.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel10.setText("Drug PickUp");

        pickDrugsjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        pickDrugsjButton.setText("Pick Drugs");
        pickDrugsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickDrugsjButtonActionPerformed(evt);
            }
        });

        referjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        referjButton.setText("Refer to Other Doctor");
        referjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referjButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jButton1.setText("Nurse Tasks");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(772, 772, 772)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(pickDrugsjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(backjButton)))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pharmacyjComboBox, 0, 182, Short.MAX_VALUE)
                                    .addComponent(medQuantityjTextField))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(916, 916, 916)
                                        .addComponent(drugjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(247, 247, 247)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(88, 88, 88)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(statusjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addComponent(jLabel5))
                                                        .addGap(147, 147, 147)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel3)
                                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(addCheckupjButton)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(222, 222, 222)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6)
                                                .addGap(84, 84, 84)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(symptomsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(primaryDoctorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(referjButton)
                                .addGap(163, 163, 163)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labReportjButton)
                                .addGap(145, 145, 145)
                                .addComponent(removejButton)
                                .addGap(102, 102, 102)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(85, 85, 85))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pharmacyjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(97, 97, 97)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(statusjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(symptomsjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(medQuantityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labReportjButton)
                                .addComponent(removejButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(backjButton)
                                    .addComponent(referjButton)
                                    .addComponent(jButton1))))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(primaryDoctorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(drugjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCheckupjButton)
                    .addComponent(pickDrugsjButton))
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        upc.remove(this);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.previous(upc);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void addCheckupjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCheckupjButtonActionPerformed
        tDate = new Date();
        String diseaseName = (String) diseasejComboBox.getSelectedItem();
        String symptoms = symptomsjTextField.getText();
        Drug drug = (Drug) drugjComboBox.getSelectedItem();
        String status = statusjTextField.getText();
        String attName = ua.getPerson().getName();
        int attId = ua.getPerson().getPersonId();
        String healthCareName = enterprise.getName();
        String attendantName = ua.getPerson().getName();
        int attendantId = ua.getPerson().getPersonId();
        
        if (symptoms.equals("") || status.equals("")) {
            JOptionPane.showMessageDialog(null, " Symptoms and status are mandatory fields. Please insert values in all of them ");
            return;
        }
        
        patient.getVitalCheckHistory().addvitalCheck(diseaseName, symptoms, drug,
                tDate, status, attName, attId, healthCareName);
        populatePatientMedHistory();
        

    }//GEN-LAST:event_addCheckupjButtonActionPerformed

    private void removejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removejButtonActionPerformed
        int selectedRow = medicalHistoryTablejTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to remove");
            return;
        }
        VitalSignCheck vsc = (VitalSignCheck) medicalHistoryTablejTable.getValueAt(selectedRow, 0);
        patient.getVitalCheckHistory().getVitalCheckList().remove(vsc);
        populatePatientMedHistory();

    }//GEN-LAST:event_removejButtonActionPerformed

    private void diseasejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseasejComboBoxActionPerformed
        String disease = (String) diseasejComboBox.getSelectedItem();
        populateDrugComboBox(disease);
    }//GEN-LAST:event_diseasejComboBoxActionPerformed

    private void labReportjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labReportjButtonActionPerformed
        
        LabReportRequest panel = new LabReportRequest(upc, patient, ua, enterprise);
        upc.add("DocWorkReq", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_labReportjButtonActionPerformed

    private void pickDrugsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickDrugsjButtonActionPerformed
        int noOfpills = 0;
        try {
            noOfpills = Integer.parseInt(medQuantityjTextField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter correct no of pills to pick ");
            return;
        }
        if (noOfpills < 0) {
            JOptionPane.showMessageDialog(null, "Please enter valid no of pills");
            return;
        }
        
        int selectedRow = medicalHistoryTablejTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to add drug name");
            return;
        }
        VitalSignCheck vsc = (VitalSignCheck) medicalHistoryTablejTable.getValueAt(selectedRow, 5);
        Enterprise pharmacy = (Enterprise) pharmacyjComboBox.getSelectedItem();
        Drug drug = (Drug) medicalHistoryTablejTable.getValueAt(selectedRow, 3);
        SalesWorkRequest swr = new SalesWorkRequest();
        swr.setDrugs(drug);
        swr.setPatient(patient);
        swr.setPrescribedBy(ua.getPerson().getName());
        swr.setQuantity(noOfpills);
        swr.setDisease(vsc.getDisease().getDiseaseName());
        swr.setHealthcareName(enterprise.getName());
        swr.setHealtcareID(enterprise.getOrgId());
        pharmacy.getWorkQueue().getWorkRequestList().add(swr);
        JOptionPane.showMessageDialog(null, "Prescription has been sent to the "
                + pharmacy + ". Patient " + patient.getName()
                + " can pick the product from the pharmacy. ");
    }//GEN-LAST:event_pickDrugsjButtonActionPerformed

    private void referjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referjButtonActionPerformed
        ReferToAnotherDocJPanel panel = new ReferToAnotherDocJPanel(upc, ua, enterprise, patient, ecosystem);
        upc.add("DocWorkReq", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_referjButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NurseTaskReportJPanel panel = new NurseTaskReportJPanel(upc, ua, enterprise, patient);
        upc.add("DocWorkReq", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCheckupjButton;
    private javax.swing.JButton backjButton;
    private javax.swing.JComboBox diseasejComboBox;
    private javax.swing.JComboBox drugjComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton labReportjButton;
    private javax.swing.JTextField medQuantityjTextField;
    private javax.swing.JTable medicalHistoryTablejTable;
    private javax.swing.JComboBox pharmacyjComboBox;
    private javax.swing.JButton pickDrugsjButton;
    private javax.swing.JTextField primaryDoctorjTextField;
    private javax.swing.JButton referjButton;
    private javax.swing.JButton removejButton;
    private javax.swing.JTextField statusjTextField;
    private javax.swing.JTextField symptomsjTextField;
    // End of variables declaration//GEN-END:variables
}
