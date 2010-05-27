/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Ctr.CustomerCtr;
import Model.Customer;
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
                        createCustomer();
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
                        getCustomer();
                        break;
                    case 6:
                        printListOfCustomer();
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


    public int writeCustomerMenu()
    {   //Userinterface
       Scanner keyboard = new Scanner(System.in);
       System.out.println("\f *** Kunde Menu ***");
       System.out.println("(0) Tilbage");
       System.out.println("(1) Opret kunde");
       System.out.println("(2) Slet kunde");
       System.out.println("(3) Opdater kunde");
       System.out.println("(4) Tildel konto");
       System.out.println("(5) Find kunde");
       System.out.println("(6) Print liste over kunder");
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

     private void deleteCustomer()
    {
        int customerID = inputUI.inputID();
        if(customerCtr.getCustomer(customerID) == null)
        {
            System.out.println("ID'et " + customerID + " findes ikke. Indtast venligst et nyt ID.");
        }
        else
        {
            boolean yesOrNo = inputUI.yesOrNo();
            if(yesOrNo == true)
            {
                customerCtr.deleteCustomer(customerID);
                System.out.println("Kunden med ID'et " + customerID + " blev slettet.");
            }
        }
    }

    public void assignAccount (int customerID, String type, int regNr, int cardNr)
    {
        customerCtr.giveAccount(customerID, type, regNr, cardNr);
        System.out.println("Kunde med id " +customerID +" har f�et tilf�jet en konto");
        pause();
    }

    public void printListOfCustomer()
    {
        System.out.println("---------------------------------------");
        for(Customer c : customerCtr.getCustomerList())
	{
            
            System.out.println("ID: " + c.getCustomerID() + " Navn: " +
                    c.getName() + " Adresse: " + c.getAddress() +
                    " Telefon: " + c.getPhone());
	}
        System.out.println("---------------------------------------");
        inputUI.pause();
    }

    private void getCustomer()
    {
        int customerID = inputUI.inputID();
        Customer c = customerCtr.getCustomer(customerID);
        if(c != null)
        {
            System.out.println("ID: " + c.getCustomerID());
            System.out.println("Navn: " + c.getName());
            System.out.println("Adresse: " + c.getAddress());
            System.out.println("Telefon: " + c.getPhone());
        }
        else
        {
            System.out.println("ID'et " + customerID + " blev ikke fundet");
        }

    }

    private void createCustomer()
    {
      String name = inputUI.inputName();
      String address = inputUI.inputAddress();
      int phone = inputUI.inputPhone();
      int id = customerCtr.createCustomer(name, address, phone);
      System.out.println("\nNy kunde oprettet med id: " + id);
    }

    // Starter UpdateCUstomerUI klassen
    public void startUpdateCustomerUI()
    {
        updateCustomerUI.start();
    }
}
