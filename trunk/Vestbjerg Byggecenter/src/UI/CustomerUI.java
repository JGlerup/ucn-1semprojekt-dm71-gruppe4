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
    
    private CustomerCtr customerCtr;
    
    public CustomerUI()
    {
       customerCtr = new CustomerCtr();
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
            
            if(choise ==1) //create Customer
            {
                String name = inputName();
                String address = inputAddress();
                int phone = inputPhone();
                System.out.println("\nNew customer crated with the ID:");
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
                        //update Customer
                    }
                    else
                    {
                        if (choise == 4)
                        {
                            //getCustomer
                        }
                        else
                        {
                            exit = true;
                        }
                    
                   
                    }//end else
                }//end else
            }//end else
        }//end while
    }

    public int writeCustomerMenu()
    {   //Userinterface
       Scanner keyboard = new Scanner(System.in);
       System.out.println("(1) Opret kunde");
       System.out.println("(2) slet kunde");
       System.out.println("(3) opdater kunde");
       System.out.println("(4) søg kunde");
       System.out.print("\n Vælg et felt: ");
       
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
           System.out.println(" Angiv ID:  ");
           try{
             id = keyboard.nextInt();
             succed = true;
           }
           catch (Exception e)
            {
             System.out.println("Det skal være et nummer. Prøv igen");
             String input = keyboard.nextLine();
           }
        }//end while
        return id;
     }

     private String inputName()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);
         System.out.println(" Write Name:  ");
         String name = keyboard.nextLine();
         return name;
    }

     private String inputAddress()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);
         System.out.println(" Write Address:  ");
         String address = keyboard.nextLine();
         return address;
    }

     private int inputPhone()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);
         System.out.println(" Write phonenumber: ");
         int phone = keyboard.nextInt();
         return phone;
    }

    
    
    
    private void pause()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nPress return to continue");
        String address = keyboard.nextLine();
    }

    public void deleteCustomer()
    {
        int id = inputCustomerID();

        customerCtr.deleteCustomer(id);
        System.out.println("Customer deleted");
        pause();
    }
    
    
}
