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
public class Sale {

    private int saleID;
    private String date;
    private double price;
    private boolean order;
    private ArrayList<SalesLineItem> sLIList;
    private Employee employee;
    private Customer customer;
    private Discount discount;

    /**
     *
     * @param date
     * @param employee
     */
    public Sale(String date, Employee employee) {
        this.date = date;
        price = 0;
        this.employee = employee;
        sLIList = new ArrayList<SalesLineItem>();
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
    public double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public int getSaleID() {
        return saleID;
    }

    /**
     *
     * @param saleID
     */
    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    /**
     *
     * @return
     */
    public Discount getDiscount() {
        return discount;
    }

    /**
     *
     * @param discount
     */
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    /**
     *
     * @return
     */
    public ArrayList<SalesLineItem> getSLIList() {
        return sLIList;
    }

    /**
     *
     * @param sLI
     * @return
     */
    public int addSalesLineItem(SalesLineItem sLI) {
        int sLIID = generateID(sLI);
        sLIList.add(sLI);
        return sLIID;
    }

    /**
     *
     * @param sLIID
     * @return
     */
    public SalesLineItem getSalesLineItem(int sLIID) {
        int index = 0;
        SalesLineItem sLI = null;
        boolean found = false;
        while (!found && index < sLIList.size()) {
            if (sLIList.get(index).getSLIID() == sLIID) {
                sLI = sLIList.get(index);
                found = true;
            }
            index++;
        }
        return sLI;
    }

    /**
     *
     * @param sLIID
     */
    public void removeSalesLineItem(int sLIID) {
        int index = 0;
        int storeIndex = 0;
        boolean found = false;
        while (!found && index < sLIList.size()) {
            if (sLIList.get(index).getSLIID() == sLIID) {
                storeIndex = index;
                found = true;
            }
            index++;
        }
        sLIList.remove(storeIndex);
    }

    /**
     *
     * @param sLI
     * @return
     */
    public int generateID(SalesLineItem sLI) {
        int newID = 1;

        if (sLI.getSLIID() == 0) {
            if (sLIList.size() != 0) {
                int lastIndex = sLIList.size() - 1;
                SalesLineItem lastSLI = sLIList.get(lastIndex);
                newID = lastSLI.getSLIID();
                newID += 1;
            }
            sLI.setsLIID(newID);
        }
        return newID;
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
    public Employee getEmployee() {
        return employee;
    }

    /**
     *
     * @param employee
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
