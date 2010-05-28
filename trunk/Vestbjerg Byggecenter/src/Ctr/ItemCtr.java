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
    public int createItem(String itemName, double itemPrice, String description, int maxInStock, int minInStock, int itemsInStock, String brand, String place, boolean isYes)
    {
        boolean  yesNo = isYes;
        Item i = new Item(itemName, itemPrice, description, maxInStock, minInStock, itemsInStock, brand, place);
        int itemID = itemCon.addItem(i);

        int antal = itemsInStock;
        
        if (yesNo == true)
        {
        assignStartUnits(itemID, antal);
        i.setContainUnits(true);
        }
        
        return itemID;
    }

    
    
    public boolean checkSupplyLimit(int minInStock, int maxInStock, int itemsInStock)
    {
        while(minInStock <= itemsInStock && maxInStock >= itemsInStock)
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
     * @return
     */
    public String listAllItems()
    {
        return itemCon.listAllItem();
    }


    // Creates new units when new units are ordered to the stock
    public void assignNewUnits(int itemID, int antal)
    {
        
        Item i = itemCon.getItem(itemID);
        int iNS = i.getItemsInStock();
        int number = antal;
        int newINS = antal;
        
        i.setItemsInStock(newINS + iNS);
        
        while (number > 0)
        {
            int unitSerialNo = generateSerialNo();
            Unit u = new Unit(unitSerialNo);
            i.addUnit(u);
            
            number--;
            
        }
    }

    // Creates units for the item when the item is created.l
    public void assignStartUnits(int itemID, int antal)
    {
         
        Item i = itemCon.getItem(itemID);
        int iNS = i.getItemsInStock();
        int number = antal;
        int newINS = antal;
        
        i.setItemsInStock(iNS);
        
        while (number > 0)
        {
            int unitSerialNo = generateSerialNo();
            Unit u = new Unit(unitSerialNo);
            i.addUnit(u);
            
            number--;
            
        }
    }
        
    public void removeAlotOfUnits(int itemID, int antal)
    {

    int numberOfUnits = antal;
    int index = 0;
    while(numberOfUnits > index)
    {
        Unit u = itemCon.getItem(itemID).getFirstUnit();
        itemCon.getItem(itemID).removeUnit(u);
        index++;
    }
    }


    public int generateSerialNo()
    {
        return serialNo++;
    }

    public void updateItemName(int itemID, String itemName)
    {
        Item i = itemCon.getItem(itemID);
        i.setItemName(itemName);
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

    public void updateItemsInStock(int itemID, int newItemsInStock, int quantity)
    {
        Item i = itemCon.getItem(itemID);
//        int currentINS = i.getItemsInStock();
        i.setItemsInStock(newItemsInStock);
        if(i.getContainUnits() == true)
        {
            assignNewUnits(itemID, quantity);
        }
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

    public Unit getFirstUnit(int itemID)
    {
        return itemCon.getItem(itemID).getFirstUnit();
    }
}

