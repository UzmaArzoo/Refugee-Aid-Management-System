/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
//import Business.Organization.Organization.ngoType;
//import Business.Organization.Organization.unoType;
//import Business.Organization.Organization.embassyType;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        if (type.getValue().equals(Type.Manager.getValue())){
            organization = new ManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.NgoManager.getValue())){
            organization = new NgoManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AidRequest.getValue())){
            organization = new AidRequestOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Registration.getValue())){
            organization = new RegisterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Approval.getValue())){
            organization = new ApprovalOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Checking.getValue())){
            organization = new CheckingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ResourceCollector.getValue())){
            organization = new ResourceCollectorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Officer.getValue())){
            organization = new OfficerOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
    
   
}