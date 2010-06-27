/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 * Klassen RentItemContainer repræsenterer en container for
 * rentableItem-objekter.
 * Den fungerer som en datase, hvor det er muligt
 * at gemme, slette og finde udlejningsvarer.
 */
public class RentableItemContainer {

    private static RentableItemContainer instance;
    private ArrayList<RentableItem> rentableItemList;

    /**
     *
     */
    public RentableItemContainer() {
        rentableItemList = new ArrayList<RentableItem>();
    }

    /**
     *
     * @return
     */
    public static RentableItemContainer getInstance() {
        if (instance == null) {
            instance = new RentableItemContainer();
        }
        return instance;
    }

    public ArrayList<RentableItem> getRentableItemList() {
        return rentableItemList;
    }

    /**
     *
     * @param ID
     * @return
     */
    public RentableItem findItem(int ID) {
        RentableItem i = null;
        for (RentableItem item : rentableItemList) {
            if (ID == item.getID()) {
                i = item;
            }
        }
        return i;
    }

    /**
     *
     * @param newItem
     * @return
     */
    public int addRentableItem(RentableItem newItem) {
        int id = generateID(newItem);
        rentableItemList.add(newItem);
        return id;

    }

    /**
     *
     * @param id
     * @return
     */
    public RentableItem getRentableItem(int id) {
        for (RentableItem item : rentableItemList) {
            if (item.getID() == id) {
                return item;
            }
        }
        return null;
    }

    /**
     *
     * @param id
     */
    public void deleteItem(int id) {
        RentableItem item = getRentableItem(id);
        if (item != null) {
            rentableItemList.remove(item);
        }
    }

    /**
     *
     * @param item
     * @return
     */
    public int generateID(RentableItem item) {
        int newID = 1;

        if (item.getID() == 0) {
            if (rentableItemList.size() != 0) {
                int lastIndex = rentableItemList.size() - 1;
                RentableItem lastItem = rentableItemList.get(lastIndex);
                newID = lastItem.getID();
                newID += 1;
            }
            item.setID(newID);
        }

        return newID;
    }

    /**
     *
     * @return
     */
    public RentableItem getAvaliableItem() {
        if (this.rentableItemList.size() > 0) {
            for (RentableItem item : this.rentableItemList) {
                if (!item.getIsRented()) {
                    return item;
                }
            }
        }

        return null;
    }
}
