/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Rajat
 */
public class OrganizationDir {
    private ArrayList<Organization> organizationList;

    public OrganizationDir() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Research.getValue())){
            organization = new ResearchOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Analysis.getValue())){
            organization = new AnalysisOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Income.getValue())){
            organization = new IncomeOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Crime.getValue())){
            organization = new CrimeOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Dependent.getValue())){
            organization = new DependentOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Mortuary.getValue())){
            organization = new MortuaryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.DeathCertificate.getValue())){
            organization = new DeathCertificateOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
