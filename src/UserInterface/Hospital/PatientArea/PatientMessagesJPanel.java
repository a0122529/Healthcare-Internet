/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.PatientArea;

import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.PatientToPatient;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshitij
 */
public class PatientMessagesJPanel extends javax.swing.JPanel {
        private JPanel upc;
        private UserAccount ua;
    /** 
     * Creates new form PatientRequestJPanel
     */
    public PatientMessagesJPanel(JPanel upc, UserAccount ua) {
        initComponents();
        this.ua = ua;
        this.upc = upc;
        populateMessageTable();
    }

    private void populateMessageTable(){
        DefaultTableModel model = (DefaultTableModel) messagejTable.getModel();
        model.setRowCount(0);
        Patient patient = (Patient) ua.getPerson();
        for(WorkRequest wr : patient.getWorkQueue().getWorkRequestList()){
            if(wr instanceof PatientToPatient){
            PatientToPatient ptop = (PatientToPatient) wr;               
            Object[] row = new Object[2];
            row[0] = ptop;
            row[1] = ptop.getMessage();
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

        patientMessagesReceivedjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messagejTable = new javax.swing.JTable();
        backjButton = new javax.swing.JButton();
        replyjButton = new javax.swing.JButton();
        replyToMessagejLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        replyToMessagejTextField = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        patientMessagesReceivedjLabel.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        patientMessagesReceivedjLabel.setText("RECEIVED MESSAGES");

        messagejTable.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        messagejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender Name", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        messagejTable.setRowHeight(26);
        jScrollPane1.setViewportView(messagejTable);
        if (messagejTable.getColumnModel().getColumnCount() > 0) {
            messagejTable.getColumnModel().getColumn(0).setResizable(false);
            messagejTable.getColumnModel().getColumn(1).setResizable(false);
        }

        backjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        replyjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        replyjButton.setText("Reply");
        replyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replyjButtonActionPerformed(evt);
            }
        });

        replyToMessagejLabel.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        replyToMessagejLabel.setText("Reply Text");

        replyToMessagejTextField.setColumns(20);
        replyToMessagejTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        replyToMessagejTextField.setRows(5);
        jScrollPane2.setViewportView(replyToMessagejTextField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(patientMessagesReceivedjLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(replyToMessagejLabel))
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(replyjButton)))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientMessagesReceivedjLabel)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backjButton)
                        .addGap(42, 42, 42)
                        .addComponent(replyToMessagejLabel))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(replyjButton))
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        upc.remove(this);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.previous(upc);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void replyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replyjButtonActionPerformed
       String reply = replyToMessagejTextField.getText();
       if(reply.equals("") || reply == null){
           JOptionPane.showMessageDialog(null, "Please enter some message to reply first");
           return;
       }
        int selectedRow = messagejTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Select a message to reply back");
            return;
        }
        PatientToPatient ptop1 =  (PatientToPatient) messagejTable.getValueAt(selectedRow, 0);
        Patient patient = (Patient) ptop1.getSender().getPerson();
        PatientToPatient ptop = new PatientToPatient();
        ptop.setSender(ua);
        ptop.setMessage(reply);
        patient.getWorkQueue().getWorkRequestList().add(ptop);
    }//GEN-LAST:event_replyjButtonActionPerformed

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        populateMessageTable();
    }//GEN-LAST:event_refreshjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable messagejTable;
    private javax.swing.JLabel patientMessagesReceivedjLabel;
    private javax.swing.JLabel replyToMessagejLabel;
    private javax.swing.JTextArea replyToMessagejTextField;
    private javax.swing.JButton replyjButton;
    // End of variables declaration//GEN-END:variables
}
