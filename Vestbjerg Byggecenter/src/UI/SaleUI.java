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

    public SaleUI()
    {
        saleCtr = new SaleCtr();
        itemUI = new ItemUI();
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
//                        getSale();
//                        break;
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

