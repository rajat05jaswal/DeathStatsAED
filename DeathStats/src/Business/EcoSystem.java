/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.DeadPerson.DeadPersonDir;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.PoliceMan.PoliceMan;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Rajat
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private DeadPersonDir deadpeople;
    private ArrayList<PoliceMan> policeManDir;
    private HashMap<String, ArrayList<PoliceMan>> hashPolice;
    private ArrayList<String> emailList;

    public ArrayList<String> getEmailList() {
        return emailList;
    }

    public void setEmailList(ArrayList<String> emailList) {
        this.emailList = emailList;
    }

    public HashMap<String, ArrayList<PoliceMan>> getHashPolice() {
        return hashPolice;
    }

    public void setHashPolice(HashMap<String, ArrayList<PoliceMan>> hashPolice) {
        this.hashPolice = hashPolice;
    }

    public ArrayList<PoliceMan> getPoliceManDir() {
        return policeManDir;
    }

    public void setPoliceManDir(ArrayList<PoliceMan> policeManDir) {
        this.policeManDir = policeManDir;
    }

    public DeadPersonDir getDeadpeople() {
        return deadpeople;
    }

    public void setDeadpeople(DeadPersonDir deadpeople) {
        this.deadpeople = deadpeople;
    }
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        deadpeople=new DeadPersonDir();
        policeManDir= new ArrayList<PoliceMan>();
        hashPolice= new HashMap<>();
        emailList= new ArrayList<>();
    }
}
