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
}
