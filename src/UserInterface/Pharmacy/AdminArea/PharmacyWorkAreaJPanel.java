/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmacy.AdminArea;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import UserInterface.Hospital.AdminArea.ManageEmployeesJPanel;
import UserInterface.Hospital.AdminArea.ManageUserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class PharmacyWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel upc;
    private Ecosystem ecosystem;
    private Enterprise enterprise;
    /**
     * Creates new form PharmacyWorkAreaJPanel
     */
    public PharmacyWorkAreaJPanel(JPanel upc, Ecosystem  ecosystem, Enterprise enterprise) {
        initComponents();
        this.upc = upc;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
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
        manageOrganizationjButton = new javax.swing.JButton();
        manageEmployeesjButton = new javax.swing.JButton();
        manageUserAccountsjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel1.setText("PHARMACY ADMIN WORK AREA");

        manageOrganizationjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        manageOrganizationjButton.setText("Manage Organization");
        manageOrganizationjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationjButtonActionPerformed(evt);
            }
        });

        manageEmployeesjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        manageEmployeesjButton.setText("Manage Employees");
        manageEmployeesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeesjButtonActionPerformed(evt);
            }
        });

        manageUserAccountsjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        manageUserAccountsjButton.setText("Manage UserAccount");
        manageUserAccountsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountsjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageUserAccountsjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(manageEmployeesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(manageOrganizationjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1)))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addComponent(manageOrganizationjButton)
                .addGap(118, 118, 118)
                .addComponent(manageEmployeesjButton)
                .addGap(142, 142, 142)
                .addComponent(manageUserAccountsjButton)
                .addContainerGap(322, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeesjButtonActionPerformed
        ManageEmployeesJPanel panel = new ManageEmployeesJPanel(upc, enterprise);
        upc.add("HospClinicAdmin", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_manageEmployeesjButtonActionPerformed

    private void manageOrganizationjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationjButtonActionPerformed
         ManageOrganizationJPanel panel = new ManageOrganizationJPanel(upc, enterprise);
        upc.add("CreateAuth", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_manageOrganizationjButtonActionPerformed

    private void manageUserAccountsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountsjButtonActionPerformed
        ManageUserAccount panel = new ManageUserAccount(upc, enterprise.getOrganizationDirectory(), ecosystem);
        upc.add("HospClinicAdmin", panel);
        CardLayout layout =  (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_manageUserAccountsjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeesjButton;
    private javax.swing.JButton manageOrganizationjButton;
    private javax.swing.JButton manageUserAccountsjButton;
    // End of variables declaration//GEN-END:variables
}
