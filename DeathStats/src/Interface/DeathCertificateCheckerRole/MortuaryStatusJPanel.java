/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DeathCertificateCheckerRole;

import Business.DeadPerson.DeadPerson;
import Interface.MortuaryRole.*;
import Business.EcoSystem;
import Business.Organization.DeathCertificateOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeathRegisterRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saboo
 */
public class MortuaryStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeadStatusJPanel
     */
    private JPanel container;
    private EcoSystem business;
    private DeathCertificateOrganization deathCertificateOrganization;
    private UserAccount account;
    private Organization organization;
    public MortuaryStatusJPanel(JPanel container, Organization organization, UserAccount account, EcoSystem business) {
        initComponents();
        this.container=container;
        this.deathCertificateOrganization = (DeathCertificateOrganization) organization;
        this.account = account;
        this.business = business;
        this.organization=organization;
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestMortJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : deathCertificateOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = ((DeathRegisterRequest) request).getDeadPerson();
            row[1] = request.getSender();
            row[2] = request.getReceiver() == null? "None": request.getReceiver();
            row[3] = request.getStatus();
            row[4] = request;
//            String result = ((LabTestWorkRequest) request).getTestResult();
//            row[3] = result == null ? "Waiting" : result;
            
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
        workRequestMortJTable = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        workRequestMortJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Death Id", "Sender", "Receiver", "Status", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestMortJTable);

        assignBtn.setBackground(new java.awt.Color(102, 153, 255));
        assignBtn.setText("Assign To Me");
        assignBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        processBtn.setBackground(new java.awt.Color(102, 153, 255));
        processBtn.setText("Process");
        processBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Mortuary Status");

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/DeathCertificateCheckerRole/back.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/DeathCertificateCheckerRole/refresh.png"))); // NOI18N
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(96, 96, 96)
                        .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(processBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestMortJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestMortJTable.getValueAt(selectedRow, 4);
        if(request.getStatus().equalsIgnoreCase("Approved")){
           JOptionPane.showMessageDialog(null, "Request already approved !!");
            return; 
        }
        if(request.getReceiver()!=null){
            JOptionPane.showMessageDialog(null, "Request already assigned to you !!");
            return;
        }
        request.setReceiver(account);
        request.setStatus("Assigned");
        request.setMessage("Mortuary request pendings");
        populateRequestTable();
    }//GEN-LAST:event_assignBtnActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestMortJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a request.");
            return;
        }
        WorkRequest request = (WorkRequest)workRequestMortJTable.getValueAt(selectedRow,4);
        if(!request.getStatus().equals("Assigned")){
           JOptionPane.showMessageDialog(null,"Please Assign the request before processing");
           return;
        }
        DeadPerson dp=(DeadPerson) workRequestMortJTable.getValueAt(selectedRow, 0);
        if(dp.isAmountDecided()){
           JOptionPane.showMessageDialog(null,"The current request has already processed and been approved !!");
           return;
        }
        ProcessingJPanel processingJPanel=new ProcessingJPanel(container,organization,account,business,dp,request);
        container.add("processingJPanel",processingJPanel);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_processBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processBtn;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestMortJTable;
    // End of variables declaration//GEN-END:variables
}
