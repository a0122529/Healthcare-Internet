/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.NurseArea;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    private Enterprise enterprise;
    private JPanel upc;
    private UserAccount ua;
    private Organization organization;

    /**
     * Creates new form NurseWorkAreaJPanel
     */
    public NurseWorkAreaJPanel(JPanel upc, UserAccount ua, Enterprise enterprise, Organization organization) {
        initComponents();
        this.upc = upc;
        this.enterprise = enterprise;
        this.ua = ua;
        this.organization = organization;
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
        patientDoctorRequestedjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(115, 166, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 30)); // NOI18N
        jLabel1.setText("NURSE WORK AREA");

        patientDoctorRequestedjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        patientDoctorRequestedjButton.setText("Patient Doctor Requested");
        patientDoctorRequestedjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDoctorRequestedjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(patientDoctorRequestedjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jLabel1)))
                .addContainerGap(429, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(278, 278, 278)
                .addComponent(patientDoctorRequestedjButton)
                .addContainerGap(469, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientDoctorRequestedjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDoctorRequestedjButtonActionPerformed
        DoctorOrderJPanel panel = new DoctorOrderJPanel(upc, organization, ua);
        upc.add("DocWorkReq", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_patientDoctorRequestedjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton patientDoctorRequestedjButton;
    // End of variables declaration//GEN-END:variables
}