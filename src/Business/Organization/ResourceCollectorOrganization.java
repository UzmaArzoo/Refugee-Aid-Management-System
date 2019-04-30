/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.ResourceCollectorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class ResourceCollectorOrganization extends Organization {
    
    public ResourceCollectorOrganization()  {
        super(Organization.Type.ResourceCollector.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ResourceCollectorRole());
        return roles;
    }
    
}
