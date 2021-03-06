/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAuthority;

import Business.Authority.Authority;
import Business.Employee.Employee;
import Business.Location.Location;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class UpdateAuthority extends javax.swing.JPanel {

    private Authority authority;
    private JPanel upc;

    /**
     * Creates new form UpdateAuthority
     */
    public UpdateAuthority(JPanel upc, Authority authority) {
        initComponents();
        this.upc = upc;
        this.authority = authority;
        populateData();
    }

    private void populateData() {
        authorityNamejTextField.setText(authority.getName());
        locationjTextField.setText(authority.getLocation().getCity());
        emailIdjTextField.setText(authority.getEmailId());

        authorityNamejTextField.setEnabled(false);
        locationjTextField.setEnabled(false);
        emailIdjTextField.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        authorityNamejLabel = new javax.swing.JLabel();
        authorityNamejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        locationjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailIdjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        updatejButton = new javax.swing.JButton();
        savejButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        authorityNamejLabel.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        authorityNamejLabel.setText("Authority Name");

        authorityNamejTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel3.setText("Location");

        locationjTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        locationjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationjTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel4.setText("Email Id");

        emailIdjTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel1.setText("UPDATE AUTHORITY");

        updatejButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        savejButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        savejButton.setText("Save");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });

        backjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(authorityNamejLabel)
                        .addGap(175, 175, 175)
                        .addComponent(authorityNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backjButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(locationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(savejButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updatejButton)))))
                .addGap(0, 291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(87, 87, 87)
                                .addComponent(authorityNamejLabel))
                            .addComponent(authorityNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3))
                    .addComponent(locationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailIdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatejButton)
                    .addComponent(backjButton)
                    .addComponent(savejButton))
                .addContainerGap(161, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void locationjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationjTextFieldActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        upc.remove(this);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.previous(upc);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        authorityNamejTextField.setEnabled(true);
        locationjTextField.setEnabled(true);
        emailIdjTextField.setEnabled(true);
    }//GEN-LAST:event_updatejButtonActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        String authName = authorityNamejTextField.getText();
        String location = locationjTextField.getText();
        String emailId = emailIdjTextField.getText();
        String street1 = "";
        String street2 = "";
        String city = "";
        String state = "";
        String zip = "";
        if (authName == null || authName
                 == null|| location == null || location == null ) {
            JOptionPane.showMessageDialog(null, "Please fill all the details to create an authority");
            return;
        }
        authority.setName(authName);
        authority.setEmailId(emailId);
        Location loc = new Location();
        loc.setState(location);
        authority.setLocation(loc);
        Employee employee = authority.getPersonDirectory().getEmployeeDirectory().createEmployee(authName,street1,
           street2, city, state,zip );
    }//GEN-LAST:event_savejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorityNamejLabel;
    private javax.swing.JTextField authorityNamejTextField;
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField emailIdjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField locationjTextField;
    private javax.swing.JButton savejButton;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables
}
