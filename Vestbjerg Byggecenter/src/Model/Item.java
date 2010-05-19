/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Daniel
 */
public class Item {

    private int itemID;
    private double itemPrice;
    private String description;
    private int maxInStock;
    private int minInStock;
    private int itemsInStock;
    private String type;
    private String brand;
    private String place;
    private Unit unit;
    



    public Item(double itemPrice, String description, int maxInStock, int minInStock, int itemsInStock, String type, String brand, String place)
    {
        this.itemPrice = itemPrice;
        this.description = description;
        this.maxInStock = maxInStock;
        this.minInStock = minInStock;
        this.itemsInStock = itemsInStock;
        this.type = type;
        this.brand = brand;
        this.place = place;
    }


    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }


    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int ItemPrice) {
        this.itemPrice = ItemPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(int itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    public int getMaxInStock() {
        return maxInStock;
    }

    public void setMaxInStock(int maxInStock) {
        this.maxInStock = maxInStock;
    }

    public int getMinInStock() {
        return minInStock;
    }

    public void setMinInStock(int minInStock) {
        this.minInStock = minInStock;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * JEG LAVER LIGE NOGET UNIT FORSØG
     */


    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }






}
