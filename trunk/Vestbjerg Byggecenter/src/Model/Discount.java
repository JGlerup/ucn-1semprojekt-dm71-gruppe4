/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Daniel
 */
public class Discount {

    private double quantityDiscount;
    private double pickupDiscount;


    /**
     *
     */
    public Discount() {
        this.quantityDiscount = 1;
        this.pickupDiscount = 1;
    }

    /**
     *
     * @return
     */
    public double getPickupDiscount() {
        return pickupDiscount;
    }

    /**
     *
     * @param pickupDiscount
     */
    public void setPickupDiscount(double pickupDiscount) {
        this.pickupDiscount = pickupDiscount;
    }

    /**
     *
     * @return
     */
    public double getQuantityDiscount() {
        return quantityDiscount;
    }

    /**
     *
     * @param quantityDiscount
     */
    public void setQuantityDiscount(double quantityDiscount) {
        this.quantityDiscount = quantityDiscount;
    }



}
