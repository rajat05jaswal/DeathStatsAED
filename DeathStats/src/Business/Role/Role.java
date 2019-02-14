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
import javax.swing.JPanel;

/**
 *
 * @author Rajat
 */
public abstract class Role {
    public enum RoleType{
        SystemAdmin("System Admin"),
        EnterpriseAdmin("Enterprise Admin"),
        Analyst("Analyst"),
        CrimeChecker("CrimeChecker"),
        DeathCertificateChecker("DeathCertificateChecker"),
        DependentChecker("DependentChecker"),
        IncomeChecker("IncomeChecker"),
        Mortuary("Mortuary"),
        Researcher("Reseacher"),
        Surveyer("Surveyer");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel container,
            Enterprise enterprise,
            Organization organization,
            UserAccount account, 
            EcoSystem business);
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
