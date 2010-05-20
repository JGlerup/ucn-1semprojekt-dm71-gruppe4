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
    
    public CustomerUI()
    {
       customerCtr = new CustomerCtr();
       updateCustomerUI = new UpdateCustomerUI();
    }
    
    public void start()
    {
        customerMenu();
    }
    
    public void customerMenu()
    {
        boolean exit = false;
        while (!exit)
        {
            int choise = writeCustomerMenu();
            
            if(choise == 1) //create Customer
            {
                String name = inputName();
                String address = inputAddress();
                int phone = inputPhone();
                int id = createCustomer(name, address, phone);
                System.out.println("\nNew customer crated with the ID: " + id);
                pause();
            }
            else
            {
                if (choise == 2) //delete customer
                {
                   deleteCustomer();

                }
                else
                {
                    if(choise == 3)
                    {
                        startUpdateCustomerUI();
                    }
                    else
                    {
                        if (choise == 4) // assign account
                        {
                           int customerID = inputCustomerID();
                           String type = inputType();
                           int regNr = inputRegNr();
                           int cardNr = inputCardNr();
                           assignAccount(customerID, type, regNr, cardNr);
                          
                        }
                        else
                        {
                            if (choise == 5)
                            {
                                //getCustomer
                            }
                            else
                            {
                            System.out.println("Goodbye");
                            exit = true;
                            }
                    
                        }//end else
                    }//end else
                }//end else
            }//end else
        }//end while
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
    
    private String inputType()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);
         System.out.println(" Indtast type:  ");
         String type = keyboard.nextLine();
         return type;
    }
    
    
     private int inputRegNr()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);
         System.out.println(" Indtast reg nummeret: ");
         int regNr = keyboard.nextInt();
         return regNr;
    }
    
    
      private int inputCardNr()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);
         System.out.println(" indtast kortnummer: ");
         int cardNr = keyboard.nextInt();
         return cardNr;
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
