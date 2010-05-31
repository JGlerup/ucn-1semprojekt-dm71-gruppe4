/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ctr;

import Model.Customer;
import Model.CustomerContainer;
import Model.Discount;
import Model.EmployeeContainer;
import Model.Employee;
import Model.Sale;
import Model.SaleContainer;
import Model.SalesLineItem;
import Model.Item;
import Model.ItemContainer;
import Model.Unit;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class SaleCtr {
    private SaleContainer saleContainer;
    private Sale sale;
    private EmployeeContainer employeeContainer;
    private ItemContainer itemContainer;
    private CustomerContainer customerContainer;
    private Discount discount;



    public SaleCtr()
    {
        saleContainer = SaleContainer.getInstance();
        itemContainer = ItemContainer.getInstance();
        employeeContainer = EmployeeContainer.getInstance();
        customerContainer = CustomerContainer.getInstance();
    }

    public int createSale(int employeeID, int itemID, String saleDate, int itemQuantity, int itemsInStock)
    {
        Employee e = employeeContainer.findEmployee(employeeID);
        Sale s = new Sale(saleDate, e);
        Discount d = new Discount();
        s.setDiscount(d);
        int saleID = saleContainer.addSale(s);
        addSalesLineItem(saleID, itemID, itemQuantity);
        return saleID;
    }

    public void setSaleTotalPrice(int saleID)
    {
        double totalPrice = 0;
        for(SalesLineItem sLI : saleContainer.getSale(saleID).getSLIList())
        {
            totalPrice =+ sLI.getTotalPrice();
        }
        saleContainer.getSale(saleID).setPrice(totalPrice);
    }


    public Sale getSale(int saleID)
    {
        return saleContainer.getSale(saleID);
    }

    public void deleteSale(int saleID)
    {
        saleContainer.deleteSale(saleID);
    }

    public void addSalesLineItem(int saleID, int itemID, int itemQuantity)
    {
        Item i = itemContainer.getItem(itemID);
        double saleTotalPrice = i.getItemPrice() * itemQuantity;
        int currentINS = i.getItemsInStock();
        SalesLineItem sli = new SalesLineItem(itemQuantity, saleTotalPrice, i);
        saleContainer.getSale(saleID).addSalesLineItem(sli);
        i.setItemsInStock(currentINS - itemQuantity);
        setSaleTotalPrice(saleID);
        if(i.getContainUnits() == true)
        {
            int index = 0;
            while(itemQuantity > index)
            {
                Unit u = i.getFirstUnit();
                sli.addUnit(u);
                i.removeUnit(u);
                index++;
            }
        }
    }

    public void removeSalesLineItem(int saleID, int sLIID)
    {
        SalesLineItem sLI = saleContainer.getSale(saleID).getSalesLineItem(sLIID);
        Item i = sLI.getItem();
        int itemQuantity = sLI.getQuantity();
        int currentINS = i.getItemsInStock();
        i.setItemsInStock(currentINS + itemQuantity);
        if(i.getContainUnits() == true)
        {
            ArrayList<Unit> unitList = sLI.getUnitList();
            i.addUnitList(unitList);
        }
        saleContainer.getSale(saleID).removeSalesLineItem(sLIID);
        setSaleTotalPrice(saleID);
    }

    public ArrayList<SalesLineItem> getSLIList(int saleID) {
        return saleContainer.getSale(saleID).getSLIList();
    }

    public void printContentsSale(int saleID)
    {
	for(SalesLineItem sLI : saleContainer.getSale(saleID).getSLIList())
	{
            System.out.println("ID: " + sLI.getSLIID() + " Varenavn: " + sLI.getItem().getItemName() + " Mængde: " + sLI.getQuantity());
	}
    }

    public void addCustomerToSale(int saleID, int customerID)
    {
        Customer c = customerContainer.findCustomer(customerID);
        saleContainer.getSale(saleID).setCustomer(c);
    }

    public void removeCustomerFromSale(int saleID)
    {
        saleContainer.getSale(saleID).setCustomer(null);
    }

    public void cancelSale(int saleID)
    {
        int index = 0;
        ArrayList<SalesLineItem> sLIList = getSLIList(saleID);
        while(sLIList.size() > index)
	{
            int sLID = sLIList.get(index).getSLIID();
            removeSalesLineItem(saleID, sLID);
            index++;
	}
        deleteSale(saleID);
    }

    public double getQuntityDiscount()
    {
        double quntityDiscount = discount.getQuantityDiscount();

        return quntityDiscount;
    }

    public void setQuntityDiscount(double newDiscount)
    {
        discount.setQuantityDiscount(newDiscount);
    }

    public double getPickupDiscount()
    {
        double pickupDiscount = discount.getPickupDiscount();

        return pickupDiscount;
    }

    public void setPickupDiscount(double newDiscount)
    {
        discount.setPickupDiscount(newDiscount);
    }
}
