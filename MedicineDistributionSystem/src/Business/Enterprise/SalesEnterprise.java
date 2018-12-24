/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Inventory.SalesInventoryItem;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Hardik
 */
public class SalesEnterprise extends Enterprise {

    private SalesInventoryItem salesInventory;

    public SalesInventoryItem getSalesInventory() {
        return salesInventory;
    }

    public void setSalesInventory(SalesInventoryItem salesInventory) {
        this.salesInventory = salesInventory;
    }
            
    
    public SalesEnterprise(String name) {
        super(name, EnterpriseType.Sales);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
