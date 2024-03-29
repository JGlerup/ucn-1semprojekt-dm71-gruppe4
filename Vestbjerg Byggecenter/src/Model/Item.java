/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Klassen repræsenterer et item-objekt. Informationer om varen
 * bliver gemt og kan hentes.
 */
public class Item {

    private int itemID;
    private String itemName;
    private double itemPrice;
    private String description;
    private int maxInStock;
    private int minInStock;
    private int itemsInStock;
    private String brand;
    private String place;
    private boolean containUnits; //Angiver om varen har et serienummer
    private ArrayList<Unit> unitList;

    /**
     * Konstruktør
     * Initialiserer varen
     * @param itemName
     * @param itemPrice
     * @param description
     * @param maxInStock
     * @param minInStock
     * @param itemsInStock
     * @param brand
     * @param place
     */
    public Item(String itemName, double itemPrice, String description, int maxInStock, int minInStock, int itemsInStock, String brand, String place) {
        containUnits = false;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.description = description;
        this.maxInStock = maxInStock;
        this.minInStock = minInStock;
        this.itemsInStock = itemsInStock;
        this.brand = brand;
        this.place = place;
        unitList = new ArrayList<Unit>();
    }

    /**
     * En metode, der søger efter det første unit-objekt i en ArrayList over
     * unit-objekter
     * @return Et objekt af klassen Unit
     */
    public Unit getFirstUnit() {
        int index = 0;
        Unit u = null;
        boolean found = false;

        while (!found && index < unitList.size() && u == null) {
            if (unitList.get(index) != null) {
                u = unitList.get(index);
                found = true;
            }
            index++;
        }
        return u;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
//        return itemPrice;
//        double x = itemPrice;
//        x = (Math.rint(x*100.0)) / 100.0;
//        return x;
        return Math.rint(itemPrice * 100.0) / 100.0;
    }

    public void setItemPrice(double ItemPrice) {
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

    public Unit getUnit(int serialNo) {
        Unit u = null;
        for (Unit unit : unitList) {
            if (serialNo == u.getSerialNo()) {
                u = unit;
            }
        }
        return u;
    }

    public void addUnit(Unit u) {
        unitList.add(u);
    }

    public void addUnitList(ArrayList<Unit> u) {
        unitList.addAll(0, u);
    }

    public void removeUnit(Unit u) {
        unitList.remove(u);
    }

    public boolean getContainUnits() {
        return containUnits;
    }

    public void setContainUnits(boolean containUnits) {
        this.containUnits = containUnits;
    }

    public ArrayList<Unit> getUnitList() {
        return unitList;
    }
}
