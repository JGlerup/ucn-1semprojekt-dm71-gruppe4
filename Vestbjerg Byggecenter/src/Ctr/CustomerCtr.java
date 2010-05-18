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





    /**
     * Method that creates a new customer and adds it in the container.
     * @param customerID
     * @param name
     * @param address
     * @param phone
     */

    public void createCustomer(String name, String address, int phone)
{
    int customerID = customerContainer.generateID();
    Customer c = new Customer(customerID, name, address, phone);
    customerContainer.addCustomer(c);
}


    public void deleteCustomer(int CustomerID)
    {
        customerContainer.deleteCustomer(CustomerID);
    }

    public void updateCustomer(int customerID, String name, String address,int phone)
    {

    }

}
