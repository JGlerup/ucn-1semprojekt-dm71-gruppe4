/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Ctr.CustomerCtr;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class UpdateCustomerUI {

    private CustomerCtr customerCtr;

    public UpdateCustomerUI()
    {
        customerCtr = new CustomerCtr();
    }

     public void start()
    {
        updateCustomerMenu();
    }

    public void updateCustomerMenu()
    {
        boolean exit = false;
        while (!exit)
        {
            int choise = writeUpdateCustomerMenu();

            if(choise == 1)
            {
                setName();
            }
            else
            {
                if (choise == 2)
                {
                    findCustomer();
                }
                else
                {
                    if (choise == 3)
                    {
                        //update phone
                    }
                    else
                    {
                        exit = true;
                    }
                }//end else
            }//end else
        }//end while
    }

    public int writeUpdateCustomerMenu()
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("\f *** Kunde Menu ***");
       System.out.println("(1) Opdater Navn");
       System.out.println("(2) Opdater Addresse");
       System.out.println("(3) Opdater Telefon nummer");
       System.out.println("(6) Tilbage");
       System.out.print("\n Indtast nummer: ");

       int choise = keyboard.nextInt();
       return choise;
    }

    private int inputCustomerID()
    {
        boolean succed = false;
        int id = 0;
        while(!succed)
        {
        // makes an object keyboard to have input from the console
           Scanner keyboard = new Scanner(System.in);
           System.out.println(" Angiv kundeID:  ");
           try{
             id = keyboard.nextInt();
             succed = true;
           }
           catch (Exception e)
            {
             System.out.println("Fejl. Pr�v igen");
             String input = keyboard.nextLine();
           }
        }//end while
        return id;
     }

     private String inputName()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);
         System.out.println(" Indtast Name:  ");
         String name = keyboard.nextLine();
         return name;
    }

     private String inputAddress()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);
         System.out.println(" Indtast Address:  ");
         String address = keyboard.nextLine();
         return address;
    }

     private int inputPhone()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);
         System.out.println(" Indtast telefon nummer: ");
         int phone = keyboard.nextInt();
         return phone;
    }

     private void pause()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n Tryk enter for at forts�tte");
        String pause = keyboard.nextLine();
    }

     public void findCustomer()
    {
        int customerID = inputCustomerID();
        customerCtr.getCustomer(customerID);
    }
     

     public void setName()
     {
         int customerID = inputCustomerID();
         String name = inputName();
         customerCtr.updateName(customerID, name);
     }
}
