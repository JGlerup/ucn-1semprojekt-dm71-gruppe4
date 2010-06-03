/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Ctr.CustomerCtr;
import Ctr.EmployeeCtr;
import Ctr.ItemCtr;
import Ctr.SaleCtr;
import Model.Customer;
import Model.Discount;
import Model.SalesLineItem; // medfører åben arkitektur
import java.util.Scanner;

/**
 *
 */
public class SaleUI {

    private SaleCtr saleCtr;
    private ItemCtr itemCtr;
    private ItemUI itemUI;
    private InputUI inputUI;
    private CustomerCtr customerCtr;
    private EmployeeCtr employeeCtr;
    private int saleID;
    private int employeeID;

    /**
     *
     */
    public SaleUI() {
        saleCtr = new SaleCtr();
        itemCtr = new ItemCtr();
        customerCtr = new CustomerCtr();
        employeeCtr = new EmployeeCtr();
        itemUI = new ItemUI();
        inputUI = new InputUI();
        saleID = 0;
        employeeID = 0;
    }

    /**
     *
     */
    public void start() {
        saleMenu();
    }

    /**
     *
     */
    public void saleMenu() {
        try {
            boolean exit = false;
            while (!exit) {
                int choice = writeSaleMenu();
                switch (choice) {
                    case 0:
                        exit = true;
                        break;
                    case 1:
                        createSale();
                        break;
                    case 2:
                        getSale();
                        break;
                }
            }
        } catch (Exception e) {
            saleMenu();
        }
    }

    /**
     *
     * @return
     */
    public int writeSaleMenu() {   //Userinterface
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Salgsmenu ***");
        System.out.println("(0) Tilbage");
        System.out.println("(1) Start salg");
        System.out.println("(2) Find salg");
        System.out.print("\n Indtast nummer: ");

        int choice = keyboard.nextInt();
        return choice;
    }

    /**
     *
     */
    public void createSale() {

        int employeeID = inputUI.inputEmployeeID();
        if (employeeCtr.getEmployee(employeeID) == null) {
            System.out.println("MedarbejderID'et " + employeeID + " findes ikke");
            inputUI.pause();
        } else {
            int itemID = inputUI.inputItemID();
            if (itemCtr.getItem(itemID) == null) {
                System.out.println("VareID'et " + itemID + " findes ikke");
                inputUI.pause();
            } else {

                int itemsInStock = itemCtr.getItem(itemID).getItemsInStock();
                String saleDate = inputUI.inputSaleDate();
                System.out.println("Lagerbeholdning: " + itemsInStock);
                int saleQuantity = inputUI.inputItemQuantity();
                while (saleQuantity > itemsInStock) {
                    System.out.println("Den indtastede " + saleQuantity + " overskrider lagerbeholdningen, som er på " + itemsInStock);
                    saleQuantity = inputUI.inputItemQuantity();
                }
//                if(itemCtr.getItem(itemID).getContainUnits() == true)
//                {
//                    itemCtr.removeAlotOfUnits(itemID, saleQuantity);
//                }
                saleID = saleCtr.createSale(employeeID, itemID, saleDate, saleQuantity);
                newSaleMenu();
                inputUI.pause();
            }
        }
    }

    /**
     *
     */
    public void getSale() {
        saleID = inputUI.inputID();
        if (saleCtr.getSale(saleID) != null) {
            System.out.println("Dato: " + saleCtr.getSale(saleID).getDate());
            System.out.println("Pris: " + saleCtr.getSale(saleID).getPrice());
            inputUI.pause();
        } else {
            System.out.println("ID'et " + saleID + "blev ikke fundet");
            inputUI.pause();
        }
    }

    /**
     *
     */
    public void addSalesLineItem() {

        int itemID = inputUI.inputID();
        int itemsInStock = itemCtr.getItem(itemID).getItemsInStock();
        int saleQuantity = inputUI.inputItemQuantity();
        while (saleQuantity > itemsInStock) {
            System.out.println("Den indtastede " + saleQuantity + " overskrider lagerbeholdningen, som er på " + itemsInStock);
            saleQuantity = inputUI.inputItemQuantity();
        }
        saleCtr.addSalesLineItem(saleID, itemID, saleQuantity);
        inputUI.pause();
    }

    /**
     *
     */
    public void removeSalesLineItem() {
        int sLIID = inputUI.inputID();
        saleCtr.removeSalesLineItem(saleID, sLIID);
    }

    /**
     *
     */
    public void cancelSale() {
        saleCtr.cancelSale(saleID);
        System.out.println("Salget med ID " + saleID + " er anulleret");
    }

    /**
     *
     */
    public void newSaleMenu() {
        try {
            boolean exit = false;
            while (!exit) {
                int choice = writeNewSaleMenu();
                switch (choice) {
                    case 0:
                        endSale();
                        exit = true;
                        break;
                    case 1:
                        addSalesLineItem();
                        break;
                    case 2:
                        removeSalesLineItem();
                        break;
                    case 3:
                        printContentsOfSale();
                        break;
                    case 4:
                        addCustomerToSale();
                        break;
                    case 5:
                        removeCustomerFromSale();
                        break;
                    case 6:
                        cancelSale();
                        exit = true;
                        break;
                    case 7:
                        discountMenu();
                        break;

                }
            }
        } catch (Exception e) {
            System.out.println("test " + e.getMessage());
            newSaleMenu();
        }
    }

