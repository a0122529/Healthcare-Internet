/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.AdminArea;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class CreateUserAccount extends javax.swing.JPanel {

    private JPanel upc;
    private OrganizationDirectory orgDir;
    private Ecosystem ecosystem;

    /**
     * Creates new form CreateUserAccount
     */
    public CreateUserAccount(JPanel upc, OrganizationDirectory orgDir, Ecosystem ecosystem) {
        initComponents();
        this.upc = upc;
        this.orgDir = orgDir;
        this.ecosystem = ecosystem;
        populateOrganizationComboBox();
    }
    
    private void populateOrganizationComboBox(){
        organizationOptionjComboBox.removeAllItems();;
        for(Organization org : orgDir.getOrganizationList()){
            organizationOptionjComboBox.addItem(org);
        }
    }
    
    private void populateEmployeeDataComboBox(Organization organization) {
        employeeListjComboBox.removeAllItems();
        for(Employee employee : organization.getPersonDirectory().getEmployeeDirectory().getEmployerList()){
            employeeListjComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization) {
        rolejComboBox.removeAllItems();
        for(Role role : organization.getSupportedRole()){
            rolejComboBox.addItem(role);
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

        organizationOptionjComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        rolejComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordjTextField = new javax.swing.JTextField();
        usernamejTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        createjButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        employeeListjComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        organizationOptionjComboBox.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        organizationOptionjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationOptionjComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel4.setText("Organization Role");

        rolejComboBox.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        rolejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolejComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel1.setText("Organization Option");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel2.setText("Employee");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel3.setText("Username");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel5.setText("Password");

        passwordjTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        usernamejTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 30)); // NOI18N
        jLabel6.setText("EMPLOYEE USER ACCOUNT");

        createjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        createjButton.setText("Create ");
        createjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButtonActionPerformed(evt);
            }
        });

        backjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        employeeListjComboBox.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(backjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(374, 374, 374)
                                    .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(367, 367, 367)
                                    .addComponent(usernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rolejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(employeeListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(250, 250, 250)
                                        .addComponent(organizationOptionjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jLabel6)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(organizationOptionjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(employeeListjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(rolejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102)
                        .addComponent(jLabel3))
                    .addComponent(usernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createjButton)
                    .addComponent(backjButton))
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationOptionjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationOptionjComboBoxActionPerformed
        employeeListjComboBox.removeAllItems();
        rolejComboBox.removeAllItems();
        
        Organization organization = (Organization) organizationOptionjComboBox.getSelectedItem();
        if (organization != null) {
            populateEmployeeDataComboBox(organization);
            populateRoleComboBox(organization);
                   }
    }//GEN-LAST:event_organizationOptionjComboBoxActionPerformed

    private void rolejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolejComboBoxActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
         upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void createjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButtonActionPerformed
        Organization org = (Organization) organizationOptionjComboBox.getSelectedItem();
        Employee emp = (Employee) employeeListjComboBox.getSelectedItem();
        Role role = (Role) rolejComboBox.getSelectedItem();
        String username = usernamejTextField.getText().trim();
        String password = passwordjTextField.getText().trim();
        
          if (org == null || emp == null || username.equals("") || username == null || 
                  password.equals("") || password == null || role == null) {
            JOptionPane.showMessageDialog(null, "Please fill all the details to create admin account");
            return;
        }
          
          String validName = ecosystem.getUcd().validUsernameCheck(username);
        if (validName == (null)) {
            JOptionPane.showMessageDialog(null, "Username already taken, please enter a different username.");
            return;
        }
        
       UserAccount userAccount =  org.getUserAccountDirectory().createUserAccount(username, password, emp, role);
        ecosystem.getUcd().addUsername(username);
        
                
    }//GEN-LAST:event_createjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JButton createjButton;
    private javax.swing.JComboBox employeeListjComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox organizationOptionjComboBox;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JComboBox rolejComboBox;
    private javax.swing.JTextField usernamejTextField;
    // End of variables declaration//GEN-END:variables
}
