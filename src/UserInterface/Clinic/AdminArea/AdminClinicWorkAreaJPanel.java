/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Clinic.AdminArea;

import UserInterface.Hospital.AdminArea.*;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class AdminClinicWorkAreaJPanel extends javax.swing.JPanel {

    private Ecosystem ecosystem;
    private JPanel upc;
    private Enterprise enterprise;
    private UserAccount ua;

    /**
     * Creates new form HospitalAndClinicWorkAreaJPanel
     */
    public AdminClinicWorkAreaJPanel(JPanel upc, Ecosystem ecosystem, Enterprise enterprise, UserAccount ua) {
        initComponents();
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        this.upc = upc;
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manageOrganizationjButton = new javax.swing.JButton();
        manageEmployeesjButton = new javax.swing.JButton();
        managePetientjButton = new javax.swing.JButton();
        manageUserAccountjButton = new javax.swing.JButton();
        manageRequestsjButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 30)); // NOI18N
        jLabel1.setText("CLINIC ADMIN WORK AREA");

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

        managePetientjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        managePetientjButton.setText("Manage Patient");
        managePetientjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePetientjButtonActionPerformed(evt);
            }
        });

        manageUserAccountjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        manageUserAccountjButton.setText("Manage User Accounts");
        manageUserAccountjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountjButtonActionPerformed(evt);
            }
        });

        manageRequestsjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        manageRequestsjButton.setText("Patient Data Reply");
        manageRequestsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRequestsjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(455, 455, 455)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageEmployeesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageOrganizationjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(managePetientjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageUserAccountjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageRequestsjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(567, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(163, 163, 163)
                .addComponent(manageOrganizationjButton)
                .addGap(149, 149, 149)
                .addComponent(manageEmployeesjButton)
                .addGap(166, 166, 166)
                .addComponent(manageUserAccountjButton)
                .addGap(136, 136, 136)
                .addComponent(managePetientjButton)
                .addGap(160, 160, 160)
                .addComponent(manageRequestsjButton)
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationjButtonActionPerformed
        ManageOrganizationJPanel panel = new ManageOrganizationJPanel(upc, enterprise, ecosystem);
        upc.add("HospClinicAdmin", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_manageOrganizationjButtonActionPerformed

    private void managePetientjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePetientjButtonActionPerformed
        ManagePatientJPanel panel = new ManagePatientJPanel(upc,enterprise, ecosystem);
        upc.add("HospClinicAdmin", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_managePetientjButtonActionPerformed

    private void manageEmployeesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeesjButtonActionPerformed
        ManageEmployeesJPanel panel = new ManageEmployeesJPanel(upc, enterprise);
        upc.add("HospClinicAdmin", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_manageEmployeesjButtonActionPerformed

    private void manageUserAccountjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountjButtonActionPerformed
         ManageUserAccount panel = new ManageUserAccount(upc, enterprise.getOrganizationDirectory(), ecosystem);
        upc.add("HospClinicAdmin", panel);
        CardLayout layout =  (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_manageUserAccountjButtonActionPerformed

    private void manageRequestsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRequestsjButtonActionPerformed
        ManageRequestsJPanel panel = new ManageRequestsJPanel(upc, enterprise, ua);
        upc.add("ClinicAdmin", panel);
        CardLayout layout =  (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_manageRequestsjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeesjButton;
    private javax.swing.JButton manageOrganizationjButton;
    private javax.swing.JButton managePetientjButton;
    private javax.swing.JButton manageRequestsjButton;
    private javax.swing.JButton manageUserAccountjButton;
    // End of variables declaration//GEN-END:variables
}