/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;

import Model.RentItemContainer;
import Model.RentableItem;

/**
 *
 * @author Daniel
 */
public class RentableItemCtr {

    private RentItemContainer itemContainer;

    /**
     *
     */
    public RentableItemCtr()
    {
        itemContainer = RentItemContainer.getInstance();
    }

    /**
     *
     * @param id
     * @return
     */
    public RentableItem getItem(int id)
    {
        RentableItem item = itemContainer.getRentableItem(id);

        return item;
    }

    /**
     *
     * @param name
     * @return
     */
    public int createItem(String name)
    {
        RentableItem item = new RentableItem(name);

        return itemContainer.addRentableItem(item);
    }

    /**
     *
     * @param id
     */
    public void deleteRentableItem(int id)
    {
        itemContainer.deleteItem(id);
        
    }



}
