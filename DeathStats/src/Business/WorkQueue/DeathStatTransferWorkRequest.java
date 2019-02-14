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
public class DeathStatTransferWorkRequest extends WorkRequest {
    private DeadPerson deadPerson;

    public DeadPerson getDeadPerson() {
        return deadPerson;
    }

    public void setDeadPerson(DeadPerson deadPerson) {
        this.deadPerson = deadPerson;
    }
}
