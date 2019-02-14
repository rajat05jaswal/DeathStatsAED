/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DependentCheckerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rajat
 */
public class DependentOrganization extends Organization {

    public DependentOrganization() {
        super(Organization.Type.Dependent.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DependentCheckerRole());
        return roles;
    }
}
