/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Daniel
 */
public class Customer extends Person {

    private int customerID;



    public Customer(int customerID, String name, String address,int phone) {

        super (name, address, phone);
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerId(int customerID) {
        this.customerID = customerID;
    }







}
