/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeadPerson;

/**
 *
 * @author Rajat
 */
public class DeadPerson {
    private int personId;
    private String fName;
    private String lName;
    private String gender;
    private int age;
    private double monthlySalary;
    private int noOfDependents;
    private String reasonOfDeath;
    private String locationOfDeath;
    private static int count;
    private int amountAssigned;
    private boolean amountDecided;
    private String analystAnalysing;
    private String generalReasonOfDeath;
    private boolean analysisDone;

    public boolean isAnalysisDone() {
        return analysisDone;
    }

    public void setAnalysisDone(boolean analysisDone) {
        this.analysisDone = analysisDone;
    }

    
    public String getGeneralReasonOfDeath() {
        return generalReasonOfDeath;
    }

    public void setGeneralReasonOfDeath(String generalReasonOfDeath) {
        this.generalReasonOfDeath = generalReasonOfDeath;
    }

    public boolean isAmountDecided() {
        return amountDecided;
    }

    public void setAmountDecided(boolean amountDecided) {
        this.amountDecided = amountDecided;
    }
    
    public DeadPerson(){
       count++;
       this.personId=count;
       this.amountDecided=false;
       this.analystAnalysing="NA";
       this.analysisDone=false;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getID() {
        return personId;
    }
    
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getNoOfDependents() {
        return noOfDependents;
    }

    public void setNoOfDependents(int noOfDependents) {
        this.noOfDependents = noOfDependents;
    }

    public String getReasonOfDeath() {
        return reasonOfDeath;
    }

    public void setReasonOfDeath(String reasonOfDeath) {
        this.reasonOfDeath = reasonOfDeath;
    }

    public String getLocationOfDeath() {
        return locationOfDeath;
    }

    public void setLocationOfDeath(String locationOfDeath) {
        this.locationOfDeath = locationOfDeath;
    }
    
    public int getamountAssigned() {
        return amountAssigned;
    }

    public void setamountAssigned(int amountAssigned) {
        this.amountAssigned = amountAssigned;
    }

    public String getAnalystAnalysing() {
        return analystAnalysing;
    }

    public void setAnalystAnalysing(String analystAnalysing) {
        this.analystAnalysing = analystAnalysing;
    }

    @Override
    public String toString() {
        return personId + fName;
    }
    
}
