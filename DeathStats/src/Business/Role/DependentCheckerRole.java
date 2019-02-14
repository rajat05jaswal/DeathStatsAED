/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.DependantsRole.DependantsEntryJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Rajat
 */
public class DependentCheckerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel container, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business) {
        return new DependantsEntryJPanel(container,enterprise,organization,account,business);
    }
    
}
