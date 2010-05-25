/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;

/**
 *
 * @author Glerup
 */
public class SalesContainer {
    private static SalesContainer instance;
    private ArrayList<Sale> saleList;

    public SalesContainer()
    {
        saleList = new ArrayList<Sale>();
    }

    public static SalesContainer getInstance()
    {
        if(instance == null)
        {
            instance = new SalesContainer();
        }
        return instance;
    }

    public int createSale(Sale s)
    {
        int saleID = generateID(s);
        saleList.add(s);
        return saleID;
    }

    public ArrayList<Sale> listSales()
    {
        return saleList;
    }

    public Sale getSale(int saleID)
    {
        int index = 0;
        boolean found = false;
        Sale s = null;
        while(!found && index < saleList.size())
        {
            if(saleList.get(index).getSaleID() == saleID)
            {
                s = saleList.get(index);
            }
        }
        return s;
    }

    public int generateID(Sale s)
    {
        int newID = 1;

        if (s.getSaleID() == 0)
        {
            if(saleList.size() != 0)
            {
                int lastIndex = saleList.size() -1;
                Sale lastSale = saleList.get(lastIndex);
                newID = lastSale.getSaleID();
                newID += 1;
            }
            s.setSaleID(newID);
        }
        return newID;
    }
}
