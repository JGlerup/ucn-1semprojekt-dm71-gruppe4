/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class CustomerContainer {

    private ArrayList<Customer> customers;
    private static CustomerContainer instance;

    public static CustomerContainer getInstance()
    {
        if (instance == null)
        {
            instance = new CustomerContainer();
        }
        return instance;
    }


    public CustomerContainer()
    {
        customers = new ArrayList<Customer>();
    }
    
    public int addCustomer(Customer customer)
    {
        int newID = 1;
        if (customer.getCustomerId() == 0)
        {
            if(customers.size() > 0)
            {
                int lastIndex = customers.size()-1;
                Customer lastCustomer = customers.get(lastIndex);
                newID = lastCustomer.getCustomerId();
                newID += 1;
            }
            customer.setCustomerId(newID);
        }
        
        customers.add(customer);
        return newID;
    }



}
