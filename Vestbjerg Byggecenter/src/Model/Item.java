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

    private int itemId;
    private int itemPrice;
    private String description;
    private int maxInStock;
    private int minInStock;
    private int inStock;
    private String type;
    private String brand;
    private String place;
    



    public Item(int itemId, int itemPrice, String description, int maxInStock, int minInStock, int inStock, String type, String brand, String place) {
        this.itemId = itemId;
        this.itemPrice = itemPrice;
        this.description = description;
        this.maxInStock = maxInStock;
        this.minInStock = minInStock;
        this.inStock = inStock;
        this.type = type;
        this.brand = brand;
        this.place = place;

    }


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }


    public int getItemPrice() {
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

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
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



}
