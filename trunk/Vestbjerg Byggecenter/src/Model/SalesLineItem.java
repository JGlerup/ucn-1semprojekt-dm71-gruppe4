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

    public SalesLineItem(int quantity, int totalPrice)
    {
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    
}
