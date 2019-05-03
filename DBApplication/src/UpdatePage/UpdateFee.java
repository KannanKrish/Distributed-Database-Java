/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpdatePage;

import EntityClasses.Fee;
import EntityClasses.Students;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import managePages.FeeManage;

/**
 *
 * @author Kannan
 */
public class UpdateFee extends javax.swing.JFrame {

    private int studentID;
    private Fee fee;

    /**
     * Creates new form InsertAdmin
     */
    public UpdateFee() {
        initComponents();
    }

    public UpdateFee(int studentID) {
        initComponents();
        this.studentID = studentID;
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("DBApplicationPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        fee = (Fee) em.createNamedQuery("Fee.findByStudentID").setParameter("studentID", studentID).getSingleResult();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        txtAmount.setText(fee.getAmount().toString());
        txtFeeStatus.setText(fee.getFeeStatus());
        txtYear.setText(formatter.format(fee.getYear()));
        cmbSchoolID.setSelectedItem(fee.getSchoolID());
        cmbStudentID.setSelectedItem(fee.getStudentID());
        em.getTransaction().commit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        DBApplicationPUEntityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("DBApplicationPU").createEntityManager();
        schoolsQuery = java.beans.Beans.isDesignTime() ? null : DBApplicationPUEntityManager0.createQuery("SELECT s FROM Schools s");
        schoolsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : schoolsQuery.getResultList();
        studentsQuery = java.beans.Beans.isDesignTime() ? null : DBApplicationPUEntityManager0.createQuery("SELECT s FROM Students s");
        studentsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentsQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        txtFeeStatus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbSchoolID = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbStudentID = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtYear = new javax.swing.JFormattedTextField();

        setTitle("Update Fee");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setText("Fee Status :");

        jLabel2.setText("Amount :");

        jLabel3.setText("Year :");

        jLabel6.setText("Select School ID :");

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${resultList}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, schoolsQuery, eLProperty, cmbSchoolID);
        bindingGroup.addBinding(jComboBoxBinding);

        jLabel7.setText("Select Student ID :");

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${resultList}");
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, studentsQuery, eLProperty, cmbStudentID);
        bindingGroup.addBinding(jComboBoxBinding);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtYear.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtYear.setToolTipText("Enter the format dd/MM/yyyy.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel6))
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbSchoolID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFeeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnBack)
                        .addGap(13, 13, 13)
                        .addComponent(btnClear)
                        .addGap(13, 13, 13)
                        .addComponent(btnUpdate)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSchoolID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFeeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(btnClear)
                    .addComponent(btnUpdate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new FeeManage().show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtFeeStatus.getText().equals("") || txtAmount.getText().equals("") || txtYear.getText().equals("") || cmbStudentID.getSelectedItem().toString().equals("") || cmbSchoolID.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Some field's are missing.", "Warning", 1);
        } else {
            try {
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("DBApplicationPU");
                EntityManager em = emf.createEntityManager();
                fee = em.find(Fee.class, studentID);
                em.getTransaction().begin();
                fee.setAmount(Integer.parseInt(txtAmount.getText()));
                fee.setFeeStatus(txtFeeStatus.getText());
                fee.setSchoolID(Integer.parseInt(cmbSchoolID.getSelectedItem().toString()));
                fee.setStudentID(new Students(Integer.parseInt(cmbStudentID.getSelectedItem().toString())));
                fee.setYear(format.parse(txtYear.getText()));
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Fee's is Updated to database.", "Warning", 1);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Your input data maybe wrong format.", "Warning", 1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Check the student already exists.", "Warning", 1);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtFeeStatus.setText(null);
        txtAmount.setText(null);
        txtYear.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        new FeeManage().show();
    }//GEN-LAST:event_formComponentHidden

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateFee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateFee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager DBApplicationPUEntityManager0;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbSchoolID;
    private javax.swing.JComboBox<String> cmbStudentID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private java.util.List<EntityClasses.Schools> schoolsList;
    private javax.persistence.Query schoolsQuery;
    private java.util.List<EntityClasses.Students> studentsList;
    private javax.persistence.Query studentsQuery;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtFeeStatus;
    private javax.swing.JFormattedTextField txtYear;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}