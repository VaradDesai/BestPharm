/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Hardik
 */
public class CustomerOrganization extends Organization {
    
    public CustomerOrganization() {
        super(Organization.Type.Customer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new ClientRole());
        return roleList;
    }
    
    
}
