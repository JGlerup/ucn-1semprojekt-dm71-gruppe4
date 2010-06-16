/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Klassen repræsenterer et salesLineItem-objekt. Informationer om salgslinjen
 * bliver gemt og kan hentes.
 */
public class SalesLineItem {

    private int sLIID;
    private int quantity;
    private double totalPrice;
    private Item item;
    private ArrayList<Unit> unitList;

    /**
     * Konstruktør
     * Initialiser salgslinjen
     * @param quantity
     * @param totalPrice
     * @param item
     */
    public SalesLineItem(int quantity, double totalPrice, Item item) {
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
//        return totalPrice;
//        DecimalFormat twoDForm = new DecimalFormat("#.##");
//        return Double.valueOf(twoDForm.format(totalPrice));
//                double x = totalPrice;
//        x = (Math.rint(x*100.0)) / 100.0;
        return Math.rint(totalPrice*100.0) / 100.0;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item newItem) {
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

    public void addUnit(Unit u) {
        unitList.add(u);
    }
}
