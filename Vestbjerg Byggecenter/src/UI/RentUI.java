package UI;
import java.util.Scanner;
import Ctr.RentCtr;


/**
 * Write a description of class RentUI here.
 * 
 * @author (Daniel)
 */
public class RentUI
{
   private RentCtr  rentCtr;
   private InputUI inputUI;
   
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
        try
        {
            boolean exit = false;
            while(!exit)
            {
            //show menu and return the user's choice
                int choice =   writeRentMenu();
                switch(choice)
                {
                    case 0:
                        exit = true;
                        break;
                    case 1:
                        rentItem();
                        break;
                    case 2:
                        deliverItem();
                        break;

                }
            }
        }
        catch(Exception e)
        {
            System.out.println("sidj" + e.getMessage());
            start();
        }
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
             int customerID = inputUI.inputID();
             String date = inputUI.inputDate();
             String status = inputUI.inputStatus();
             int itemID = inputUI.inputItemID();
             int returnID = rentCtr.rentItem(itemID, date, status, customerID);

             System.out.println("Udlejning oprettet med ID: " + returnID);
             inputUI.pause();
         }
        


        private void deliverItem()
        {
            int itemID = inputUI.inputID();
            rentCtr.deliverItem(itemID);
        }
        

   
}