    /**
     *
     * @return
     */
    public int writeNewSaleMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Nyt salg ***");
        System.out.println("(0) Afslut salg");
        System.out.println("(1) Tilføj vare");
        System.out.println("(2) Fjern vare");
        System.out.println("(3) Print salgets indhold");
        System.out.println("(4) Associer kunde");
        System.out.println("(5) Fjern kunde");
        System.out.println("(6) Annuller salg");
        System.out.println("(7) Giv Rabat");
        System.out.print("\n Indtast nummer: ");

        int choice = keyboard.nextInt();
        return choice;
    }

    /**
     *
     */
    public void printContentsOfSale() {
        for (SalesLineItem sLI : saleCtr.getSLIList(saleID)) {
            System.out.println("ID: " + sLI.getSLIID() + " Varenavn: " + sLI.getItem().getItemName() + " Mængde: " + sLI.getQuantity());
        }
        inputUI.pause();
    }

    /**
     *
     */
    public void addCustomerToSale() {
        int customerID = inputUI.inputCustomerID();
        if (customerCtr.getCustomer(customerID) != null) {
            saleCtr.addCustomerToSale(saleID, customerID);
            System.out.println("En kunde ved ID " + customerID + " blev tilknyttet til salget");
            inputUI.pause();
        } else {
            System.out.println("En kunde med ID'et " + customerID + " findes ikke");
            inputUI.pause();
        }
    }

    /**
     *
     */
    public void removeCustomerFromSale() {
        boolean yesOrNo = inputUI.yesOrNo();
        if (saleCtr.getSale(saleID).getCustomer() != null && yesOrNo == true) {
            int customerID = saleCtr.getSale(saleID).getCustomer().getCustomerID();
            saleCtr.removeCustomerFromSale(saleID);
            System.out.println("En kunde med ID'et " + customerID + " er ikke længere tilknyttet til salget");
            inputUI.pause();
        } else {
            if(saleCtr.getSale(saleID).getCustomer() == null && yesOrNo == true)
            {
            System.out.println("Der er ikke tilknyttet en kunde til salget");
            inputUI.pause();
            }
        }
        
    }

    /**
     *
     */
    public void discountMenu() {
        try {
            boolean exit = false;
            while (!exit) {
                int choice = writeDiscountMenu();
                switch (choice) {
                    case 0:
                        exit = true;
                        break;
                    case 1:
                        addPickupDiscount();
                        break;
                    case 2:
                        addQuntityDiscount();
                        break;
                }
            }
        } catch (Exception e) {
            discountMenu();
        }
    }

    /**
     *
     * @return
     */
    public int writeDiscountMenu() {   //Userinterface
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Salgsmenu ***");
        System.out.println("(0) Tilbage");
        System.out.println("(1) Giv Afhentningsrabat");
        System.out.println("(2) Giv Maengderabat");
        System.out.print("\n Indtast nummer: ");

        int choice = keyboard.nextInt();
        return choice;
    }

    // bruger åben arkitektur, kender klassen Customer i modellaget
    /**
     *
     * @return
     */
    public double addDiscount() {
        Customer customer = saleCtr.getSale(saleID).getCustomer();
        double discount = 1;

        if (customer.getAccount() != null) {
            discount = 0.9;
        }

        return discount;
    }

    /**
     *
     */
    public void endSale() {
        double discount = 1;
        Discount d = saleCtr.getSale(saleID).getDiscount();
        if (saleCtr.getSale(saleID).getCustomer() != null) {
            discount = addDiscount() - 1 + d.getQuantityDiscount() - 1 + d.getPickupDiscount();
        } else {
            discount = d.getQuantityDiscount() - 1 + d.getPickupDiscount();
        }

        if (discount < 0.8) {
            discount = 0.8;
        }
        double price = saleCtr.getSale(saleID).getPrice();
        price = price * discount;

        saleCtr.getSale(saleID).setPrice(price);
        double trade = saleCtr.getSale(saleID).getEmployee().getTrade();
        saleCtr.getSale(saleID).getEmployee().setTrade(trade + price);
    }

    /**
     *
     * @return
     */
    public double getQuntityDiscount() {
        double discount = saleCtr.getQuntityDiscount();

        return discount;
    }

    /**
     *
     * @return
     */
    public double getPickupDiscount() {
        double discount = saleCtr.getPickupDiscount();

        return discount;
    }

    /**
     *
     */
    public void addQuntityDiscount() {
        double newDiscount = inputUI.inputDiscount();
        double discount = 1 - (newDiscount / 100);
        saleCtr.getSale(saleID).getDiscount().setQuantityDiscount(discount);
    }

    /**
     *
     */
    public void addPickupDiscount() {
        double newDiscount = inputUI.inputDiscount();
        double discount = 1 - (newDiscount / 100);
        saleCtr.getSale(saleID).getDiscount().setPickupDiscount(discount);
    }
}
