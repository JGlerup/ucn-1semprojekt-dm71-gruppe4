/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class ItemContainer {

    private ArrayList<Item> itemList;
    private static ItemContainer instance;


     public static ItemContainer getInstance()
    {
        if (instance == null)
        {
            instance = new ItemContainer();
        }
        return instance;
    }


    public ItemContainer()
    {
        itemList = new ArrayList<Item>();
    }

    public int addItem(Item item)
    {
        int id = generateID(item);
        itemList.add(item);
        return id;
    }

    public int generateID(Item item)
    {
        int newID = 1;

        if (item.getItemID() == 0)
        {
            if(itemList.size() != 0)
            {
                int lastIndex = itemList.size() -1;
                Item lastItem = itemList.get(lastIndex);
                newID = lastItem.getItemID();
                newID += 1;
            }
            item.setItemID(newID);
        }

        return newID;
    }


    public Item getItem(int itemID)
    {
        Item i = null;
        for(Item item : itemList)
        {
            if(itemID == item.getItemID())
            {
                i = item;
            }
        }
        return i;
    }

    public void deleteItem(int itemID)
    {
        int index = 0;
        int storeIndex = 0;
        boolean found = false;
        while(!found && index < itemList.size())
        {
            if(itemList.get(index).getItemID() == itemID)
            {
                storeIndex = index;
                found = true;
            }
            index++;
        }
        itemList.remove(storeIndex);
    }

    public String listAllItem()
    {
        String outputString = " ";
        for(Item i : itemList)
        {
            outputString = outputString + "ID:" + i.getItemID() + " - " + i.getDescription()+ "\n";
        }
        return outputString;
    }
}


