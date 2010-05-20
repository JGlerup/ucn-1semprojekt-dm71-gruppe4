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

    public SaleUI()
    {
        saleCtr = new SaleCtr();
    }

    public void start()
    {
        saleMenu();
    }

     public void saleMenu()
    {
        boolean exit = false;
        while (!exit)
        {
            int choise = writeSaleMenu();

            if(choise == 1)
            {
                //create Sale
            }
            else
            {
                if (choise == 2)
                {
                    //findSale
                }
                else
                {
                    exit = true;
                }
            }//end else
        }//end while
     }

      public int writeSaleMenu()
    {   //Userinterface
       Scanner keyboard = new Scanner(System.in);
       System.out.println("\f *** Kunde Menu ***");
       System.out.println("(1) Start salg");
       System.out.println("(2) Find salg");
       System.out.println("(3) Tilbage");
       System.out.print("\n Indtast nummer: ");

       int choise = keyboard.nextInt();
       return choise;
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
        System.out.println("\n Tryk enter for at fortsætte");
        String pause = keyboard.nextLine();
    }

}

