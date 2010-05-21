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
public class CustomerUI {
    
    private UpdateCustomerUI updateCustomerUI;
    private CustomerCtr customerCtr;
    private InputUI inputUI;
    private int CustomerID;
    
    public CustomerUI()
    {
       customerCtr = new CustomerCtr();
       updateCustomerUI = new UpdateCustomerUI();
       inputUI = new InputUI();
    }
    
    public void start()
    {
        customerMenu();
    }

    public void customerMenu()
    {
        try
        {
            boolean exit = false;
            while(!exit)
            {
            //show menu and return the user's choice
                int choice =   writeCustomerMenu();
                switch(choice)
                {
                    case 1:
                     String name = inputUI.inputName();
                     String address = inputUI.inputAddress();
                     int phone = inputUI.inputPhone();
                     int id = createCustomer(name, address, phone);
                     System.out.println("\nNy kunde oprettet med id: " + id);
                        break;
                    case 2:
                         deleteCustomer();
                        break;
                    case 3:
                        startUpdateCustomerUI();
                        break;
                    case 4:
                           int customerID = inputCustomerID();
                           String type = inputUI.inputType();
                           int regNr = inputUI.inputRegNr();
                           int cardNr = inputUI.inputCardNr();
                           assignAccount(customerID, type, regNr, cardNr);
                        break;
                    case 5:
                           //findCustomer
                        break;
                    case 6:
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
    

    public int writeCustomerMenu()
    {   //Userinterface
       Scanner keyboard = new Scanner(System.in);
       System.out.println("\f *** Kunde Menu ***");
       System.out.println("(1) Opret kunde");
       System.out.println("(2) Slet kunde");
       System.out.println("(3) Opdater kunde");
       System.out.println("(4) Tildel konto");
       System.out.println("(5) Find kunde");
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
    
    
    private void pause()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n Tryk enter for at forts�tte");
        String pause = keyboard.nextLine();
    }

    public void deleteCustomer()
    {
        int id = inputCustomerID();

        customerCtr.deleteCustomer(id);
        System.out.println("Customer deleted");
        pause();
    }
    
    public void assignAccount (int customerID, String type, int regNr, int cardNr)
    {
        customerCtr.giveAccount(customerID, type, regNr, cardNr);
        System.out.println("Kunde med id " +customerID +" har f�et tilf�jet en konto");
        pause();
    }
    
    private int createCustomer(String name, String address, int phone)
    {
      return customerCtr.createCustomer(name, address, phone);
    }


    // Starter UpdateCUstomerUI klassen
    public void startUpdateCustomerUI()
    {
        updateCustomerUI.start();
    }
    
      public void findCustomer(int customerID)
    {
        customerCtr.getCustomer(customerID);
    }
}
