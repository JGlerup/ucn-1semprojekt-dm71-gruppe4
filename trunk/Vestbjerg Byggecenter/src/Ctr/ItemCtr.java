/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;

import Model.Item;
import Model.ItemContainer;
import Model.Unit;

/**
 *
 * @author Daniel
 */
public class ItemCtr
{

    private ItemContainer itemCon;
    private int serialNo = 1;
    
    /**
     *
     */
    public ItemCtr()
    {
         itemCon = ItemContainer.getInstance();
    }
           
    /**
     *
     * @param itemID
     * @return
     */
    public Item getItem(int itemID)
    {  
        return itemCon.getItem(itemID);
    }
    
    /**
     *
     * @param itemPrice
     * @param description
     * @param maxInStock
     * @param minInStock
     * @param inStock
     * @param type
     * @param brand
     * @param place
     * @return
     */
    public int createItem(double itemPrice, String description, int maxInStock, int minInStock, int inStock, String type, String brand, String place)
    {
        Item i = new Item(itemPrice, description, maxInStock, minInStock, inStock, type, brand, place);
        return itemCon.addItem(i);
    }

    public boolean checkSupplyLimit(int minInStock, int maxInStock, int itemsInStock)
    {
        while(minInStock < itemsInStock && maxInStock > itemsInStock)
        {
            return false;
        }
        return true;
    }

	
    /**
     *
     * @param itemID
     */
    public void deleteItem(int itemID)
    {
    	itemCon.deleteItem(itemID);
    }

    /**
     *
     * @param itemID
     * @param itemPrice
     * @param description
     * @param maxInStock
     * @param minInStock
     * @param inStock
     * @param type
     * @param brand
     * @param place
     * @return
     */
    public boolean updateItem(int itemID, int itemPrice, String description, int maxInStock, int minInStock, int inStock, String type, String brand, String place)
    {
        Item i = itemCon.getItem(itemID);
        if(i != null)
        {
            i.setBrand(brand);
            i.setDescription(description);
            i.setItemsInStock(inStock);
            i.setItemPrice(itemPrice);
            i.setMaxInStock(maxInStock);
            i.setMinInStock(minInStock);
            i.setPlace(place);
            i.setType(type);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     *
     * @return
     */
    public String listAllItems()
    {
        return itemCon.listAllItem();
    }

    public int assignUnit(int itemID)
    {
        Item i = itemCon.getItem(itemID);
        int lol = generateSerialNo();
        Unit u = new Unit(lol);
        i.addUnit(u);
        return lol;
    }

    public int generateSerialNo()
    {
        return serialNo++;
    }

    public void updateItemPrice(int itemID, double itemPrice)
    {
        Item i = itemCon.getItem(itemID);
        i.setItemPrice(itemPrice);
    }

    public void updateDescription(int itemID, String description)
    {
        Item i = itemCon.getItem(itemID);
        i.setDescription(description);
    }

    public void updateMaxInStock(int itemID, int maxInStock)
    {
        Item i = itemCon.getItem(itemID);
        i.setMaxInStock(maxInStock);
    }

    public void updateMinInStock(int itemID, int minInStock)
    {
        Item i = itemCon.getItem(itemID);
        i.setMinInStock(minInStock);
    }

    public void updateItemsInStock(int itemID, int itemsInStock)
    {
        Item i = itemCon.getItem(itemID);
        i.setItemsInStock(itemsInStock);
    }

    public void updateType(int itemID, String type)
    {
        Item i = itemCon.getItem(itemID);
        i.setType(type);
    }

    public void updateBrand(int itemID, String brand)
    {
        Item i = itemCon.getItem(itemID);
        i.setBrand(brand);
    }

    public void updatePlace(int itemID, String place)
    {
        Item i = itemCon.getItem(itemID);
        i.setPlace(place);
    }
}

