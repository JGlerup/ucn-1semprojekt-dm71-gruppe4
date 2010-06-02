/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

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
    private boolean containUnits;
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
    public Item(String itemName, double itemPrice, String description, int maxInStock, int minInStock, int itemsInStock, String brand, String place)
    {
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
    public Unit getFirstUnit()
    {
        int index = 0;
        Unit u = null;
        boolean found = false;

        while(!found && index < unitList.size() && u == null)
        {
            if(unitList.get(index) != null)
            {
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

    /**
     *
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     *
     * @return
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     *
     * @param ItemPrice
     */
    public void setItemPrice(double ItemPrice) {
        this.itemPrice = ItemPrice;
    }

    /**
     *
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public int getItemsInStock() {
        return itemsInStock;
    }

    /**
     *
     * @param itemsInStock
     */
    public void setItemsInStock(int itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    /**
     *
     * @return
     */
    public int getMaxInStock() {
        return maxInStock;
    }

    /**
     *
     * @param maxInStock
     */
    public void setMaxInStock(int maxInStock) {
        this.maxInStock = maxInStock;
    }

    /**
     *
     * @return
     */
    public int getMinInStock() {
        return minInStock;
    }

    /**
     *
     * @param minInStock
     */
    public void setMinInStock(int minInStock) {
        this.minInStock = minInStock;
    }

    /**
     *
     * @return
     */
    public String getPlace() {
        return place;
    }

    /**
     *
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     *
     * @param serialNo
     * @return
     */
    public Unit getUnit(int serialNo)
    {
        Unit u = null;
        for(Unit unit : unitList)
        {
            if(serialNo == u.getSerialNo())
            {
                u = unit;
            }
        }
        return u;
    }

    /**
     *
     * @param u
     */
    public void addUnit(Unit u)
    {
        unitList.add(u);
    }

    /**
     *
     * @param u
     */
    public void addUnitList(ArrayList<Unit> u)
    {
        unitList.addAll(0, u);
    }

    /**
     *
     * @param u
     */
    public void removeUnit(Unit u)
    {
        unitList.remove(u);
    }

    /**
     *
     * @return
     */
    public boolean getContainUnits() {
        return containUnits;
    }

    /**
     *
     * @param containUnits
     */
    public void setContainUnits(boolean containUnits) {
        this.containUnits = containUnits;
    }
}
