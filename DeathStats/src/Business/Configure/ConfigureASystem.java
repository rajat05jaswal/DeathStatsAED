/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configure;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.DeathVerfication;
import Business.Network.Network;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Rajat
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        ArrayList<Network> networkList=new ArrayList<Network>();
        system.setNetworkList(networkList);
        
        Network network = new Network();
        network.setName("Boston");
        networkList.add(network);
        
        //Create Admin Username and Password
        Employee sysadmin = system.getEmployeeDirectory().createEmployee("DeathStatsMainAdmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("a", "a", sysadmin, new SystemAdminRole());
        ua.setEmployee(sysadmin);
        
        //Create Enterprises and their Username, Password
//        String ent1 = "Death Verification Boston";
//        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(ent1, DeathVerfication);
//        Employee empdv1 = enterprise.getEmployeeDirectory().createEmployee("DVBoston");
//        UserAccount empdv1 = empdv1.get
//        empdv1.
        
        return system;
    }
}
