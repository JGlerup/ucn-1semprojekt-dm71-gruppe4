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

    public Sale(String date, double price, Employee employee)
    {
        this.date = date;
        this.price = price;
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
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    public ArrayList<SalesLineItem> getsLIList() {
        return sLIList;
    }

    public void addSalesLineItem(SalesLineItem salesLineItem)
    {
        sLIList.add(salesLineItem);
    }

    public void setEmployee(Employee e)
    {
        employee = e;
    }
}
