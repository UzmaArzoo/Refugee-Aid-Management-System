/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author hp
 */
public class WorkAidRequest {
   private UserAccount requestsender;
   private UserAccount ngoreciever;
   private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   private int amount;
   String status;
   private Enterprise enterprise;

   
    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
   

   
    public UserAccount getRequestsender() {
        return requestsender;
    }

    public void setRequestsender(UserAccount requestsender) {
        this.requestsender = requestsender;
    }

    public UserAccount getNgoreciever() {
        return ngoreciever;
    }

    public void setNgoreciever(UserAccount ngoreciever) {
        this.ngoreciever = ngoreciever;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
    @Override
    public String toString() {
        return status;
    }
   
   
    
}
