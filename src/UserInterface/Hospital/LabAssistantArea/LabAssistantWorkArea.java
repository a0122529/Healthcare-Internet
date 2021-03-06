/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.LabAssistantArea;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.LabToPatient;
import Business.WorkRequest.PatientLabRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshitij
 */
public class LabAssistantWorkArea extends javax.swing.JPanel {

    private JPanel upc;
    ;
    private Ecosystem ecosystem;
    private UserAccount ua;
    private Organization org;
    private Enterprise enterprise;
    private PatientLabRequest plr;
    private Date date;

    /**
     * Creates new form LabAssistantWorkArea
     */
    public LabAssistantWorkArea(JPanel userProcessContainer, Ecosystem ecosystem,
            UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.ecosystem = ecosystem;
        this.upc = userProcessContainer;
        this.enterprise = enterprise;
        this.org = organization;
        this.ua = account;
        populatePatientToCheck();

    }

    private void populatePatientToCheck() {
        DefaultTableModel model = (DefaultTableModel) patLabReqjTable.getModel();
        model.setRowCount(0);

        for (WorkRequest wr : org.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof PatientLabRequest) {
                plr = (PatientLabRequest) wr;

                Object[] row = new Object[8];
                row[0] = plr.getReqId();
                row[1] = plr.getPatient().getPatientId();
                row[2] = plr.getPatient().getName();
                row[3] = plr.getMessage();
                row[4] = plr.getSender().getPerson().getName();
                row[5] = plr == null ? ("N/A") : plr;
                row[6] = plr.getReceiver() == null ? ("N/A") : plr.getReceiver().getPerson().getName();
                row[7] = plr.getTimeStamp();
                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patLabReqjTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        respRatejTextField = new javax.swing.JTextField();
        heartRatejTextField = new javax.swing.JTextField();
        bloodPressurejTextField = new javax.swing.JTextField();
        backjButton = new javax.swing.JButton();
        submitVitalsjButton = new javax.swing.JButton();
        assignjButton = new javax.swing.JButton();
        refreshjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel1.setText("LAB ASSISTANT WORK AREA");

        patLabReqjTable.setBackground(new java.awt.Color(115, 166, 200));
        patLabReqjTable.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        patLabReqjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Patient Id", "Patient Name", "Patient Tests", "Sender", "Status", "Receiver", "Timestamp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patLabReqjTable.setRowHeight(26);
        jScrollPane1.setViewportView(patLabReqjTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel2.setText("Respiratory Rate");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel3.setText("Heart Rate");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel4.setText("Blood Pressure");

        respRatejTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        heartRatejTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        bloodPressurejTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        backjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        submitVitalsjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        submitVitalsjButton.setText("Submit Vitals");
        submitVitalsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitVitalsjButtonActionPerformed(evt);
            }
        });

        assignjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        assignjButton.setText("Assign ");
        assignjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignjButtonActionPerformed(evt);
            }
        });

        refreshjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        refreshjButton.setText("Refresh");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(assignjButton)
                                    .addGap(345, 345, 345)
                                    .addComponent(refreshjButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(270, 270, 270))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(backjButton)
                                            .addGap(340, 340, 340)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bloodPressurejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(heartRatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(respRatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(submitVitalsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 404, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignjButton)
                    .addComponent(refreshjButton))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(respRatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(heartRatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bloodPressurejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitVitalsjButton)
                    .addComponent(backjButton))
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitVitalsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitVitalsjButtonActionPerformed
        date = new Date();
        int resp = 0, bp = 0, hR = 0;
        
        int selectedRow = patLabReqjTable.getSelectedRow();
        if(selectedRow < 0) {
           JOptionPane.showMessageDialog(null, "Please select a row first ");
           return;
        }
        
        PatientLabRequest plr1 = (PatientLabRequest) patLabReqjTable.getValueAt(selectedRow, 5);
        String rRate = respRatejTextField.getText().trim();
        String bloodPr = bloodPressurejTextField.getText().trim();
        String heartR = heartRatejTextField.getText().trim();
        
        if (rRate == null || bloodPr == null || heartR == null) {
            JOptionPane.showMessageDialog(null, "Please enter some value");
            return;
        }

  
        
        try {
            resp = Integer.parseInt(rRate);
            bp = Integer.parseInt(bloodPr);
            hR = Integer.parseInt(heartR);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid value");
            return;
        }
        
              if(resp <0 || bp <0 || hR <0  ){
            JOptionPane.showMessageDialog(null, "Values doesn't seems to be valid");
            return;
        }
       if (!plr1.getStatus().equals("In-Progress")) {
            JOptionPane.showMessageDialog(null, "Please assign the lab patient request to you first");
            return;                             
        }           
         if(plr1.getStatus().equals("Completed")){
             JOptionPane.showMessageDialog(null, "Patient vital Sign has already been sent");
             return;
         }   
       plr1.setStatus("Completed");
        LabToPatient ltp = new LabToPatient();
        ltp.setSender(ua);
        ltp.setStatus("Completed");
        ltp.setPatient(plr1.getPatient());
        ltp.setBloodPressure(bp);
        ltp.setRespRate(resp);
        ltp.sethRate(hR);
        ltp.setTimeStamp(date);
        ltp.setRequestId(plr1.getReqId());

        plr1.getPatient().getWorkQueue().getWorkRequestList().add(ltp);
        JOptionPane.showMessageDialog(null, "Patient Vital Signs added and sent");
        populatePatientToCheck();

    }//GEN-LAST:event_submitVitalsjButtonActionPerformed

    private void assignjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignjButtonActionPerformed
        int selectedRow = patLabReqjTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to assign to you");
            return;
        }
        PatientLabRequest plr = (PatientLabRequest) patLabReqjTable.getValueAt(selectedRow, 5);

        if(plr.getStatus().equals("Completed")){
            JOptionPane.showMessageDialog(null, "Patient lab report has already been sent.");
            return;
        }
        plr.setReceiver(ua);
        plr.setStatus("In-Progress");
        populatePatientToCheck();
        
        if(plr.getReceiver() == null){
            JOptionPane.showMessageDialog(null, "Please assign the request to you first");
            return;
        }     
    }//GEN-LAST:event_assignjButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        upc.remove(this);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.previous(upc);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        populatePatientToCheck();
    }//GEN-LAST:event_refreshjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignjButton;
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField bloodPressurejTextField;
    private javax.swing.JTextField heartRatejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patLabReqjTable;
    private javax.swing.JButton refreshjButton;
    private javax.swing.JTextField respRatejTextField;
    private javax.swing.JButton submitVitalsjButton;
    // End of variables declaration//GEN-END:variables
}
