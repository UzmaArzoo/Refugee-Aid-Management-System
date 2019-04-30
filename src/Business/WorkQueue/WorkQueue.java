/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<WorkRegistration> registrationList;
    private ArrayList<WorkAddResourse> addresourceList;
    private ArrayList<WorkAidRequest> aidrequestList;
    
    public WorkQueue() {
        workRequestList = new ArrayList();
        registrationList= new ArrayList();
        addresourceList= new ArrayList();
        aidrequestList = new ArrayList();
        
    }

    public ArrayList<WorkAddResourse> getAddresourceList() {
        return addresourceList;
    }

    public void setAddresourceList(ArrayList<WorkAddResourse> addresourceList) {
        this.addresourceList = addresourceList;
    }

    public ArrayList<WorkAidRequest> getAidrequestList() {
        return aidrequestList;
    }

    public void setAidrequestList(ArrayList<WorkAidRequest> aidrequestList) {
        this.aidrequestList = aidrequestList;
    }
     

    public ArrayList<WorkRegistration> getRegistrationList() {
        return registrationList;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}