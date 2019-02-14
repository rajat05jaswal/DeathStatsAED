/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AnalystRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rajat
 */
public class AnalysisOrganization extends Organization {

    public AnalysisOrganization() {
        super(Organization.Type.Analysis.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AnalystRole());
        return roles;
    }
}
