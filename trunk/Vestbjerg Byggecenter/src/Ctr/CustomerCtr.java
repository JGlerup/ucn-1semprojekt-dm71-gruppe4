/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctr;

import Model.Account;
import Model.Customer;
import Model.CustomerContainer;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class CustomerCtr {

    private CustomerContainer customerContainer;
    private Account account;

    /**
     * 
     */
    public CustomerCtr() {
        customerContainer = CustomerContainer.getInstance();
    }

    /**
     * 
     * @param name
     * @param address
     * @param phone
     * @return
     */
    public int createCustomer(String name, String address, String phone) {

        Customer c = new Customer(name, address, phone);
        return customerContainer.addCustomer(c);
    }

    /**
     * 
     * @param CustomerID
     */
    public void deleteCustomer(int CustomerID) {
        customerContainer.deleteCustomer(CustomerID);
    }

    /**
     * 
     * @param customerID
     * @param name
     * @param address
     * @param phone
     * @return
     */
    public boolean updateCustomer(int customerID, String name, String address, String phone) {
        Customer c = customerContainer.findCustomer(customerID);
        if (c != null) {
            c.setCustomerID(customerID);
            c.setName(name);
            c.setAddress(address);
            c.setPhone(phone);
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @param customerID
     * @param type
     * @param regNr
     * @param cardNr
     */
    public void giveAccount(int customerID, String type, int regNr, int cardNr) {
        Customer c = getCustomer(customerID);
        Account a = new Account(type, regNr, cardNr);
        c.setAccount(a);
    }

    /**
     * 
     * @param customerID
     * @return
     */
    public Customer getCustomer(int customerID) {

        Customer c = customerContainer.findCustomer(customerID);
        return c;
    }

    /**
     * Denne metode opdaterer navnet på kunden
     * @param customerID
     * @param name
     */
    public void updateName(int customerID, String name) {
        Customer c = getCustomer(customerID);
        c.setName(name);
    }

    /**
     * 
     * @param customerID
     * @param address
     */
    public void updateAddress(int customerID, String address) {
        Customer c = getCustomer(customerID);
        c.setAddress(address);
    }

    /**
     * 
     * @param customerID
     * @param phone
     */
    public void updatePhone(int customerID, String phone) {
        Customer c = getCustomer(customerID);
        c.setPhone(phone);
    }

    /**
     *
     * @return En
     */
    public ArrayList<Customer> getCustomerList() {
        return customerContainer.getCustomerList();
    }
}
