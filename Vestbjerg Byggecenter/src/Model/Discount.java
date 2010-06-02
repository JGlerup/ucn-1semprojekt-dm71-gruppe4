/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Klassen repræsenterer et discount-objekt. Informationer vedr. discount
 * bliver gemt og kan hentes.
 */
public class Discount {

    private double quantityDiscount;
    private double pickupDiscount;

    public Discount() {
        this.quantityDiscount = 1;
        this.pickupDiscount = 1;
    }

    public double getPickupDiscount() {
        return pickupDiscount;
    }

    public void setPickupDiscount(double pickupDiscount) {
        this.pickupDiscount = pickupDiscount;
    }

    public double getQuantityDiscount() {
        return quantityDiscount;
    }

    public void setQuantityDiscount(double quantityDiscount) {
        this.quantityDiscount = quantityDiscount;
    }
}
