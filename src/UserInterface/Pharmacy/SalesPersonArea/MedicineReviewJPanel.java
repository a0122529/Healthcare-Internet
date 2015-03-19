/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmacy.SalesPersonArea;

import Business.Drug.Drug;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.DrugReview;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshitij
 */
public class MedicineReviewJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private UserAccount ua;
    private Enterprise enterprise;
    private Ecosystem ecosystem;

    /**
     * Creates new form MedicineReviewJPanel
     */
    public MedicineReviewJPanel(JPanel upc, UserAccount ua, Enterprise enterprise, Ecosystem ecosystem) {
        initComponents();
        this.upc = upc;
        this.enterprise = enterprise;
        this.ua = ua;
        this.ecosystem = ecosystem;
        populateReviewTable();
    }

    private void populateReviewTable() {
        DefaultTableModel model = (DefaultTableModel) medicineReviewjTable1.getModel();
        model.setRowCount(0);
        for (WorkRequest newWr : enterprise.getWorkQueue().getWorkRequestList()) {
            if (newWr instanceof DrugReview) {
                DrugReview dr = (DrugReview) newWr;
                for (Drug drug : dr.getDrugDirectory().getDrugList()) {
                    Object[] row = new Object[9];
                    row[0] = dr.getReqId();
                    row[1] = drug.getDrugName();
                    row[2] = drug;
                    row[3] = drug.getDisease().getDiseaseName();
                    row[4] = dr.getSender().getPerson().getName();
                    row[5] = drug.getSideEffects();
                    row[6] = dr.getPharmaceutical();
                    row[7] = dr.getCallBack() == null ? ("No") : (dr.getCallBack());
                    row[8] = dr;
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        medicineReviewjTable1 = new javax.swing.JTable();
        backjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        drugIssuesjTextArea = new javax.swing.JTextArea();
        sendjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(115, 166, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 30)); // NOI18N
        jLabel1.setText("DRUG RESPONSE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 28)); // NOI18N
        jLabel3.setText("Drug Survey for Pharmaceutical");

        medicineReviewjTable1.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        medicineReviewjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Medicine Name", "Medicine Code", "Disease Cure", "Sender", "Safety Issues", "Pharmaceutical Name", "CallBack", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicineReviewjTable1.setRowHeight(26);
        jScrollPane3.setViewportView(medicineReviewjTable1);

        backjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel2.setText("Drug Issues");

        drugIssuesjTextArea.setColumns(20);
        drugIssuesjTextArea.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        drugIssuesjTextArea.setRows(5);
        jScrollPane2.setViewportView(drugIssuesjTextArea);

        sendjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        sendjButton.setText("Send");
        sendjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(691, 691, 691))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(634, 634, 634))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(backjButton)
                .addGap(133, 133, 133)
                .addComponent(jLabel2)
                .addGap(90, 90, 90)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(sendjButton)
                .addContainerGap(320, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendjButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backjButton)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(276, 276, 276))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void sendjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendjButtonActionPerformed
        String issues = drugIssuesjTextArea.getText();
        if (issues.equals("") || issues == null) {
            JOptionPane.showMessageDialog(null, "Please first write drug review to send");
            return;
        }
        int selectedRow = medicineReviewjTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to proceed");
            return;
        }
        DrugReview dr = (DrugReview) medicineReviewjTable1.getValueAt(selectedRow, 8);
        dr.setReviews(issues);
        dr.setStatus("Issue sent");
        dr.setReplied("Yes");
        dr.setReceiver(ua);
        populateReviewTable();
    }//GEN-LAST:event_sendjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JTextArea drugIssuesjTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable medicineReviewjTable1;
    private javax.swing.JButton sendjButton;
    // End of variables declaration//GEN-END:variables
}