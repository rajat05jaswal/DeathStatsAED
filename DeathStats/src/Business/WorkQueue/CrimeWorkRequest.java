/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DeadPerson.DeadPerson;

/**
 *
 * @author Rajat
 */
public class CrimeWorkRequest extends WorkRequest{
    private DeadPerson dp;

    public DeadPerson getDp() {
        return dp;
    }

    public void setDp(DeadPerson dp) {
        this.dp = dp;
    }
}
