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

    private ArrayList<Customer> customerList;
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
        customerList= new ArrayList<Customer>();
    }


    public int generateID()
    {
        int index = 0;
        int newID = 0;
        if(customerList.size() != 0)
        {
            index = customerList.size() -1;
            Customer c = customerList.get(index);
            newID = c.getCustomerID() + 1;
        }
        else
        {
            newID = 1;
        }
        return newID;
    }


    public void addCustomer(Customer customer)
    {
        customerList.add(customer);
    }

    public void deleteCustomer(int customerID)
    {
        int index = 0;
        int storeIndex = 0;
        boolean found = false;
        while (!found && index < customerList.size())
        {
            if (customerList.get(index).getCustomerID() == customerID)
            {
                storeIndex = index;
                found = true;
            }
            index++;
        }
        customerList.remove(storeIndex);
    }

     public void getCustomerID(int customerID)
     {

     }




}
