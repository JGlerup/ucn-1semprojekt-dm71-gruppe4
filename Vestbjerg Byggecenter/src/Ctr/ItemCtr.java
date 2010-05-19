/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;

import Model.Item;
import Model.ItemContainer;

/**
 *
 * @author Daniel
 */
public class ItemCtr
{

    private ItemContainer itemCon;
    
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
        Item item = itemCon.getItem(itemID);
        
        return item;
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
}
