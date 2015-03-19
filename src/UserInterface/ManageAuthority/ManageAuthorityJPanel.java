/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAuthority;

import Business.Authority.Authority;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshitij
 */
public class ManageAuthorityJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private Ecosystem ecosystem;

    /**
     * Creates new form ManageAuthorityJPanel
     */
    public ManageAuthorityJPanel(JPanel upc, Ecosystem ecosystem) {
        initComponents();
        this.upc = upc;
        this.ecosystem = ecosystem;
        populateAuthorityList();
    }

    private void populateAuthorityList() {
        DefaultTableModel model = (DefaultTableModel) authorityjTable.getModel();
        model.setRowCount(0);

        Authority authority = ecosystem.getAuthority();
        for (UserAccount ua : authority.getUserAccountDirectory().getUserAccountList()) {
            Object[] row = new Object[6];
            row[0] = authority;
            row[1] = authority.getAuthCode();
            row[2] = authority.getLocation().getCity();
            row[3] = authority.getEmailId();
            row[4] = ua.getUsername();
            row[5] = ua.getPassword();
            model.addRow(row);
            
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        authorityjTable = new javax.swing.JTable();
        createAuthorityjButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        updatejButton = new javax.swing.JButton();
        refreshjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        authorityjTable.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        authorityjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Authority Name", "Authority Code", "Location", "Email Id", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        authorityjTable.setRowHeight(26);
        jScrollPane1.setViewportView(authorityjTable);
        if (authorityjTable.getColumnModel().getColumnCount() > 0) {
            authorityjTable.getColumnModel().getColumn(0).setResizable(false);
            authorityjTable.getColumnModel().getColumn(1).setResizable(false);
            authorityjTable.getColumnModel().getColumn(2).setResizable(false);
            authorityjTable.getColumnModel().getColumn(3).setResizable(false);
            authorityjTable.getColumnModel().getColumn(4).setResizable(false);
            authorityjTable.getColumnModel().getColumn(5).setResizable(false);
        }

        createAuthorityjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        createAuthorityjButton.setText("Create Authority");
        createAuthorityjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAuthorityjButtonActionPerformed(evt);
            }
        });

        backjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        backjButton.setText("<<Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel2.setText("AUTHORITY");

        updatejButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        updatejButton.setText("Update Authority");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        refreshjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        refreshjButton.setText("Refresh");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(664, 664, 664)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(backjButton)
                        .addGap(231, 231, 231)
                        .addComponent(updatejButton)
                        .addGap(189, 189, 189)
                        .addComponent(refreshjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)
                        .addComponent(createAuthorityjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton)
                    .addComponent(updatejButton)
                    .addComponent(refreshjButton)
                    .addComponent(createAuthorityjButton))
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        upc.remove(this);
        CardLayout cardLayout = (CardLayout) upc.getLayout();
        cardLayout.previous(upc);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void createAuthorityjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAuthorityjButtonActionPerformed
        CreateAuthority panel = new CreateAuthority(upc, ecosystem);
        upc.add("CreateAuth", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_createAuthorityjButtonActionPerformed

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        populateAuthorityList();
    }//GEN-LAST:event_refreshjButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        int SelectedRow = authorityjTable.getSelectedRow();
        if (SelectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a authority to update");
            return;
        } else {
            Authority authority = (Authority) authorityjTable.getValueAt(SelectedRow, 0);
            UpdateAuthority panel = new UpdateAuthority(upc, authority);
            upc.add("CreateAuth", panel);
            CardLayout layout = (CardLayout) upc.getLayout();
            layout.next(upc);
        }

    }//GEN-LAST:event_updatejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable authorityjTable;
    private javax.swing.JButton backjButton;
    private javax.swing.JButton createAuthorityjButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshjButton;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables
}