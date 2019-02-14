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
import Interface.CrimeCheckerRole.CrimeCheckerEntryJPanel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Rajat
 */
public class CrimeCheckerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel container, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business) {
        try {
            return new CrimeCheckerEntryJPanel(container,enterprise,organization,account, business);
        } catch (IOException ex) {
            Logger.getLogger(CrimeCheckerRole.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
