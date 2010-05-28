/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Ctr.CustomerCtr;
import Ctr.EmployeeCtr;
import Ctr.ItemCtr;
import Ctr.SaleCtr;
import Model.SalesLineItem; // medfører åben arkitektur
import java.util.Scanner;

/**
 *
 * @author Daniel
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

    public SaleUI()
    {
        saleCtr = new SaleCtr();
        itemCtr = new ItemCtr();
        customerCtr = new CustomerCtr();
        employeeCtr = new EmployeeCtr();
        itemUI = new ItemUI();
        inputUI = new InputUI();
        saleID = 0;
        employeeID = 0;
    }

    public void start()
    {
        saleMenu();
    }

     public void saleMenu()
    {
        try
        {
            boolean exit = false;
            while(!exit)
            {
                int choice = writeSaleMenu();
                switch(choice)
                {
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
        }
        catch(Exception e)
        {
            saleMenu();
        }
     }

    public int writeSaleMenu()
    {   //Userinterface
       Scanner keyboard = new Scanner(System.in);
       System.out.println("\f *** Salgsmenu ***");
       System.out.println("(0) Tilbage");
       System.out.println("(1) Start salg");
       System.out.println("(2) Find salg");
       System.out.print("\n Indtast nummer: ");

       int choice = keyboard.nextInt();
       return choice;
    }

    public void createSale()
    {

        int employeeID = inputUI.inputEmployeeID();
        if(employeeCtr.getEmployee(employeeID) == null)
        {
            System.out.println("MedarbejderID'et " + employeeID + " findes ikke");
            inputUI.pause();
        }
        else
        {
            int itemID = inputUI.inputItemID();
            if(itemCtr.getItem(itemID) == null)
            {
                System.out.println("VareID'et " + itemID + " findes ikke");
                inputUI.pause();
            }
            else
            {

                int itemsInStock = itemCtr.getItem(itemID).getItemsInStock();
                String saleDate = inputUI.inputSaleDate();
                System.out.println("Lagerbeholdning: " + itemsInStock);
                int saleQuantity = inputUI.inputQuantity();
                while(saleQuantity > itemsInStock)
                {
                    System.out.println("Den indtastede " + saleQuantity + " overskrider lagerbeholdningen, som er på " + itemsInStock);
                    saleQuantity = inputUI.inputQuantity();
                }
                int newItemsInStock = itemsInStock - saleQuantity;
                if(itemCtr.getItem(itemID).getContainUnits() == true)
                {
                    itemCtr.removeAlotOfUnits(itemID, saleQuantity);
                }
                itemCtr.getItem(itemID).setItemsInStock(newItemsInStock);
                saleID = saleCtr.createSale(employeeID, itemID, saleDate, saleQuantity);
                double price = saleCtr.calculateTotalPrice(saleID);
                saleCtr.getSale(saleID).setPrice(price);
                newSaleMenu();
                inputUI.pause();
            }
        }
    }

    public void getSale()
    {
        saleID = inputUI.inputID();
        if(saleCtr.getSale(saleID) != null)
        {
            System.out.println("Dato: " + saleCtr.getSale(saleID).getDate());
            System.out.println("Pris: " + saleCtr.getSale(saleID).getPrice());
            inputUI.pause();
        }
        else
        {
            System.out.println("ID'et " + saleID + "blev ikke fundet");
            inputUI.pause();
        }
    }

    public void addSalesLineItem()
    {

        int itemID = inputUI.inputID();
        int itemsInStock = itemCtr.getItem(itemID).getItemsInStock();
        int saleQuantity = inputUI.inputQuantity();
        while(saleQuantity > itemsInStock)
        {
            System.out.println("Den indtastede " + saleQuantity + " overskrider lagerbeholdningen, som er på " + itemsInStock);
            saleQuantity = inputUI.inputQuantity();
        }
        saleCtr.addSalesLineItem(saleID, itemID, saleQuantity);
        inputUI.pause();
    }


    public void removeSalesLineItem()
    {
        int sLIID = inputUI.inputID();
        saleCtr.removeSalesLineItem(saleID, sLIID);
    }

    public void newSaleMenu()
    {
        try
        {
            boolean exit = false;
            while(!exit)
            {
                int choice =   writeNewSaleMenu();
                switch(choice)
                {
                    case 0:
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
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("test");
            newSaleMenu();
        }
    }

    public int writeNewSaleMenu()
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("\f *** Nyt salg ***");
       System.out.println("(0) Afslut salg");
       System.out.println("(1) Tilføj vare");
       System.out.println("(2) Fjern vare");
       System.out.println("(3) Print salgets indhold");
       System.out.print("\n Indtast nummer: ");

       int choice = keyboard.nextInt();
       return choice;
    }

    public void printContentsOfSale()
    {
        for(SalesLineItem sLI : saleCtr.getSLIList(saleID))
	{
            System.out.println("ID: " + sLI.getSLIID() + " Varenavn: " + sLI.getItem().getItemName() + " Mængde: " + sLI.getQuantity());
	}
        inputUI.pause();
    }

    public void addCustomerToSale()
    {
        int customerID = inputUI.inputCustomerID();
        if(customerCtr.getCustomer(customerID) != null)
        {
            saleCtr.addCustomerToSale(saleID, customerID);
            System.out.println("En kunde ved ID " + customerID + " blev tilknyttet til salget");
            inputUI.pause();
        }
        else
        {
            System.out.println("En kunde med ID'et " + customerID + " findes ikke");
            inputUI.pause();
        }
    }

    public void removeCustomerFromSale()
    {
        boolean yesOrNo = inputUI.yesOrNo();
        int customerID = saleCtr.getSale(saleID).getCustomer().getCustomerID();
        if(yesOrNo == true)
        {
            saleCtr.removeCustomerFromSale(saleID);
            System.out.println("En kunde med ID'et " + customerID + " er ikke længere tilknyttet til salget");
        }
        inputUI.pause();
    }
}

//        boolean stop = false;
//        while(!stop)
//        {
//            System.out.println("VareID");
//            itemID = inputUI.inputID();
//            System.out.println("saleQuantity");
//            saleQuantity = inputUI.inputQuantity();
//            saleCtr.addSalesLineItem(s, itemID, saleQuantity);
//            stop = true;
//        }