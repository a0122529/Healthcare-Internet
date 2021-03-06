/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmaceutical.AdminArea;

import Business.Disease.Disease;
import Business.Drug.Drug;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.WorkRequest.DrugApprovalRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kshitij
 */
public class CreateMedicineJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private Enterprise enterprise;
    private Ecosystem ecosystem;

    /**
     * Creates new form CreateMedicineJPanel
     */
    public CreateMedicineJPanel(JPanel upc, Enterprise enterprise, Ecosystem ecosystem) {
        initComponents();
        this.upc = upc;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        populateDiseaseComboBox();
    }

    public void populateDiseaseComboBox() {
        curediseasejComboBox.removeAllItems();
        curediseasejComboBox.addItem(Disease.Asthma);
        curediseasejComboBox.addItem(Disease.Hepatitis);
        curediseasejComboBox.addItem(Disease.Ebola);
        curediseasejComboBox.addItem(Disease.Leprosy);
        curediseasejComboBox.addItem(Disease.Cholera);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        medicineNamejTextField = new javax.swing.JTextField();
        medicineCodejTextField = new javax.swing.JTextField();
        usesjTextField = new javax.swing.JTextField();
        risksjTextField = new javax.swing.JTextField();
        curediseasejComboBox = new javax.swing.JComboBox();
        createjButton = new javax.swing.JButton();
        backkjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(115, 166, 200));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel1.setText("CREATE  MEDICINE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel2.setText("Medicine Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel3.setText("Medicine Code");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel4.setText("Cure Disease ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel5.setText("Uses");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        jLabel6.setText("Risks");

        medicineNamejTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        medicineCodejTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        usesjTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        usesjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usesjTextFieldActionPerformed(evt);
            }
        });

        risksjTextField.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N

        curediseasejComboBox.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        curediseasejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curediseasejComboBoxActionPerformed(evt);
            }
        });

        createjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        createjButton.setText("Create");
        createjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButtonActionPerformed(evt);
            }
        });

        backkjButton.setFont(new java.awt.Font("Tahoma", 2, 27)); // NOI18N
        backkjButton.setText("<<Back");
        backkjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backkjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(207, 207, 207))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(backkjButton))
                                .addGap(216, 216, 216)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(medicineCodejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(medicineNamejTextField)
                                .addComponent(curediseasejComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usesjTextField)
                                .addComponent(risksjTextField))
                            .addComponent(createjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel1)))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(medicineNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(medicineCodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(curediseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usesjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(risksjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createjButton)
                    .addComponent(backkjButton))
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usesjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usesjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usesjTextFieldActionPerformed

    private void curediseasejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curediseasejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curediseasejComboBoxActionPerformed

    private void createjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButtonActionPerformed
            String medName = medicineNamejTextField.getText();
        String code = medicineCodejTextField.getText();
        String cureDisease = (String) curediseasejComboBox.getSelectedItem();
        String uses = usesjTextField.getText();
        String risks = risksjTextField.getText();
        String pharmaName = enterprise.getName();
        int pharmaId = enterprise.getOrgId();
        if (medName.equals("") || code.equals("") || cureDisease.equals("") || uses.equals("") || risks.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the required fields");
            return;
        }

        Drug drug = enterprise.getDrugDirectory().addDrug(medName, code, risks, uses, cureDisease, pharmaName, pharmaId);
        DrugApprovalRequest dar = new DrugApprovalRequest();
        dar.setStatus("N/A");
        dar.setDrugReqCode(code);
        dar.setCompanyName(enterprise.getName());
        dar.setCompanyId(enterprise.getOrgId());
        dar.getDrugDirectory().getDrugList().add(drug);
        dar.setMessage("Evaluation Required");
        enterprise.getWorkQueue().getWorkRequestList().add(dar);
    }//GEN-LAST:event_createjButtonActionPerformed

    private void backkjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backkjButtonActionPerformed
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
    }//GEN-LAST:event_backkjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backkjButton;
    private javax.swing.JButton createjButton;
    private javax.swing.JComboBox curediseasejComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField medicineCodejTextField;
    private javax.swing.JTextField medicineNamejTextField;
    private javax.swing.JTextField risksjTextField;
    private javax.swing.JTextField usesjTextField;
    // End of variables declaration//GEN-END:variables
}
