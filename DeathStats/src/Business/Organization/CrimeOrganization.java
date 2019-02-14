/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CrimeCheckerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rajat
 */
public class CrimeOrganization extends Organization {

    public CrimeOrganization() {
        super(Organization.Type.Crime.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CrimeCheckerRole());
        return roles;
    }
}
