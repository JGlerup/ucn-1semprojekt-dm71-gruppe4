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
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class SaleCtr {
    private SalesContainer salesContainer;
    private Sale sale;
    private EmployeeContainer employeeContainer;
    private ItemContainer itemContainer;

    public SaleCtr()
    {
        salesContainer = SalesContainer.getInstance();
        itemContainer = ItemContainer.getInstance();
        employeeContainer = EmployeeContainer.getInstance();
    }

    public int createSale(int employeeID, int itemID, String saleDate, int saleQuantity)
    {
        Employee e = employeeContainer.findEmployee(employeeID);
        Item i = itemContainer.getItem(itemID);
        double saleTotalPrice = i.getItemPrice() * saleQuantity;
        SalesLineItem sli = new SalesLineItem(saleQuantity, saleTotalPrice, i);
        Sale s = new Sale(saleDate, saleTotalPrice, e);
        s.addSalesLineItem(sli);
        return salesContainer.addSale(s);
    }

    public double calculateTotalPrice(int saleID)
    {
        double totalPrice = 0;
        for(SalesLineItem sLI : salesContainer.getSale(saleID).getSLIList())
        {
            totalPrice =+ sLI.getTotalPrice();
        }
        return totalPrice;
    }

    public void endSale()
    {

    }

    public Sale getSale(int saleID)
    {
        return salesContainer.getSale(saleID);
    }

    public void addSalesLineItem(int saleID, int itemID, int saleQuantity)
    {
        Item i = itemContainer.getItem(itemID);
        double saleTotalPrice = i.getItemPrice() * saleQuantity;
        SalesLineItem sli = new SalesLineItem(saleQuantity, saleTotalPrice, i);
        salesContainer.getSale(saleID).addSalesLineItem(sli);
    }

    public void removeSalesLineItem(int saleID, int sLIID)
    {
        salesContainer.getSale(saleID).removeSalesLineItem(sLIID);
    }

    public ArrayList<SalesLineItem> getSLIList(int saleID) {
        return salesContainer.getSale(saleID).getSLIList();
    }

    public void printContentsSale(int saleID)
    {
	for(SalesLineItem sLI : salesContainer.getSale(saleID).getSLIList())
	{
            System.out.println("ID: " + sLI.getSLIID() + " Varenavn: " + sLI.getItem().getItemName() + " Mængde: " + sLI.getQuantity());
	}
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
