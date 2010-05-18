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
public class ItemCtr {
    
    private ItemContainer itemCon;
    
    public ItemCtr()
    {
         itemCon = ItemContainer.getInstance();
    }
           

    public Item getItem(int itemID)
    {
        Item item = itemCon.getItem(itemID);
        
        return item;
    }
    
    public void createItem(int itemPrice, String description, int maxInStock, int minInStock, int inStock, String type, String brand, String place)
    {
        int itemID = itemCon.generateID();
        Item item = new Item(itemID, itemPrice, description, maxInStock, minInStock, inStock, type, brand, place);
        itemCon.addItem(item);
    }
	
    public void deleteItem(int itemID)
    {
    	itemCon.deleteItem(itemID);
    }

    public boolean updateItem(int itemID, int itemPrice, String description, int maxInStock, int minInStock, int inStock, String type, String brand, String place)
    {
        Item i = itemCon.getItem(itemID);
        if(i != null)
        {
            i.setBrand(brand);
            i.setDescription(description);
            i.setInStock(inStock);
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

    public String listAllItems()
    {
        return itemCon.listAllItem();
    }
}
