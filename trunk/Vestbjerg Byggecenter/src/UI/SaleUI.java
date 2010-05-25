/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Ctr.SaleCtr;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class SaleUI {

    private SaleCtr saleCtr;
    private ItemUI itemUI;
    private InputUI inputUI;

    public SaleUI()
    {
        saleCtr = new SaleCtr();
        itemUI = new ItemUI();
        inputUI = new InputUI();
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
       System.out.println("\f *** Kunde Menu ***");
       System.out.println("(1) Start salg");
       System.out.println("(2) Find salg");
       System.out.println("(0) Tilbage");
       System.out.print("\n Indtast nummer: ");

       int choice = keyboard.nextInt();
       return choice;
    }

    public void createSale()
    {
        System.out.println("MedarbejderID");
        int employeeID = inputUI.inputID();
        System.out.println("VareID");
        int itemID = inputUI.inputID();
        System.out.println("Salgsdato");
        String saleDate = inputUI.inputSaleDate();
        System.out.println("Antal");
        int saleQuantity = inputUI.inputQuantity();
        int s = saleCtr.createSale(employeeID, itemID, saleDate, saleQuantity);
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
        double price = saleCtr.calculateTotalPrice(s);
        saleCtr.getSale(s).setPrice(price);
        System.out.println(s);
    }

    public void getSale()
    {
        int saleID = inputUI.inputID();
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

    private String inputName()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("State employee name: ");
        String name = keyboard.nextLine();
        return name;
    }


    private void pause()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n Tryk enter for at forts�tte");
        String pause = keyboard.nextLine();
    }

}

