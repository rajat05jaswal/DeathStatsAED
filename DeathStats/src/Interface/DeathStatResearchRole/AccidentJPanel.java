/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DeathStatResearchRole;

import Business.DeadPerson.DeadPerson;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.DeathStatAnalystRole.AnalysingCurrentDeathJPanel;
import java.awt.CardLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saboo
 */
public class AccidentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccidentJPanel
     */
    private JPanel container;
    private EcoSystem business;
    private Organization organization;
    private UserAccount account;
    public AccidentJPanel(JPanel container, Organization organization, UserAccount account, EcoSystem business) {
        initComponents();
        this.container=container;
        this.organization = organization;
        this.account = account;
        this.business = business;
        populateAccidentDeathTable();
        accidentRateLabel.setVisible(false);
        CrimeproneLabel.setVisible(false);
    }
    
    public void populateAccidentDeathTable(){
        DefaultTableModel model = (DefaultTableModel) deathJTable.getModel();
        
        model.setRowCount(0);
        for (DeadPerson dp: business.getDeadpeople().getDeadPeople()){
            if(dp.getGeneralReasonOfDeath()!=null){
                if(dp.getGeneralReasonOfDeath().equalsIgnoreCase("Accident")){
                    Object[] row = new Object[5];
                    row[0] = dp.getfName();
                    row[1] = dp.getlName();
                    row[2] = dp.getAge();
                    row[3] = dp;
                    row[4] = dp.getLocationOfDeath();
                    model.addRow(row);
                } 
            }
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

        accidentRateLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        deathJTable = new javax.swing.JTable();
        accidentAreaBtn = new javax.swing.JButton();
        accidentRateBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CrimeproneLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        accidentRateLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        accidentRateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accidentRateLabel.setText("Deaths Due to Accidents");

        deathJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Age", "DeathID", "Location of Death"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deathJTable);

        accidentAreaBtn.setBackground(new java.awt.Color(102, 153, 255));
        accidentAreaBtn.setText("Get Accident Prone Area");
        accidentAreaBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        accidentAreaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accidentAreaBtnActionPerformed(evt);
            }
        });

        accidentRateBtn.setBackground(new java.awt.Color(102, 153, 255));
        accidentRateBtn.setText("Get Accident Rate");
        accidentRateBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        accidentRateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accidentRateBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Deaths Due to Accidents");

        CrimeproneLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CrimeproneLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CrimeproneLabel.setText("Deaths Due to Crime");

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
                        .addGap(110, 110, 110)
                        .addComponent(accidentAreaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)
                        .addComponent(accidentRateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CrimeproneLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accidentRateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accidentRateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accidentAreaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(accidentRateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CrimeproneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(633, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void accidentAreaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accidentAreaBtnActionPerformed
        // TODO add your handling code here:
        
        HashMap<String, ArrayList<DeadPerson>> hm=new HashMap<>();
        for (DeadPerson dp: business.getDeadpeople().getDeadPeople()){
            if(dp.getGeneralReasonOfDeath()!=null){
                if(dp.getGeneralReasonOfDeath().equalsIgnoreCase("accident")){
                    String location =dp.getLocationOfDeath();
                    if(hm.containsKey(location)){
                        hm.get(location).add(dp);
                    }else{
                        ArrayList<DeadPerson> list= new ArrayList<>();
                        list.add(dp);
                        hm.put(location, list);
                    }
                }
            }
        }
        int max=0;
        String maxLocation="";
        for(Map.Entry<String, ArrayList<DeadPerson>> entry: hm.entrySet()){
            if(entry.getValue().size()>max){
                max=entry.getValue().size();
                maxLocation=entry.getKey();
            }
        }
        CrimeproneLabel.setText("The Current Accident Prone Area is " + maxLocation.toUpperCase() + " Please take preventive measures.");
        CrimeproneLabel.setVisible(true);
        
       
    }//GEN-LAST:event_accidentAreaBtnActionPerformed

    private void accidentRateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accidentRateBtnActionPerformed
        // TODO add your handling code here:
       double totalDeaths = business.getDeadpeople().getDeadPeople().size();
       double accidentCount =0;
       double accidentPercentage =0;
        for (DeadPerson dp: business.getDeadpeople().getDeadPeople()){
            if(dp.getGeneralReasonOfDeath()!=null){
                if(dp.getGeneralReasonOfDeath().equalsIgnoreCase("Accident")){
                   accidentCount++; 
                }
            }
        }
        accidentPercentage = (accidentCount/totalDeaths)*100;
        DecimalFormat df = new DecimalFormat("####0.00");
        accidentRateLabel.setText("The Accident Rate is " + df.format(accidentPercentage) +"%");
        accidentRateLabel.setVisible(true);
    }//GEN-LAST:event_accidentRateBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CrimeproneLabel;
    private javax.swing.JButton accidentAreaBtn;
    private javax.swing.JButton accidentRateBtn;
    private javax.swing.JLabel accidentRateLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable deathJTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
