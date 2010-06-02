/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Klassen repræsenterer et customer-objekt arver fra klassen Person.
 * Informationer om kunden bliver gemt og kan hentes.
 */
public class Customer extends Person {

    private int customerID;
    private Account account;

    /**
     * Konstruktør
     * Initialiserer kunden
     * @param name
     * @param address
     * @param phone
     */
    public Customer(String name, String address, String phone) {

        super(name, address, phone);
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
