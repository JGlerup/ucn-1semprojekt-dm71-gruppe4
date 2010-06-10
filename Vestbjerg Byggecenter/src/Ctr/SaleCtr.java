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
 * Controller-klassen for Sale
 */
public class SaleCtr {

    private SaleContainer saleContainer;
    private Sale sale;
    private EmployeeContainer employeeContainer;
    private ItemContainer itemContainer;
    private CustomerContainer customerContainer;
    private Discount discount;

    /**
     * Konstruktør
     * Initialiserer felterne saleContainer, itemContainer, employeeContainer,
     * og customerContainer
     */
    public SaleCtr() {
        saleContainer = SaleContainer.getInstance();
        itemContainer = ItemContainer.getInstance();
        employeeContainer = EmployeeContainer.getInstance();
        customerContainer = CustomerContainer.getInstance();
    }

    /**
     * En metode, der laver et objekt af klassen Salg
     * @param employeeID
     * @param itemID
     * @param saleDate
     * @param itemQuantity
     * @param itemsInStock
     * @return Et salgs-ID
     */
    public int createSale(int employeeID, int itemID, String saleDate, int itemQuantity) {
        Employee e = employeeContainer.findEmployee(employeeID);
        Sale s = new Sale(saleDate, e);
        Discount d = new Discount();
        s.setDiscount(d);
        int saleID = saleContainer.addSale(s);
        addSalesLineItem(saleID, itemID, itemQuantity);
        return saleID;
    }

    /**
     * En metode, der beregner den totale pris for et salg
     * ved at gennemgå en ArrayList af SalesLineItem-objekter
     * @param saleID Søgeværdi
     */
    public void setSaleTotalPrice(int saleID) {
        double totalPrice = 0;
        for (SalesLineItem sLI : saleContainer.getSale(saleID).getSLIList()) {
            totalPrice = totalPrice += sLI.getTotalPrice();
        }
        saleContainer.getSale(saleID).setPrice(totalPrice);
    }

    /**
     * En metode, der kalder getSale. Den finder et salgs-objekt
     * @param saleID Søgeværdi
     * @return Et objekt af klassen Salg
     */
    public Sale getSale(int saleID) {
        return saleContainer.getSale(saleID);
    }

    /**
     * En metode, der kalder deleteSale. Den sletter et salgs-objekt
     * @param saleID Søgeværdi
     */
    public void deleteSale(int saleID) {
        saleContainer.deleteSale(saleID);
    }

    /**
     * En metode, der tilføjer et objekt af klassen SalesLineItem til et objekt
     * af klassen Salg
     * @param saleID Søgeværdi
     * @param itemID Søgeværdi
     * @param itemQuantity Mængden af eksemplarer
     */
    public void addSalesLineItem(int saleID, int itemID, int itemQuantity) {
        Item i = itemContainer.getItem(itemID);
        double saleTotalPrice = i.getItemPrice() * itemQuantity;
        int currentINS = i.getItemsInStock();
        SalesLineItem sli = new SalesLineItem(itemQuantity, saleTotalPrice, i);
        saleContainer.getSale(saleID).addSalesLineItem(sli);
        i.setItemsInStock(currentINS - itemQuantity);
        setSaleTotalPrice(saleID);
        if (i.getContainUnits() == true) {
            int index = 0;
            while (itemQuantity > index) {
                Unit u = i.getFirstUnit();
                sli.addUnit(u);
                i.removeUnit(u);
                index++;
            }
        }
    }

    /**
     * En metode, der fjerner et objekt af klassen SalesLineItem, samt opdaterer
     * lagerbeholdningen for et objekt klassen Item
     * @param saleID Søgeværdi
     * @param sLIID Søgeværdi
     */
    public void removeSalesLineItem(int saleID, int sLIID) {
        SalesLineItem sLI = saleContainer.getSale(saleID).getSalesLineItem(sLIID);
        Item i = sLI.getItem();
        int itemQuantity = sLI.getQuantity();
        int currentINS = i.getItemsInStock();
        i.setItemsInStock(currentINS + itemQuantity);
        if (i.getContainUnits() == true) {
            ArrayList<Unit> unitList = sLI.getUnitList();
            i.addUnitList(unitList);
        }
        saleContainer.getSale(saleID).removeSalesLineItem(sLIID);
        setSaleTotalPrice(saleID);
    }

    /**
     * @param saleID Søgeværdi
     * @return En ArrayList over salesLineItem-objekter
     */
    public ArrayList<SalesLineItem> getSLIList(int saleID) {
        return saleContainer.getSale(saleID).getSLIList();
    }

    /**
     * En metode, der tilføjer et kunde-objekt til et salgs-objekt
     * @param saleID Søgeværdi
     * @param customerID Søgeværdi
     */
    public void addCustomerToSale(int saleID, int customerID) {
        Customer c = customerContainer.findCustomer(customerID);
        saleContainer.getSale(saleID).setCustomer(c);
    }

    /**
     * En metode, der fjerner et kunde-objekt fra et salgs-objekt
     * @param saleID Søgeværdi
     */
    public void removeCustomerFromSale(int saleID) {
        saleContainer.getSale(saleID).setCustomer(null);
    }

    /**
     * En metode, der annullerer salget
     * @param saleID Søgeværdi
     */
    public void cancelSale(int saleID) {
        int index = 0;
        ArrayList<SalesLineItem> sLIList = getSLIList(saleID);
        while (sLIList.size() > index) {
            int sLID = sLIList.get(index).getSLIID();
            removeSalesLineItem(saleID, sLID);
            index++;
        }
        deleteSale(saleID);
    }

    /**
     * @return Mængderabat
     */
    public double getQuntityDiscount() {
        double quntityDiscount = discount.getQuantityDiscount();

        return quntityDiscount;
    }

    /**
     * @param newDiscount
     */
    public void setQuntityDiscount(double newDiscount) {
        discount.setQuantityDiscount(newDiscount);
    }

    /**
     * @return Afhetningsrabat
     */
    public double getPickupDiscount() {
        double pickupDiscount = discount.getPickupDiscount();

        return pickupDiscount;
    }

    /**
     * @param newDiscount
     */
    public void setPickupDiscount(double newDiscount) {
        discount.setPickupDiscount(newDiscount);
    }

    public void endSale(int saleID) {
        double discount = 1;
        Discount d = getSale(saleID).getDiscount();
        if (getSale(saleID).getCustomer() != null) {
            discount = addDiscount(saleID) - 1 + d.getQuantityDiscount() - 1 + d.getPickupDiscount();
        } else {
            discount = d.getQuantityDiscount() - 1 + d.getPickupDiscount();
        }

        if (discount < 0.8) {
            discount = 0.8;
        }
        double price = getSale(saleID).getPrice();
        price = price * discount;

        getSale(saleID).setPrice(price);
        double trade = getSale(saleID).getEmployee().getTrade();
        getSale(saleID).getEmployee().setTrade(trade + price);
    }

    public double addDiscount(int saleID) {
        Customer customer = getSale(saleID).getCustomer();
        double discount = 1;

        if (customer.getAccount() != null) {
            discount = 0.9;
        }

        return discount;
    }

    public ArrayList<Sale> getSaleList()
    {
        return saleContainer.listSales();
    }
}
