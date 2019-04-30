/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NgoManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NgoManagerRole.NgoManagerWorkAreaPanel;

/**
 *
 * @author hp
 */
public class NgoManagerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Network network, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new NgoManagerWorkAreaPanel(userProcessContainer, account, (NgoManagerOrganization)organization, enterprise,business,network);
    }
    
}
