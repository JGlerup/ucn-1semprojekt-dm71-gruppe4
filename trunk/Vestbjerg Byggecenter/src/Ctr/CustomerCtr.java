/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;

import Model.Customer;
import Model.CustomerContainer;

/**
 *
 * @author Daniel
 */
public class CustomerCtr {
    
    private Customer customer;
    private CustomerContainer customerContainer;

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
        Customer c = customerContainer.getCustomer(customerID);
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



}
