/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;

import Model.EmployeeContainer;
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
    private EmployeeContainer employee;
    
    public SaleCtr()
    {
        salesContainer = SalesContainer.getInstance();
    }
    
    public void createSale(String newDate, int newPrice, int newID, int newQuantity, int newTotalPrice)
    {
        int index = 0;
        index = employee.listEmployee().size() -1;
        Sale saleObjekt = new Sale(newDate, newPrice);
        salesContainer.createSale(saleObjekt);
        SalesLineItem sLIObjekt = new SalesLineItem(newID, newQuantity, newTotalPrice);
        index = salesContainer.listSales().size() -1;
        salesLineItemList.createSalesLineItem(sLIObjekt);
    }

    public void createSalesLineItem(int newID, int newQuantity, int newTotalPrice)
    {
        int index = 0;
        SalesLineItem sLIObjekt = new SalesLineItem(newID, newQuantity, newTotalPrice);
        index = salesContainer.listSales().size() -1;
        salesLineItemList.createSalesLineItem(sLIObjekt);
    }

}
