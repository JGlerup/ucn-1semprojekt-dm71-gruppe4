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
 * Controller-klassen for Customer
 */
public class CustomerCtr {

    private CustomerContainer customerContainer;
    private Account account;

    /**
     * Konstruktør
     * Initialiserer feltet customerContainer
     */
    public CustomerCtr() {
        customerContainer = CustomerContainer.getInstance();
    }

    /**
     * En metode, der laver et objekt af klassen Customer
     * @param name
     * @param address
     * @param phone
     * @return Kunde-ID
     */
    public int createCustomer(String name, String address, String phone) {

        Customer c = new Customer(name, address, phone);
        return customerContainer.addCustomer(c);
    }

    /**
     * En metode, der kalder metoden deleteCustomer
     * @param CustomerID
     */
    public void deleteCustomer(int CustomerID) {
        customerContainer.deleteCustomer(CustomerID);
    }

    /**
     * En metode, der tildeler en konto til et kundeobjekt
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
     * En metode, der kalder metoden findCustomer
     * @param customerID
     * @return Et objekt af klassen Customer
     */
    public Customer getCustomer(int customerID) {

        Customer c = customerContainer.findCustomer(customerID);
        return c;
    }

    /**
     * En metoder, der opdaterer kundes navn
     * @param customerID
     * @param name
     */
    public void updateName(int customerID, String name) {
        Customer c = getCustomer(customerID);
        c.setName(name);
    }

    /**
     * En metode, der opdaterer en kundes telefonnummer
     * @param customerID
     * @param address
     */
    public void updateAddress(int customerID, String address) {
        Customer c = getCustomer(customerID);
        c.setAddress(address);
    }

    /**
     * En metode, der opdaterer en kundes telefonnummer
     * @param customerID
     * @param phone
     */
    public void updatePhone(int customerID, String phone) {
        Customer c = getCustomer(customerID);
        c.setPhone(phone);
    }

    /**
     * @return En ArrayList over objekter af typen Customer
     */
    public ArrayList<Customer> getCustomerList() {
        return customerContainer.getCustomerList();
    }
}
