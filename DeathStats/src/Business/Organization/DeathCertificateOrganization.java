/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeathCertificateCheckerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rajat
 */
public class DeathCertificateOrganization extends Organization {

    public DeathCertificateOrganization() {
        super(Organization.Type.DeathCertificate.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeathCertificateCheckerRole());
        return roles;
    }
}
