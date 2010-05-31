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
    private InputUI inputUI;
    private int customerID;

    public UpdateCustomerUI()
    {
        customerCtr = new CustomerCtr();
        inputUI = new InputUI();
    }

     public void start()
    {
        selectCustomer();
         if(customerID != 0)
        {
            updateCustomerMenu();
        }
    }

      public void updateCustomerMenu()
    {
        try
        {
            boolean exit = false;
            while(!exit)
            {
            //show menu and return the user's choice
                int choice =   writeUpdateCustomerMenu();
                switch(choice)
                {
                    case 1:
                        setName();
                        break;
                    case 2:
                         findCustomer();
                        break;
                    case 3:
                         //update phone
                        break;
                    case 0:
                          exit = true;
                          break;
                }
            }
        }
        catch(Exception e)
        {
            start();
        }
    }

    
    public int writeUpdateCustomerMenu()
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("\f *** Opdater Kunde Menu ***");
       System.out.println("(1) Opdater Navn");
       System.out.println("(2) Opdater Addresse");
       System.out.println("(3) Opdater Telefon nummer");
       System.out.println("(0) Tilbage");
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

     public void findCustomer()
    {
        int customerID = inputCustomerID();
        customerCtr.getCustomer(customerID);
    }
     

     public void setName()
     {
         int customerID = inputCustomerID();
         String name = inputUI.inputName();
         customerCtr.updateName(customerID, name);
     }


          public void setAddress()
     {
         int customerID = inputCustomerID();
         String address = inputUI.inputAddress();
         customerCtr.updateAddress(customerID, address);
     }

           public void setPhone()
     {
         int customerID = inputCustomerID();
         String phone = inputUI.inputPhone();
         customerCtr.updatePhone(customerID, phone);
     }

           private void selectCustomer()
     {
        customerID = inputUI.inputID();
        if (customerCtr.getCustomer(customerID) == null)
        {
            System.out.println("ID'et blev ikke fundet");
            customerID = 0;
            inputUI.pause();
        }
     }

}
