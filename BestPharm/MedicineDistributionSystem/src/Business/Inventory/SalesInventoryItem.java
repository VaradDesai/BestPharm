/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Hardik
 */
public class SalesInventoryItem extends InventoryItem {
    
   // varad 6/12//
   private UserAccount userAccount; 
//    ********varad 6/12***********

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    
}
