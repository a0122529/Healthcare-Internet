/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.AdminArea;

import Business.Employee.Employee;
import Business.Location.Location;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class UpdateEmployeeData extends javax.swing.JPanel {

    private JPanel upc;
    private Employee emp;

    /**
     * Creates new form UpdateEmployeeData
     */
    public UpdateEmployeeData(JPanel upc, Employee emp) {
        initComponents();
        this.upc = upc;
        this.emp = emp;
        populateEmployeeData();
    }

    private void populateEmployeeData() {
        employeeNamejTextField.setText(emp.getName());
        streetLine1jTextField.setText(emp.getLocation().getStreetLine1());
        streetLine2jTextField.setText(emp.getLocation().getStreetLine2());
        cityjTextField.setText(emp.getLocation().getCity());
        statejTextField.setText(emp.getLocation().getState());
        zipCodejTextField.setText(emp.getLocation().getZipCode());

        employeeNamejTextField.setEnabled(false);
        streetLine1jTextField.setEnabled(false);
        streetLine2jTextField.setEnabled(false);
        cityjTextField.setEnabled(false);
        statejTextField.setEnabled(false);
        zipCodejTextField.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        employeeNamejLabel = new javax.swing.JLabel();
        employeeNamejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        streetLine1jTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        streetLine2jTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cityjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        statejTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        zipCodejTextField = new javax.swing.JTextField();
        updateEmployeejButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        savejButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(115, 166, 200));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 30)); // NOI18N
        jLabel1.setText("UPDATE EMPLOYEE DATA");

        employeeNamejLabel.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        employeeNamejLabel.setText("Employee Name");

        employeeNamejTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel4.setText("Street Line1");

        streetLine1jTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel6.setText("Street Line2");

        streetLine2jTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel5.setText("City");

        cityjTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        cityjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityjTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel7.setText("State");

        statejTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel8.setText("Zip Code");

        zipCodejTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        updateEmployeejButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        updateEmployeejButton.setText("Update Employee");
        updateEmployeejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeejButtonActionPerformed(evt);
            }
        });

        backjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        savejButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        savejButton.setText("Save");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(603, 603, 603)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(zipCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(statejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(streetLine2jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(streetLine1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(employeeNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(306, 306, 306)
                                .addComponent(employeeNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backjButton)
                        .addGap(227, 227, 227)
                        .addComponent(savejButton)
                        .addGap(173, 173, 173)
                        .addComponent(updateEmployeejButton)))
                .addContainerGap(400, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(employeeNamejLabel)
                                            .addComponent(employeeNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(87, 87, 87)
                                        .addComponent(jLabel4))
                                    .addComponent(streetLine1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101)
                                .addComponent(jLabel6))
                            .addComponent(streetLine2jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(statejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zipCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton)
                    .addComponent(savejButton)
                    .addComponent(updateEmployeejButton))
                .addGap(176, 176, 176))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1582, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1212, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cityjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityjTextFieldActionPerformed

    private void updateEmployeejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeejButtonActionPerformed
        employeeNamejTextField.setEnabled(true);
        streetLine1jTextField.setEnabled(true);
        streetLine2jTextField.setEnabled(true);
        cityjTextField.setEnabled(true);
        statejTextField.setEnabled(true);
        zipCodejTextField.setEnabled(true);
    }//GEN-LAST:event_updateEmployeejButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        upc.remove(this);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.previous(upc);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        String name = employeeNamejTextField.getText();
        String street1 = streetLine1jTextField.getText();
        String street2 = streetLine2jTextField.getText();
        String city = cityjTextField.getText();
        String state = statejTextField.getText();
        String zip = zipCodejTextField.getText();

        if (name.equals("") || street1.equals("") || city.equals("") || state.equals("") || zip.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the  required data to update an employee");
            return;
        }

        emp.setName(name);
        Location loc = emp.getLocation();
        loc.setCity(city);
        loc.setStreetLine1(street1);
        loc.setStreetLine2(street2);
        loc.setState(state);
        loc.setZipCode(zip);
        emp.setLocation(loc);
    }//GEN-LAST:event_savejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField cityjTextField;
    private javax.swing.JLabel employeeNamejLabel;
    private javax.swing.JTextField employeeNamejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton savejButton;
    private javax.swing.JTextField statejTextField;
    private javax.swing.JTextField streetLine1jTextField;
    private javax.swing.JTextField streetLine2jTextField;
    private javax.swing.JButton updateEmployeejButton;
    private javax.swing.JTextField zipCodejTextField;
    // End of variables declaration//GEN-END:variables
}