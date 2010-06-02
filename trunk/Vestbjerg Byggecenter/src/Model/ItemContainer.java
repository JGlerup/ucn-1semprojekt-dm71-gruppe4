/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 * Klassen ItemContainer repræsenterer en container for item-objekter.
 * Den fungerer som en datase, hvor det er muligt
 * at gemme, slette og finde varer.
 */
public class ItemContainer {

    private ArrayList<Item> itemList;
    private static ItemContainer instance;

    public ItemContainer() {
        itemList = new ArrayList<Item>();
    }

    public static ItemContainer getInstance() {
        if (instance == null) {
            instance = new ItemContainer();
        }
        return instance;
    }

    public int addItem(Item item) {
        int id = generateID(item);
        itemList.add(item);
        return id;
    }

    public int generateID(Item item) {
        int newID = 1;

        if (item.getItemID() == 0) {
            if (itemList.size() != 0) {
                int lastIndex = itemList.size() - 1;
                Item lastItem = itemList.get(lastIndex);
                newID = lastItem.getItemID();
                newID += 1;
            }
            item.setItemID(newID);
        }

        return newID;
    }

    public Item getItem(int itemID) {
        int index = 0;
        Item i = null;
        boolean found = false;
        while (!found && index < itemList.size()) {
            if (itemList.get(index).getItemID() == (itemID)) {
                i = itemList.get(index);
                found = true;
            }
            index++;
        }
        return i;
    }

    public void deleteItem(int itemID) {
        int index = 0;
        int storeIndex = 0;
        boolean found = false;
        while (!found && index < itemList.size()) {
            if (itemList.get(index).getItemID() == itemID) {
                storeIndex = index;
                found = true;
            }
            index++;
        }
        itemList.remove(storeIndex);
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }
}


