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

    private String date;
    private int price;
    private boolean order;
    private ArrayList<SalesLineItem> sLIList;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Sale(String date, int price)
    {
        this.date = date;
        this.price = price;
        sLIList = new ArrayList<SalesLineItem>();
    }

    public void createSalesLineItem(SalesLineItem newSalesLineItem)
    {
        sLIList.add(newSalesLineItem);
    }

}
