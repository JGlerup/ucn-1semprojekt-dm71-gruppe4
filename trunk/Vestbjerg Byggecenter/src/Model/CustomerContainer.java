/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 * Klassen CustomerContainer repræsenterer en container for customer-objekter.
 * Den fungerer som en datase, hvor det er muligt
 * at gemme, slette og finde kunder.
 */
public class CustomerContainer {

    private ArrayList<Customer> customerList;
    private static CustomerContainer instance;

    /**
     * Konstruktør
     * Initialiserer en tom database(customerList)
     */
    public CustomerContainer() {
        customerList = new ArrayList<Customer>();
    }

    /**
     * Initialiserer en instans af klassen CustomerConatiner
     */
    public static CustomerContainer getInstance() {
        if (instance == null) {
            instance = new CustomerContainer();
        }
        return instance;
    }

    /**
     * En søgemetode, som returnerer et objekt af klassen Customer hvis
     * ID er identisk med parameteren id.
     * @param customerID
     * @return Et objekt af klassen kunde
     */
    public Customer findCustomer(int customerID) {
        Customer c = null;
        for (Customer customer : customerList) {
            if (customerID == customer.getCustomerID()) {
                c = customer;
            }
        }
        return c;
    }

    /**
     * En metode, der generer et ID til et objekt af klassen Customer
     * @param customer
     * @return Kunde-ID
     */
    public int generateID(Customer customer) {
        int newID = 1;

        if (customer.getCustomerID() == 0) {
            if (customerList.size() != 0) {
                int lastIndex = customerList.size() - 1;
                Customer lastCustomer = customerList.get(lastIndex);
                newID = lastCustomer.getCustomerID();
                newID += 1;
            }
            customer.setCustomerID(newID);
        }

        return newID;
    }

    /**
     * En metode til at tilføje objekter af klasen Customer til customerList.
     * @param customer
     * @return
     */
    public int addCustomer(Customer customer) {
        int id = generateID(customer);
        customerList.add(customer);
        return id;
    }

    /**
     * En metode til at fjerne objekter af klasen Customer til customerList.
     * @param customerID
     */
    public void deleteCustomer(int customerID) {
        int index = 0;
        int storeIndex = 0;
        boolean found = false;
        while (!found && index < customerList.size()) {
            if (customerList.get(index).getCustomerID() == customerID) {
                storeIndex = index;
                found = true;
            }
            index++;
        }
        customerList.remove(storeIndex);
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
}
