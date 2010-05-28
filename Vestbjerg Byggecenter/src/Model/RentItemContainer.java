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
public class RentItemContainer {

    private static RentItemContainer instance;
    private ArrayList<RentableItem> rentItems;

    public static RentItemContainer getInstance()
    {
        if (instance == null)
        {
            instance = new RentItemContainer();
        }
        return instance;
    }


    public RentItemContainer()
    {
        rentItems = new ArrayList<RentableItem>();
    }

     public RentableItem findItem(int ID)
    {
        RentableItem i = null;
        for(RentableItem item : rentItems)
        {
            if(ID == item.getID())
            {
                i = item;
            }
        }
        return  i;
    }


    public int addRentableItem(RentableItem newItem)
    {
        int id = generateID(newItem);
        rentItems.add(newItem);
        return id;

    }
    
    public RentableItem getRentableItem(int id)
    {
      for(RentableItem item : rentItems)
      {
          if(item.getID() == id)
          {
              return item;
          }
      }
      return null;
    }

     public void deleteItem(int id)
    {
        RentableItem item = getRentableItem(id);
        if(item!= null)
            rentItems.remove(item);
    }

      public int generateID(RentableItem item)
    {
        int newID = 1;

        if (item.getID() == 0)
        {
            if(rentItems.size() != 0)
            {
                int lastIndex = rentItems.size() -1;
                RentableItem lastItem = rentItems.get(lastIndex);
                newID = lastItem.getID();
                newID += 1;
            }
            item.setID(newID);
        }

        return newID;
    }


      public RentableItem getAvaliableItem()
    {
        if (this.rentItems.size() > 0)
        {
            for (RentableItem item : this.rentItems)
            {
                if (!item.getIsRented())
                {
                    return item;
                }
            }
        }

        return null;
    }



}
