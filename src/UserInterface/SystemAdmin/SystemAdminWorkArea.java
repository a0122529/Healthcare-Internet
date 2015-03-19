/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import UserInterface.ManageUserAccounts.ManageEnterpriseAdminUserAccountJPanel;
import UserInterface.ManageAuthority.ManageAuthorityJPanel;
import UserInterface.ManageEnterprise.ManageNetworkEnterpriseJPanel;
import UserInterface.ManageNetwork.ManageNetworkJPanel;
import Business.Authority.Authority;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author kshitij
 */
public class SystemAdminWorkArea extends javax.swing.JPanel {

    private JPanel upc;
    private Ecosystem ecosystem;

    /**
     * Creates new form SystemAdminWorkArea
     */
    public SystemAdminWorkArea(JPanel upc, Ecosystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.upc = upc;
        populateSystemJTree();
    }

    public void populateSystemJTree() {

        DefaultTreeModel model = (DefaultTreeModel) systemNodejTree.getModel();
        ArrayList<Network> networkList = ecosystem.getNetworkLst();
        Authority authority = ecosystem.getAuthority();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        Network network;
        Enterprise enterprise;
        Organization organization;
        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("States");
        DefaultMutableTreeNode authorities = new DefaultMutableTreeNode("Authority");
        DefaultMutableTreeNode roots = (DefaultMutableTreeNode) model.getRoot();
        roots.insert(networks, 0);
        roots.insert(authorities, 0);
        DefaultMutableTreeNode authorityNode;
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;

        authorityNode = new DefaultMutableTreeNode(authority.getName());
        authorities.insert(authorityNode, 0);
        

        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();
            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        systemNodejTree = new javax.swing.JTree();
        systemAdminWorkAreajPanel = new javax.swing.JPanel();
        systemAdminArea = new javax.swing.JLabel();
        networkNameButton = new javax.swing.JButton();
        networkEnterprisesjButton = new javax.swing.JButton();
        enterpriseAdminAccountjButton = new javax.swing.JButton();
        authorityjButton = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        systemNodejTree.setBackground(new java.awt.Color(115, 166, 200));
        systemNodejTree.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("USA");
        systemNodejTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        systemNodejTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                systemNodejTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(systemNodejTree);

        jPanel1.add(jScrollPane1);

        jSplitPane1.setLeftComponent(jPanel1);

        systemAdminWorkAreajPanel.setBackground(new java.awt.Color(115, 166, 200));
        systemAdminWorkAreajPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        systemAdminArea.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        systemAdminArea.setText("SUPER ADMIN WORK AREA");

        networkNameButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        networkNameButton.setText("Network");
        networkNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkNameButtonActionPerformed(evt);
            }
        });

        networkEnterprisesjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        networkEnterprisesjButton.setText("Network Enterprises");
        networkEnterprisesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkEnterprisesjButtonActionPerformed(evt);
            }
        });

        enterpriseAdminAccountjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        enterpriseAdminAccountjButton.setText("Enterprise Admin User Accounts");
        enterpriseAdminAccountjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseAdminAccountjButtonActionPerformed(evt);
            }
        });

        authorityjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        authorityjButton.setText("Authority");
        authorityjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorityjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout systemAdminWorkAreajPanelLayout = new javax.swing.GroupLayout(systemAdminWorkAreajPanel);
        systemAdminWorkAreajPanel.setLayout(systemAdminWorkAreajPanelLayout);
        systemAdminWorkAreajPanelLayout.setHorizontalGroup(
            systemAdminWorkAreajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminWorkAreajPanelLayout.createSequentialGroup()
                .addGroup(systemAdminWorkAreajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(systemAdminWorkAreajPanelLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addGroup(systemAdminWorkAreajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(networkEnterprisesjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(networkNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterpriseAdminAccountjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorityjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(systemAdminWorkAreajPanelLayout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(systemAdminArea)))
                .addContainerGap(427, Short.MAX_VALUE))
        );
        systemAdminWorkAreajPanelLayout.setVerticalGroup(
            systemAdminWorkAreajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminWorkAreajPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(systemAdminArea)
                .addGap(127, 127, 127)
                .addComponent(networkNameButton)
                .addGap(121, 121, 121)
                .addComponent(networkEnterprisesjButton)
                .addGap(133, 133, 133)
                .addComponent(enterpriseAdminAccountjButton)
                .addGap(132, 132, 132)
                .addComponent(authorityjButton)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(systemAdminWorkAreajPanel);

        add(jSplitPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void networkNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkNameButtonActionPerformed
        ManageNetworkJPanel panel = new ManageNetworkJPanel(upc, ecosystem);
        upc.add("NetworkArea", panel);
        ((CardLayout) upc.getLayout()).next(upc);
    }//GEN-LAST:event_networkNameButtonActionPerformed

    private void systemNodejTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_systemNodejTreeValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_systemNodejTreeValueChanged

    private void networkEnterprisesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkEnterprisesjButtonActionPerformed
        ManageNetworkEnterpriseJPanel panel = new ManageNetworkEnterpriseJPanel(upc, ecosystem);
        upc.add("EnterpriseNetwork", panel);
        ((CardLayout) upc.getLayout()).next(upc);
    }//GEN-LAST:event_networkEnterprisesjButtonActionPerformed

    private void enterpriseAdminAccountjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseAdminAccountjButtonActionPerformed
        ManageEnterpriseAdminUserAccountJPanel panel = new ManageEnterpriseAdminUserAccountJPanel(upc, ecosystem);
        upc.add("EnterpriseNetwork", panel);
        ((CardLayout) upc.getLayout()).next(upc);
    }//GEN-LAST:event_enterpriseAdminAccountjButtonActionPerformed

    private void authorityjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorityjButtonActionPerformed
        ManageAuthorityJPanel panel = new ManageAuthorityJPanel(upc, ecosystem);
        upc.add("AuthorityPanel", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_authorityjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authorityjButton;
    private javax.swing.JButton enterpriseAdminAccountjButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton networkEnterprisesjButton;
    private javax.swing.JButton networkNameButton;
    private javax.swing.JLabel systemAdminArea;
    private javax.swing.JPanel systemAdminWorkAreajPanel;
    private javax.swing.JTree systemNodejTree;
    // End of variables declaration//GEN-END:variables
}
