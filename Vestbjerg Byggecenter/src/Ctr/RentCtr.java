package Ctr;

import java.util.ArrayList;
import Model.*;
/**
 *
 * @author KL-DELL
 */
public class RentCtr {

    private RentContainer rentContainer;

    public RentCtr()
    {
        rentContainer = new RentContainer();
    }

    public void createRent(int rentID, int serial)
    {
        rentContainer.createRent(rentID, serial);
    }

    public String findRent(int rentID)
    {
        Rent r = rentContainer.findRent(rentID);
        String outputString = "Rent id: " + r.getRentID() + "\n" + "Rental date: " + r.getRentDate() + "\n" + "Rental return date: " + r.getReturnDate() + "\n" + "Rented unit: " + r.getRentUnit();
        return outputString;
    }

    public void endRent(int rentID)
    {
        rentContainer.endRent(rentID);
    }

    public String listAllRents()
    {
        return rentContainer.listAllRents();
    }
}
