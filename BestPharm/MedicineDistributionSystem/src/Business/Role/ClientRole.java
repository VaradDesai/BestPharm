/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.ClientRole.ClientWorkAreaJPanel;
import UserInterface.SalesRole.SalesWorkAreaJPanel;
import UserInterface.PatientRole.PatientWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Hardik
 */
public class ClientRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
            
            return new ClientWorkAreaJPanel(container, account, (CustomerOrganization) organization, enterprise, network);
        
    }
    
    
    
    
}
