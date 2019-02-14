/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDir;
import Business.Role.Role;
import Business.UserAccount.UserAccountDir;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Rajat
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private EmployeeDir employeeDirectory;
    private UserAccountDir userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDir();
        userAccountDirectory = new UserAccountDir();
        organizationID = counter;
        ++counter;
    }
    
    public enum Type{
        EnterpriseAdmin("Enterprise Admin Organization"),
        Mortuary("Mortuary Organization"),
        DeathCertificate("Death Certificate Organization"),
        Crime("Crime Organization"),
        Income("Income Organization"),
        Dependent("Dependent Organization"),
        Research("Research Organization"),
        Analysis("Analysis Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDir getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setEmployeeDirectory(EmployeeDir employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public void setUserAccountDirectory(UserAccountDir userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDir getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
