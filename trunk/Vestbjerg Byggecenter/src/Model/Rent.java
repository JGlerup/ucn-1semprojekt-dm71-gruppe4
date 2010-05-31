/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;


import Model.Customer;

/**
 *
 * @author Daniel
 */
public class Rent {

    private int id;
    private String date;
    private String status;
    private Customer customer;
    private RentableItem rentableItem;

    public Rent(String date, String status, RentableItem rentableItem, Customer customer) {
        this.date = date;
        this.status = status;
        this.rentableItem = rentableItem;
        this.customer = customer;
    }

    public Rent()
    { }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public RentableItem getRentableItem() {
        return rentableItem;
    }

    public void setRentableItem(RentableItem rentableItem) {
        this.rentableItem = rentableItem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }





}
