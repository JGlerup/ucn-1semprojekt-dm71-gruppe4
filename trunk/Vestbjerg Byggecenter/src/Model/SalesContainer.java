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

    public void createSale(Sale newSale)
    {
        saleList.add(newSale);
    }

    public ArrayList<Sale> listSales()
    {
        return saleList;
    }
}
