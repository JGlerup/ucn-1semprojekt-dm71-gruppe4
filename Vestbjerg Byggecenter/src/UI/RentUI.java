package UI;
import java.util.Scanner;
import Ctr.RentCtr;


/**
 * Write a description of class RentUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RentUI
{
   private RentCtr  rentCtr;
   
   public RentUI()
   {
       rentCtr = new RentCtr();
   }
   
   public void start()
   {
       rentMenu();
   }
   
   public void rentMenu()
   {
        boolean exit = false;
        while(!exit)//that is: while exit is false
        {
            int choice = writeRentMenu();
            if (choice == 1)
            {
               rentItem();
               
            }
            else{if(choice == 2) {
                deliverItem();
            }
                else{
                    exit = true;
                    }
                    
                }
}
}

  public String inputDate()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);  
         System.out.println(" Write date:  ");
         String date = keyboard.nextLine();
         return date;
    } 
    
      public String inputStatus()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);  
         System.out.println(" WriteType:  ");
         String status = keyboard.nextLine();
         return status;
    } 
      public int inputID()
    {
         // makes an object keyboard to have input from the screen
         Scanner keyboard = new Scanner(System.in);  
         System.out.println(" Write ID:  ");
         int id = keyboard.nextInt();
         return id;
    }
   


         private int writeRentMenu()
            {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Rent Menu ***");
            System.out.println(" (1) Udlej Item");
            System.out.println(" (2) Aflever Item");
            System.out.println(" (3) Tilbage");
            System.out.print("\n Tryk et nummer: ");
            
            int choice = keyboard.nextInt();
            return choice;
        }
        
        private void rentItem()
        {
            String date = inputDate();
            String status = inputStatus();
            int itemID = inputID();
            int returnID = rentCtr.rentItem(itemID, date, status);
           
            System.out.println("Udlejning oprettet med ID: " + returnID);
            pause();
        }

        private void deliverItem()
        {
            int itemID = inputID();
            rentCtr.deliverItem(itemID);
        }
        
         public void pause()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nPress return to continue");
        String address = keyboard.nextLine();
    }

   
}
