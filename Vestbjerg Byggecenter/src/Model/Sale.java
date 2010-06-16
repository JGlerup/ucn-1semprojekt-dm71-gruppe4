/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Klassen repræsenterer et salgs-objekt.
 * Informationer om salget bliver gemt og kan hentes.
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
     * Konstruktør
     * Initialiserer en tom database(sLIList), samt felterne date og employee
     * @param date
     * @param employee
     */
    public Sale(String date, Employee employee) {
        this.date = date;
        price = 0;
        this.employee = employee;
        sLIList = new ArrayList<SalesLineItem>();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
//        return price;
//        DecimalFormat twoDForm = new DecimalFormat("#.##");
//        return Double.valueOf(twoDForm.format(price));
        return Math.rint(price*100.0) / 100.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public ArrayList<SalesLineItem> getSLIList() {
        return sLIList;
    }

    /**
     * En metode, der tilføjer et salesLineItem til salget
     * @param sLI
     * @return Salgslinje-ID
     */
    public int addSalesLineItem(SalesLineItem sLI) {
        int sLIID = generateID(sLI);
        sLIList.add(sLI);
        return sLIID;
    }

    /**
     * @param sLIID
     * @return Et objekt af klassen SalesLineItem
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
     * @param sLI
     * @return ID
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
