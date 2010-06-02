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
public class RentContainer {

    private static RentContainer instance;
    private ArrayList<Rent> rentContainer;

    /**
     *
     * @return
     */
    public static RentContainer getInstance() {
        if (instance == null) {
            instance = new RentContainer();
        }
        return instance;
    }

    /**
     *
     */
    public RentContainer() {
        rentContainer = new ArrayList<Rent>();
    }

    /**
     *
     * @param rent
     * @return
     */
    public int addRent(Rent rent) {
        int id = generateID(rent);
        setRented(rent);
        rentContainer.add(rent);
        return id;
    }

    /**
     *
     * @param id
     */
    public void deliverItem(int id) {
        for (Rent rent : rentContainer) {
            if (rent.getID() == id) {
                RentableItem item = rent.getRentableItem();
                item.setIsRented(false);
                rentContainer.remove(rent);
                return;
            }
        }
    }

    /**
     *
     * @param rent
     */
    public void setRented(Rent rent) {
        RentableItem item = rent.getRentableItem();
        if (item != null) {
            item.setIsRented(true);
        }
    }

    /**
     *
     * @param rent
     * @return
     */
    public int generateID(Rent rent) {
        int newID = 1;


        if (rent.getID() == 0) {
            if (rentContainer.size() != 0) {
                int lastIndex = rentContainer.size() - 1;
                Rent lastRent = rentContainer.get(lastIndex);
                newID = lastRent.getID();
                newID += 1;
            }
            rent.setID(newID);
        }


        return newID;
    }
}

