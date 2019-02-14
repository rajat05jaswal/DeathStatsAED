package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Interface.GovernmentRole.ClaimProcessJPanel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajat
 */
public class IncomeCheckerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel container, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business) {
        return new ClaimProcessJPanel(container, organization, account, business);
    }
    
}
