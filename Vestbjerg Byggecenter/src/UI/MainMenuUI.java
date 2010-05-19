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
//   private SaleUI saleUI;
   private ItemUI itemUI;
   private CustomerUI customerUI;
   private EmployeeUI employeeUI;
//   private RentUI rentUI;
   
   public MainMenuUI()
   {
//       saleUI = new SaleUI();
       itemUI = new ItemUI();
       customerUI = new CustomerUI();
       employeeUI = new EmployeeUI();
       
       mainMenuStart();
   }
   
   public void mainMenuStart()
   {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            int choice = writeMainMenu();
            if(choice == 1)
            {
                startSaleUI();
            }
            else
            {
                    if(choice == 2)
                    { 
                        startItemUI();
                    }
                    else
                    {
                        if(choice == 3)
                        {
                            startCustomerUI(); 
                        }//end if
                        else
                        {
                            if(choice == 4)
                            {
                                startEmployeeUI();
                            }
                            else
                            {
                            writeEnd();
                            exit = true;
                            }//end else
                        }// end else
                    }//end else
            }//end while
        }//end start
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
            System.out.print("\n Make your choice: ");
            
            int choice = keyboard.nextInt();
            
            return choice;
    }
    
    private void startSaleUI()
    {
//        saleUI.start();
      
     
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
   
//    private void startRentUI()
//    {
//        rentUI = new RentUI();
//        rentUI.start();
//    }
    
    private void writeEnd()
    {
        System.out.println(" The System is shuting down ");
    }
}
