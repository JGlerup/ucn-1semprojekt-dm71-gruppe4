/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

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
    private int saleID;
    private int employeeID;

    public SaleUI()
    {
        saleCtr = new SaleCtr();
        itemCtr = new ItemCtr();
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

        employeeID = inputUI.inputID();
        int itemID = inputUI.inputID();
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
        itemCtr.getItem(itemID).setItemsInStock(newItemsInStock);
        saleID = saleCtr.createSale(employeeID, itemID, saleDate, saleQuantity);
        double price = saleCtr.calculateTotalPrice(saleID);
        saleCtr.getSale(saleID).setPrice(price);
        newSaleMenu();
        inputUI.pause();
    }

    public void getSale()
    {
        saleID = inputUI.inputID();
        if(saleCtr.getSale(saleID) != null)
        {
            System.out.println("Dato: " + saleCtr.getSale(saleID).getDate());
            System.out.println("Pris: " + saleCtr.getSale(saleID).getPrice());
        }
        else
        {
            System.out.println("ID'et " + saleID + "blev ikke fundet");
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
       System.out.println("(0) Tilbage");
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