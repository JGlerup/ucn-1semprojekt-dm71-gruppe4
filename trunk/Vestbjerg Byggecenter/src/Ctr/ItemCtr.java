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
    
    public void createItem(int itemID, int itemPrice, String description, int maxInStock, int minInStock, int inStock, String type, String brand, String place)
    {
        Item item = new Item(itemID, itemPrice, description, maxInStock, minInStock, inStock, type, brand, place);
        
        itemCon.addItem(item);
    }
	
    public void deleteItem(int itemID)
    {
    	itemCon.deleteItem(itemID);
    }

    public void updateItem(int itemID, int itemPrice, String description, int maxInStock, int minInStock, int inStock, String type, String brand, String place)
    {
    }
}
