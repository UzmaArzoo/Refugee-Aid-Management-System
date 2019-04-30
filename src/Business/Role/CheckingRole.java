/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ManagerOrganization;
import Business.Organization.CheckingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ManagerRole.ManagerWorkAreaPanel;
import userinterface.CheckingRole.CheckingAreaWorkJPanel;

/**
 *
 * @author hp
 */
public class CheckingRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Network network, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CheckingAreaWorkJPanel(userProcessContainer, account, (CheckingOrganization)organization, enterprise,business,network);
    }
    
}
