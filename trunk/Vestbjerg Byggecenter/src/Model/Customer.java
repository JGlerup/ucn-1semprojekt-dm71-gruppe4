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

    private int customerId;



    public Customer(String name, String address,int phone,int customerId) {

        super (name, address, phone);
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }




}
