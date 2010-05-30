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
public class SaleContainer {
    private static SaleContainer instance;
    private ArrayList<Sale> saleList;

    public SaleContainer()
    {
        saleList = new ArrayList<Sale>();
    }

    public static SaleContainer getInstance()
    {
        if(instance == null)
        {
            instance = new SaleContainer();
        }
        return instance;
    }

    public int addSale(Sale s)
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
                found = true;
            }
            index++;
        }
        return s;
    }

    public void deleteSale(int saleID)
    {
        int index = 0;
        int storeIndex = 0;
        boolean found = false;
        while(!found && index < saleList.size())
        {
            if(saleList.get(index).getSaleID() == saleID)
            {
                storeIndex = index;
                found = true;
            }
            index++;
        }
        saleList.remove(storeIndex);
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
