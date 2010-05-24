/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Daniel
 */
public class SalesLineItem {

    private int quantity;
    private double totalPrice;
    private ItemContainer itemContainer;
    private Item item;

    public SalesLineItem(int quantity, double totalPrice, Item item)
    {
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.item = item;
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

    public void setItem(Item newItem)
    {
        item = newItem;
    }
}