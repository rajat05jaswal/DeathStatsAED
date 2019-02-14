/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.GovernmentRole;

import Business.DeadPerson.DeadPerson;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Karan
 */
public class CalculateAmountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeathPersonDetails
     */
     private JPanel container;
    private EcoSystem business;
    private Organization organization;
    private UserAccount account;
    private DeadPerson dp;
    public CalculateAmountJPanel(JPanel container, Organization organization, UserAccount account, EcoSystem business, DeadPerson dp) {
        initComponents();
        this.container=container;
        this.organization = organization;
        this.account = account;
        this.business = business;
        this.dp = dp;
        
        populateData();
    }

    private void populateData(){
       dependentTextField.setText(String.valueOf(dp.getNoOfDependents()));
       ageTextField.setText(String.valueOf(dp.getAge()));
       incomeTextField.setText(String.valueOf(dp.getMonthlySalary()));
       idTextField.setText(String.valueOf(dp.getID()));
       
       
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
        idTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        dependentTextField = new javax.swing.JTextField();
        incomeTextField = new javax.swing.JTextField();
        CalcBtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Calculate Amount");

        jLabel2.setText("ID:");

        jLabel3.setText("Age:");

        jLabel4.setText("Dependents:");

        jLabel5.setText("Income:");

        idTextField.setEditable(false);
        idTextField.setEnabled(false);

        ageTextField.setEditable(false);
        ageTextField.setEnabled(false);
        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        dependentTextField.setEditable(false);
        dependentTextField.setEnabled(false);
        dependentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dependentTextFieldActionPerformed(evt);
            }
        });

        incomeTextField.setEditable(false);
        incomeTextField.setEnabled(false);
        incomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeTextFieldActionPerformed(evt);
            }
        });

        CalcBtn.setBackground(new java.awt.Color(102, 102, 255));
        CalcBtn.setText("Calculate");
        CalcBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CalcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcBtnActionPerformed(evt);
            }
        });

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/DeathCertificateCheckerRole/back.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ageTextField)
                            .addComponent(dependentTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(incomeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(CalcBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dependentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(incomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dependentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dependentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dependentTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void incomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeTextFieldActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_incomeTextFieldActionPerformed

    private void CalcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcBtnActionPerformed
        // TODO add your handling code here:
       int dependent = Integer.parseInt(dependentTextField.getText());
       int age = Integer.parseInt(ageTextField.getText());
       double income = Double.parseDouble(incomeTextField.getText());
       int amount =0;
         if(dependent<0) 
       {
           amount = 0;
           dp.setamountAssigned(0);
       }
       if(income>50000) {
          amount = 0;
            dp.setamountAssigned(0);
       }
       if(dependent==0) {
           amount = 0;
            dp.setamountAssigned(0);
       }
       if(dependent>0&&age<40) {
           amount = 20000;
            dp.setamountAssigned(20000);
       }
       if(dependent>0&&age>40&&age<50) {
           amount = 10000;
            dp.setamountAssigned(10000);
       }
       if(dependent>0&&age>50) {
         amount = 5000;
            dp.setamountAssigned(5000);
       }
       dp.setAmountDecided(true);
         JOptionPane.showMessageDialog(null,"Claimed Amount is :"+amount);
    }//GEN-LAST:event_CalcBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        Component[] components = container.getComponents();
        for(Component c :components){
            if(c instanceof ClaimDeathMoneyJPanel){
                ClaimDeathMoneyJPanel manageAirliners = (ClaimDeathMoneyJPanel)c;
                manageAirliners.populateRequestTable();
            }
        }
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcBtn;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField dependentTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JTextField incomeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
