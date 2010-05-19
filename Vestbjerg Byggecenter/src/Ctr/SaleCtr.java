/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;

import Model.Sale;
import Model.SalesContainer;
import Model.SalesLineItem;

/**
 *
 * @author Daniel
 */
public class SaleCtr {
    private SalesContainer salesContainer;
    private Sale salesLineItemList;
    
    public SaleCtr()
    {
        salesContainer = SalesContainer.getInstance();
    }
    
    public void createSale(String newDate, int newPrice, int newQuantity, int newTotalPrice)
    {
        int index = 0;
        Sale saleObjekt = new Sale(newDate, newPrice);
        salesContainer.createSale(saleObjekt);
        SalesLineItem sLIObjekt = new SalesLineItem(newQuantity, newTotalPrice);
        index = salesContainer.listSales().size() -1;
        salesLineItemList.createSalesLineItem(sLIObjekt);
    }

    public void createSalesLineItem(int newQuantity, int newTotalPrice)
    {
        int index = 0;
        SalesLineItem sLIObjekt = new SalesLineItem(newQuantity, newTotalPrice);
        index = salesContainer.listSales().size() -1;
        salesLineItemList.createSalesLineItem(sLIObjekt);
    }

}
