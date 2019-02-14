/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PoliceMan;

import java.util.Random;

/**
 *
 * @author Rajat
 */
public class PoliceMan {
    private String policeId;
    private static int count;
    public PoliceMan(){
        Random r=new Random();
        count++;
        this.policeId="POL"+r.nextInt(200*count);
    }

    public String getPoliceId() {
        return policeId;
    }

    public void setPoliceId(String policeId) {
        this.policeId = policeId;
    }

    @Override
    public String toString() {
        return String.valueOf(policeId);
    }
}
