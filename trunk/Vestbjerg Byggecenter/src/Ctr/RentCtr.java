/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;


import Model.Rent;
import Model.RentContainer;
import Model.RentItemContainer;
import Model.RentableItem;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class RentCtr {

    private RentContainer rentContainer;
    private RentItemContainer rentItemContainer;

    public RentCtr()
    {
        rentContainer = RentContainer.getInstance();
        rentItemContainer = RentItemContainer.getInstance();
    }

    public int rentItem(int itemID, String date, String status)
    {
        DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date();
        if (date == null)
        date = dt.format(currentDate);


        RentableItem item = rentItemContainer.findItem(itemID);

        Rent rent = new Rent (date, status, item);

        return rentContainer.addRent(rent);

    }

    public void deliverItem(int id)
    {
        rentContainer.deliverItem(id);
    }


}
