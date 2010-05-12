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

    private ArrayList<Item> items;
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
        items = new ArrayList<Item>();
    }

    public void addItem(Item newItem)
    {
        items.add(newItem);
    }


    public Item getItem(int id)
    {
      for(Item item : items)
      {
          if(item.getItemId() == id)
          {
              return item;
          }
      }
      return null;
    }

}
