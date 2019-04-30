/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.RegisterOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Network.Network;
import javax.swing.JPanel;
import userinterface.RegisterationRole.RegisterWorkAreaPanel;

/**
 *
 * @author hp
 */
public class RegisterRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,  UserAccount account,Network network, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new RegisterWorkAreaPanel(userProcessContainer, account, (RegisterOrganization)organization, enterprise,business ,network );
    }
}
