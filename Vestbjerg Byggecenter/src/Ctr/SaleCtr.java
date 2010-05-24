/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;

import Model.EmployeeContainer;
import Model.Employee;
import Model.Sale;
import Model.SalesContainer;
import Model.SalesLineItem;
import Model.Item;
import Model.ItemContainer;

/**
 *
 * @author Daniel
 */
public class SaleCtr {
    private SalesContainer salesContainer;
    private Sale salesLineItemList;
    private EmployeeContainer employee;
    private ItemContainer itemContainer;
    
    public SaleCtr()
    {
        salesContainer = SalesContainer.getInstance();
        itemContainer = ItemContainer.getInstance();
    }

    public void createSale(int employeeID, int itemID, String saleDate, double salePrice, int saleQuantity)
    {
        Employee e = employee.findEmployee(employeeID);
        Item i = itemContainer.getItem(itemID);
        double saleTotalPrice = i.getItemPrice() * saleQuantity;
        SalesLineItem sli = new SalesLineItem(saleQuantity, saleTotalPrice, i);
        Sale s = new Sale()
        



    }
    
//    public void createSale(String newDate, int newPrice, int newID, int newQuantity, int newTotalPrice)
//    {
//        int index = 0;
//        index = employee.listEmployee().size() -1;
//        Sale saleObjekt = new Sale(newDate, newPrice);
//        salesContainer.createSale(saleObjekt);
//        SalesLineItem sLIObjekt = new SalesLineItem(newID, newQuantity, newTotalPrice);
//        index = salesContainer.listSales().size() -1;
//        salesLineItemList.createSalesLineItem(sLIObjekt);
//    }
//
//    public void createSalesLineItem(int newID, int newQuantity, int newTotalPrice)
//    {
//        int index = 0;
//        SalesLineItem sLIObjekt = new SalesLineItem(newID, newQuantity, newTotalPrice);
//        index = salesContainer.listSales().size() -1;
//        salesLineItemList.createSalesLineItem(sLIObjekt);
//    }
}
