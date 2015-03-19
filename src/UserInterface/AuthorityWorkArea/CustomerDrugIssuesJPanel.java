/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AuthorityWorkArea;

import Business.Authority.Authority;
import Business.Drug.Drug;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.DoctorPatientDrugIssueReq;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshitij
 */
public class CustomerDrugIssuesJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private UserAccount ua;
    private Authority authority;
    private DoctorPatientDrugIssueReq dpdi;
    private Ecosystem ecosystem;

    /**
     * Creates new form CustomerDrugIssuesJPanel
     */
    public CustomerDrugIssuesJPanel(JPanel upc, Authority authority, UserAccount ua, Ecosystem ecosystem) {
        initComponents();
        this.upc = upc;
        this.authority = authority;
        this.ua = ua;
        this.ecosystem = ecosystem;
        populateDrugComboBox();
    }

    private void populateDrugComboBox() {
        drugNamejComboBox.removeAllItems();
        for (Drug drug : ecosystem.getDrugDirectory().getDrugList()) {
            if (drug.getStatus() == null) {
            }
            if (drug.getStatus().equals("Approved")) {
                drugNamejComboBox.addItem(drug);
            }
        }
    }

    private void populateDrugIssueTable(Drug drug) {
        DefaultTableModel model = (DefaultTableModel) allmedicineissuejTable.getModel();
        model.setRowCount(0);
        for (WorkRequest wr1 : drug.getWorkQueue().getWorkRequestList()) {
            if (wr1 instanceof DoctorPatientDrugIssueReq) {
                dpdi = (DoctorPatientDrugIssueReq) wr1;
                Object[] row = new Object[9];
                row[0] = dpdi.getReqId();
                row[1] = drug;
                row[2] = dpdi.getSender() == null ? ("N/A") : dpdi.getSender().getPerson().getName();
                row[3] = dpdi.getSafetyIssue();
                row[4] = dpdi.getOrganizationName();
                row[5] = dpdi.getOrganizationId();
                row[6] = dpdi.getCallBack();
                row[7] = dpdi;
                row[8] = dpdi.gettDate();
                model.addRow(row);
                  //  }
                //     }
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
        allmedicineissuejTable = new javax.swing.JTable();
        drugNamejComboBox = new javax.swing.JComboBox();
        backjButton = new javax.swing.JButton();
        viewIssueListjButton = new javax.swing.JButton();
        callbackjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(115, 166, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 30)); // NOI18N
        jLabel1.setText("CUSTOMER RESPONSE ON DRUGS");

        allmedicineissuejTable.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        allmedicineissuejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Medicine Code", "Sender", "Safety Issues", "Organization Name", "Organization Id", "CallBack", "Status", "timstamp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allmedicineissuejTable.setRowHeight(26);
        jScrollPane1.setViewportView(allmedicineissuejTable);

        drugNamejComboBox.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        drugNamejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugNamejComboBoxActionPerformed(evt);
            }
        });

        backjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        viewIssueListjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        viewIssueListjButton.setText("View Issue List");
        viewIssueListjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewIssueListjButtonActionPerformed(evt);
            }
        });

        callbackjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        callbackjButton.setText("ForceCallBack");
        callbackjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callbackjButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel2.setText("Drugs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addGap(71, 71, 71)
                        .addComponent(drugNamejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(backjButton)
                        .addGap(295, 295, 295)
                        .addComponent(viewIssueListjButton)
                        .addGap(213, 213, 213)
                        .addComponent(callbackjButton)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drugNamejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewIssueListjButton)
                    .addComponent(backjButton)
                    .addComponent(callbackjButton))
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void drugNamejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugNamejComboBoxActionPerformed
        Drug drug = (Drug) drugNamejComboBox.getSelectedItem();
        if (drug != null) {
            populateDrugIssueTable(drug);
        }
    }//GEN-LAST:event_drugNamejComboBoxActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void viewIssueListjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewIssueListjButtonActionPerformed
        Drug drug = (Drug) drugNamejComboBox.getSelectedItem();
        if (drug != null) {
            populateDrugIssueTable(drug);
        }
    }//GEN-LAST:event_viewIssueListjButtonActionPerformed

    private void callbackjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callbackjButtonActionPerformed
        int selectedRow = allmedicineissuejTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first");
            return;
        }
        DoctorPatientDrugIssueReq dpidr = (DoctorPatientDrugIssueReq) allmedicineissuejTable.getValueAt(selectedRow, 7);
        Drug drug = (Drug) allmedicineissuejTable.getValueAt(selectedRow, 1);
        if (dpidr.getCallBack().equals("Yes") || dpidr.getStatus().equals("Product Withdrawn")) {
            JOptionPane.showMessageDialog(null, "Drug has been already been removed from the market");
            return;
        } else {
            dpidr.setCallBack("Yes");
            dpidr.setStatus("Product Withdrawn");

            for (Drug drug1 : ecosystem.getDrugDirectory().getDrugList()) {
                if (drug1.getDrugId() == drug.getDrugId()) {
                    drug1.setStatus("Drug Disapproved");
                }
            }
        }

        populateDrugComboBox();
        Drug drug3 = (Drug) drugNamejComboBox.getSelectedItem();
        populateDrugIssueTable(drug3);
    }//GEN-LAST:event_callbackjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allmedicineissuejTable;
    private javax.swing.JButton backjButton;
    private javax.swing.JButton callbackjButton;
    private javax.swing.JComboBox drugNamejComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewIssueListjButton;
    // End of variables declaration//GEN-END:variables
}