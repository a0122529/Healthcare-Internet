/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmaceutical.AdminArea;

import Business.Drug.Drug;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.WorkRequest.DrugApprovalRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshitij
 */
public class ManageMedicineJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private Enterprise enterprise;
    private Ecosystem ecosystem;

    /**
     * Creates new form CreateMedicineJPanel
     */
    public ManageMedicineJPanel(JPanel upc, Enterprise enterprise, Ecosystem ecosystem) {
        initComponents();
        this.upc = upc;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        populateMedicineTable();
    }

        private void populateMedicineTable(){
            DefaultTableModel model = (DefaultTableModel) medicineAreajTable.getModel();
            model.setRowCount(0);
            
            for(Drug drug : enterprise.getDrugDirectory().getDrugList()){
                    Object[] row = new Object[6];
                    row[0] = drug.getDrugName();
                    row[1] = drug;
                    row[2] = drug.getDrugId();
                    row[3] = drug.getDisease().getDiseaseName();
                    row[4] = drug.getUses();
                    row[5] = drug.getSideEffects();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicineAreajTable = new javax.swing.JTable();
        createMedicinejButton = new javax.swing.JButton();
        refreshjButton = new javax.swing.JButton();
        removejButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel1.setText("MANAGE MEDICINE");

        medicineAreajTable.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        medicineAreajTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Medicine Code", "Medicine Id", "Disease Cure", "Uses", "Risks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicineAreajTable.setRowHeight(26);
        jScrollPane1.setViewportView(medicineAreajTable);
        if (medicineAreajTable.getColumnModel().getColumnCount() > 0) {
            medicineAreajTable.getColumnModel().getColumn(0).setResizable(false);
            medicineAreajTable.getColumnModel().getColumn(1).setResizable(false);
            medicineAreajTable.getColumnModel().getColumn(2).setResizable(false);
            medicineAreajTable.getColumnModel().getColumn(3).setResizable(false);
            medicineAreajTable.getColumnModel().getColumn(4).setResizable(false);
            medicineAreajTable.getColumnModel().getColumn(5).setResizable(false);
        }

        createMedicinejButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        createMedicinejButton.setText("Create Medicine");
        createMedicinejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMedicinejButtonActionPerformed(evt);
            }
        });

        refreshjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        refreshjButton.setText("Refresh");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });

        removejButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        removejButton.setText("Remove");
        removejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removejButtonActionPerformed(evt);
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
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(backjButton)
                        .addGap(171, 171, 171)
                        .addComponent(removejButton)
                        .addGap(198, 198, 198)
                        .addComponent(refreshjButton)
                        .addGap(183, 183, 183)
                        .addComponent(createMedicinejButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(616, 616, 616)
                        .addComponent(jLabel1)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshjButton)
                    .addComponent(createMedicinejButton)
                    .addComponent(removejButton)
                    .addComponent(backjButton))
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void createMedicinejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMedicinejButtonActionPerformed
        CreateMedicineJPanel panel = new CreateMedicineJPanel(upc, enterprise, ecosystem);
        upc.add("CreateAuth", panel);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.next(upc);
    }//GEN-LAST:event_createMedicinejButtonActionPerformed

    private void removejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removejButtonActionPerformed
         int selectedRow = medicineAreajTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to remove");
            return;
        }
        Drug drug = (Drug) medicineAreajTable.getValueAt(selectedRow, 1);
        enterprise.getDrugDirectory().getDrugList().remove(drug);
         for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){
             if(wr instanceof DrugApprovalRequest){
                 DrugApprovalRequest dar  = (DrugApprovalRequest) wr;
                 dar.getDrugDirectory().getDrugList().remove(drug);
             }
         }
        populateMedicineTable();
        
    }//GEN-LAST:event_removejButtonActionPerformed

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        populateMedicineTable();
    }//GEN-LAST:event_refreshjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JButton createMedicinejButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable medicineAreajTable;
    private javax.swing.JButton refreshjButton;
    private javax.swing.JButton removejButton;
    // End of variables declaration//GEN-END:variables
}
