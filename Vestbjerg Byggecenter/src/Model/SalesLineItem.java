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
    private int totalPrice;
    private ItemContainer itemContainer;
    private Item item;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public SalesLineItem(int ID, int quantity, int totalPrice)
    {
        Item item = itemContainer.getItem(ID);
        setItem(item);
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public void setItem(Item newItem)
    {
        item = newItem;
    }
}