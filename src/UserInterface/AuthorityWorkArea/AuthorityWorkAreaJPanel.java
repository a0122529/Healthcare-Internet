/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AuthorityWorkArea;

import Business.Authority.Authority;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import UserInterface.Pharmaceutical.MedRepArea.CustomerDrugResponseJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class AuthorityWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private Ecosystem ecosystem;
    private Authority authority;
    private UserAccount ua;

    /**
     * Creates new form AuthorityWorkAreaJPanel
     */
    public AuthorityWorkAreaJPanel(JPanel upc, Ecosystem ecosystem, Authority authority, UserAccount ua) {
        initComponents();
        this.upc = upc;
        this.ecosystem = ecosystem;
        this.authority = authority;
        this.ua = ua;
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
        drugAnalysisjButton = new javax.swing.JButton();
        customerIssuesjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(115, 166, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 30)); // NOI18N
        jLabel1.setText("AUTHORITY WORK AREA");

        drugAnalysisjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        drugAnalysisjButton.setText("Pharmaceutical Drug Analysis");
        drugAnalysisjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugAnalysisjButtonActionPerformed(evt);
            }
        });

        customerIssuesjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        customerIssuesjButton.setText("Customer Drug Issues");
        customerIssuesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIssuesjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerIssuesjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drugAnalysisjButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jLabel1)))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(105, 105, 105)
                .addComponent(drugAnalysisjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(customerIssuesjButton)
                .addContainerGap(350, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void drugAnalysisjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugAnalysisjButtonActionPerformed
        DrugAnalysisJPanel panel = new DrugAnalysisJPanel(upc, ecosystem, authority, ua);
        upc.add("DrugAnalysis", panel);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.next(upc);
    }//GEN-LAST:event_drugAnalysisjButtonActionPerformed

    private void customerIssuesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIssuesjButtonActionPerformed
        CustomerDrugIssuesJPanel panel = new CustomerDrugIssuesJPanel(upc, authority, ua, ecosystem);
        upc.add("DrugAnalysis", panel);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.next(upc);
    }//GEN-LAST:event_customerIssuesjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerIssuesjButton;
    private javax.swing.JButton drugAnalysisjButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
