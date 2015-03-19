/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.DoctorArea;

import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.DoctorPatientRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshitij
 */
public class ViewPatientDataReqJPanel extends javax.swing.JPanel {
    private JPanel upc;
    private UserAccount ua;
    private Patient patient;
    /** 
     * Creates new form ViewPatientDataReqJPanel
     */
    public ViewPatientDataReqJPanel(JPanel upc, UserAccount ua, Patient patient) {
        initComponents();
        this.ua = ua;
        this.upc = upc;
        this.patient = patient;
        populateRequestedData();
    }

    
    private void populateRequestedData(){
        DefaultTableModel model = (DefaultTableModel) patientInfojTable.getModel();
        model.setRowCount(0);
        for(WorkRequest wr : ua.getWorkQueue().getWorkRequestList()){
            if(wr instanceof DoctorPatientRequest){
                DoctorPatientRequest dpr  = (DoctorPatientRequest) wr;
                if(dpr.getPatient().getPatientId() == patient.getPatientId()) {
                    Object[] row = new Object[6];
                    row[0] = dpr.getReqId();
                    row[1] = dpr.getPatient().getName();
                    row[2] = dpr.getRespond();
                    row[3] = dpr.getSender().getPerson().getName();
                    row[4] = dpr.getOrganizationName();
                    row[5] = dpr;
                    model.addRow(row);
                }
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
        patientInfojTable = new javax.swing.JTable();
        backjButton = new javax.swing.JButton();
        viewReplyjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        replyReceivedjTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel1.setText("VIEW PATIENT REQUESTED DATA");

        patientInfojTable.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        patientInfojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Patient Name", "Requested Reply", "Sender Name", "Organization Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientInfojTable.setRowHeight(26);
        jScrollPane1.setViewportView(patientInfojTable);

        backjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        viewReplyjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        viewReplyjButton.setText("View Reply");
        viewReplyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReplyjButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel2.setText("Received Reply");

        replyReceivedjTextArea.setColumns(20);
        replyReceivedjTextArea.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        replyReceivedjTextArea.setRows(5);
        jScrollPane2.setViewportView(replyReceivedjTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backjButton)
                                .addGap(224, 224, 224)
                                .addComponent(viewReplyjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel1)))
                .addContainerGap(221, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewReplyjButton)
                    .addComponent(backjButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel2)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
         upc.remove(this);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.previous(upc);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void viewReplyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReplyjButtonActionPerformed
        
        int selectedRow = patientInfojTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first");
            return;
        }
        DoctorPatientRequest dpr = (DoctorPatientRequest) patientInfojTable.getValueAt(selectedRow, 5);
        replyReceivedjTextArea.setText(dpr.getRespond());
        dpr.setStatus("Reply checked");
        populateRequestedData();
    }//GEN-LAST:event_viewReplyjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientInfojTable;
    private javax.swing.JTextArea replyReceivedjTextArea;
    private javax.swing.JButton viewReplyjButton;
    // End of variables declaration//GEN-END:variables
}