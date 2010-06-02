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

    /**
     *
     * @param quantity
     * @param totalPrice
     * @param item
     */
    public SalesLineItem(int quantity, double totalPrice, Item item)
    {
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.item = item;
        unitList = new ArrayList<Unit>();
    }

    /**
     *
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     *
     * @return
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     *
     * @param totalPrice
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     *
     * @return
     */
    public Item getItem() {
        return item;
    }



    /**
     *
     * @param newItem
     */
    public void setItem(Item newItem)
    {
        item = newItem;
    }

    /**
     *
     * @return
     */
    public int getSLIID() {
        return sLIID;
    }

    /**
     *
     * @param sLIID
     */
    public void setsLIID(int sLIID) {
        this.sLIID = sLIID;
    }

    /**
     *
     * @return
     */
    public ArrayList<Unit> getUnitList() {
        return unitList;
    }

    /**
     *
     * @param u
     */
    public void addUnit(Unit u)
    {
        unitList.add(u);
    }
}