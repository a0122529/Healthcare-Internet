/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.DoctorArea;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.AskforPatientRequest;
import Business.WorkRequest.DoctorPatientRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshitij
 */
public class PatientCheckupJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private Ecosystem ecosystem;
    private UserAccount ua;
    private Organization org;
    private Enterprise enterprise;

    /**
     * Creates new form PatientCheckupJPanel
     */
    public PatientCheckupJPanel(JPanel upc, Ecosystem ecosystem, UserAccount ua, Organization org, Enterprise enterprise) {
        initComponents();
        this.upc = upc;
        this.ua = ua;
        this.org = org;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
    }

    private void populatePatientData(Patient patient) {
        DefaultTableModel model = (DefaultTableModel) patientInformationjTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[4];
        row[0] = patient;
        row[1] = patient.getPatientId();
        row[2] = patient.getAge();
        row[3] = patient.getSex();
        model.addRow(row);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchyIdjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientInformationjTable = new javax.swing.JTable();
        searchByIdjTextField = new javax.swing.JTextField();
        backjButton = new javax.swing.JButton();
        patientInformationjLabel = new javax.swing.JLabel();
        patientMedicalHistoryjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        askforpatientjButton = new javax.swing.JButton();
        askForPattext = new javax.swing.JTextField();

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        searchyIdjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        searchyIdjButton.setText("Search");
        searchyIdjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchyIdjButtonActionPerformed(evt);
            }
        });

        patientInformationjTable.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        patientInformationjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Patient ID", "Age", "Sex"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientInformationjTable.setRowHeight(26);
        jScrollPane1.setViewportView(patientInformationjTable);
        if (patientInformationjTable.getColumnModel().getColumnCount() > 0) {
            patientInformationjTable.getColumnModel().getColumn(0).setResizable(false);
            patientInformationjTable.getColumnModel().getColumn(1).setResizable(false);
            patientInformationjTable.getColumnModel().getColumn(2).setResizable(false);
            patientInformationjTable.getColumnModel().getColumn(3).setResizable(false);
        }

        searchByIdjTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        backjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        patientInformationjLabel.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        patientInformationjLabel.setText("PATIENT INFORMATION");

        patientMedicalHistoryjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        patientMedicalHistoryjButton.setText("Patient Medical History");
        patientMedicalHistoryjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientMedicalHistoryjButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel1.setText("Search Patient By Id");

        askforpatientjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        askforpatientjButton.setText("Ask for patient");
        askforpatientjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                askforpatientjButtonActionPerformed(evt);
            }
        });

        askForPattext.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        askForPattext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                askForPattextActionPerformed(evt);
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
                        .addGap(473, 473, 473)
                        .addComponent(patientInformationjLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(backjButton)
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(askForPattext)
                            .addComponent(askforpatientjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchByIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patientMedicalHistoryjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchyIdjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(patientInformationjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton)
                    .addComponent(patientMedicalHistoryjButton)
                    .addComponent(askforpatientjButton))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(askForPattext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchByIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(searchyIdjButton)
                .addContainerGap(286, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientMedicalHistoryjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientMedicalHistoryjButtonActionPerformed
        int selectedRow = patientInformationjTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row to proceed further");
            return;
        }
        Patient patient = (Patient) patientInformationjTable.getValueAt(selectedRow, 0);
        if (patient != null) {
            PatientMedicalHistoryJPanel panel = new PatientMedicalHistoryJPanel(upc, patient, org, ua, enterprise, ecosystem);
            upc.add("Patientcheckup", panel);
            CardLayout layout = (CardLayout) upc.getLayout();
            layout.next(upc);
        }
    }//GEN-LAST:event_patientMedicalHistoryjButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        upc.remove(this);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.previous(upc);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void searchyIdjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchyIdjButtonActionPerformed
        int id = 0;
        try {
            id = Integer.parseInt(searchByIdjTextField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter correct patient Id");
            return;
        }
        if(id == 0){
            JOptionPane.showMessageDialog(null, "Please enter some id to search first");
            return;
        }
        if(id<0){
            JOptionPane.showMessageDialog(null, "Please enter some valid id to search first");
            return;
        }
        Patient patient = enterprise.getPersonDirectory().getPatientDirectory().searchPatient(id);
        if(patient == null ) {
            JOptionPane.showMessageDialog(null, "No patient found, please search out patient data at some other hospital");
            return; 
        }
        if (patient != null) {
            populatePatientData(patient);
        }
    }//GEN-LAST:event_searchyIdjButtonActionPerformed

    private void askForPattextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_askForPattextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_askForPattextActionPerformed

    private void askforpatientjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_askforpatientjButtonActionPerformed
         int info = 0;
         try {
               info = Integer.parseInt(askForPattext.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Please enter patient medical number or patient ID");
            return;
        }
        if(info<0){
            JOptionPane.showMessageDialog(null, "Please enter some valid id to send the request");
            return;
        }
        
          Boolean result = enterprise.getPersonDirectory().getPatientDirectory().searchIfPresentinSame(info);
        if(result == true){
            JOptionPane.showMessageDialog(null, "Patient has been treated in the same hospital before, no need to send the request anywhere");
            return;
        }
      
        AskforPatientRequest afp = new AskforPatientRequest();
            afp.setPatId(info);
            afp.setStatus("sent");
            afp.setMessage("give patient info");
            afp.setOrgName(enterprise.getName());
            afp.setCity(enterprise.getLocation().getCity());
            afp.setSender(ua);
        for (Network network : ecosystem.getNetworkLst()) {
            for (Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise1.getEnterpriseType().getValue().equals("Hospital")
                        || enterprise1.getEnterpriseType().getValue().equals("Clinic")) {
                    if (enterprise1.getOrgId() != enterprise.getOrgId()) {
                        enterprise1.getWorkQueue().getWorkRequestList().add(afp);
                       
                    }
                }
            }
        }
         JOptionPane.showMessageDialog(null, "Your request has been sent to other hospitals");
//    }                                                     

    }//GEN-LAST:event_askforpatientjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField askForPattext;
    private javax.swing.JButton askforpatientjButton;
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patientInformationjLabel;
    private javax.swing.JTable patientInformationjTable;
    private javax.swing.JButton patientMedicalHistoryjButton;
    private javax.swing.JTextField searchByIdjTextField;
    private javax.swing.JButton searchyIdjButton;
    // End of variables declaration//GEN-END:variables
}
