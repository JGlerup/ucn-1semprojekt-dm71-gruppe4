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

    public Sale(String date, int price)
    {
        this.date = date;
        this.price = price;
        sLIList = new ArrayList<SalesLineItem>();
    }

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



    public void addSalesLineItem(SalesLineItem salesLineItem)
    {
        sLIList.add(salesLineItem);
    }

}
