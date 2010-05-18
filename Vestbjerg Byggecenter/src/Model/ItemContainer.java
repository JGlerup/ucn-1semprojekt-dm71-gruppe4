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

    public void addItem(Item newItem)
    {
        itemList.add(newItem);
    }


    public Item getItem(int itemID)
    {
      for(Item item : itemList)
      {
          if(item.getItemID() == itemID)
          {
              return item;
          }
      }
      return null;
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


