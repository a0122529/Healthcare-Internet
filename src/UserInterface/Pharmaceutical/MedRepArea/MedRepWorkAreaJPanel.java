/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmaceutical.MedRepArea;

import Business.Authority.Authority;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MedRepOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class MedRepWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private UserAccount ua;
    private Enterprise enterprise;
    private Organization org;
    private Authority authority;
    private Ecosystem ecosystem;

    /**
     * Creates new form SalesRepWorkAreaJPanel
     */
    public MedRepWorkAreaJPanel(JPanel upc, UserAccount ua, Enterprise enterprise, Organization org, Authority authority, Ecosystem ecosystem) {
        initComponents();
        this.upc = upc;
        this.ua = ua;
        this.org = org;
        this.enterprise = enterprise;
        this.authority = authority;
        this.ecosystem = ecosystem;
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
        approvalRequestjButton = new javax.swing.JButton();
        approvedDrugReviewjButton = new javax.swing.JButton();
        custDrugRespjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel1.setText("MEDICAL REP WORK AREA");

        approvalRequestjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        approvalRequestjButton.setText("Medicine Approval Request");
        approvalRequestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvalRequestjButtonActionPerformed(evt);
            }
        });

        approvedDrugReviewjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        approvedDrugReviewjButton.setText("Approved Drug Survey");
        approvedDrugReviewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedDrugReviewjButtonActionPerformed(evt);
            }
        });

        custDrugRespjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        custDrugRespjButton.setText("Customer Drug Response");
        custDrugRespjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custDrugRespjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(approvedDrugReviewjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(approvalRequestjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custDrugRespjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel1)))
                .addGap(0, 280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(91, 91, 91)
                .addComponent(approvalRequestjButton)
                .addGap(120, 120, 120)
                .addComponent(approvedDrugReviewjButton)
                .addGap(139, 139, 139)
                .addComponent(custDrugRespjButton)
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void approvalRequestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvalRequestjButtonActionPerformed
        MedicineApprovalRequest panel = new MedicineApprovalRequest(upc, enterprise, org, ua, authority, ecosystem);
        upc.add("SupplerRequestPanel", panel);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.next(upc);
    }//GEN-LAST:event_approvalRequestjButtonActionPerformed

    private void approvedDrugReviewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedDrugReviewjButtonActionPerformed
        ApprovedDrugReviewJPanel panel = new ApprovedDrugReviewJPanel(upc, ua,enterprise, ecosystem );
        upc.add("ApprovedDrug", panel);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.next(upc);   
    }//GEN-LAST:event_approvedDrugReviewjButtonActionPerformed

    private void custDrugRespjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custDrugRespjButtonActionPerformed
        CustomerDrugResponseJPanel panel = new CustomerDrugResponseJPanel(upc, ua,enterprise, ecosystem );
        upc.add("ApprovedDrug", panel);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.next(upc);
    }//GEN-LAST:event_custDrugRespjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approvalRequestjButton;
    private javax.swing.JButton approvedDrugReviewjButton;
    private javax.swing.JButton custDrugRespjButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
