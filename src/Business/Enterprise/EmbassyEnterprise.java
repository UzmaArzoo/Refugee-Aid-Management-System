/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class EmbassyEnterprise extends Enterprise{
    
    public EmbassyEnterprise(String name){
        super(name,EnterpriseType.Embassy);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
