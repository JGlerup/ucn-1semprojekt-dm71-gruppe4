/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctr;

import Model.RentableItemContainer;
import Model.RentableItem;
import java.util.ArrayList;

/**
 * Controller-klassen for Rent
 */
public class RentableItemCtr {

    private RentableItemContainer rentableItemContainer;

    /**
     * Konstruktør
     * Initialiserer feltet rentableItemContainer
     */
    public RentableItemCtr() {
        rentableItemContainer = RentableItemContainer.getInstance();
    }

    /**
     * En metode, der kalder metoden getRentableItem. Den finder et objekt af
     * klassen RentableItem
     * @param id Søgeværdi
     * @return Et objekt af klassen RentableItem
     */
    public RentableItem getItem(int id) {
        RentableItem item = rentableItemContainer.getRentableItem(id);

        return item;
    }

    /**
     * En metode, der laver et objekt af klassen RentableItem og tilføjer dette
     * til RentItemContainer
     * @param name
     * @return Vare-ID Søgeværdi
     */
    public int createItem(String name) {
        RentableItem item = new RentableItem(name);

        return rentableItemContainer.addRentableItem(item);
    }

    /**
     * En metode, der kalder metoden deleteItem
     * @param id Søgeværdi
     */
    public void deleteRentableItem(int id) {
        rentableItemContainer.deleteItem(id);

    }

    public ArrayList<RentableItem> getRentableItemList()
    {
        return rentableItemContainer.getRentableItemList();
    }
}
