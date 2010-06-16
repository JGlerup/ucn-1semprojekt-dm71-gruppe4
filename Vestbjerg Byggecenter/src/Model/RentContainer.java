/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 * Klassen RentContainer repræsenterer en container for rent-objekter.
 * Den fungerer som en datase, hvor det er muligt
 * at gemme, slette og finde udlejninger.
 */
public class RentContainer {

    private static RentContainer instance;
    private ArrayList<Rent> rentList;

    /**
     *
     */
    public RentContainer() {
        rentList = new ArrayList<Rent>();
    }

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
     * @param rent
     * @return
     */
    public int addRent(Rent rent) {
        int id = generateID(rent);
        setRented(rent);
        rentList.add(rent);
        return id;
    }

    /**
     *
     * @param id
     */
    public void deliverItem(int id) {
        for (Rent rent : rentList) {
            if (rent.getID() == id) {
                RentableItem item = rent.getRentableItem();
                item.setIsRented(false);
                rentList.remove(rent);
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
            if (rentList.size() != 0) {
                int lastIndex = rentList.size() - 1;
                Rent lastRent = rentList.get(lastIndex);
                newID = lastRent.getID();
                newID += 1;
            }
            rent.setID(newID);
        }


        return newID;
    }

    public ArrayList<Rent> getRentContainer() {
        return rentList;
    }

    public Rent findRent(int ID) {
        Rent rent = null;
        for (Rent r : rentList) {
            if (ID == r.getID()) {
                rent = r;
            }
        }
        return rent;
    }
}

