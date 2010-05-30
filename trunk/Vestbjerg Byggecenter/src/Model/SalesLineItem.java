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
public class SalesLineItem {

    private int sLIID;
    private int quantity;
    private double totalPrice;
    private ItemContainer itemContainer;
    private Item item;
    private ArrayList<Unit> unitList;

    public SalesLineItem(int quantity, double totalPrice, Item item)
    {
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.item = item;
        unitList = new ArrayList<Unit>();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Item getItem() {
        return item;
    }



    public void setItem(Item newItem)
    {
        item = newItem;
    }

    public int getSLIID() {
        return sLIID;
    }

    public void setsLIID(int sLIID) {
        this.sLIID = sLIID;
    }

    public ArrayList<Unit> getUnitList() {
        return unitList;
    }

    public void addUnit(Unit u)
    {
        unitList.add(u);
    }
}