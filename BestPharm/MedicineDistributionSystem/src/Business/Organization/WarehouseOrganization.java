/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Patient.PatientDirectory;
import Business.Role.AdminRole;
import Business.Role.WarehouseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Hardik
 */
public class WarehouseOrganization extends Organization{

   // private PatientDirectory patientList;

    public WarehouseOrganization() {
        super(Organization.Type.Warehouse.getValue());
     //   patientList = new PatientDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new WarehouseRole());
        return roleList;
    }
}
