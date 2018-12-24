/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.QATeamRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Hardik
 */
public class QAOrganization extends Organization {

    public QAOrganization() {
        super(Organization.Type.QATeam.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new QATeamRole());
        return roleList;
    }

}
