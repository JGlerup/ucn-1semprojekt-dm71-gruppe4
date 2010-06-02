/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Klassen repræsenterer et rent-objekt. Informationer om udlejningen
 * bliver gemt og kan hentes.
 */
public class Rent {

    private int id;
    private String date;
    private String status;
    private Customer customer;
    private RentableItem rentableItem;

    /**
     *
     * @param date
     * @param status
     * @param rentableItem
     * @param customer
     */
    public Rent(String date, String status, RentableItem rentableItem, Customer customer) {
        this.date = date;
        this.status = status;
        this.rentableItem = rentableItem;
        this.customer = customer;
    }

    /**
     *
     */
    public Rent() {
    }

    /**
     *
     * @return
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     *
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public int getID() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public RentableItem getRentableItem() {
        return rentableItem;
    }

    /**
     *
     * @param rentableItem
     */
    public void setRentableItem(RentableItem rentableItem) {
        this.rentableItem = rentableItem;
    }

    /**
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
