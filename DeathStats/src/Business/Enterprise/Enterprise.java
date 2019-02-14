/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.DeadPerson.DeadPersonDir;
import Business.Organization.Organization;
import Business.Organization.OrganizationDir;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Rajat
 */
public abstract class Enterprise extends Organization{
    private OrganizationDir organizationDirectory;
    private EnterpriseType enterpriseType;
    
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDir();
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDir getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDir organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    public enum EnterpriseType{
        DeathVerfication("Death Verification"),
        GovernmentAuthority("Government Authority"),
        DeathStats("DeathStats");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
            return value;
        }
    }
}
