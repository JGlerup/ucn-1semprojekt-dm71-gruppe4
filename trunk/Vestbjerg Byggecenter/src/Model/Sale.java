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

    public Sale(String date, Employee employee)
    {
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
        return price;
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

    public ArrayList<SalesLineItem> getSLIList() {
        return sLIList;
    }

    public int addSalesLineItem(SalesLineItem sLI)
    {
        int sLIID = generateID(sLI);
        sLIList.add(sLI);
        return sLIID;
    }

    public SalesLineItem getSalesLineItem(int sLIID)
    {
        int index = 0;
        SalesLineItem sLI = null;
        boolean found = false;
        while(!found && index < sLIList.size())
        {
            if(sLIList.get(index).getSLIID() == sLIID)
            {
                sLI = sLIList.get(index);
                found = true;
            }
            index++;
        }
        return sLI;
    }

    public void removeSalesLineItem(int sLIID)
    {
        int index = 0;
        int storeIndex = 0;
        boolean found = false;
        while(!found && index < sLIList.size())
        {
            if(sLIList.get(index).getSLIID() == sLIID)
            {
                storeIndex = index;
                found = true;
            }
            index++;
        }
        sLIList.remove(storeIndex);
    }

    public int generateID(SalesLineItem sLI)
    {
        int newID = 1;

        if (sLI.getSLIID() == 0)
        {
            if(sLIList.size() != 0)
            {
                int lastIndex = sLIList.size() -1;
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
