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
            
            if(choise ==1)
            {
                //create Customer
                System.out.println("\nNew customer crated with the ID:");
                pause();
            }
            else
            {
                if (choise == 2)
                {
                    //delete Customer
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

    
    
    
    private void pause()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nPress return to continue");
        String address = keyboard.nextLine();
    }
    
    
}
