/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;

import Model.Account;
import Model.Customer;
import Model.CustomerContainer;

/**
 *
 * @author Daniel
 */
public class CustomerCtr {
    
    
    private CustomerContainer customerContainer;
    private Account account;

    public CustomerCtr()
    {
        customerContainer = CustomerContainer.getInstance();
    }

    public int createCustomer(String name, String address, int phone)
{

    Customer c = new Customer(name, address, phone);
    return customerContainer.addCustomer(c);
}


    public void deleteCustomer(int CustomerID)
    {
        customerContainer.deleteCustomer(CustomerID);
    }

    public boolean updateCustomer(int customerID, String name, String address,int phone)
    {
        Customer c = customerContainer.findCustomer(customerID);
        if(c != null)
        {
            c.setCustomerID(customerID);
            c.setName(name);
            c.setAddress(address);
            c.setPhone(phone);
            return true;
        }
        else
        {
            return false;
        }
    }


    
    public void giveAccount(int customerID, String type, int regNr, int cardNr)
    {
        Customer c = getCustomer(customerID);
        Account a = new Account(type, regNr, cardNr);
        c.setAccount(a);
    }

    public Customer getCustomer(int customerID)
    {

        Customer c = customerContainer.findCustomer(customerID);
        return c;
    }

    public void updateName(int customerID, String name)
    {
        Customer c = getCustomer(customerID);
        c.setName(name);
    }

    public void updateAddress(int customerID, String address)
    {
        Customer c = getCustomer(customerID);
        c.setAddress(address);
    }

    public void updatePhone(int customerID, int phone)
    {
        Customer c = getCustomer(customerID);
        c.setPhone(phone);
    }



}
