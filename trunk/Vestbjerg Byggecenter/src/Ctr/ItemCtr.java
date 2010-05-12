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
           

    public Item getItem(int id)
    {
        Item item = itemCon.getItem(id);
        
        return item;
    }
    
    public void createItem(int itemId, int itemPrice, String description, int maxInStock, int minInStock, int inStock, String type, String brand, String place)
    {
        Item item = new Item(itemId, itemPrice, description, maxInStock, minInStock, inStock, type, brand, place);
        
        itemCon.addItem(item);
    }
    
}
