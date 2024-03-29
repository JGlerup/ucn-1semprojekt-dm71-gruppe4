/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctr;

import Model.Customer;
import Model.CustomerContainer;
import Model.Rent;
import Model.RentContainer;
import Model.RentableItemContainer;
import Model.RentableItem;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Controller-klassen for Rent
 */
public class RentCtr {

    private RentContainer rentContainer;
    private RentableItemContainer rentItemContainer;
    private CustomerContainer customerContainer;

    /**
     * Konstruktør
     * Initialiserer felterne rentContainer og rentItemContainer
     */
    public RentCtr() {
        rentContainer = RentContainer.getInstance();
        rentItemContainer = RentableItemContainer.getInstance();
        customerContainer = CustomerContainer.getInstance();
    }

    /**
     * En metode, der udlejer et objekt af klassen rentItem.
     * @param itemID Søgeværdi
     * @param date
     * @param status
     * @param customerID Søgeværdi
     * @return Et udlejnings-ID Søgeværdi
     */
    public int rentItem(int itemID, String date, String status, int customerID) {
        DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        if (date == null) {
            date = dt.format(currentDate);
        }

        Customer customer = customerContainer.findCustomer(customerID);
        RentableItem item = rentItemContainer.findItem(itemID);

        Rent rent = new Rent(date, status, item, customer);

        return rentContainer.addRent(rent);

    }

    /**
     * En metode, der kalder metoden deliverItem
     * @param id Søgeværdi
     */
    public void deliverItem(int rentID) {
        rentContainer.deliverItem(rentID);
    }

    public ArrayList<Rent> getRentList() {
        return rentContainer.getRentList();
    }

    public Rent getRent(int rentID) {
        return rentContainer.findRent(rentID);
    }

    public boolean checkRentStatusCustomer(int customerID) {
        boolean rentStatus = false;
        for(Rent r : getRentList()) {
            if(r.getCustomer().getCustomerID() == customerID) {
                rentStatus = true;
            }
        }
        return rentStatus;
    }
}
