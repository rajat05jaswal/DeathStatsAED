/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeadPerson;

import java.util.ArrayList;

/**
 *
 * @author Rajat
 */
public class DeadPersonDir {
    private ArrayList<DeadPerson> deadPeople;

    public ArrayList<DeadPerson> getDeadPeople() {
        return deadPeople;
    }

    public void setDeadPeople(ArrayList<DeadPerson> deadPeople) {
        this.deadPeople = deadPeople;
    }
    
    public DeadPersonDir(){
        deadPeople=new ArrayList<>();
    }
    
    public void addDeadPerson(DeadPerson dp){
        this.deadPeople.add(dp);
    }
    
    public void removeDeadPerson(DeadPerson dp){
        this.deadPeople.remove(dp);
    }
    
}
