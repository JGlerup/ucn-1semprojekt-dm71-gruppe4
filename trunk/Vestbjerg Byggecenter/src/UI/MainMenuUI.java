/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class MainMenuUI 
{
   private SaleUI saleUI;
   private ItemUI itemUI;
   private CustomerUI customerUI;
   private EmployeeUI employeeUI;
   private RentUI rentUI;
   private RentItemUI rentItemUI;
   
   /**
    *
    */
   public MainMenuUI()
   {
       saleUI = new SaleUI();
       itemUI = new ItemUI();
       customerUI = new CustomerUI();
       employeeUI = new EmployeeUI();
       
       mainMenuStart();
   }
   
   /**
    *
    */
   public void mainMenuStart()
   {
       try
       {
           boolean exit = false;
           while(!exit)
           {
               int choice = writeMainMenu();
               switch(choice)
               {
                   case 0:
                       exit = true;
                       break;
                   case 1:
                       startSaleUI();
                       break;
                   case 2:
                       startItemUI();
                       break;
                   case 3:
                       startCustomerUI();
                       break;
                   case 4:
                       startEmployeeUI();
                       break;
                   case 5:
                       startRentUI();
                       break;
                   case 6:
                       startRentItemUI();
                       break;
               }
           }
       }
       catch(Exception e)
       {
       }
   }
    
    private int writeMainMenu()
    {
            // creates a keyboard object to read input
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Hovedmenu ***");
            System.out.println(" (1) Salg");
            System.out.println(" (2) Lagerstyring");
            System.out.println(" (3) Kundehåndtering");
            System.out.println(" (4) Medarbejderhåndtering");
            System.out.println(" (5) Udlejning");
            System.out.println(" (6) Nyt udlejningsudstyr");
            System.out.println(" (0) Exit");
            System.out.print("\n Make your choice: ");
            
            int choice = keyboard.nextInt();
            
            return choice;
    }
    
    private void startSaleUI()
    {
      saleUI.start();
    }

    private void startItemUI()
    {
        itemUI.start();
    }
    
    private void startCustomerUI()
    {
        customerUI.start();
    }
    
    private void startEmployeeUI()
    {
        employeeUI.start();
    }
   
    private void startRentUI()
    {
        rentUI = new RentUI();
        rentUI.start();
    }

    private void startRentItemUI()
    {
        rentItemUI = new RentItemUI();
        rentItemUI.start();
    }
    
    private void writeEnd()
    {
        System.out.println(" The System is shuting down ");
    }
}
