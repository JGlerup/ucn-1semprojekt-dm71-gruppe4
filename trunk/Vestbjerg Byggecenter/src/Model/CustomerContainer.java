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

     public Customer getCustomer(int customerID)
    {
      for(Customer customer : customerList)
      {
          if(customer.getCustomerID() == customerID)
          {
              return customer;
          }
      }
      return null;
    }


    public int generateID(Customer customer)
    {
        int index = 0;
        int newID = 1;
        
        if (customer.getCustomerID() == 0)
        { 
            if(customerList.size() != 0)
            {
                int lastIndex = customerList.size() -1;            
                Customer lastCustomer = customerList.get(lastIndex);
                newID = lastCustomer.getCustomerID();
                newID += 1;
            }
            customer.setCustomerID(newID);
        }
       
        return newID;
    }


    public int addCustomer(Customer customer)
    {
        int id = generateID(customer);
        customerList.add(customer);
        return id;
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

     




}